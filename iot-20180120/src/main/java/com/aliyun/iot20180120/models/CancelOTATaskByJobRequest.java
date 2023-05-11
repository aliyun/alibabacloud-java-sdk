// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelOTATaskByJobRequest extends TeaModel {
    /**
     * <p>Specifies whether to cancel the update tasks that are in the **IN_PROGRESS** state in an update batch. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: cancel the update tasks that are in the IN_PROGRESS state.</p>
     * <p>*   **false**: do not cancel the update tasks that are in the IN_PROGRESS state.</p>
     */
    @NameInMap("CancelInProgressTask")
    public Boolean cancelInProgressTask;

    /**
     * <p>Specifies whether to cancel the update tasks that are in the **NOTIFIED** state in an update batch. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: cancel the update tasks that are in the NOTIFIED state.</p>
     * <p>*   **false**: do not cancel the update tasks that are in the NOTIFIED state.</p>
     */
    @NameInMap("CancelNotifiedTask")
    public Boolean cancelNotifiedTask;

    /**
     * <p>Specifies whether to cancel the update tasks that are in the **QUEUED** state in an update batch. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: cancel the update tasks that are in the NOTIFIED state.</p>
     * <p>*   **false**: do not cancel the update tasks that are in the NOTIFIED state.</p>
     * <br>
     * <p>> If you set this parameter to **true** and specify the **CancelUnconfirmedTask** parameter, only the update tasks that are in the QUEUED state are canceled. If you do not specify the **CancelUnconfirmedTask** parameter, the update tasks that are in the QUEUED or CONFIRM state are canceled.</p>
     */
    @NameInMap("CancelQueuedTask")
    public Boolean cancelQueuedTask;

    /**
     * <p>Specifies whether to cancel update tasks of a scheduled update batch. If you specify the **ScheduleTime** parameter when you call the [CreateOTAStaticUpgradeJob](~~147496~~) operation, a scheduled update batch is created. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: cancel update tasks of a scheduled update batch.</p>
     * <p>*   **false**: do not cancel update tasks of a scheduled update batch.</p>
     */
    @NameInMap("CancelScheduledTask")
    public Boolean cancelScheduledTask;

    /**
     * <p>Specifies whether to cancel the update tasks that are in the **CONFIRM** state in an update batch. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: cancel the update tasks that are in the CONFIRM state.</p>
     * <p>*   **false**: do not cancel the update tasks that are in the CONFIRM state.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     * <br>
     * <p>> If you do not specify this parameter and set the **CancelQueuedTask** parameter to **true**, the update tasks that are in the CONFIRM state are canceled. If you set the **CancelQueuedTask** parameter to **false**, the update tasks that are in the CONFIRM state are not canceled.</p>
     */
    @NameInMap("CancelUnconfirmedTask")
    public Boolean cancelUnconfirmedTask;

    /**
     * <p>The ID of the instance. You can obtain the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</p>
     * <p>>*   If the **Overview** page or an instance ID is not displayed in the IoT Platform console, ignore this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the update batch.</p>
     * <br>
     * <p>Use the value that is returned for the **JobId** parameter contained in the response of the [CreateOTAStaticUpgradeJob](~~147496~~) or [CreateOTADynamicUpgradeJob](~~147887~~) operation. You can also obtain the batch ID on the **Firmware Details** page of the IoT Platform console.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static CancelOTATaskByJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOTATaskByJobRequest self = new CancelOTATaskByJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelOTATaskByJobRequest setCancelInProgressTask(Boolean cancelInProgressTask) {
        this.cancelInProgressTask = cancelInProgressTask;
        return this;
    }
    public Boolean getCancelInProgressTask() {
        return this.cancelInProgressTask;
    }

    public CancelOTATaskByJobRequest setCancelNotifiedTask(Boolean cancelNotifiedTask) {
        this.cancelNotifiedTask = cancelNotifiedTask;
        return this;
    }
    public Boolean getCancelNotifiedTask() {
        return this.cancelNotifiedTask;
    }

    public CancelOTATaskByJobRequest setCancelQueuedTask(Boolean cancelQueuedTask) {
        this.cancelQueuedTask = cancelQueuedTask;
        return this;
    }
    public Boolean getCancelQueuedTask() {
        return this.cancelQueuedTask;
    }

    public CancelOTATaskByJobRequest setCancelScheduledTask(Boolean cancelScheduledTask) {
        this.cancelScheduledTask = cancelScheduledTask;
        return this;
    }
    public Boolean getCancelScheduledTask() {
        return this.cancelScheduledTask;
    }

    public CancelOTATaskByJobRequest setCancelUnconfirmedTask(Boolean cancelUnconfirmedTask) {
        this.cancelUnconfirmedTask = cancelUnconfirmedTask;
        return this;
    }
    public Boolean getCancelUnconfirmedTask() {
        return this.cancelUnconfirmedTask;
    }

    public CancelOTATaskByJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CancelOTATaskByJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
