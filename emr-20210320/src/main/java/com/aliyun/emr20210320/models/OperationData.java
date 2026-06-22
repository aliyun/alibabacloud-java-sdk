// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class OperationData extends TeaModel {
    /**
     * <p>The number of units actually delivered.</p>
     */
    @NameInMap("actualDeliveredAmounts")
    public Integer actualDeliveredAmounts;

    /**
     * <p>The IDs of instances that could not be refunded.</p>
     */
    @NameInMap("failedRefundInstanceIds")
    public java.util.List<String> failedRefundInstanceIds;

    /**
     * <p>The number of units requested.</p>
     */
    @NameInMap("toBeDeliveredAmounts")
    public Integer toBeDeliveredAmounts;

    public static OperationData build(java.util.Map<String, ?> map) throws Exception {
        OperationData self = new OperationData();
        return TeaModel.build(map, self);
    }

    public OperationData setActualDeliveredAmounts(Integer actualDeliveredAmounts) {
        this.actualDeliveredAmounts = actualDeliveredAmounts;
        return this;
    }
    public Integer getActualDeliveredAmounts() {
        return this.actualDeliveredAmounts;
    }

    public OperationData setFailedRefundInstanceIds(java.util.List<String> failedRefundInstanceIds) {
        this.failedRefundInstanceIds = failedRefundInstanceIds;
        return this;
    }
    public java.util.List<String> getFailedRefundInstanceIds() {
        return this.failedRefundInstanceIds;
    }

    public OperationData setToBeDeliveredAmounts(Integer toBeDeliveredAmounts) {
        this.toBeDeliveredAmounts = toBeDeliveredAmounts;
        return this;
    }
    public Integer getToBeDeliveredAmounts() {
        return this.toBeDeliveredAmounts;
    }

}
