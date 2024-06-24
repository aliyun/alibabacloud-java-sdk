// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderCreateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelOrderCreateResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
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
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static HotelOrderCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderCreateResponseBody self = new HotelOrderCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelOrderCreateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelOrderCreateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelOrderCreateResponseBody setModule(HotelOrderCreateResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelOrderCreateResponseBodyModule getModule() {
        return this.module;
    }

    public HotelOrderCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelOrderCreateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelOrderCreateResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelOrderCreateResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("btrip_order_id")
        public Long btripOrderId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_price")
        public Long totalPrice;

        public static HotelOrderCreateResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderCreateResponseBodyModule self = new HotelOrderCreateResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelOrderCreateResponseBodyModule setBtripOrderId(Long btripOrderId) {
            this.btripOrderId = btripOrderId;
            return this;
        }
        public Long getBtripOrderId() {
            return this.btripOrderId;
        }

        public HotelOrderCreateResponseBodyModule setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Long getTotalPrice() {
            return this.totalPrice;
        }

    }

}
