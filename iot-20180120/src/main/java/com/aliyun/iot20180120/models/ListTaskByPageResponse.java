// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListTaskByPageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageCount")
    @Validation(required = true)
    public Integer pageCount;

    @NameInMap("Page")
    @Validation(required = true)
    public Integer page;

    @NameInMap("Data")
    @Validation(required = true)
    public ListTaskByPageResponseData data;

    public static ListTaskByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskByPageResponse self = new ListTaskByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskByPageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskByPageResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTaskByPageResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskByPageResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTaskByPageResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListTaskByPageResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskByPageResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListTaskByPageResponse setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListTaskByPageResponse setData(ListTaskByPageResponseData data) {
        this.data = data;
        return this;
    }
    public ListTaskByPageResponseData getData() {
        return this.data;
    }

    public static class ListTaskByPageResponseDataData extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("JobName")
        @Validation(required = true)
        public String jobName;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("Progress")
        @Validation(required = true)
        public Integer progress;

        @NameInMap("UtcQueueTime")
        @Validation(required = true)
        public String utcQueueTime;

        @NameInMap("UtcModified")
        @Validation(required = true)
        public String utcModified;

        @NameInMap("StatusDetail")
        @Validation(required = true)
        public String statusDetail;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        public static ListTaskByPageResponseDataData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskByPageResponseDataData self = new ListTaskByPageResponseDataData();
            return TeaModel.build(map, self);
        }

        public ListTaskByPageResponseDataData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListTaskByPageResponseDataData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListTaskByPageResponseDataData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTaskByPageResponseDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListTaskByPageResponseDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListTaskByPageResponseDataData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListTaskByPageResponseDataData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListTaskByPageResponseDataData setUtcQueueTime(String utcQueueTime) {
            this.utcQueueTime = utcQueueTime;
            return this;
        }
        public String getUtcQueueTime() {
            return this.utcQueueTime;
        }

        public ListTaskByPageResponseDataData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListTaskByPageResponseDataData setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public ListTaskByPageResponseDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskByPageResponseDataData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class ListTaskByPageResponseData extends TeaModel {
        @NameInMap("data")
        @Validation(required = true)
        public java.util.List<ListTaskByPageResponseDataData> data;

        public static ListTaskByPageResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskByPageResponseData self = new ListTaskByPageResponseData();
            return TeaModel.build(map, self);
        }

        public ListTaskByPageResponseData setData(java.util.List<ListTaskByPageResponseDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListTaskByPageResponseDataData> getData() {
            return this.data;
        }

    }

}
