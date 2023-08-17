// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class ReClassifyTradeDocumentExtractResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReClassifyTradeDocumentExtractResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ReClassifyTradeDocumentExtractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReClassifyTradeDocumentExtractResponseBody self = new ReClassifyTradeDocumentExtractResponseBody();
        return TeaModel.build(map, self);
    }

    public ReClassifyTradeDocumentExtractResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReClassifyTradeDocumentExtractResponseBody setData(ReClassifyTradeDocumentExtractResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReClassifyTradeDocumentExtractResponseBodyData getData() {
        return this.data;
    }

    public ReClassifyTradeDocumentExtractResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReClassifyTradeDocumentExtractResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ReClassifyTradeDocumentExtractResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static ReClassifyTradeDocumentExtractResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReClassifyTradeDocumentExtractResponseBodyData self = new ReClassifyTradeDocumentExtractResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReClassifyTradeDocumentExtractResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
