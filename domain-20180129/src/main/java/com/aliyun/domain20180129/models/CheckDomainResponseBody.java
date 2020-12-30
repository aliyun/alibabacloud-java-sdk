// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Avail")
    public String avail;

    @NameInMap("Price")
    public Long price;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Premium")
    public String premium;

    @NameInMap("DynamicCheck")
    public Boolean dynamicCheck;

    @NameInMap("Reason")
    public String reason;

    public static CheckDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainResponseBody self = new CheckDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDomainResponseBody setAvail(String avail) {
        this.avail = avail;
        return this;
    }
    public String getAvail() {
        return this.avail;
    }

    public CheckDomainResponseBody setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public CheckDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CheckDomainResponseBody setPremium(String premium) {
        this.premium = premium;
        return this;
    }
    public String getPremium() {
        return this.premium;
    }

    public CheckDomainResponseBody setDynamicCheck(Boolean dynamicCheck) {
        this.dynamicCheck = dynamicCheck;
        return this;
    }
    public Boolean getDynamicCheck() {
        return this.dynamicCheck;
    }

    public CheckDomainResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
