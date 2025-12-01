// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkOptionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task for which the bandwidth weight is modified.</p>
     * <p>You can use the <a href="https://help.aliyun.com/document_detail/2679968.html">DescribeTaskAttribute</a> interface to modify the bandwidth weight result.</p>
     * 
     * <strong>example:</strong>
     * <p>t-bp198jigq7l0h5ac****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifyInstanceNetworkOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkOptionsResponseBody self = new ModifyInstanceNetworkOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetworkOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceNetworkOptionsResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
