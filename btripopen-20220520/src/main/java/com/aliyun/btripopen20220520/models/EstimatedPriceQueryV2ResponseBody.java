// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EstimatedPriceQueryV2ResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("module")
    public java.util.List<EstimatedPriceQueryV2ResponseBodyModule> module;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>210bcc3a16583004579056128d33d7</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static EstimatedPriceQueryV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EstimatedPriceQueryV2ResponseBody self = new EstimatedPriceQueryV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public EstimatedPriceQueryV2ResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public EstimatedPriceQueryV2ResponseBody setModule(java.util.List<EstimatedPriceQueryV2ResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<EstimatedPriceQueryV2ResponseBodyModule> getModule() {
        return this.module;
    }

    public EstimatedPriceQueryV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EstimatedPriceQueryV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EstimatedPriceQueryV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class EstimatedPriceQueryV2ResponseBodyModule extends TeaModel {
        /**
         * <p>The category, such as flight, hotel, or train.</p>
         * 
         * <strong>example:</strong>
         * <p>flight</p>
         */
        @NameInMap("biz_type")
        public String bizType;

        /**
         * <p>The price map. Key: min and max.</p>
         */
        @NameInMap("price_map")
        public java.util.Map<String, ModulePriceMapValue> priceMap;

        /**
         * <p>The type, such as economy class, business class, first class, G/D train, other, or travel standard.</p>
         * 
         * <strong>example:</strong>
         * <p>经济舱</p>
         */
        @NameInMap("type")
        public String type;

        public static EstimatedPriceQueryV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            EstimatedPriceQueryV2ResponseBodyModule self = new EstimatedPriceQueryV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public EstimatedPriceQueryV2ResponseBodyModule setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public EstimatedPriceQueryV2ResponseBodyModule setPriceMap(java.util.Map<String, ModulePriceMapValue> priceMap) {
            this.priceMap = priceMap;
            return this;
        }
        public java.util.Map<String, ModulePriceMapValue> getPriceMap() {
            return this.priceMap;
        }

        public EstimatedPriceQueryV2ResponseBodyModule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
