// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorTaskListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <br>
     * <p>> The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>*   If the request was successful, the value `successful` is returned.</p>
     * <p>*   If the request failed, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The metric import tasks.</p>
     */
    @NameInMap("TaskList")
    public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskList> taskList;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The tag key.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tag value.</p>
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
         * <p>The method that is used to match the instance name. Valid values:</p>
         * <br>
         * <p>*   startWith: starts with a prefix</p>
         * <p>*   endWith: ends with a suffix</p>
         * <p>*   all: matches all</p>
         * <p>*   equals: equals</p>
         * <p>*   contains: contains</p>
         * <p>*   notContains: does not contain</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The keyword that corresponds to the instance name.</p>
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
        /**
         * <p>The alias of the extended field that indicates the result of basic operations that are performed on aggregation results.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The extended field that indicates the result of basic operations that are performed on aggregation results.</p>
         */
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
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The name of the key that is used to filter logs imported from Log Service.</p>
         */
        @NameInMap("SLSKeyName")
        public String SLSKeyName;

        /**
         * <p>The value of the key that is used to filter logs imported from Log Service.</p>
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
         * <p>The conditions that are used to filter logs imported from Log Service.</p>
         */
        @NameInMap("Filters")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilterFilters> filters;

        /**
         * <p>The relationship between multiple filter conditions. Valid values:</p>
         * <br>
         * <p>*   and (default): Logs are processed only if all filter conditions are met.</p>
         * <p>*   or: Logs are processed if one of the filter conditions is met.</p>
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
         * <p>The alias of the aggregation result.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The name of the key that is used to aggregate logs imported from Log Service.</p>
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
        /**
         * <p>The alias of the aggregation result.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The function that is used to aggregate log data within a statistical period. Valid values:</p>
         * <br>
         * <p>*   count: counts the number.</p>
         * <p>*   sum: calculates the total value.</p>
         * <p>*   avg: calculates the average value.</p>
         * <p>*   max: calculates the maximum value.</p>
         * <p>*   min: calculates the minimum value.</p>
         * <p>*   value: collects samples within the statistical period.</p>
         * <p>*   countps: calculates the average number of the specified field per second by using the following formula: Counted number of the specified field/Total number of seconds within the statistical period.</p>
         * <p>*   sumps: calculates the average number of the specified field per second by using the following formula: Total value of the specified field/Total number of seconds within the statistical period.</p>
         * <p>*   distinct: counts the number of logs where the specified field appears within the statistical period.</p>
         * <p>*   distribution: counts the number of logs that meet a specified condition within the statistical period.</p>
         * <p>*   percentile: sorts the values of the specified field in ascending order, and then returns the value that is at the specified percentile within the statistical period. Example: P50.</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The value of the function that is used to aggregate logs imported from Log Service.</p>
         * <br>
         * <p>*   If the `Function` parameter is set to `distribution`, this parameter indicates the lower limit of the statistical interval. For example, 200 indicates that the number of HTTP requests whose status code is 2XX is calculated.</p>
         * <p>*   If the `Function` parameter is set to `percentile`, this parameter specifies the percentile at which the expected value is. For example, 0.5 specifies P50.</p>
         */
        @NameInMap("Parameter1")
        public String parameter1;

        /**
         * <p>The value of the function that is used to aggregate logs imported from Log Service.</p>
         * <br>
         * <p>> This parameter is returned only if the `Function` parameter is set to `distribution`. This parameter indicates the upper limit of the statistical interval. For example, 299 indicates that the number of HTTP requests whose status code is 2XX is calculated.</p>
         */
        @NameInMap("Parameter2")
        public String parameter2;

        /**
         * <p>The name of the key that is used to aggregate logs imported from Log Service.</p>
         */
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
         * <p>The extended fields that indicate the results of basic operations that are performed on aggregation results.</p>
         */
        @NameInMap("Express")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigExpress> express;

        /**
         * <p>The conditions that are used to filter logs imported from Log Service.</p>
         */
        @NameInMap("Filter")
        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigFilter filter;

        /**
         * <p>The dimensions based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL.</p>
         */
        @NameInMap("GroupBy")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfigGroupBy> groupBy;

        /**
         * <p>The methods that are used to aggregate logs imported from Log Service.</p>
         */
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
         * <p>The tags of the metric import task.</p>
         */
        @NameInMap("AttachLabels")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListAttachLabels> attachLabels;

        /**
         * <p>The interval at which the CloudMonitor agent collects host monitoring data. Valid values:</p>
         * <br>
         * <p>*   15</p>
         * <p>*   30</p>
         * <p>*   60</p>
         * <br>
         * <p>Unit: seconds.</p>
         */
        @NameInMap("CollectInterval")
        public Integer collectInterval;

        /**
         * <p>The URL of the destination from which the CloudMonitor agent collects host monitoring data.</p>
         */
        @NameInMap("CollectTargetEndpoint")
        public String collectTargetEndpoint;

        /**
         * <p>The relative path from which the CloudMonitor agent collects monitoring data.</p>
         */
        @NameInMap("CollectTargetPath")
        public String collectTargetPath;

        /**
         * <p>The type of the monitoring data. Valid values: Spring, Tomcat, Nginx, Tengine, JVM, Redis, and MySQL.</p>
         */
        @NameInMap("CollectTargetType")
        public String collectTargetType;

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
        @NameInMap("CollectTimout")
        public Integer collectTimout;

        /**
         * <p>The timestamp when the metric import task was created.</p>
         * <br>
         * <p>Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the metric import task.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The additional information of the instance.</p>
         */
        @NameInMap("ExtraInfo")
        public String extraInfo;

        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The instances where monitoring data is collected in batches.</p>
         */
        @NameInMap("Instances")
        public java.util.List<String> instances;

        @NameInMap("LogFilePath")
        public String logFilePath;

        /**
         * <p>The method that is used to aggregate on-premises log data.</p>
         */
        @NameInMap("LogProcess")
        public String logProcess;

        /**
         * <p>The sample on-premises log.</p>
         */
        @NameInMap("LogSample")
        public String logSample;

        /**
         * <p>The result that is returned after on-premises log data is split based on the specified matching mode.</p>
         * <br>
         * <p>> The matching modes of on-premises log data include full regex mode, delimiter mode, and JSON mode.</p>
         */
        @NameInMap("LogSplit")
        public String logSplit;

        /**
         * <p>The conditions that are used to match the instances in the application group.</p>
         */
        @NameInMap("MatchExpress")
        public java.util.List<DescribeHybridMonitorTaskListResponseBodyTaskListMatchExpress> matchExpress;

        /**
         * <p>The relationship between the conditions that are used to filter metric import tasks. Valid values:</p>
         * <br>
         * <p>*   or</p>
         * <p>*   and</p>
         */
        @NameInMap("MatchExpressRelation")
        public String matchExpressRelation;

        /**
         * <p>The namespace to which the host belongs.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The network type of the host. Valid values:</p>
         * <br>
         * <p>*   `vpc`</p>
         * <p>*   `Internet`</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The configurations of the logs that are imported from Log Service.</p>
         */
        @NameInMap("SLSProcess")
        public String SLSProcess;

        /**
         * <p>The configurations of the logs that are imported from Log Service.</p>
         * <br>
         * <p>> This parameter is returned only if the `TaskType` parameter is set to `aliyun_sls`.</p>
         */
        @NameInMap("SLSProcessConfig")
        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig SLSProcessConfig;

        /**
         * <p>The ID of the member account.</p>
         * <br>
         * <p>> This parameter is displayed only when you call this operation by using a management account.</p>
         */
        @NameInMap("TargetUserId")
        public String targetUserId;

        /**
         * <p>The ID of the metric import task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the metric import task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the metric import task. Valid values:</p>
         * <br>
         * <p>*   aliyun_fc: metric import tasks for Alibaba Cloud services</p>
         * <p>*   aliyun_sls: metrics for logs imported from Log Service</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The region where the host resides.</p>
         */
        @NameInMap("UploadRegion")
        public String uploadRegion;

        /**
         * <p>The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.</p>
         * <br>
         * <p>*   namespace: the namespace of the Alibaba Cloud service.</p>
         * <p>*   metric_list: the metrics of the Alibaba Cloud service.</p>
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
