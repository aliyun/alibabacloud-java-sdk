// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocumentExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitDocumentExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDocumentExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentExtractJobResponseBody self = new SubmitDocumentExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitDocumentExtractJobResponseBody setData(SubmitDocumentExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitDocumentExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitDocumentExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitDocumentExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitDocumentExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitDocumentExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocumentExtractJobResponseBodyData self = new SubmitDocumentExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitDocumentExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
