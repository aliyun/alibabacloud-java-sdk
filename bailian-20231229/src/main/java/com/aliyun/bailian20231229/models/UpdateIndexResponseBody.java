// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateIndexResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateIndexResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Required parameter(%s) missing or invalid, please check the request parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>17204B98-7734-4F9A-8464-xxx</p>
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

    public static UpdateIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIndexResponseBody self = new UpdateIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIndexResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateIndexResponseBody setData(UpdateIndexResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateIndexResponseBodyData getData() {
        return this.data;
    }

    public UpdateIndexResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateIndexResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateIndexResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateIndexResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>79c0alxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        public static UpdateIndexResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateIndexResponseBodyData self = new UpdateIndexResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateIndexResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
