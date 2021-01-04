// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataExportShrinkRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("ActionName")
    public String actionName;

    @NameInMap("ActionDetail")
    public String actionDetailShrink;

    public static ExecuteDataExportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDataExportShrinkRequest self = new ExecuteDataExportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDataExportShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ExecuteDataExportShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ExecuteDataExportShrinkRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public ExecuteDataExportShrinkRequest setActionDetailShrink(String actionDetailShrink) {
        this.actionDetailShrink = actionDetailShrink;
        return this;
    }
    public String getActionDetailShrink() {
        return this.actionDetailShrink;
    }

}
