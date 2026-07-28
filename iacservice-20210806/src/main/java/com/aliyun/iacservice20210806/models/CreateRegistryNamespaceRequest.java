// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateRegistryNamespaceRequest extends TeaModel {
    /**
     * <p>The access permission. Valid values:</p>
     * <ul>
     * <li>private: private access.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("acl")
    public String acl;

    /**
     * <p>The idempotence token. Format: [0-9a-zA-Z-]{1,64}. Use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The workspace description.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The administrator name.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("maintainer")
    public String maintainer;

    /**
     * <p>The workspace name. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 3 to 63 characters in length.</li>
     * <li>The name can contain uppercase and lowercase letters, digits, hyphens (-), and underscores (_), and cannot start or end with a hyphen.</li>
     * <li>The name must be unique within the global workspace resources.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NamespaceName</p>
     */
    @NameInMap("namespaceName")
    public String namespaceName;

    public static CreateRegistryNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRegistryNamespaceRequest self = new CreateRegistryNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateRegistryNamespaceRequest setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

    public CreateRegistryNamespaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRegistryNamespaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRegistryNamespaceRequest setMaintainer(String maintainer) {
        this.maintainer = maintainer;
        return this;
    }
    public String getMaintainer() {
        return this.maintainer;
    }

    public CreateRegistryNamespaceRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

}
