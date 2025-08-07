// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateRestoreTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the restore task.</p>
     * 
     * <strong>example:</strong>
     * <p>restore-fdsafda</p>
     */
    @NameInMap("RestoreTaskId")
    public String restoreTaskId;

    /**
     * <p>The status of the service instance. Valid values:</p>
     * <ul>
     * <li>Restoring</li>
     * <li>Restored</li>
     * <li>RestoreFailed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Restoring</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateRestoreTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRestoreTaskResponseBody self = new CreateRestoreTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRestoreTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRestoreTaskResponseBody setRestoreTaskId(String restoreTaskId) {
        this.restoreTaskId = restoreTaskId;
        return this;
    }
    public String getRestoreTaskId() {
        return this.restoreTaskId;
    }

    public CreateRestoreTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
