// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateSAMLProviderRequest extends TeaModel {
    /**
     * <p>The description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The metadata file, which is Base64 encoded.</p>
     * <br>
     * <p>The file is provided by an IdP that supports SAML 2.0.</p>
     */
    @NameInMap("EncodedSAMLMetadataDocument")
    public String encodedSAMLMetadataDocument;

    /**
     * <p>The name of the IdP.</p>
     * <br>
     * <p>The value can be up to 128 characters in length. The name can contain letters, digits,`  periods (.), hyphens (-), and underscores (_) `. The name cannot start or end with`  periods (.), hyphens (-), or underscores (_) `.</p>
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
