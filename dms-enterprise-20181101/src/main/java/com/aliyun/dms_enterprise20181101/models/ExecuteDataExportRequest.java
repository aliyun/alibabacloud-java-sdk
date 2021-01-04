// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataExportRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("ActionName")
    public String actionName;

    @NameInMap("ActionDetail")
    public java.util.Map<String, ?> actionDetail;

    public static ExecuteDataExportRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDataExportRequest self = new ExecuteDataExportRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDataExportRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ExecuteDataExportRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ExecuteDataExportRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public ExecuteDataExportRequest setActionDetail(java.util.Map<String, ?> actionDetail) {
        this.actionDetail = actionDetail;
        return this;
    }
    public java.util.Map<String, ?> getActionDetail() {
        return this.actionDetail;
    }

}
