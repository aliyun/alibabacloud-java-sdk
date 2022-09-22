// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToImageJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitConvertPdfToImageJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitConvertPdfToImageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToImageJobResponseBody self = new SubmitConvertPdfToImageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToImageJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitConvertPdfToImageJobResponseBody setData(SubmitConvertPdfToImageJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitConvertPdfToImageJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitConvertPdfToImageJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitConvertPdfToImageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitConvertPdfToImageJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitConvertPdfToImageJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitConvertPdfToImageJobResponseBodyData self = new SubmitConvertPdfToImageJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitConvertPdfToImageJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
