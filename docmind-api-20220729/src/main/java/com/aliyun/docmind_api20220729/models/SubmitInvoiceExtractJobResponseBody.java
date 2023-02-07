// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitInvoiceExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitInvoiceExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitInvoiceExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitInvoiceExtractJobResponseBody self = new SubmitInvoiceExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitInvoiceExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitInvoiceExtractJobResponseBody setData(SubmitInvoiceExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitInvoiceExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitInvoiceExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitInvoiceExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitInvoiceExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitInvoiceExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitInvoiceExtractJobResponseBodyData self = new SubmitInvoiceExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitInvoiceExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
