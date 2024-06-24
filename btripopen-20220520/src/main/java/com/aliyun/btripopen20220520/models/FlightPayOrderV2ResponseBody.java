// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightPayOrderV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public FlightPayOrderV2ResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
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
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightPayOrderV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightPayOrderV2ResponseBody self = new FlightPayOrderV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightPayOrderV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightPayOrderV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightPayOrderV2ResponseBody setModule(FlightPayOrderV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightPayOrderV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightPayOrderV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightPayOrderV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightPayOrderV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightPayOrderV2ResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>51000</p>
         */
        @NameInMap("price")
        public Long price;

        public static FlightPayOrderV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightPayOrderV2ResponseBodyModule self = new FlightPayOrderV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightPayOrderV2ResponseBodyModule setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

    }

}
