// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GoodsShippingNoticeCreateCmd extends TeaModel {
    @NameInMap("cpCode")
    public String cpCode;

    @NameInMap("disputeId")
    public Long disputeId;

    @NameInMap("logisticsNo")
    public String logisticsNo;

    public static GoodsShippingNoticeCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        GoodsShippingNoticeCreateCmd self = new GoodsShippingNoticeCreateCmd();
        return TeaModel.build(map, self);
    }

    public GoodsShippingNoticeCreateCmd setCpCode(String cpCode) {
        this.cpCode = cpCode;
        return this;
    }
    public String getCpCode() {
        return this.cpCode;
    }

    public GoodsShippingNoticeCreateCmd setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public GoodsShippingNoticeCreateCmd setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
        return this;
    }
    public String getLogisticsNo() {
        return this.logisticsNo;
    }

}
