// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AbortAndRollbackChangeOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public AbortAndRollbackChangeOrderResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static AbortAndRollbackChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbortAndRollbackChangeOrderResponseBody self = new AbortAndRollbackChangeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public AbortAndRollbackChangeOrderResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AbortAndRollbackChangeOrderResponseBody setData(AbortAndRollbackChangeOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AbortAndRollbackChangeOrderResponseBodyData getData() {
        return this.data;
    }

    public AbortAndRollbackChangeOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AbortAndRollbackChangeOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AbortAndRollbackChangeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AbortAndRollbackChangeOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
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

}
