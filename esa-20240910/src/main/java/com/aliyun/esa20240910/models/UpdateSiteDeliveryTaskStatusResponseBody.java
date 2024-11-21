// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteDeliveryTaskStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the delivery task. Valid values:</p>
     * <ul>
     * <li><strong>online</strong></li>
     * <li><strong>offline</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The name of the delivery task.</p>
     * 
     * <strong>example:</strong>
     * <p>cdn-test-task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static UpdateSiteDeliveryTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteDeliveryTaskStatusResponseBody self = new UpdateSiteDeliveryTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSiteDeliveryTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSiteDeliveryTaskStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateSiteDeliveryTaskStatusResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
