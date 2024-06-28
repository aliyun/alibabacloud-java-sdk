// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToExcelJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>noPermission</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitConvertPdfToExcelJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43A29C77-405E-4CC0-BC55-EE694AD00655</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>docmind-20220816-15bc7965</p>
         */
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
