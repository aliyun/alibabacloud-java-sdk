// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RollbackChangeOrderResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("Data")
    public RollbackChangeOrderResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Code")
    public Integer code;

    public static RollbackChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackChangeOrderResponseBody self = new RollbackChangeOrderResponseBody();
        return TeaModel.build(map, self);
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

    public RollbackChangeOrderResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class AbortAndRollbackChangeOrderResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static AbortAndRollbackChangeOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AbortAndRollbackChangeOrderResponseBodyData self = new AbortAndRollbackChangeOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AbortAndRollbackChangeOrderResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

    public static class RollbackChangeOrderResponseBodyData extends TeaModel {
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
