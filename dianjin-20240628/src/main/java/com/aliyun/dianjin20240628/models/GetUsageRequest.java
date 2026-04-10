// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetUsageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("externalUserId")
    public String externalUserId;

    /**
     * <strong>example:</strong>
     * <p>R123456789</p>
     */
    @NameInMap("redemptionOrderNo")
    public String redemptionOrderNo;

    public static GetUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUsageRequest self = new GetUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetUsageRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public GetUsageRequest setRedemptionOrderNo(String redemptionOrderNo) {
        this.redemptionOrderNo = redemptionOrderNo;
        return this;
    }
    public String getRedemptionOrderNo() {
        return this.redemptionOrderNo;
    }

}
