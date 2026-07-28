// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateRegistryNamespaceAttributeRequest extends TeaModel {
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
     * <p>2da11a5501f18cc5e004</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The description of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateRegistryNamespaceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegistryNamespaceAttributeRequest self = new UpdateRegistryNamespaceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRegistryNamespaceAttributeRequest setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

    public UpdateRegistryNamespaceAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRegistryNamespaceAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
