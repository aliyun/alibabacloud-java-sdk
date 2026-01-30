// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetTier2CouponApprovalDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>d54ca949-9b88-4514-add3-c6029c4027f4</p>
     */
    @NameInMap("ApplicationSheetId")
    public String applicationSheetId;

    public static GetTier2CouponApprovalDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTier2CouponApprovalDetailRequest self = new GetTier2CouponApprovalDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetTier2CouponApprovalDetailRequest setApplicationSheetId(String applicationSheetId) {
        this.applicationSheetId = applicationSheetId;
        return this;
    }
    public String getApplicationSheetId() {
        return this.applicationSheetId;
    }

}
