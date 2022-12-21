// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateScenarioRequest extends TeaModel {
    // The description of the business scenario.
    @NameInMap("Description")
    public String description;

    // The name of the business scenario.
    @NameInMap("ScenarioName")
    public String scenarioName;

    // The ID of the tenant.
    // 
    // > To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
    @NameInMap("Tid")
    public Long tid;

    public static CreateScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScenarioRequest self = new CreateScenarioRequest();
        return TeaModel.build(map, self);
    }

    public CreateScenarioRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateScenarioRequest setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
        return this;
    }
    public String getScenarioName() {
        return this.scenarioName;
    }

    public CreateScenarioRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
