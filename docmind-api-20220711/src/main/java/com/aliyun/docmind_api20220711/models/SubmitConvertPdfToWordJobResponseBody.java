// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToWordJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitConvertPdfToWordJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitConvertPdfToWordJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToWordJobResponseBody self = new SubmitConvertPdfToWordJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToWordJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitConvertPdfToWordJobResponseBody setData(SubmitConvertPdfToWordJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitConvertPdfToWordJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitConvertPdfToWordJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitConvertPdfToWordJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitConvertPdfToWordJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitConvertPdfToWordJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitConvertPdfToWordJobResponseBodyData self = new SubmitConvertPdfToWordJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitConvertPdfToWordJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
