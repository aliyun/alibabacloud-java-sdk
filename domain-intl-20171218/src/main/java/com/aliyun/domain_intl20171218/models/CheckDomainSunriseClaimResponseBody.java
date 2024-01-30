// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class CheckDomainSunriseClaimResponseBody extends TeaModel {
    @NameInMap("ClaimKey")
    public String claimKey;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Integer result;

    public static CheckDomainSunriseClaimResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainSunriseClaimResponseBody self = new CheckDomainSunriseClaimResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDomainSunriseClaimResponseBody setClaimKey(String claimKey) {
        this.claimKey = claimKey;
        return this;
    }
    public String getClaimKey() {
        return this.claimKey;
    }

    public CheckDomainSunriseClaimResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDomainSunriseClaimResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

}
