// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainRealTimePriceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4000</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>非法参数</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>3002</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>非法参数</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Module")
    public QueryDomainRealTimePriceResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>A4A4F72C-8E8E-19D2-BCC1-21E41D334A75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Synchro")
    public Boolean synchro;

    public static QueryDomainRealTimePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainRealTimePriceResponseBody self = new QueryDomainRealTimePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainRealTimePriceResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryDomainRealTimePriceResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryDomainRealTimePriceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryDomainRealTimePriceResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryDomainRealTimePriceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryDomainRealTimePriceResponseBody setModule(QueryDomainRealTimePriceResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryDomainRealTimePriceResponseBodyModule getModule() {
        return this.module;
    }

    public QueryDomainRealTimePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainRealTimePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDomainRealTimePriceResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class QueryDomainRealTimePriceResponseBodyModuleDomainPrices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>renew</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Avail")
        public Integer avail;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>xxx.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        @NameInMap("Premium")
        public Boolean premium;

        /**
         * <strong>example:</strong>
         * <p>16.22</p>
         */
        @NameInMap("Price")
        public Double price;

        /**
         * <strong>example:</strong>
         * <p>不可续费</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static QueryDomainRealTimePriceResponseBodyModuleDomainPrices build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainRealTimePriceResponseBodyModuleDomainPrices self = new QueryDomainRealTimePriceResponseBodyModuleDomainPrices();
            return TeaModel.build(map, self);
        }

        public QueryDomainRealTimePriceResponseBodyModuleDomainPrices setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryDomainRealTimePriceResponseBodyModuleDomainPrices setAvail(Integer avail) {
            this.avail = avail;
            return this;
        }
        public Integer getAvail() {
            return this.avail;
        }

        public QueryDomainRealTimePriceResponseBodyModuleDomainPrices setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryDomainRealTimePriceResponseBodyModuleDomainPrices setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryDomainRealTimePriceResponseBodyModuleDomainPrices setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public QueryDomainRealTimePriceResponseBodyModuleDomainPrices setPremium(Boolean premium) {
            this.premium = premium;
            return this;
        }
        public Boolean getPremium() {
            return this.premium;
        }

        public QueryDomainRealTimePriceResponseBodyModuleDomainPrices setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public QueryDomainRealTimePriceResponseBodyModuleDomainPrices setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class QueryDomainRealTimePriceResponseBodyModule extends TeaModel {
        @NameInMap("DomainPrices")
        public java.util.List<QueryDomainRealTimePriceResponseBodyModuleDomainPrices> domainPrices;

        public static QueryDomainRealTimePriceResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainRealTimePriceResponseBodyModule self = new QueryDomainRealTimePriceResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryDomainRealTimePriceResponseBodyModule setDomainPrices(java.util.List<QueryDomainRealTimePriceResponseBodyModuleDomainPrices> domainPrices) {
            this.domainPrices = domainPrices;
            return this;
        }
        public java.util.List<QueryDomainRealTimePriceResponseBodyModuleDomainPrices> getDomainPrices() {
            return this.domainPrices;
        }

    }

}
