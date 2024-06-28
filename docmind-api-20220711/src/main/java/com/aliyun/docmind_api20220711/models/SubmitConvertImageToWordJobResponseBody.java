// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToWordJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>noPermission</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitConvertImageToWordJobResponseBodyData data;

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

    public static SubmitConvertImageToWordJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToWordJobResponseBody self = new SubmitConvertImageToWordJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToWordJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitConvertImageToWordJobResponseBody setData(SubmitConvertImageToWordJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitConvertImageToWordJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitConvertImageToWordJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitConvertImageToWordJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitConvertImageToWordJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>docmind-20220810-7c5f9dd4</p>
         */
        @NameInMap("Id")
        public String id;

        public static SubmitConvertImageToWordJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitConvertImageToWordJobResponseBodyData self = new SubmitConvertImageToWordJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitConvertImageToWordJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
