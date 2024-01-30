// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class CheckDomainResponseBody extends TeaModel {
    @NameInMap("Avail")
    public String avail;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DynamicCheck")
    public Boolean dynamicCheck;

    @NameInMap("Premium")
    public String premium;

    @NameInMap("Price")
    public Long price;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RequestId")
    public String requestId;

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

}
