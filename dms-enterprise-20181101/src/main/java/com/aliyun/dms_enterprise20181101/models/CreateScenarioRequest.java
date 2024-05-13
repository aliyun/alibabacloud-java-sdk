// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateScenarioRequest extends TeaModel {
    /**
     * <p>The description of the business scenario.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the business scenario.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScenarioName")
    public String scenarioName;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html) topic.</p>
     */
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
