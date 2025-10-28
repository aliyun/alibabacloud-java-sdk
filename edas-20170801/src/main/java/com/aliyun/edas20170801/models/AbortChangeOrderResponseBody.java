// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AbortChangeOrderResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The change process.</p>
     */
    @NameInMap("Data")
    public AbortChangeOrderResponseBodyData data;

    /**
     * <p>The error code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>57F146F6-3C94-<strong><strong>-</strong></strong>-A66EF4B9*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the trace.</p>
     * 
     * <strong>example:</strong>
     * <p>0b59000b15947<strong><strong>55688656d</strong></strong></p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static AbortChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbortChangeOrderResponseBody self = new AbortChangeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public AbortChangeOrderResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AbortChangeOrderResponseBody setData(AbortChangeOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AbortChangeOrderResponseBodyData getData() {
        return this.data;
    }

    public AbortChangeOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AbortChangeOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AbortChangeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AbortChangeOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AbortChangeOrderResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change process.</p>
         * 
         * <strong>example:</strong>
         * <p>4f038ddf-b27b-<strong><strong>-</strong></strong>-88e44375****</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static AbortChangeOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AbortChangeOrderResponseBodyData self = new AbortChangeOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AbortChangeOrderResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
