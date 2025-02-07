// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateSAMLProviderRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a provider.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The metadata file which is Base64-encoded.</p>
     * <p>The file is provided by an IdP that supports Security Assertion Markup Language (SAML) 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>PD94bWwgdmVy****</p>
     */
    @NameInMap("EncodedSAMLMetadataDocument")
    public String encodedSAMLMetadataDocument;

    /**
     * <p>The name of the IdP.</p>
     * <p>The name can be up to 128 characters in length. The name can contain letters, digits, <code>periods (.), hyphens (-), and underscores (_)</code>. The name cannot start or end with <code>periods (.), hyphens (-), or underscores (_)</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-provider</p>
     */
    @NameInMap("SAMLProviderName")
    public String SAMLProviderName;

    public static CreateSAMLProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSAMLProviderRequest self = new CreateSAMLProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateSAMLProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSAMLProviderRequest setEncodedSAMLMetadataDocument(String encodedSAMLMetadataDocument) {
        this.encodedSAMLMetadataDocument = encodedSAMLMetadataDocument;
        return this;
    }
    public String getEncodedSAMLMetadataDocument() {
        return this.encodedSAMLMetadataDocument;
    }

    public CreateSAMLProviderRequest setSAMLProviderName(String SAMLProviderName) {
        this.SAMLProviderName = SAMLProviderName;
        return this;
    }
    public String getSAMLProviderName() {
        return this.SAMLProviderName;
    }

}
