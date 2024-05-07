// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GoodsShippingNoticeCreateCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("cpCode")
    public String cpCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("disputeId")
    public String disputeId;

    /**
     * <p>This parameter is required.</p>
     */
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

    public GoodsShippingNoticeCreateCmd setDisputeId(String disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public String getDisputeId() {
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
