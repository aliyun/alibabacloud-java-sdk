// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class ReIndexRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8326472354762354</p>
     */
    @NameInMap("documentId")
    public String documentId;

    public static ReIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        ReIndexRequest self = new ReIndexRequest();
        return TeaModel.build(map, self);
    }

    public ReIndexRequest setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }
    public String getDocumentId() {
        return this.documentId;
    }

}
