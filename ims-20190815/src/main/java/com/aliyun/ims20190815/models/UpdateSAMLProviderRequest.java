// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateSAMLProviderRequest extends TeaModel {
    @NameInMap("SAMLProviderName")
    public String SAMLProviderName;

    @NameInMap("NewSAMLMetadataDocument")
    public String newSAMLMetadataDocument;

    @NameInMap("NewDescription")
    public String newDescription;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    @NameInMap("NewEncodedSAMLMetadataDocument")
    public String newEncodedSAMLMetadataDocument;

    public static UpdateSAMLProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSAMLProviderRequest self = new UpdateSAMLProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSAMLProviderRequest setSAMLProviderName(String SAMLProviderName) {
        this.SAMLProviderName = SAMLProviderName;
        return this;
    }
    public String getSAMLProviderName() {
        return this.SAMLProviderName;
    }

    public UpdateSAMLProviderRequest setNewSAMLMetadataDocument(String newSAMLMetadataDocument) {
        this.newSAMLMetadataDocument = newSAMLMetadataDocument;
        return this;
    }
    public String getNewSAMLMetadataDocument() {
        return this.newSAMLMetadataDocument;
    }

    public UpdateSAMLProviderRequest setNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }
    public String getNewDescription() {
        return this.newDescription;
    }

    public UpdateSAMLProviderRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

    public UpdateSAMLProviderRequest setNewEncodedSAMLMetadataDocument(String newEncodedSAMLMetadataDocument) {
        this.newEncodedSAMLMetadataDocument = newEncodedSAMLMetadataDocument;
        return this;
    }
    public String getNewEncodedSAMLMetadataDocument() {
        return this.newEncodedSAMLMetadataDocument;
    }

}
