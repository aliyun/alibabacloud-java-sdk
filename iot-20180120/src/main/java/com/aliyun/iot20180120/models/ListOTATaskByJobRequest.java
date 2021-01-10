// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTATaskByJobRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DeviceNames")
    public java.util.List<String> deviceNames;

    public static ListOTATaskByJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOTATaskByJobRequest self = new ListOTATaskByJobRequest();
        return TeaModel.build(map, self);
    }

    public ListOTATaskByJobRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public ListOTATaskByJobRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public ListOTATaskByJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
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

    public ListOTATaskByJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
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

}
