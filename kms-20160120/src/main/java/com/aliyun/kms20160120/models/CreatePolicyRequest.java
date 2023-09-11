// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    @NameInMap("AccessControlRules")
    public String accessControlRules;

    @NameInMap("Description")
    public String description;

    @NameInMap("KmsInstance")
    public String kmsInstance;

    @NameInMap("Name")
    public String name;

    @NameInMap("Permissions")
    public String permissions;

    @NameInMap("Resources")
    public String resources;

    public static CreatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyRequest self = new CreatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyRequest setAccessControlRules(String accessControlRules) {
        this.accessControlRules = accessControlRules;
        return this;
    }
    public String getAccessControlRules() {
        return this.accessControlRules;
    }

    public CreatePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolicyRequest setKmsInstance(String kmsInstance) {
        this.kmsInstance = kmsInstance;
        return this;
    }
    public String getKmsInstance() {
        return this.kmsInstance;
    }

    public CreatePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePolicyRequest setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }
    public String getPermissions() {
        return this.permissions;
    }

    public CreatePolicyRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
