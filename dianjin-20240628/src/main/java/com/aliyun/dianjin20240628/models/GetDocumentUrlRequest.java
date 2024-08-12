// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDocumentUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12681367362</p>
     */
    @NameInMap("documentId")
    public String documentId;

    public static GetDocumentUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentUrlRequest self = new GetDocumentUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentUrlRequest setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

}
