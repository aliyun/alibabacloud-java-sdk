// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListTaskByPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Data")
    public ListTaskByPageResponseBodyData data;

    public static ListTaskByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskByPageResponseBody self = new ListTaskByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTaskByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskByPageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTaskByPageResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListTaskByPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskByPageResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListTaskByPageResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListTaskByPageResponseBody setData(ListTaskByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTaskByPageResponseBodyData getData() {
        return this.data;
    }

    public static class ListTaskByPageResponseBodyDataData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("UtcQueueTime")
        public String utcQueueTime;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("StatusDetail")
        public String statusDetail;

        @NameInMap("Status")
        public String status;

        @NameInMap("ProductName")
        public String productName;

        public static ListTaskByPageResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskByPageResponseBodyDataData self = new ListTaskByPageResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListTaskByPageResponseBodyDataData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListTaskByPageResponseBodyDataData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListTaskByPageResponseBodyDataData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTaskByPageResponseBodyDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListTaskByPageResponseBodyDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListTaskByPageResponseBodyDataData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListTaskByPageResponseBodyDataData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListTaskByPageResponseBodyDataData setUtcQueueTime(String utcQueueTime) {
            this.utcQueueTime = utcQueueTime;
            return this;
        }
        public String getUtcQueueTime() {
            return this.utcQueueTime;
        }

        public ListTaskByPageResponseBodyDataData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListTaskByPageResponseBodyDataData setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public ListTaskByPageResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskByPageResponseBodyDataData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class ListTaskByPageResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<ListTaskByPageResponseBodyDataData> data;

        public static ListTaskByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskByPageResponseBodyData self = new ListTaskByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTaskByPageResponseBodyData setData(java.util.List<ListTaskByPageResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListTaskByPageResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
