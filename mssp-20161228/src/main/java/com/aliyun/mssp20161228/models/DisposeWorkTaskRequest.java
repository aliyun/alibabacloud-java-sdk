// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class DisposeWorkTaskRequest extends TeaModel {
    /**
     * <p>Operator.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WB01089929</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>Operation remarks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>处理完成</p>
     */
    @NameInMap("OptRemark")
    public String optRemark;

    /**
     * <p>Work order status.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Work order ID, multiple IDs separated by commas.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10310</p>
     */
    @NameInMap("TaskIds")
    public String taskIds;

    public static DisposeWorkTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DisposeWorkTaskRequest self = new DisposeWorkTaskRequest();
        return TeaModel.build(map, self);
    }

    public DisposeWorkTaskRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DisposeWorkTaskRequest setOptRemark(String optRemark) {
        this.optRemark = optRemark;
        return this;
    }
    public String getOptRemark() {
        return this.optRemark;
    }

    public DisposeWorkTaskRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DisposeWorkTaskRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

}
