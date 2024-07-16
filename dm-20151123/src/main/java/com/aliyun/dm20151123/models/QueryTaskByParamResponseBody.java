// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryTaskByParamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("data")
    public QueryTaskByParamResponseBodyData data;

    public static QueryTaskByParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskByParamResponseBody self = new QueryTaskByParamResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskByParamResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryTaskByParamResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskByParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTaskByParamResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryTaskByParamResponseBody setData(QueryTaskByParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTaskByParamResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTaskByParamResponseBodyDataTask extends TeaModel {
        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>TKP000442-333</p>
         */
        @NameInMap("ReceiversName")
        public String receiversName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RequestCount")
        public String requestCount;

        /**
         * <strong>example:</strong>
         * <p>202201</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <strong>example:</strong>
         * <p>1054296</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <strong>example:</strong>
         * <p>Short Simple</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <strong>example:</strong>
         * <p>1569734892</p>
         */
        @NameInMap("UtcCreateTime")
        public Long utcCreateTime;

        public static QueryTaskByParamResponseBodyDataTask build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskByParamResponseBodyDataTask self = new QueryTaskByParamResponseBodyDataTask();
            return TeaModel.build(map, self);
        }

        public QueryTaskByParamResponseBodyDataTask setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public QueryTaskByParamResponseBodyDataTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskByParamResponseBodyDataTask setReceiversName(String receiversName) {
            this.receiversName = receiversName;
            return this;
        }
        public String getReceiversName() {
            return this.receiversName;
        }

        public QueryTaskByParamResponseBodyDataTask setRequestCount(String requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public String getRequestCount() {
            return this.requestCount;
        }

        public QueryTaskByParamResponseBodyDataTask setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public QueryTaskByParamResponseBodyDataTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryTaskByParamResponseBodyDataTask setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskByParamResponseBodyDataTask setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QueryTaskByParamResponseBodyDataTask setUtcCreateTime(Long utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

    }

    public static class QueryTaskByParamResponseBodyData extends TeaModel {
        @NameInMap("task")
        public java.util.List<QueryTaskByParamResponseBodyDataTask> task;

        public static QueryTaskByParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskByParamResponseBodyData self = new QueryTaskByParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTaskByParamResponseBodyData setTask(java.util.List<QueryTaskByParamResponseBodyDataTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<QueryTaskByParamResponseBodyDataTask> getTask() {
            return this.task;
        }

    }

}
