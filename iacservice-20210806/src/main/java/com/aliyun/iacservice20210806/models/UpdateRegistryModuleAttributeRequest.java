// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateRegistryModuleAttributeRequest extends TeaModel {
    /**
     * <p>The access permission. Valid values:</p>
     * <ul>
     * <li>private: private.</li>
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
     * <p>The description of the Registry template.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateRegistryModuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegistryModuleAttributeRequest self = new UpdateRegistryModuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRegistryModuleAttributeRequest setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

    public UpdateRegistryModuleAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRegistryModuleAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
