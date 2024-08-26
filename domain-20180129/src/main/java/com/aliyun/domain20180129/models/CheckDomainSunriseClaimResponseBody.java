// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckDomainSunriseClaimResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2017092100/8/2/1/kDfu9htHGEx_y-LJ3XSlKMZ70000020001</p>
     */
    @NameInMap("ClaimKey")
    public String claimKey;

    /**
     * <strong>example:</strong>
     * <p>BA7A4FD4-EB9A-4A20-BB0C-9AEB15634DC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
