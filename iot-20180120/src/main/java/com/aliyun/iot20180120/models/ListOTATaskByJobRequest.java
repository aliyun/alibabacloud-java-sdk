// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTATaskByJobRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DeviceNames")
    public java.util.List<String> deviceNames;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("PageSize")
    public Integer pageSize;

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
