// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ExtractDocumentTextResponseBody extends TeaModel {
    @NameInMap("DocumentText")
    public String documentText;

    /**
     * <strong>example:</strong>
     * <p>94D6F994-E298-037E-8E8B-0090F27*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExtractDocumentTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtractDocumentTextResponseBody self = new ExtractDocumentTextResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtractDocumentTextResponseBody setDocumentText(String documentText) {
        this.documentText = documentText;
        return this;
    }
    public String getDocumentText() {
        return this.documentText;
    }

    public ExtractDocumentTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
