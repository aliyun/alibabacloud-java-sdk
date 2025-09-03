// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryTaskByParamResponseBody extends TeaModel {
    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total count</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Returned results</p>
     */
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
        /**
         * <p>Address type, sending address: 1; random address: 0;</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("ConfigSetId")
        public String configSetId;

        @NameInMap("ConfigSetName")
        public String configSetName;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-18T10:36Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>dedicated IP pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("IpPoolId")
        public String ipPoolId;

        /**
         * <p>dedicated IP pool name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IpPoolName")
        public String ipPoolName;

        /**
         * <p>Receiver\&quot;s name</p>
         * 
         * <strong>example:</strong>
         * <p>TKP000442-333</p>
         */
        @NameInMap("ReceiversName")
        public String receiversName;

        /**
         * <p>Request count</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RequestCount")
        public String requestCount;

        /**
         * <p>Tag</p>
         * 
         * <strong>example:</strong>
         * <p>202201</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>1054296</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Task status, sent successfully: 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>Template name</p>
         * 
         * <strong>example:</strong>
         * <p>Short Simple</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>Creation time in UTC format</p>
         * 
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

        public QueryTaskByParamResponseBodyDataTask setConfigSetId(String configSetId) {
            this.configSetId = configSetId;
            return this;
        }
        public String getConfigSetId() {
            return this.configSetId;
        }

        public QueryTaskByParamResponseBodyDataTask setConfigSetName(String configSetName) {
            this.configSetName = configSetName;
            return this;
        }
        public String getConfigSetName() {
            return this.configSetName;
        }

        public QueryTaskByParamResponseBodyDataTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskByParamResponseBodyDataTask setIpPoolId(String ipPoolId) {
            this.ipPoolId = ipPoolId;
            return this;
        }
        public String getIpPoolId() {
            return this.ipPoolId;
        }

        public QueryTaskByParamResponseBodyDataTask setIpPoolName(String ipPoolName) {
            this.ipPoolName = ipPoolName;
            return this;
        }
        public String getIpPoolName() {
            return this.ipPoolName;
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
