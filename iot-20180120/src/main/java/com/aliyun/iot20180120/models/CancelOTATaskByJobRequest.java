// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelOTATaskByJobRequest extends TeaModel {
    /**
     * <p>Specifies whether to cancel the update tasks that are in the <strong>IN_PROGRESS</strong> state in an update batch. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: cancel the update tasks that are in the IN_PROGRESS state.</li>
     * <li><strong>false</strong>: do not cancel the update tasks that are in the IN_PROGRESS state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CancelInProgressTask")
    public Boolean cancelInProgressTask;

    /**
     * <p>Specifies whether to cancel the update tasks that are in the <strong>NOTIFIED</strong> state in an update batch. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: cancel the update tasks that are in the NOTIFIED state.</li>
     * <li><strong>false</strong>: do not cancel the update tasks that are in the NOTIFIED state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CancelNotifiedTask")
    public Boolean cancelNotifiedTask;

    /**
     * <p>Specifies whether to cancel the update tasks that are in the <strong>QUEUED</strong> state in an update batch. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: cancel the update tasks that are in the NOTIFIED state.</li>
     * <li><strong>false</strong>: do not cancel the update tasks that are in the NOTIFIED state.</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <strong>true</strong> and specify the <strong>CancelUnconfirmedTask</strong> parameter, only the update tasks that are in the QUEUED state are canceled. If you do not specify the <strong>CancelUnconfirmedTask</strong> parameter, the update tasks that are in the QUEUED or CONFIRM state are canceled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CancelQueuedTask")
    public Boolean cancelQueuedTask;

    /**
     * <p>Specifies whether to cancel update tasks of a scheduled update batch. If you specify the <strong>ScheduleTime</strong> parameter when you call the <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a> operation, a scheduled update batch is created. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: cancel update tasks of a scheduled update batch.</li>
     * <li><strong>false</strong>: do not cancel update tasks of a scheduled update batch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CancelScheduledTask")
    public Boolean cancelScheduledTask;

    /**
     * <p>Specifies whether to cancel the update tasks that are in the <strong>CONFIRM</strong> state in an update batch. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: cancel the update tasks that are in the CONFIRM state.</li>
     * <li><strong>false</strong>: do not cancel the update tasks that are in the CONFIRM state.</li>
     * </ul>
     * <p>This parameter is empty by default.</p>
     * <blockquote>
     * <p>If you do not specify this parameter and set the <strong>CancelQueuedTask</strong> parameter to <strong>true</strong>, the update tasks that are in the CONFIRM state are canceled. If you set the <strong>CancelQueuedTask</strong> parameter to <strong>false</strong>, the update tasks that are in the CONFIRM state are not canceled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CancelUnconfirmedTask")
    public Boolean cancelUnconfirmedTask;

    /**
     * <p>The ID of the instance. You can obtain the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</li>
     * <li>If the <strong>Overview</strong> page or an instance ID is not displayed in the IoT Platform console, ignore this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the update batch.</p>
     * <p>Use the value that is returned for the <strong>JobId</strong> parameter contained in the response of the <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a> or <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> operation. You can also obtain the batch ID on the <strong>Firmware Details</strong> page of the IoT Platform console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7glPHmaDYLAYMD1HHutT02****</p>
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
