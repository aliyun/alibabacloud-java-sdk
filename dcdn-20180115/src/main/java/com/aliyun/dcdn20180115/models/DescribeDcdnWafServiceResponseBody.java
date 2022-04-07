// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafServiceResponseBody extends TeaModel {
    @NameInMap("Edition")
    public String edition;

    @NameInMap("OpeningTime")
    public String openingTime;

    @NameInMap("RequestBillingType")
    public String requestBillingType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleBillingType")
    public String ruleBillingType;

    @NameInMap("Status")
    public String status;

    public static DescribeDcdnWafServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafServiceResponseBody self = new DescribeDcdnWafServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafServiceResponseBody setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public DescribeDcdnWafServiceResponseBody setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
        return this;
    }
    public String getOpeningTime() {
        return this.openingTime;
    }

    public DescribeDcdnWafServiceResponseBody setRequestBillingType(String requestBillingType) {
        this.requestBillingType = requestBillingType;
        return this;
    }
    public String getRequestBillingType() {
        return this.requestBillingType;
    }

    public DescribeDcdnWafServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafServiceResponseBody setRuleBillingType(String ruleBillingType) {
        this.ruleBillingType = ruleBillingType;
        return this;
    }
    public String getRuleBillingType() {
        return this.ruleBillingType;
    }

    public DescribeDcdnWafServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
