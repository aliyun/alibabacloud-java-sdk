// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListSettlementStatusRequest extends TeaModel {
    // 商户类型：SUPPLIER/DISTRIBUTOR
    @NameInMap("MerchantType")
    public String merchantType;

    // MERCHANT(入驻状态)
    @NameInMap("StatusType")
    public String statusType;

    public static ListSettlementStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSettlementStatusRequest self = new ListSettlementStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListSettlementStatusRequest setMerchantType(String merchantType) {
        this.merchantType = merchantType;
        return this;
    }
    public String getMerchantType() {
        return this.merchantType;
    }

    public ListSettlementStatusRequest setStatusType(String statusType) {
        this.statusType = statusType;
        return this;
    }
    public String getStatusType() {
        return this.statusType;
    }

}
