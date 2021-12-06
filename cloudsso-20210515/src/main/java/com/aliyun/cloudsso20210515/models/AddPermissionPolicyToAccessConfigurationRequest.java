// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddPermissionPolicyToAccessConfigurationRequest extends TeaModel {
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("InlinePolicyDocument")
    public String inlinePolicyDocument;

    @NameInMap("PermissionPolicyName")
    public String permissionPolicyName;

    @NameInMap("PermissionPolicyType")
    public String permissionPolicyType;

    public static AddPermissionPolicyToAccessConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPermissionPolicyToAccessConfigurationRequest self = new AddPermissionPolicyToAccessConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public AddPermissionPolicyToAccessConfigurationRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public AddPermissionPolicyToAccessConfigurationRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public AddPermissionPolicyToAccessConfigurationRequest setInlinePolicyDocument(String inlinePolicyDocument) {
        this.inlinePolicyDocument = inlinePolicyDocument;
        return this;
    }
    public String getInlinePolicyDocument() {
        return this.inlinePolicyDocument;
    }

    public AddPermissionPolicyToAccessConfigurationRequest setPermissionPolicyName(String permissionPolicyName) {
        this.permissionPolicyName = permissionPolicyName;
        return this;
    }
    public String getPermissionPolicyName() {
        return this.permissionPolicyName;
    }

    public AddPermissionPolicyToAccessConfigurationRequest setPermissionPolicyType(String permissionPolicyType) {
        this.permissionPolicyType = permissionPolicyType;
        return this;
    }
    public String getPermissionPolicyType() {
        return this.permissionPolicyType;
    }

}
