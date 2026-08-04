// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BalancePoolSummaryDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>40.00</p>
     */
    @NameInMap("allocated")
    public Double allocated;

    /**
     * <strong>example:</strong>
     * <p>60.00</p>
     */
    @NameInMap("available")
    public Double available;

    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("total")
    public Double total;

    public static BalancePoolSummaryDTO build(java.util.Map<String, ?> map) throws Exception {
        BalancePoolSummaryDTO self = new BalancePoolSummaryDTO();
        return TeaModel.build(map, self);
    }

    public BalancePoolSummaryDTO setAllocated(Double allocated) {
        this.allocated = allocated;
        return this;
    }
    public Double getAllocated() {
        return this.allocated;
    }

    public BalancePoolSummaryDTO setAvailable(Double available) {
        this.available = available;
        return this;
    }
    public Double getAvailable() {
        return this.available;
    }

    public BalancePoolSummaryDTO setTotal(Double total) {
        this.total = total;
        return this;
    }
    public Double getTotal() {
        return this.total;
    }

}
