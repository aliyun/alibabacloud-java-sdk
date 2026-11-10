// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateRegistryModuleRequest extends TeaModel {
    /**
     * <p>The permissions. Valid values: private: Private.</p>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("acl")
    public String acl;

    /**
     * <p>The client token used to ensure idempotence. Format: [0-9a-zA-Z-]{1,64}. We recommend that you use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The description of the Registry template.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the Registry template. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 3 to 63 characters in length.</li>
     * <li>The name can contain uppercase and lowercase letters, digits, hyphens (-), and underscores (_), and cannot start or end with a hyphen.</li>
     * <li>The name must be unique among the resources in the workspace.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ModuleName</p>
     */
    @NameInMap("moduleName")
    public String moduleName;

    /**
     * <p>The name of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NamespaceName</p>
     */
    @NameInMap("namespaceName")
    public String namespaceName;

    /**
     * <p>The provider type. Valid values: alicloud: Alibaba Cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>alicloud</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>The template type. Valid values: self: Custom template.</p>
     * 
     * <strong>example:</strong>
     * <p>self</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateRegistryModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRegistryModuleRequest self = new CreateRegistryModuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRegistryModuleRequest setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

    public CreateRegistryModuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRegistryModuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRegistryModuleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public CreateRegistryModuleRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public CreateRegistryModuleRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateRegistryModuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
