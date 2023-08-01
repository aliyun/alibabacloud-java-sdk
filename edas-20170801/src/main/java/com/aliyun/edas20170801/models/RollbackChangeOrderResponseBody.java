// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RollbackChangeOrderResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the change process.</p>
     */
    @NameInMap("Data")
    public RollbackChangeOrderResponseBodyData data;

    /**
     * <p>The error code that is returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the trace.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static RollbackChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackChangeOrderResponseBody self = new RollbackChangeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackChangeOrderResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RollbackChangeOrderResponseBody setData(RollbackChangeOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RollbackChangeOrderResponseBodyData getData() {
        return this.data;
    }

    public RollbackChangeOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RollbackChangeOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RollbackChangeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RollbackChangeOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class RollbackChangeOrderResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change process.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static RollbackChangeOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RollbackChangeOrderResponseBodyData self = new RollbackChangeOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RollbackChangeOrderResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
