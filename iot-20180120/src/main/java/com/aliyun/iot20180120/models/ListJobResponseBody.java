// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static ListJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobResponseBody self = new ListJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJobResponseBody setData(ListJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListJobResponseBodyData getData() {
        return this.data;
    }

    public ListJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListJobResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListJobResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListJobResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListJobResponseBodyDataData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("ScheduledTime")
        public Long scheduledTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static ListJobResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyDataData self = new ListJobResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyDataData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListJobResponseBodyDataData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobResponseBodyDataData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListJobResponseBodyDataData setScheduledTime(Long scheduledTime) {
            this.scheduledTime = scheduledTime;
            return this;
        }
        public Long getScheduledTime() {
            return this.scheduledTime;
        }

        public ListJobResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobResponseBodyDataData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListJobResponseBodyDataData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListJobResponseBodyDataData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class ListJobResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<ListJobResponseBodyDataData> data;

        public static ListJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyData self = new ListJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyData setData(java.util.List<ListJobResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListJobResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
