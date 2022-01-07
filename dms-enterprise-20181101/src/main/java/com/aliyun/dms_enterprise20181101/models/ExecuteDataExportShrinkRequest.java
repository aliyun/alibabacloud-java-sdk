// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataExportShrinkRequest extends TeaModel {
    @NameInMap("ActionDetail")
    public String actionDetailShrink;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Tid")
    public Long tid;

    public static ExecuteDataExportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDataExportShrinkRequest self = new ExecuteDataExportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDataExportShrinkRequest setActionDetailShrink(String actionDetailShrink) {
        this.actionDetailShrink = actionDetailShrink;
        return this;
    }
    public String getActionDetailShrink() {
        return this.actionDetailShrink;
    }

    public ExecuteDataExportShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ExecuteDataExportShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
