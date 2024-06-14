// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateApplicationAccessPointRequest extends TeaModel {
    /**
     * <p>The description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the AAP that you want to update.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The permission policy that you want to update.</p>
     * <p>> You can associate up to three permission policies with each AAP.</p>
     */
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
