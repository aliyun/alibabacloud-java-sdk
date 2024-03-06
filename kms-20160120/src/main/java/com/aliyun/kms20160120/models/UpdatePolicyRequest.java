// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdatePolicyRequest extends TeaModel {
    /**
     * <p>The access control rule.</p>
     * <br>
     * <p>> For more information about how to query created access control rules, see [ListNetworkRules](~~2539433~~).</p>
     */
    @NameInMap("AccessControlRules")
    public String accessControlRules;

    /**
     * <p>The description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the permission policy that you want to update.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operations that are supported by the updated policy. Valid values:</p>
     * <br>
     * <p>*   RbacPermission/Template/CryptoServiceKeyUser: allows you to perform cryptographic operations.</p>
     * <p>*   RbacPermission/Template/CryptoServiceSecretUser: allows you to perform secret-related operations.</p>
     * <br>
     * <p>You can select both.</p>
     */
    @NameInMap("Permissions")
    public String permissions;

    /**
     * <p>The key and secret that are allowed to access after the update.</p>
     * <br>
     * <p>*   Key: Enter a key in the `key/${KeyId}` format. To allow access to all keys of a KMS instance, enter key/\*.</p>
     * <p>*   Secret: Enter a secret in the `secret/${SecretName}` format. To allow access to all secrets of a KMS instance, enter secret/\*.</p>
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
