// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdatePolicyRequest extends TeaModel {
    @NameInMap("AccessControlRules")
    public String accessControlRules;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Permissions")
    public String permissions;

    @NameInMap("Resources")
    public String resources;

    public static UpdatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyRequest self = new UpdatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyRequest setAccessControlRules(String accessControlRules) {
        this.accessControlRules = accessControlRules;
        return this;
    }
    public String getAccessControlRules() {
        return this.accessControlRules;
    }

    public UpdatePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePolicyRequest setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }
    public String getPermissions() {
        return this.permissions;
    }

    public UpdatePolicyRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
