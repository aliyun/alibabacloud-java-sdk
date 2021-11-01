// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateSAMLProviderRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EncodedSAMLMetadataDocument")
    public String encodedSAMLMetadataDocument;

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
