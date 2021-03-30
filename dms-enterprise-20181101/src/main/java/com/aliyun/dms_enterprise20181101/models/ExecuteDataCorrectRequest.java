// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataCorrectRequest extends TeaModel {
    @NameInMap("Tid")
    public String tid;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("ActionDetail")
    public java.util.Map<String, ?> actionDetail;

    public static ExecuteDataCorrectRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDataCorrectRequest self = new ExecuteDataCorrectRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDataCorrectRequest setTid(String tid) {
        this.tid = tid;
        return this;
    }
    public String getTid() {
        return this.tid;
    }

    public ExecuteDataCorrectRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ExecuteDataCorrectRequest setActionDetail(java.util.Map<String, ?> actionDetail) {
        this.actionDetail = actionDetail;
        return this;
    }
    public java.util.Map<String, ?> getActionDetail() {
        return this.actionDetail;
    }

}
