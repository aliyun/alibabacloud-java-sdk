// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorTaskListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>The configurations of the logs that are imported from Log Service.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The method that is used to aggregate on-premises log data.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The conditions that are used to match the instances in the application group.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The alias of the extended field that indicates the result of basic operations that are performed on aggregation results.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timeout period during which the CloudMonitor agent collects host monitoring data. Valid values:</p>
     * <br>
     * <p>*   0</p>
     * <p>*   15</p>
     * <p>*   30</p>
     * <p>*   60</p>
     * <br>
     * <p>Unit: seconds.</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The ID of the metric import task.</p>
     */
    @NameInMap("TaskList")
    public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskList> taskList;

    /**
     * <p>The method that is used to filter logs imported from Log Service. Valid values:</p>
     * <br>
     * <p>*   `contain`: contains</p>
     * <p>*   `notContain`: does not contain</p>
     * <p>*   `>`: greater than</p>
     * <p>*   `<`: less than</p>
     * <p>*   `=`: equal to</p>
     * <p>*   `! =`: not equal to</p>
     * <p>*   `>=`: greater than or equal to</p>
     * <p>*   `<=`: less than or equal to</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeHybridMonitorTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorTaskListResponseBody self = new DescribeHybridMonitorTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorTaskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHybridMonitorTaskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHybridMonitorTaskListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHybridMonitorTaskListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHybridMonitorTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridMonitorTaskListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeHybridMonitorTaskListResponseBody setTaskList(java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public DescribeHybridMonitorTaskListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels extends TeaModel {
        /**
         * <p>The name of the key that is used to aggregate logs imported from Log Service.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of entries to return on each page.</p>
         * <br>
         * <p>Minimum value: 1. Default value: 10.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels self = new DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress extends TeaModel {
        /**
         * <p>The extended fields that indicate the results of basic operations that are performed on aggregation results.</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The number of the page to return.</p>
         * <br>
         * <p>Pages start from page 1. Default value: 1.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress self = new DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigExpress extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Express")
        public String express;

        public static DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigExpress build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigExpress self = new DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigExpress();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigExpress setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigExpress setExpress(String express) {
            this.express = express;
            return this;
        }
        public String getExpress() {
            return this.express;
        }

    }

    public static class DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilterFilters extends TeaModel {
        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The type of the monitoring data. Valid values: Spring, Tomcat, Nginx, Tengine, JVM, Redis, and MySQL.</p>
         */
        @NameInMap("SLSKeyName")
        public String SLSKeyName;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilterFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilterFilters self = new DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilterFilters();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilterFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilterFilters setSLSKeyName(String SLSKeyName) {
            this.SLSKeyName = SLSKeyName;
            return this;
        }
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilterFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilter extends TeaModel {
        /**
         * <p>The extended field that indicates the result of basic operations that are performed on aggregation results.</p>
         */
        @NameInMap("Filters")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilterFilters> filters;

        /**
         * <p>The ID of the member account.</p>
         * <br>
         * <p>>  This parameter is required only if you call this operation to delete metric import tasks that belong to a member in a resource directory. In this case, the `TaskType` parameter is set to `aliyun_fc`.</p>
         */
        @NameInMap("Relation")
        public String relation;

        public static DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilter self = new DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilter();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilter setFilters(java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilterFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilterFilters> getFilters() {
            return this.filters;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilter setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

    }

    public static class DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigGroupBy extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The alias of the aggregation result.</p>
         */
        @NameInMap("SLSKeyName")
        public String SLSKeyName;

        public static DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigGroupBy build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigGroupBy self = new DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigGroupBy();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigGroupBy setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigGroupBy setSLSKeyName(String SLSKeyName) {
            this.SLSKeyName = SLSKeyName;
            return this;
        }
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

    }

    public static class DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigStatistics extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Function")
        public String function;

        @NameInMap("Parameter1")
        public String parameter1;

        @NameInMap("Parameter2")
        public String parameter2;

        @NameInMap("SLSKeyName")
        public String SLSKeyName;

        public static DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigStatistics self = new DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigStatistics setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigStatistics setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigStatistics setParameter1(String parameter1) {
            this.parameter1 = parameter1;
            return this;
        }
        public String getParameter1() {
            return this.parameter1;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigStatistics setParameter2(String parameter2) {
            this.parameter2 = parameter2;
            return this;
        }
        public String getParameter2() {
            return this.parameter2;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigStatistics setSLSKeyName(String SLSKeyName) {
            this.SLSKeyName = SLSKeyName;
            return this;
        }
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

    }

    public static class DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig extends TeaModel {
        /**
         * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
         */
        @NameInMap("Express")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigExpress> express;

        /**
         * <p>The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL.</p>
         */
        @NameInMap("Filter")
        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilter filter;

        /**
         * <p>The sample on-premises log.</p>
         */
        @NameInMap("GroupBy")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigGroupBy> groupBy;

        @NameInMap("Statistics")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigStatistics> statistics;

        public static DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig self = new DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig setExpress(java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigExpress> express) {
            this.express = express;
            return this;
        }
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigExpress> getExpress() {
            return this.express;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig setFilter(DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilter filter) {
            this.filter = filter;
            return this;
        }
        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilter getFilter() {
            return this.filter;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig setGroupBy(java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigGroupBy> groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigGroupBy> getGroupBy() {
            return this.groupBy;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig setStatistics(java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigStatistics> statistics) {
            this.statistics = statistics;
            return this;
        }
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigStatistics> getStatistics() {
            return this.statistics;
        }

    }

    public static class DescribeHybridMonitorTaskListResponseBodyTaskList extends TeaModel {
        /**
         * <p>The method that is used to match the instance name. Valid values:</p>
         * <br>
         * <p>*   startWith: starts with a prefix</p>
         * <p>*   endWith: ends with a suffix</p>
         * <p>*   all: includes all</p>
         * <p>*   equals: equals</p>
         * <p>*   contains: contains</p>
         * <p>*   notContains: excludes</p>
         */
        @NameInMap("AttachLabels")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels> attachLabels;

        /**
         * <p>The relationship between the conditions that are used to filter metric import tasks. Valid values:</p>
         * <br>
         * <p>*   or</p>
         * <p>*   and</p>
         */
        @NameInMap("CollectInterval")
        public Integer collectInterval;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("CollectTargetEndpoint")
        public String collectTargetEndpoint;

        /**
         * <p>The conditions that are used to filter logs imported from Log Service.</p>
         */
        @NameInMap("CollectTargetPath")
        public String collectTargetPath;

        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("CollectTargetType")
        public String collectTargetType;

        /**
         * <p>The name of the namespace.</p>
         * <br>
         * <p>For information about how to obtain the name of a namespace, see [DescribeHybridMonitorNamespaceList](~~428880~~).</p>
         */
        @NameInMap("CollectTimout")
        public Integer collectTimout;

        /**
         * <p>The metric import tasks.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The result that is returned after on-premises log data is split based on the specified matching mode.</p>
         * <br>
         * <p>>  The matching modes of on-premises log data include full regex mode, delimiter mode, and JSON mode.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The network type of the host. Valid values:</p>
         * <br>
         * <p>*   `vpc`: a virtual private cloud (VPC)</p>
         * <p>*   `Internet`: Internet</p>
         */
        @NameInMap("ExtraInfo")
        public String extraInfo;

        /**
         * <p>The name of the metric import task.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the key that is used to filter logs imported from Log Service.</p>
         */
        @NameInMap("Instances")
        public java.util.List<String> instances;

        /**
         * <p>The relationship between multiple filter conditions. Valid values:</p>
         * <br>
         * <p>*   and (default value): Logs are processed only if all filter conditions are met.</p>
         * <p>*   or: Logs are processed if one of the filter conditions is met.</p>
         */
        @NameInMap("LogFilePath")
        public String logFilePath;

        /**
         * <p>The description of the metric import task.</p>
         */
        @NameInMap("LogProcess")
        public String logProcess;

        /**
         * <p>The type of the metric import task. Valid values:</p>
         * <br>
         * <p>*   aliyun_fc: metric import tasks for Alibaba Cloud services</p>
         * <p>*   aliyun_sls: metrics for logs imported from Log Service</p>
         */
        @NameInMap("LogSample")
        public String logSample;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("LogSplit")
        public String logSplit;

        /**
         * <p>The returned message.</p>
         * <br>
         * <p>*   If the call is successful, the value `successful` is returned.</p>
         * <p>*   If the call fails, an error message is returned.</p>
         */
        @NameInMap("MatchExpress")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress> matchExpress;

        /**
         * <p>The URL of the destination from which the CloudMonitor agent collects host monitoring data.</p>
         */
        @NameInMap("MatchExpressRelation")
        public String matchExpressRelation;

        /**
         * <p>The relative path from which the CloudMonitor agent collects monitoring data.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The keyword that corresponds to the instance name.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>Specifies whether the returned result includes metric import tasks for Alibaba Cloud services. Valid values:</p>
         * <br>
         * <p>*   true (default value): includes metric import tasks for Alibaba Cloud services.</p>
         * <p>*   false: excludes metric import tasks for Alibaba Cloud services.</p>
         */
        @NameInMap("SLSProcess")
        public String SLSProcess;

        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("SLSProcessConfig")
        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig SLSProcessConfig;

        /**
         * <p>The ID of the metric import task.</p>
         */
        @NameInMap("TargetUserId")
        public String targetUserId;

        /**
         * <p>The configurations of the logs that are imported from Log Service.</p>
         * <br>
         * <p>>  This parameter is returned only if the `TaskType` parameter is set to `aliyun_sls`.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The region where the host resides.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The ID of the member account.</p>
         * <br>
         * <p>>  This parameter is returned only if you call this operation by using a management account.</p>
         */
        @NameInMap("UploadRegion")
        public String uploadRegion;

        /**
         * <p>The ID of the application group.</p>
         * <br>
         * <p>For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).</p>
         */
        @NameInMap("YARMConfig")
        public String YARMConfig;

        public static DescribeHybridMonitorTaskListResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridMonitorTaskListResponseBodyTaskList self = new DescribeHybridMonitorTaskListResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setAttachLabels(java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels> attachLabels) {
            this.attachLabels = attachLabels;
            return this;
        }
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels> getAttachLabels() {
            return this.attachLabels;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setCollectInterval(Integer collectInterval) {
            this.collectInterval = collectInterval;
            return this;
        }
        public Integer getCollectInterval() {
            return this.collectInterval;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setCollectTargetEndpoint(String collectTargetEndpoint) {
            this.collectTargetEndpoint = collectTargetEndpoint;
            return this;
        }
        public String getCollectTargetEndpoint() {
            return this.collectTargetEndpoint;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setCollectTargetPath(String collectTargetPath) {
            this.collectTargetPath = collectTargetPath;
            return this;
        }
        public String getCollectTargetPath() {
            return this.collectTargetPath;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setCollectTargetType(String collectTargetType) {
            this.collectTargetType = collectTargetType;
            return this;
        }
        public String getCollectTargetType() {
            return this.collectTargetType;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setCollectTimout(Integer collectTimout) {
            this.collectTimout = collectTimout;
            return this;
        }
        public Integer getCollectTimout() {
            return this.collectTimout;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setInstances(java.util.List<String> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<String> getInstances() {
            return this.instances;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setLogFilePath(String logFilePath) {
            this.logFilePath = logFilePath;
            return this;
        }
        public String getLogFilePath() {
            return this.logFilePath;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setLogProcess(String logProcess) {
            this.logProcess = logProcess;
            return this;
        }
        public String getLogProcess() {
            return this.logProcess;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setLogSample(String logSample) {
            this.logSample = logSample;
            return this;
        }
        public String getLogSample() {
            return this.logSample;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setLogSplit(String logSplit) {
            this.logSplit = logSplit;
            return this;
        }
        public String getLogSplit() {
            return this.logSplit;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setMatchExpress(java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress> matchExpress) {
            this.matchExpress = matchExpress;
            return this;
        }
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress> getMatchExpress() {
            return this.matchExpress;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setMatchExpressRelation(String matchExpressRelation) {
            this.matchExpressRelation = matchExpressRelation;
            return this;
        }
        public String getMatchExpressRelation() {
            return this.matchExpressRelation;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setSLSProcess(String SLSProcess) {
            this.SLSProcess = SLSProcess;
            return this;
        }
        public String getSLSProcess() {
            return this.SLSProcess;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setSLSProcessConfig(DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig SLSProcessConfig) {
            this.SLSProcessConfig = SLSProcessConfig;
            return this;
        }
        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig getSLSProcessConfig() {
            return this.SLSProcessConfig;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setTargetUserId(String targetUserId) {
            this.targetUserId = targetUserId;
            return this;
        }
        public String getTargetUserId() {
            return this.targetUserId;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setUploadRegion(String uploadRegion) {
            this.uploadRegion = uploadRegion;
            return this;
        }
        public String getUploadRegion() {
            return this.uploadRegion;
        }

        public DescribeHybridMonitorTaskListResponseBodyTaskList setYARMConfig(String YARMConfig) {
            this.YARMConfig = YARMConfig;
            return this;
        }
        public String getYARMConfig() {
            return this.YARMConfig;
        }

    }

}
