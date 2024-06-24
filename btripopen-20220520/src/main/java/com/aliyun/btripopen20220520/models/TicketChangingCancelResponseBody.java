// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingCancelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TicketChangingCancelResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>210f079e16603757182131635d866a</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TicketChangingCancelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingCancelResponseBody self = new TicketChangingCancelResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketChangingCancelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TicketChangingCancelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TicketChangingCancelResponseBody setModule(TicketChangingCancelResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TicketChangingCancelResponseBodyModule getModule() {
        return this.module;
    }

    public TicketChangingCancelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketChangingCancelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TicketChangingCancelResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TicketChangingCancelResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0000-00-00 00:00:00</p>
         */
        @NameInMap("cancel_time")
        public String cancelTime;

        /**
         * <strong>example:</strong>
         * <p>mid1243</p>
         */
        @NameInMap("dis_sub_order_id")
        public String disSubOrderId;

        @NameInMap("status")
        public String status;

        public static TicketChangingCancelResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingCancelResponseBodyModule self = new TicketChangingCancelResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TicketChangingCancelResponseBodyModule setCancelTime(String cancelTime) {
            this.cancelTime = cancelTime;
            return this;
        }
        public String getCancelTime() {
            return this.cancelTime;
        }

        public TicketChangingCancelResponseBodyModule setDisSubOrderId(String disSubOrderId) {
            this.disSubOrderId = disSubOrderId;
            return this;
        }
        public String getDisSubOrderId() {
            return this.disSubOrderId;
        }

        public TicketChangingCancelResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
