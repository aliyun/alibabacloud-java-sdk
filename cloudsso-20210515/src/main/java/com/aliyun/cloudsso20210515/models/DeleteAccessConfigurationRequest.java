// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteAccessConfigurationRequest extends TeaModel {
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("ForceRemovePermissionPolicies")
    public Boolean forceRemovePermissionPolicies;

    public static DeleteAccessConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessConfigurationRequest self = new DeleteAccessConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessConfigurationRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public DeleteAccessConfigurationRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DeleteAccessConfigurationRequest setForceRemovePermissionPolicies(Boolean forceRemovePermissionPolicies) {
        this.forceRemovePermissionPolicies = forceRemovePermissionPolicies;
        return this;
    }
    public Boolean getForceRemovePermissionPolicies() {
        return this.forceRemovePermissionPolicies;
    }

}
