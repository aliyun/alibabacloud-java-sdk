// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocumentCompareJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitDocumentCompareJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDocumentCompareJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentCompareJobResponseBody self = new SubmitDocumentCompareJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentCompareJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitDocumentCompareJobResponseBody setData(SubmitDocumentCompareJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitDocumentCompareJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitDocumentCompareJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitDocumentCompareJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitDocumentCompareJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitDocumentCompareJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocumentCompareJobResponseBodyData self = new SubmitDocumentCompareJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitDocumentCompareJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
