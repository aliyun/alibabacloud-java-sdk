// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToExcelJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitConvertPdfToExcelJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitConvertPdfToExcelJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertPdfToExcelJobResponseBody self = new SubmitConvertPdfToExcelJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitConvertPdfToExcelJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitConvertPdfToExcelJobResponseBody setData(SubmitConvertPdfToExcelJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitConvertPdfToExcelJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitConvertPdfToExcelJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitConvertPdfToExcelJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitConvertPdfToExcelJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitConvertPdfToExcelJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitConvertPdfToExcelJobResponseBodyData self = new SubmitConvertPdfToExcelJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitConvertPdfToExcelJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
