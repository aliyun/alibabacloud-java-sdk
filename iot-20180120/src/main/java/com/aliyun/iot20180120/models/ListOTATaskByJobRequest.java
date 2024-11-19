// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTATaskByJobRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     * <blockquote>
     * <p>The product of the value of the <strong>CurrentPage</strong> parameter and the value of the <strong>PageSize</strong> parameter must be less than or equal to 100,000.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>device1</p>
     */
    @NameInMap("DeviceNames")
    public java.util.List<String> deviceNames;

    /**
     * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
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
     * <p>The ID of the update batch. This ID uniquely identifies the update batch. You can obtain the ID from the value of the <strong>JobId</strong> parameter that is returned after you call the <a href="https://help.aliyun.com/document_detail/147480.html">CreateOTAVerifyJob</a>, <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a>, or <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> operation. You can also view the batch ID on the <strong>Firmware Details</strong> page of the IoT Platform console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7glPHmaDYLAYMD1HHutT02****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     * <blockquote>
     * <p>The product of the value of the <strong>CurrentPage</strong> parameter and the value of the <strong>PageSize</strong> parameter must be less than or equal to 100,000.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>If you specify a value for this parameter, only the update tasks that are in the specified state are queried. Valid values:</p>
     * <ul>
     * <li><strong>CONFIRM</strong>: The update task is pending confirmation.</li>
     * <li><strong>QUEUED</strong>: The update notification is to be pushed.</li>
     * <li><strong>NOTIFIED</strong>: The update notification is pushed to the device.</li>
     * <li><strong>IN_PROGRESS</strong>: The update task is in progress.</li>
     * <li><strong>SUCCEEDED</strong>: The update is successful.</li>
     * <li><strong>FAILED</strong>: The update failed.</li>
     * <li><strong>CANCELED</strong>: The update batch is canceled.</li>
     * </ul>
     * <p>If you do not specify a value for this parameter, all update tasks of the specified batch are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>FAILED</p>
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
