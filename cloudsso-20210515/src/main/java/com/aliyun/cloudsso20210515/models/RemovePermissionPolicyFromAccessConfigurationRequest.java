// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RemovePermissionPolicyFromAccessConfigurationRequest extends TeaModel {
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("PermissionPolicyName")
    public String permissionPolicyName;

    @NameInMap("PermissionPolicyType")
    public String permissionPolicyType;

    public static RemovePermissionPolicyFromAccessConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePermissionPolicyFromAccessConfigurationRequest self = new RemovePermissionPolicyFromAccessConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public RemovePermissionPolicyFromAccessConfigurationRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public RemovePermissionPolicyFromAccessConfigurationRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public RemovePermissionPolicyFromAccessConfigurationRequest setPermissionPolicyName(String permissionPolicyName) {
        this.permissionPolicyName = permissionPolicyName;
        return this;
    }
    public String getPermissionPolicyName() {
        return this.permissionPolicyName;
    }

    public RemovePermissionPolicyFromAccessConfigurationRequest setPermissionPolicyType(String permissionPolicyType) {
        this.permissionPolicyType = permissionPolicyType;
        return this;
    }
    public String getPermissionPolicyType() {
        return this.permissionPolicyType;
    }

}
