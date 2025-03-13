// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchAddDocumentResult extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("addDocumentResults")
    public java.util.List<AddDocumentResult> addDocumentResults;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static BatchAddDocumentResult build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDocumentResult self = new BatchAddDocumentResult();
        return TeaModel.build(map, self);
    }

    public BatchAddDocumentResult setAddDocumentResults(java.util.List<AddDocumentResult> addDocumentResults) {
        this.addDocumentResults = addDocumentResults;
        return this;
    }
    public java.util.List<AddDocumentResult> getAddDocumentResults() {
        return this.addDocumentResults;
    }

    public BatchAddDocumentResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
