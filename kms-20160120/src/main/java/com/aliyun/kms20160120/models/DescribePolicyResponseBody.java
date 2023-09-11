// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribePolicyResponseBody extends TeaModel {
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
    public java.util.List<String> permissions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<String> resources;

    public static DescribePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyResponseBody self = new DescribePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyResponseBody setAccessControlRules(String accessControlRules) {
        this.accessControlRules = accessControlRules;
        return this;
    }
    public String getAccessControlRules() {
        return this.accessControlRules;
    }

    public DescribePolicyResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public DescribePolicyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribePolicyResponseBody setKmsInstance(String kmsInstance) {
        this.kmsInstance = kmsInstance;
        return this;
    }
    public String getKmsInstance() {
        return this.kmsInstance;
    }

    public DescribePolicyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePolicyResponseBody setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

    public DescribePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolicyResponseBody setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

}
