// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateApplicationAccessPointRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Policies")
    public String policies;

    public static UpdateApplicationAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationAccessPointRequest self = new UpdateApplicationAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationAccessPointRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationAccessPointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateApplicationAccessPointRequest setPolicies(String policies) {
        this.policies = policies;
        return this;
    }
    public String getPolicies() {
        return this.policies;
    }

}
