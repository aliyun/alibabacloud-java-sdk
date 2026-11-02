// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddPermissionPolicyToAccessConfigurationRequest extends TeaModel {
    /**
     * <p>The access configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ac-00jhtfl8thteu6uj****</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The content of the inline policy.</p>
     * <p>The maximum length is 4,096 characters.</p>
     * <p>If PermissionPolicyType is set to Inline, this parameter is required. For more information about the syntax and structure of access policies, see <a href="https://help.aliyun.com/document_detail/93739.html">Access policy syntax and structure</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: &quot;<em>&quot;,&quot;Effect&quot;: &quot;Allow&quot;,&quot;Resource&quot;: &quot;</em>&quot;}],&quot;Version&quot;: &quot;1&quot;}</p>
     */
    @NameInMap("InlinePolicyDocument")
    public String inlinePolicyDocument;

    /**
     * <p>The name of the access policy. </p>
     * <ul>
     * <li>If PermissionPolicyType is set to System, this parameter specifies the name of the system policy. Because RAM system policies are reused, you must obtain the system policy name from RAM.</li>
     * <li>If PermissionPolicyType is set to Inline, this parameter specifies the name of the inline policy. You can customize the name. The name can be up to 32 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AliyunECSFullAccess</p>
     */
    @NameInMap("PermissionPolicyName")
    public String permissionPolicyName;

    /**
     * <p>The type of the access policy. Valid values:</p>
     * <ul>
     * <li>System: system policy. Reuses the system policies of Resource Access Management (RAM).</li>
     * <li>Inline: inline policy. A custom policy written based on the syntax and structure of RAM policies.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>System</p>
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
