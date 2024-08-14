// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdatePolicyRequest extends TeaModel {
    /**
     * <p>The access control rule.</p>
     * <blockquote>
     * <p>For more information about how to query created access control rules, see <a href="https://help.aliyun.com/document_detail/2539433.html">ListNetworkRules</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NetworkRules&quot;:[&quot;kst-hzz62ee817bvyyr5x****.efkd&quot;,&quot;kst-hzz62ee817bvyyr5x****.eyyp&quot;]}</p>
     */
    @NameInMap("AccessControlRules")
    public String accessControlRules;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>policy  description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the permission policy that you want to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>policy_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operations that are supported by the updated policy. Valid values:</p>
     * <ul>
     * <li>RbacPermission/Template/CryptoServiceKeyUser: allows you to perform cryptographic operations.</li>
     * <li>RbacPermission/Template/CryptoServiceSecretUser: allows you to perform secret-related operations.</li>
     * </ul>
     * <p>You can select both.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;RbacPermission/Template/CryptoServiceKeyUser&quot;, &quot;RbacPermission/Template/CryptoServiceSecretUser&quot;]</p>
     */
    @NameInMap("Permissions")
    public String permissions;

    /**
     * <p>The key and secret that are allowed to access after the update.</p>
     * <ul>
     * <li>Key: Enter a key in the <code>key/${KeyId}</code> format. To allow access to all keys of a KMS instance, enter key/\*.</li>
     * <li>Secret: Enter a secret in the <code>secret/${SecretName}</code> format. To allow access to all secrets of a KMS instance, enter secret/\*.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;secret/acs/ram/user/ram-secret&quot;, &quot;secret/acs/ram/user/acr-master&quot;, &quot;key/key-hzz63d9c8d3dfv8cv****&quot;]</p>
     */
    @NameInMap("Resources")
    public String resources;

    public static UpdatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyRequest self = new UpdatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyRequest setAccessControlRules(String accessControlRules) {
        this.accessControlRules = accessControlRules;
        return this;
    }
    public String getAccessControlRules() {
        return this.accessControlRules;
    }

    public UpdatePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePolicyRequest setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }
    public String getPermissions() {
        return this.permissions;
    }

    public UpdatePolicyRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
