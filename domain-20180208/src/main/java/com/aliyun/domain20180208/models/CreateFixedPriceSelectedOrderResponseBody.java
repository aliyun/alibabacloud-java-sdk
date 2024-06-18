// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CreateFixedPriceSelectedOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DomainNotOnSale</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Module")
    public CreateFixedPriceSelectedOrderResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>C50E41A0-09F1-4491-8DB8-AF55BD2D0CC8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateFixedPriceSelectedOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFixedPriceSelectedOrderResponseBody self = new CreateFixedPriceSelectedOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFixedPriceSelectedOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateFixedPriceSelectedOrderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateFixedPriceSelectedOrderResponseBody setModule(CreateFixedPriceSelectedOrderResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CreateFixedPriceSelectedOrderResponseBodyModule getModule() {
        return this.module;
    }

    public CreateFixedPriceSelectedOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFixedPriceSelectedOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateFixedPriceSelectedOrderResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>31199295f2074ce895645d386cb22c36</p>
         */
        @NameInMap("OrderNo")
        public String orderNo;

        /**
         * <strong>example:</strong>
         * <p>20.00</p>
         */
        @NameInMap("Price")
        public Long price;

        public static CreateFixedPriceSelectedOrderResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CreateFixedPriceSelectedOrderResponseBodyModule self = new CreateFixedPriceSelectedOrderResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CreateFixedPriceSelectedOrderResponseBodyModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateFixedPriceSelectedOrderResponseBodyModule setOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }
        public String getOrderNo() {
            return this.orderNo;
        }

        public CreateFixedPriceSelectedOrderResponseBodyModule setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

    }

}
