// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskSpecResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * <blockquote>
     * <p> This parameter is returned only when the category of a subscription disk or the performance level of a subscription ESSD is modified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20413515388****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the disk category change task.</p>
     * <blockquote>
     * <p> If you only modify the performance level of an ESSD, this parameter is not returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>t-bp67acfmxazb4p****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifyDiskSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskSpecResponseBody self = new ModifyDiskSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDiskSpecResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDiskSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDiskSpecResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
