// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListPermissionPoliciesInAccessConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the access configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>ac-00jhtfl8thteu6uj****</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The type of the policy. The type can be used to filter policies. Valid values:</p>
     * <ul>
     * <li>System: system policy.</li>
     * <li>Inline: inline policy.</li>
     * </ul>
     * <p>If you do not specify this parameter, all types of policies are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
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
