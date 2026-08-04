// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class DeptBalanceSummaryDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("monthly")
    public BalancePoolSummaryDTO monthly;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("permanent")
    public BalancePoolSummaryDTO permanent;

    public static DeptBalanceSummaryDTO build(java.util.Map<String, ?> map) throws Exception {
        DeptBalanceSummaryDTO self = new DeptBalanceSummaryDTO();
        return TeaModel.build(map, self);
    }

    public DeptBalanceSummaryDTO setMonthly(BalancePoolSummaryDTO monthly) {
        this.monthly = monthly;
        return this;
    }
    public BalancePoolSummaryDTO getMonthly() {
        return this.monthly;
    }

    public DeptBalanceSummaryDTO setPermanent(BalancePoolSummaryDTO permanent) {
        this.permanent = permanent;
        return this;
    }
    public BalancePoolSummaryDTO getPermanent() {
        return this.permanent;
    }

}
