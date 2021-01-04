// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataCorrectShrinkRequest extends TeaModel {
    @NameInMap("Tid")
    public String tid;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("ActionName")
    public String actionName;

    @NameInMap("ActionDetail")
    public String actionDetailShrink;

    public static ExecuteDataCorrectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDataCorrectShrinkRequest self = new ExecuteDataCorrectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDataCorrectShrinkRequest setTid(String tid) {
        this.tid = tid;
        return this;
    }
    public String getTid() {
        return this.tid;
    }

    public ExecuteDataCorrectShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ExecuteDataCorrectShrinkRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public ExecuteDataCorrectShrinkRequest setActionDetailShrink(String actionDetailShrink) {
        this.actionDetailShrink = actionDetailShrink;
        return this;
    }
    public String getActionDetailShrink() {
        return this.actionDetailShrink;
    }

}
