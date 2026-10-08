// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckDomainResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the domain name can be registered. Valid values:  </p>
     * <ul>
     * <li><strong>1</strong>: Registrable.  </li>
     * <li><strong>3</strong>: Pre-registration.  </li>
     * <li><strong>4</strong>: Deletion reservation available.  </li>
     * <li><strong>0</strong>: Not registrable.  </li>
     * <li><strong>-1</strong>: Abnormal.  </li>
     * <li><strong>-2</strong>: Registration paused.  </li>
     * <li><strong>-3</strong>: Blacklisted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Avail")
    public String avail;

    /**
     * <p>The queried domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>test**.xin</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Indicates whether dynamic pricing is enabled. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Yes.  </li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DynamicCheck")
    public Boolean dynamicCheck;

    /**
     * <p>Indicates whether the domain name is a premium term. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Yes.  </li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Premium")
    public String premium;

    /**
     * <p>Registration price for premium domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>1286</p>
     */
    @NameInMap("Price")
    public Long price;

    /**
     * <p>The reason for non-registrability returned by the domain name registry.  </p>
     * <blockquote>
     * <p>The reason may vary depending on the domain name registry.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>In use</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>Unique request access token.</p>
     * 
     * <strong>example:</strong>
     * <p>BA7A4FD4-EB9A-4A20-BB0C-9AEB15634DC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StaticPriceInfo")
    public CheckDomainResponseBodyStaticPriceInfo staticPriceInfo;

    public static CheckDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainResponseBody self = new CheckDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDomainResponseBody setAvail(String avail) {
        this.avail = avail;
        return this;
    }
    public String getAvail() {
        return this.avail;
    }

    public CheckDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CheckDomainResponseBody setDynamicCheck(Boolean dynamicCheck) {
        this.dynamicCheck = dynamicCheck;
        return this;
    }
    public Boolean getDynamicCheck() {
        return this.dynamicCheck;
    }

    public CheckDomainResponseBody setPremium(String premium) {
        this.premium = premium;
        return this;
    }
    public String getPremium() {
        return this.premium;
    }

    public CheckDomainResponseBody setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public CheckDomainResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CheckDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDomainResponseBody setStaticPriceInfo(CheckDomainResponseBodyStaticPriceInfo staticPriceInfo) {
        this.staticPriceInfo = staticPriceInfo;
        return this;
    }
    public CheckDomainResponseBodyStaticPriceInfo getStaticPriceInfo() {
        return this.staticPriceInfo;
    }

    public static class CheckDomainResponseBodyStaticPriceInfoPriceInfo extends TeaModel {
        @NameInMap("action")
        public String action;

        @NameInMap("money")
        public Double money;

        @NameInMap("period")
        public Long period;

        public static CheckDomainResponseBodyStaticPriceInfoPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            CheckDomainResponseBodyStaticPriceInfoPriceInfo self = new CheckDomainResponseBodyStaticPriceInfoPriceInfo();
            return TeaModel.build(map, self);
        }

        public CheckDomainResponseBodyStaticPriceInfoPriceInfo setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CheckDomainResponseBodyStaticPriceInfoPriceInfo setMoney(Double money) {
            this.money = money;
            return this;
        }
        public Double getMoney() {
            return this.money;
        }

        public CheckDomainResponseBodyStaticPriceInfoPriceInfo setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

    }

    public static class CheckDomainResponseBodyStaticPriceInfo extends TeaModel {
        @NameInMap("PriceInfo")
        public java.util.List<CheckDomainResponseBodyStaticPriceInfoPriceInfo> priceInfo;

        public static CheckDomainResponseBodyStaticPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            CheckDomainResponseBodyStaticPriceInfo self = new CheckDomainResponseBodyStaticPriceInfo();
            return TeaModel.build(map, self);
        }

        public CheckDomainResponseBodyStaticPriceInfo setPriceInfo(java.util.List<CheckDomainResponseBodyStaticPriceInfoPriceInfo> priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }
        public java.util.List<CheckDomainResponseBodyStaticPriceInfoPriceInfo> getPriceInfo() {
            return this.priceInfo;
        }

    }

}
