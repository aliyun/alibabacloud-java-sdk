// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EstimatedPriceQueryV2ResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("module")
    public java.util.List<EstimatedPriceQueryV2ResponseBodyModule> module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

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
        @NameInMap("biz_type")
        public String bizType;

        @NameInMap("price_map")
        public java.util.Map<String, ModulePriceMapValue> priceMap;

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
