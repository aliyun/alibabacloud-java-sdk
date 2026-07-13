// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCreditPackageRequest extends TeaModel {
    /**
     * <p>The ID of the credit booster package.</p>
     * 
     * <strong>example:</strong>
     * <p>crp-xagydbhfkah****</p>
     */
    @NameInMap("CreditPackageId")
    public String creditPackageId;

    /**
     * <p>The status of the credit booster package.</p>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("CreditPackageStatus")
    public String creditPackageStatus;

    public static DescribeCreditPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditPackageRequest self = new DescribeCreditPackageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCreditPackageRequest setCreditPackageId(String creditPackageId) {
        this.creditPackageId = creditPackageId;
        return this;
    }
    public String getCreditPackageId() {
        return this.creditPackageId;
    }

    public DescribeCreditPackageRequest setCreditPackageStatus(String creditPackageStatus) {
        this.creditPackageStatus = creditPackageStatus;
        return this;
    }
    public String getCreditPackageStatus() {
        return this.creditPackageStatus;
    }

}
