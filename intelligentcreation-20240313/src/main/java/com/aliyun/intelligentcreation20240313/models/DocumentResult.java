// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DocumentResult extends TeaModel {
    @NameInMap("documentInfo")
    public DocumentInfo documentInfo;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DocumentResult build(java.util.Map<String, ?> map) throws Exception {
        DocumentResult self = new DocumentResult();
        return TeaModel.build(map, self);
    }

    public DocumentResult setDocumentInfo(DocumentInfo documentInfo) {
        this.documentInfo = documentInfo;
        return this;
    }
    public DocumentInfo getDocumentInfo() {
        return this.documentInfo;
    }

    public DocumentResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
