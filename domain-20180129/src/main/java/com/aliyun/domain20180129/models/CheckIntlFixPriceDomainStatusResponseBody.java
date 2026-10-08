// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckIntlFixPriceDomainStatusResponseBody extends TeaModel {
    /**
     * <p>The returned object.</p>
     */
    @NameInMap("Module")
    public CheckIntlFixPriceDomainStatusResponseBodyModule module;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40F46D3D-F4F3-4CCB-AC30-2DD20E32E528</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckIntlFixPriceDomainStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckIntlFixPriceDomainStatusResponseBody self = new CheckIntlFixPriceDomainStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckIntlFixPriceDomainStatusResponseBody setModule(CheckIntlFixPriceDomainStatusResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CheckIntlFixPriceDomainStatusResponseBodyModule getModule() {
        return this.module;
    }

    public CheckIntlFixPriceDomainStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckIntlFixPriceDomainStatusResponseBodyModule extends TeaModel {
        /**
         * <p>The currency. Valid values:</p>
         * <ul>
         * <li><p>RMB: Chinese Yuan.</p>
         * </li>
         * <li><p>USD: US Dollar.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The expiration date of the domain name. After this date, the domain name requires renewal.</p>
         * 
         * <strong>example:</strong>
         * <p>1567353497</p>
         */
        @NameInMap("DeadDate")
        public Long deadDate;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The sale deadline of the domain name. After this time, the domain name is no longer available for sale.</p>
         * 
         * <strong>example:</strong>
         * <p>1567353497</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Indicates whether the domain name is a premium domain name. Valid values:</p>
         * <ul>
         * <li><p>true: The domain name is a premium domain name.</p>
         * </li>
         * <li><p>false: The domain name is not a premium domain name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Premium")
        public Boolean premium;

        /**
         * <p>The price.</p>
         * 
         * <strong>example:</strong>
         * <p>20.00</p>
         */
        @NameInMap("Price")
        public Long price;

        /**
         * <p>The registration date of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>1566353497</p>
         */
        @NameInMap("RegDate")
        public Long regDate;

        public static CheckIntlFixPriceDomainStatusResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CheckIntlFixPriceDomainStatusResponseBodyModule self = new CheckIntlFixPriceDomainStatusResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CheckIntlFixPriceDomainStatusResponseBodyModule setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public CheckIntlFixPriceDomainStatusResponseBodyModule setDeadDate(Long deadDate) {
            this.deadDate = deadDate;
            return this;
        }
        public Long getDeadDate() {
            return this.deadDate;
        }

        public CheckIntlFixPriceDomainStatusResponseBodyModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CheckIntlFixPriceDomainStatusResponseBodyModule setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CheckIntlFixPriceDomainStatusResponseBodyModule setPremium(Boolean premium) {
            this.premium = premium;
            return this;
        }
        public Boolean getPremium() {
            return this.premium;
        }

        public CheckIntlFixPriceDomainStatusResponseBodyModule setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public CheckIntlFixPriceDomainStatusResponseBodyModule setRegDate(Long regDate) {
            this.regDate = regDate;
            return this;
        }
        public Long getRegDate() {
            return this.regDate;
        }

    }

}
