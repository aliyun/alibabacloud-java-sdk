// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class SubmitIndexAddDocumentsJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Index.InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitIndexAddDocumentsJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>778C0B3B-03C1-5FC1-A947-36EDD13606AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitIndexAddDocumentsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitIndexAddDocumentsJobResponseBody self = new SubmitIndexAddDocumentsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitIndexAddDocumentsJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitIndexAddDocumentsJobResponseBody setData(SubmitIndexAddDocumentsJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitIndexAddDocumentsJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitIndexAddDocumentsJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitIndexAddDocumentsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitIndexAddDocumentsJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SubmitIndexAddDocumentsJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitIndexAddDocumentsJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>42687eb254a34802bed398357f5498ae</p>
         */
        @NameInMap("Id")
        public String id;

        public static SubmitIndexAddDocumentsJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitIndexAddDocumentsJobResponseBodyData self = new SubmitIndexAddDocumentsJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitIndexAddDocumentsJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
