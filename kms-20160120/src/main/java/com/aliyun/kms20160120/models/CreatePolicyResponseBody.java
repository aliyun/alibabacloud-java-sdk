// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreatePolicyResponseBody extends TeaModel {
    @NameInMap("AccessControlRules")
    public String accessControlRules;

    @NameInMap("Arn")
    public String arn;

    @NameInMap("Description")
    public String description;

    @NameInMap("KmsInstance")
    public String kmsInstance;

    @NameInMap("Name")
    public String name;

    @NameInMap("Permissions")
    public String permissions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public String resources;

    public static CreatePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyResponseBody self = new CreatePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolicyResponseBody setAccessControlRules(String accessControlRules) {
        this.accessControlRules = accessControlRules;
        return this;
    }
    public String getAccessControlRules() {
        return this.accessControlRules;
    }

    public CreatePolicyResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public CreatePolicyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolicyResponseBody setKmsInstance(String kmsInstance) {
        this.kmsInstance = kmsInstance;
        return this;
    }
    public String getKmsInstance() {
        return this.kmsInstance;
    }

    public CreatePolicyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePolicyResponseBody setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }
    public String getPermissions() {
        return this.permissions;
    }

    public CreatePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePolicyResponseBody setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
