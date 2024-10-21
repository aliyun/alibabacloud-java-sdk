// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckIntlFixPriceDomainStatusResponseBody extends TeaModel {
    @NameInMap("Module")
    public CheckIntlFixPriceDomainStatusResponseBodyModule module;

    /**
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
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>1567353497</p>
         */
        @NameInMap("DeadDate")
        public Long deadDate;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>1567353497</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Premium")
        public Boolean premium;

        /**
         * <strong>example:</strong>
         * <p>20.00</p>
         */
        @NameInMap("Price")
        public Long price;

        /**
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
