// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateSAMLProviderRequest extends TeaModel {
    /**
     * <p>The new description.</p>
     * <br>
     * <p>>  You must specify at least one of the `NewDescription` and `NewEncodedSAMLMetadataDocument` parameters.</p>
     */
    @NameInMap("NewDescription")
    public String newDescription;

    /**
     * <p>The new metadata file.</p>
     * <br>
     * <p>>  You must specify at least one of the `NewDescription` and `NewEncodedSAMLMetadataDocument` parameters.</p>
     */
    @NameInMap("NewEncodedSAMLMetadataDocument")
    public String newEncodedSAMLMetadataDocument;

    /**
     * <p>The name of the IdP whose information you want to modify.</p>
     */
    @NameInMap("SAMLProviderName")
    public String SAMLProviderName;

    public static UpdateSAMLProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSAMLProviderRequest self = new UpdateSAMLProviderRequest();
        return TeaModel.build(map, self);
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

    public UpdateSAMLProviderRequest setSAMLProviderName(String SAMLProviderName) {
        this.SAMLProviderName = SAMLProviderName;
        return this;
    }
    public String getSAMLProviderName() {
        return this.SAMLProviderName;
    }

}
