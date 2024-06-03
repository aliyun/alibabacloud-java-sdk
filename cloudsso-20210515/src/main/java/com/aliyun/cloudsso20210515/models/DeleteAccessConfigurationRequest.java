// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteAccessConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the access configuration.</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>Specifies whether to forcibly remove system policies and inline policies. Valid values:</p>
     * <br>
     * <p>*   true: When you delete the access configuration, the associated system policies and inline policies are forcibly removed.</p>
     * <p>*   false: When you delete the access configuration, the associated system policies and inline policies are not forcibly removed. This is the default value. If these policies exist in the access configuration, the deletion fails. Before you delete the access configuration, you must remove the system policies and inline policies. For more information, see [RemovePermissionPolicyFromAccessConfiguration](https://help.aliyun.com/document_detail/336904.html).</p>
     */
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
