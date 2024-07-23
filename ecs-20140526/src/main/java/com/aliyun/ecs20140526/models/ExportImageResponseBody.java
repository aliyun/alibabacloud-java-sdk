// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ExportImageResponseBody extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C8B26B44-0189-443E-9816-D951F596****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task that is used to export the custom image.</p>
     * 
     * <strong>example:</strong>
     * <p>tsk-bp67acfmxazb4p****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ExportImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportImageResponseBody self = new ExportImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportImageResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExportImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportImageResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
