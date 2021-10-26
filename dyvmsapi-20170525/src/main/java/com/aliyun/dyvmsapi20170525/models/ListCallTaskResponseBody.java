// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListCallTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListCallTaskResponseBodyData> data;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListCallTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallTaskResponseBody self = new ListCallTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallTaskResponseBody setData(java.util.List<ListCallTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCallTaskResponseBodyData> getData() {
        return this.data;
    }

    public ListCallTaskResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCallTaskResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCallTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCallTaskResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListCallTaskResponseBodyData extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("CompletedCount")
        public Long completedCount;

        @NameInMap("CompletedRate")
        public Integer completedRate;

        @NameInMap("Data")
        public String data;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("FireTime")
        public String fireTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("Status")
        public String status;

        @NameInMap("StopTime")
        public String stopTime;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCallTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallTaskResponseBodyData self = new ListCallTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallTaskResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListCallTaskResponseBodyData setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListCallTaskResponseBodyData setCompletedCount(Long completedCount) {
            this.completedCount = completedCount;
            return this;
        }
        public Long getCompletedCount() {
            return this.completedCount;
        }

        public ListCallTaskResponseBodyData setCompletedRate(Integer completedRate) {
            this.completedRate = completedRate;
            return this;
        }
        public Integer getCompletedRate() {
            return this.completedRate;
        }

        public ListCallTaskResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListCallTaskResponseBodyData setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListCallTaskResponseBodyData setFireTime(String fireTime) {
            this.fireTime = fireTime;
            return this;
        }
        public String getFireTime() {
            return this.fireTime;
        }

        public ListCallTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCallTaskResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListCallTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCallTaskResponseBodyData setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public ListCallTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListCallTaskResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListCallTaskResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListCallTaskResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
