// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class RetryTradeDocumentExtractResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RetryTradeDocumentExtractResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RetryTradeDocumentExtractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryTradeDocumentExtractResponseBody self = new RetryTradeDocumentExtractResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryTradeDocumentExtractResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RetryTradeDocumentExtractResponseBody setData(RetryTradeDocumentExtractResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetryTradeDocumentExtractResponseBodyData getData() {
        return this.data;
    }

    public RetryTradeDocumentExtractResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetryTradeDocumentExtractResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RetryTradeDocumentExtractResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static RetryTradeDocumentExtractResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetryTradeDocumentExtractResponseBodyData self = new RetryTradeDocumentExtractResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetryTradeDocumentExtractResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
