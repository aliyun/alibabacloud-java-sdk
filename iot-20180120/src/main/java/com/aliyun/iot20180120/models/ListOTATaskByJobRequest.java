// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTATaskByJobRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     * <br>
     * <p>> The product of the value of the **CurrentPage** parameter and the value of the **PageSize** parameter must be less than or equal to 100,000.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DeviceNames")
    public java.util.List<String> deviceNames;

    /**
     * <p>The ID of the instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>>*   If no **Overview** page or ID is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the update batch. This ID uniquely identifies the update batch. You can obtain the ID from the value of the **JobId** parameter that is returned after you call the [CreateOTAVerifyJob](~~147480~~), [CreateOTAStaticUpgradeJob](~~147496~~), or [CreateOTADynamicUpgradeJob](~~147887~~) operation. You can also view the batch ID on the **Firmware Details** page of the IoT Platform console.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     * <br>
     * <br>
     * <br>
     * <p>> The product of the value of the **CurrentPage** parameter and the value of the **PageSize** parameter must be less than or equal to 100,000.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>If you specify a value for this parameter, only the update tasks that are in the specified state are queried. Valid values:</p>
     * <br>
     * <p>*   **CONFIRM**: The update task is pending confirmation.</p>
     * <p>*   **QUEUED**: The update notification is to be pushed.</p>
     * <p>*   **NOTIFIED**: The update notification is pushed to the device.</p>
     * <p>*   **IN_PROGRESS**: The update task is in progress.</p>
     * <p>*   **SUCCEEDED**: The update is successful.</p>
     * <p>*   **FAILED**: The update failed.</p>
     * <p>*   **CANCELED**: The update batch is canceled.</p>
     * <br>
     * <p>If you do not specify a value for this parameter, all update tasks of the specified batch are queried.</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    public static ListOTATaskByJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOTATaskByJobRequest self = new ListOTATaskByJobRequest();
        return TeaModel.build(map, self);
    }

    public ListOTATaskByJobRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTATaskByJobRequest setDeviceNames(java.util.List<String> deviceNames) {
        this.deviceNames = deviceNames;
        return this;
    }
    public java.util.List<String> getDeviceNames() {
        return this.deviceNames;
    }

    public ListOTATaskByJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListOTATaskByJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListOTATaskByJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTATaskByJobRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
