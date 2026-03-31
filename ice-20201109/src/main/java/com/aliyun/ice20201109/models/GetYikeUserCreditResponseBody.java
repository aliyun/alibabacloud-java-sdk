// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetYikeUserCreditResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("CreditTotal")
    public String creditTotal;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CreditUsage")
    public String creditUsage;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetYikeUserCreditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYikeUserCreditResponseBody self = new GetYikeUserCreditResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYikeUserCreditResponseBody setCreditTotal(String creditTotal) {
        this.creditTotal = creditTotal;
        return this;
    }
    public String getCreditTotal() {
        return this.creditTotal;
    }

    public GetYikeUserCreditResponseBody setCreditUsage(String creditUsage) {
        this.creditUsage = creditUsage;
        return this;
    }
    public String getCreditUsage() {
        return this.creditUsage;
    }

    public GetYikeUserCreditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
