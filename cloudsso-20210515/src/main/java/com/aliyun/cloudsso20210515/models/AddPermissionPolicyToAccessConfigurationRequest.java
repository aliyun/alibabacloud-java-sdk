// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddPermissionPolicyToAccessConfigurationRequest extends TeaModel {
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
     * <p>The configurations of the inline policy.</p>
     * <p>The value can be up to 4,096 characters in length.</p>
     * <p>If you set <code>PermissionPolicyType</code> to <code>Inline</code>, you must specify this parameter. For more information about the syntax and structure of RAM policies, see <a href="https://help.aliyun.com/document_detail/93739.html">Policy syntax and structure</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: &quot;<em>&quot;,&quot;Effect&quot;: &quot;Allow&quot;,&quot;Resource&quot;: &quot;</em>&quot;}],&quot;Version&quot;: &quot;1&quot;}</p>
     */
    @NameInMap("InlinePolicyDocument")
    public String inlinePolicyDocument;

    /**
     * <p>The name of the policy.</p>
     * <ul>
     * <li>If you set <code>PermissionPolicyType</code> to <code>System</code>, you must set PermissionPolicyName to the name of a system policy. You can obtain the name of the system policy from RAM.</li>
     * <li>If you set <code>PermissionPolicyType</code> to <code>Inline</code>, you must set PermissionPolicyName to the name of an inline policy. A custom value is supported. The value can be up to 32 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AliyunECSFullAccess</p>
     */
    @NameInMap("PermissionPolicyName")
    public String permissionPolicyName;

    /**
     * <p>The type of the policy. Valid values:</p>
     * <ul>
     * <li>System: system policy. Resource Access Management (RAM) system policies are reused.</li>
     * <li>Inline: inline policy. Inline policies are created based on the RAM policy syntax and structure.</li>
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
