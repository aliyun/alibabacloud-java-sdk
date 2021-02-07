// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateSAMLProviderRequest extends TeaModel {
    @NameInMap("SAMLProviderName")
    public String SAMLProviderName;

    @NameInMap("SAMLMetadataDocument")
    public String SAMLMetadataDocument;

    @NameInMap("Description")
    public String description;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    @NameInMap("EncodedSAMLMetadataDocument")
    public String encodedSAMLMetadataDocument;

    public static CreateSAMLProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSAMLProviderRequest self = new CreateSAMLProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateSAMLProviderRequest setSAMLProviderName(String SAMLProviderName) {
        this.SAMLProviderName = SAMLProviderName;
        return this;
    }
    public String getSAMLProviderName() {
        return this.SAMLProviderName;
    }

    public CreateSAMLProviderRequest setSAMLMetadataDocument(String SAMLMetadataDocument) {
        this.SAMLMetadataDocument = SAMLMetadataDocument;
        return this;
    }
    public String getSAMLMetadataDocument() {
        return this.SAMLMetadataDocument;
    }

    public CreateSAMLProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSAMLProviderRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

    public CreateSAMLProviderRequest setEncodedSAMLMetadataDocument(String encodedSAMLMetadataDocument) {
        this.encodedSAMLMetadataDocument = encodedSAMLMetadataDocument;
        return this;
    }
    public String getEncodedSAMLMetadataDocument() {
        return this.encodedSAMLMetadataDocument;
    }

}
