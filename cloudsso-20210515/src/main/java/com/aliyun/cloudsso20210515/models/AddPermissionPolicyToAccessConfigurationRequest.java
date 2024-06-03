// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddPermissionPolicyToAccessConfigurationRequest extends TeaModel {
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
     * <p>The configurations of the inline policy.</p>
     * <br>
     * <p>The value can be up to 4,096 characters in length.</p>
     * <br>
     * <p>If you set `PermissionPolicyType` to `Inline`, you must specify this parameter. For more information about the syntax and structure of RAM policies, see [Policy syntax and structure](https://help.aliyun.com/document_detail/93739.html).</p>
     */
    @NameInMap("InlinePolicyDocument")
    public String inlinePolicyDocument;

    /**
     * <p>The name of the policy.</p>
     * <br>
     * <p>*   If you set `PermissionPolicyType` to `System`, you must set this parameter to the name of the system policy. You can obtain the name of the system policy from RAM.</p>
     * <p>*   If you set `PermissionPolicyType` to `Inline`, you must set this parameter to the name of the inline policy. A custom value is supported.</p>
     */
    @NameInMap("PermissionPolicyName")
    public String permissionPolicyName;

    /**
     * <p>The type of the policy. Valid values:</p>
     * <br>
     * <p>*   System: system policy. Resource Access Management (RAM) system policies are reused.</p>
     * <p>*   Inline: inline policy. Inline policies are created based on the RAM policy syntax and structure.</p>
     */
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
