// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListPermissionPoliciesInAccessConfigurationRequest extends TeaModel {
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("PermissionPolicyType")
    public String permissionPolicyType;

    public static ListPermissionPoliciesInAccessConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionPoliciesInAccessConfigurationRequest self = new ListPermissionPoliciesInAccessConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ListPermissionPoliciesInAccessConfigurationRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public ListPermissionPoliciesInAccessConfigurationRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListPermissionPoliciesInAccessConfigurationRequest setPermissionPolicyType(String permissionPolicyType) {
        this.permissionPolicyType = permissionPolicyType;
        return this;
    }
    public String getPermissionPolicyType() {
        return this.permissionPolicyType;
    }

}
