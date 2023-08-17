// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitTradeDocumentPackageExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitTradeDocumentPackageExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitTradeDocumentPackageExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTradeDocumentPackageExtractJobResponseBody self = new SubmitTradeDocumentPackageExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTradeDocumentPackageExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitTradeDocumentPackageExtractJobResponseBody setData(SubmitTradeDocumentPackageExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitTradeDocumentPackageExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitTradeDocumentPackageExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTradeDocumentPackageExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitTradeDocumentPackageExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitTradeDocumentPackageExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitTradeDocumentPackageExtractJobResponseBodyData self = new SubmitTradeDocumentPackageExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitTradeDocumentPackageExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
