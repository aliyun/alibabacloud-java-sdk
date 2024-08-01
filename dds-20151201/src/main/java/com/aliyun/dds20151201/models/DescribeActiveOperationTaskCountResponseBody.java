// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskCountResponseBody extends TeaModel {
    /**
     * <p>Indicates whether any O\&amp;M tasks need pop-up windows to notify users actions. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No O\&amp;M tasks need pop-up windows to notify users actions.</li>
     * <li><strong>1</strong>: Some O\&amp;M tasks need pop-up windows to notify users actions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NeedPop")
    public Integer needPop;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>770D7F11-21A2-402B-9DF6-D1A620570EF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of pending O\&amp;M tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskCount")
    public Integer taskCount;

    public static DescribeActiveOperationTaskCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskCountResponseBody self = new DescribeActiveOperationTaskCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskCountResponseBody setNeedPop(Integer needPop) {
        this.needPop = needPop;
        return this;
    }
    public Integer getNeedPop() {
        return this.needPop;
    }

    public DescribeActiveOperationTaskCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActiveOperationTaskCountResponseBody setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
        return this;
    }
    public Integer getTaskCount() {
        return this.taskCount;
    }

}
