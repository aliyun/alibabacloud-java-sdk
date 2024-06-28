// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertPdfToWordJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>noPermission</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitConvertPdfToWordJobResponseBodyData data;

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
        /**
         * <strong>example:</strong>
         * <p>docmind-20220816-15bc7965</p>
         */
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
