// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateSAMLProviderRequest extends TeaModel {
    @NameInMap("SAMLProviderName")
    @Validation(required = true)
    public String SAMLProviderName;

    @NameInMap("NewDescription")
    public String newDescription;

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

    public UpdateSAMLProviderRequest setNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }
    public String getNewDescription() {
        return this.newDescription;
    }

    public UpdateSAMLProviderRequest setNewEncodedSAMLMetadataDocument(String newEncodedSAMLMetadataDocument) {
        this.newEncodedSAMLMetadataDocument = newEncodedSAMLMetadataDocument;
        return this;
    }
    public String getNewEncodedSAMLMetadataDocument() {
        return this.newEncodedSAMLMetadataDocument;
    }

}
