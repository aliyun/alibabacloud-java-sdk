// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class SubmitIndexJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitIndexJobResponseBodyData data;

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
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitIndexJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitIndexJobResponseBody self = new SubmitIndexJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitIndexJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitIndexJobResponseBody setData(SubmitIndexJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitIndexJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitIndexJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitIndexJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitIndexJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SubmitIndexJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitIndexJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eFDr2fGRzP9gdDZWAdo3YQ==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>khdyak1uuj</p>
         */
        @NameInMap("IndexId")
        public String indexId;

        public static SubmitIndexJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitIndexJobResponseBodyData self = new SubmitIndexJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitIndexJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitIndexJobResponseBodyData setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

    }

}
