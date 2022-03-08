// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class RemarkWorkOrderRequest extends TeaModel {
    // 幂等校验 token
    @NameInMap("ClientToken")
    public String clientToken;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 备注人
    @NameInMap("Operator")
    public String operator;

    // 备注信息
    @NameInMap("Remark")
    public String remark;

    // 备注工单id
    @NameInMap("WorkOrderId")
    public String workOrderId;

    public static RemarkWorkOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RemarkWorkOrderRequest self = new RemarkWorkOrderRequest();
        return TeaModel.build(map, self);
    }

    public RemarkWorkOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemarkWorkOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemarkWorkOrderRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public RemarkWorkOrderRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public RemarkWorkOrderRequest setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
        return this;
    }
    public String getWorkOrderId() {
        return this.workOrderId;
    }

}
