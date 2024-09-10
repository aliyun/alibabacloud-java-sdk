// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorTaskListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li>If the request was successful, the value <code>successful</code> is returned.</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11145B76-566A-5D80-A8A3-FAD98D310079</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
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
         * <ul>
         * <li>startWith: starts with a prefix</li>
         * <li>endWith: ends with a suffix</li>
         * <li>all: matches all</li>
         * <li>equals: equals</li>
         * <li>contains: contains</li>
         * <li>notContains: does not contain</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The keyword that corresponds to the instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_instance1</p>
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
         * 
         * <strong>example:</strong>
         * <p>SuccRate</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The extended field that indicates the result of basic operations that are performed on aggregation results.</p>
         * 
         * <strong>example:</strong>
         * <p>success_count</p>
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
         * <ul>
         * <li><code>contain</code>: contains</li>
         * <li><code>notContain</code>: does not contain</li>
         * <li><code>&gt;</code>: greater than</li>
         * <li><code>&lt;</code>: less than</li>
         * <li><code>=</code>: equal to</li>
         * <li><code>! =</code>: not equal to</li>
         * <li><code>&gt;=</code>: greater than or equal to</li>
         * <li><code>&lt;=</code>: less than or equal to</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The name of the key that is used to filter logs imported from Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>host</p>
         */
        @NameInMap("SLSKeyName")
        public String SLSKeyName;

        /**
         * <p>The value of the key that is used to filter logs imported from Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * <ul>
         * <li>and (default): Logs are processed only if all filter conditions are met.</li>
         * <li>or: Logs are processed if one of the filter conditions is met.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>and</p>
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
         * 
         * <strong>example:</strong>
         * <p>ApiResult</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The name of the key that is used to aggregate logs imported from Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
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
         * 
         * <strong>example:</strong>
         * <p>level_count</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The function that is used to aggregate log data within a statistical period. Valid values:</p>
         * <ul>
         * <li>count: counts the number.</li>
         * <li>sum: calculates the total value.</li>
         * <li>avg: calculates the average value.</li>
         * <li>max: calculates the maximum value.</li>
         * <li>min: calculates the minimum value.</li>
         * <li>value: collects samples within the statistical period.</li>
         * <li>countps: calculates the average number of the specified field per second by using the following formula: Counted number of the specified field/Total number of seconds within the statistical period.</li>
         * <li>sumps: calculates the average number of the specified field per second by using the following formula: Total value of the specified field/Total number of seconds within the statistical period.</li>
         * <li>distinct: counts the number of logs where the specified field appears within the statistical period.</li>
         * <li>distribution: counts the number of logs that meet a specified condition within the statistical period.</li>
         * <li>percentile: sorts the values of the specified field in ascending order, and then returns the value that is at the specified percentile within the statistical period. Example: P50.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The value of the function that is used to aggregate logs imported from Log Service.</p>
         * <ul>
         * <li>If the <code>Function</code> parameter is set to <code>distribution</code>, this parameter indicates the lower limit of the statistical interval. For example, 200 indicates that the number of HTTP requests whose status code is 2XX is calculated.</li>
         * <li>If the <code>Function</code> parameter is set to <code>percentile</code>, this parameter specifies the percentile at which the expected value is. For example, 0.5 specifies P50.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Parameter1")
        public String parameter1;

        /**
         * <p>The value of the function that is used to aggregate logs imported from Log Service.</p>
         * <blockquote>
         * <p>This parameter is returned only if the <code>Function</code> parameter is set to <code>distribution</code>. This parameter indicates the upper limit of the statistical interval. For example, 299 indicates that the number of HTTP requests whose status code is 2XX is calculated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>299</p>
         */
        @NameInMap("Parameter2")
        public String parameter2;

        /**
         * <p>The name of the key that is used to aggregate logs imported from Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
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
         * <ul>
         * <li>15</li>
         * <li>30</li>
         * <li>60</li>
         * </ul>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("CollectInterval")
        public Integer collectInterval;

        /**
         * <p>The URL of the destination from which the CloudMonitor agent collects host monitoring data.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://localhost">http://localhost</a></p>
         */
        @NameInMap("CollectTargetEndpoint")
        public String collectTargetEndpoint;

        /**
         * <p>The relative path from which the CloudMonitor agent collects monitoring data.</p>
         * 
         * <strong>example:</strong>
         * <p>/metrics</p>
         */
        @NameInMap("CollectTargetPath")
        public String collectTargetPath;

        /**
         * <p>The type of the monitoring data. Valid values: Spring, Tomcat, Nginx, Tengine, JVM, Redis, and MySQL.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("CollectTargetType")
        public String collectTargetType;

        /**
         * <p>The timeout period during which the CloudMonitor agent collects host monitoring data. Valid values:</p>
         * <ul>
         * <li>0</li>
         * <li>15</li>
         * <li>30</li>
         * <li>60</li>
         * </ul>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("CollectTimout")
        public Integer collectTimout;

        /**
         * <p>The timestamp when the metric import task was created.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1639382496000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the metric import task.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The additional information of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ExtraInfo")
        public String extraInfo;

        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>3607****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The instances where monitoring data is collected in batches.</p>
         */
        @NameInMap("Instances")
        public java.util.List<String> instances;

        /**
         * <strong>example:</strong>
         * <p>C:\UserData\log\*.Log</p>
         */
        @NameInMap("LogFilePath")
        public String logFilePath;

        /**
         * <p>The method that is used to aggregate on-premises log data.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;metric&quot;: &quot;metric1&quot;,&quot;filters&quot;: [{&quot;column&quot;: &quot;filed2&quot;,&quot;type&quot;: &quot;include&quot;,&quot;values&quot;: [&quot;222222&quot;]}],&quot;groupBys&quot;: [{&quot;column&quot;: &quot;filed3&quot;,&quot;name&quot;: &quot;filed3&quot;}],&quot;calculates&quot;: [{&quot;column&quot;: &quot;field1&quot;,&quot;name&quot;: &quot;avg&quot;,&quot;type&quot;: &quot;avg&quot;}]},{&quot;metric&quot;: &quot;metric2&quot;,&quot;filters&quot;: [{&quot;column&quot;: &quot;field1&quot;,&quot;type&quot;: &quot;include&quot;,&quot;values&quot;: [&quot;11111&quot;]}],&quot;groupBys&quot;: [{&quot;column&quot;: &quot;filed2&quot;,&quot;name&quot;: &quot;filed2&quot;}],&quot;calculates&quot;: [{&quot;column&quot;: &quot;field1&quot;,&quot;name&quot;: &quot;avg&quot;,&quot;type&quot;: &quot;avg&quot;}]}]</p>
         */
        @NameInMap("LogProcess")
        public String logProcess;

        /**
         * <p>The sample on-premises log.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;logContent&quot;:&quot;100.116.134.26 1119 - [13/Aug/2019:16:55:46 +0800] POST metrichub-cn-hongkong.aliyun.com /agent/metrics/putLines 200 0 \&quot;-\&quot; \&quot;127.0.0.1:7001\&quot; \&quot;Go-http-client/1.1\&quot; \&quot;-\&quot; \&quot;-\&quot; \&quot;0a98a21a15656865460656276e\&quot;&quot;,&quot;addData&quot;:{&quot;field1&quot;:[&quot;1119&quot;,&quot;1119&quot;],&quot;filed2&quot;:[&quot;POSTx&quot;,&quot;POST&quot;],&quot;filed3&quot;:[&quot;true&quot;,&quot;200&quot;]}}</p>
         */
        @NameInMap("LogSample")
        public String logSample;

        /**
         * <p>The result that is returned after on-premises log data is split based on the specified matching mode.</p>
         * <blockquote>
         * <p>The matching modes of on-premises log data include full regex mode, delimiter mode, and JSON mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;: &quot;regex&quot;,&quot;regex&quot;: &quot;\\d+\\.\\d+\\.\\d+\\.\\d+\\s+(\\d+)\\s+\\S+\\s+[\\d+/\\S+/\\d+:\\d+:\\d+:\\d+\\s+\\+\\d+\\]\\s+(\\S+)\\s+\\S+\\s+/\\S+/\\S+/\\S+\\s+(\\d+)&quot;,&quot;columns&quot;: [{&quot;name&quot;: &quot;field1&quot;},{&quot;name&quot;: &quot;filed2&quot;,&quot;translate&quot;: {&quot;default&quot;: &quot;-&quot;,&quot;mappings&quot;: [{&quot;from&quot;: &quot;(\\w+)&quot;,&quot;to&quot;: &quot;$1x&quot;,&quot;type&quot;: &quot;regex&quot;}]}},{&quot;name&quot;: &quot;filed3&quot;,&quot;translate&quot;: {&quot;default&quot;: &quot;-&quot;,&quot;mappings&quot;: [{&quot;from&quot;: &quot;NumberRange(100,300)&quot;,&quot;to&quot;: &quot;true&quot;,&quot;type&quot;: &quot;function&quot;}]}}]}</p>
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
         * <ul>
         * <li>or</li>
         * <li>and</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>or</p>
         */
        @NameInMap("MatchExpressRelation")
        public String matchExpressRelation;

        /**
         * <p>The namespace to which the host belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The network type of the host. Valid values:</p>
         * <ul>
         * <li><code>vpc</code></li>
         * <li><code>Internet</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The configurations of the logs that are imported from Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;express&quot;: [],&quot;filter&quot;: {&quot;filters&quot;: [{&quot;key&quot;: &quot;task_type&quot;,&quot;operator&quot;: &quot;=&quot;,&quot;value&quot;: &quot;1&quot;}]},&quot;groupby&quot;: [{&quot;alias&quot;: &quot;isp&quot;,&quot;key&quot;: &quot;isp&quot;,&quot;sqlKey&quot;: &quot;t.<code>isp</code>&quot;,&quot;valueKey&quot;: &quot;isp&quot;}],&quot;interval&quot;: 60,&quot;labels&quot;: [{&quot;name&quot;: &quot;<strong>cms_app</strong>&quot;,&quot;type&quot;: 0,&quot;value&quot;: &quot;sitemonitor&quot;}],&quot;statistics&quot;: [{&quot;alias&quot;: &quot;http_dns_time_avg&quot;,&quot;function&quot;: &quot;avg&quot;,&quot;key&quot;: &quot;http_dns_time&quot;}]}</p>
         */
        @NameInMap("SLSProcess")
        public String SLSProcess;

        /**
         * <p>The configurations of the logs that are imported from Log Service.</p>
         * <blockquote>
         * <p>This parameter is returned only if the <code>TaskType</code> parameter is set to <code>aliyun_sls</code>.</p>
         * </blockquote>
         */
        @NameInMap("SLSProcessConfig")
        public DescribeHybridMonitorTaskListResponseBodyTaskListSLSProcessConfig SLSProcessConfig;

        /**
         * <p>The ID of the member account.</p>
         * <blockquote>
         * <p>This parameter is displayed only when you call this operation by using a management account.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("TargetUserId")
        public String targetUserId;

        /**
         * <p>The ID of the metric import task.</p>
         * 
         * <strong>example:</strong>
         * <p>36****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the metric import task.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_task</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the metric import task. Valid values:</p>
         * <ul>
         * <li>aliyun_fc: metric import tasks for Alibaba Cloud services</li>
         * <li>aliyun_sls: metrics for logs imported from Log Service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun_sls</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The region where the host resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("UploadRegion")
        public String uploadRegion;

        /**
         * <p>The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.</p>
         * <ul>
         * <li>namespace: the namespace of the Alibaba Cloud service.</li>
         * <li>metric_list: the metrics of the Alibaba Cloud service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>products:- namespace: acs_ecs_dashboard metric_info: - metric_list: - cpu_total</p>
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
