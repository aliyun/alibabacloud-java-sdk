// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class PreviewDocumentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8326472354762354</p>
     */
    @NameInMap("documentId")
    public String documentId;

    public static PreviewDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewDocumentRequest self = new PreviewDocumentRequest();
        return TeaModel.build(map, self);
    }

    public PreviewDocumentRequest setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

}
