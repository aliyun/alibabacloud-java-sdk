// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CreateFixedPriceDemandOrderResponseBody extends TeaModel {
    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // module
    @NameInMap("Module")
    public CreateFixedPriceDemandOrderResponseBodyModule module;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static CreateFixedPriceDemandOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFixedPriceDemandOrderResponseBody self = new CreateFixedPriceDemandOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFixedPriceDemandOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateFixedPriceDemandOrderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateFixedPriceDemandOrderResponseBody setModule(CreateFixedPriceDemandOrderResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CreateFixedPriceDemandOrderResponseBodyModule getModule() {
        return this.module;
    }

    public CreateFixedPriceDemandOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFixedPriceDemandOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateFixedPriceDemandOrderResponseBodyModule extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("OrderNo")
        public String orderNo;

        @NameInMap("Price")
        public Long price;

        public static CreateFixedPriceDemandOrderResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CreateFixedPriceDemandOrderResponseBodyModule self = new CreateFixedPriceDemandOrderResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CreateFixedPriceDemandOrderResponseBodyModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateFixedPriceDemandOrderResponseBodyModule setOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }
        public String getOrderNo() {
            return this.orderNo;
        }

        public CreateFixedPriceDemandOrderResponseBodyModule setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

    }

}
