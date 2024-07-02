// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class DistributionMaxRefundFee extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxRefundFee")
    public Long maxRefundFee;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("minRefundFee")
    public Long minRefundFee;

    public static DistributionMaxRefundFee build(java.util.Map<String, ?> map) throws Exception {
        DistributionMaxRefundFee self = new DistributionMaxRefundFee();
        return TeaModel.build(map, self);
    }

    public DistributionMaxRefundFee setMaxRefundFee(Long maxRefundFee) {
        this.maxRefundFee = maxRefundFee;
        return this;
    }
    public Long getMaxRefundFee() {
        return this.maxRefundFee;
    }

    public DistributionMaxRefundFee setMinRefundFee(Long minRefundFee) {
        this.minRefundFee = minRefundFee;
        return this;
    }
    public Long getMinRefundFee() {
        return this.minRefundFee;
    }

}
