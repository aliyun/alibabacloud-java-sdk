// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListJobResponse extends TeaModel {
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

    @NameInMap("Page")
    @Validation(required = true)
    public Integer page;

    @NameInMap("Data")
    @Validation(required = true)
    public ListJobResponseData data;

    public static ListJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobResponse self = new ListJobResponse();
        return TeaModel.build(map, self);
    }

    public ListJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListJobResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListJobResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobResponse setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListJobResponse setData(ListJobResponseData data) {
        this.data = data;
        return this;
    }
    public ListJobResponseData getData() {
        return this.data;
    }

    public static class ListJobResponseDataData extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("JobName")
        @Validation(required = true)
        public String jobName;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("UtcModified")
        @Validation(required = true)
        public String utcModified;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static ListJobResponseDataData build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseDataData self = new ListJobResponseDataData();
            return TeaModel.build(map, self);
        }

        public ListJobResponseDataData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobResponseDataData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListJobResponseDataData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListJobResponseDataData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListJobResponseDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobResponseDataData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListJobResponseDataData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListJobResponseData extends TeaModel {
        @NameInMap("data")
        @Validation(required = true)
        public java.util.List<ListJobResponseDataData> data;

        public static ListJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseData self = new ListJobResponseData();
            return TeaModel.build(map, self);
        }

        public ListJobResponseData setData(java.util.List<ListJobResponseDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListJobResponseDataData> getData() {
            return this.data;
        }

    }

}
