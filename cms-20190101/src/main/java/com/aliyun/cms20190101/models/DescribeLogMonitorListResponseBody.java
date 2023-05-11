// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeLogMonitorListResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The logical operator that is used between log filter conditions. The ValueFilter and ValueFilterRelation parameters are used in pair. Valid values:</p>
     * <br>
     * <p>*   and</p>
     * <p>*   or</p>
     */
    @NameInMap("LogMonitorList")
    public java.util.List<DescribeLogMonitorListResponseBodyLogMonitorList> logMonitorList;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The total number of the returned entries.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The log monitoring metrics.</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeLogMonitorListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogMonitorListResponseBody self = new DescribeLogMonitorListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogMonitorListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeLogMonitorListResponseBody setLogMonitorList(java.util.List<DescribeLogMonitorListResponseBodyLogMonitorList> logMonitorList) {
        this.logMonitorList = logMonitorList;
        return this;
    }
    public java.util.List<DescribeLogMonitorListResponseBodyLogMonitorList> getLogMonitorList() {
        return this.logMonitorList;
    }

    public DescribeLogMonitorListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLogMonitorListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLogMonitorListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLogMonitorListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogMonitorListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeLogMonitorListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeLogMonitorListResponseBodyLogMonitorListValueFilter extends TeaModel {
        /**
         * <p>The field value to be matched in the filter condition.</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The method that is used to match the field value. Valid values:</p>
         * <br>
         * <p>*   contain</p>
         * <p>*   notContain</p>
         * <p>*   `>`: greater than</p>
         * <p>*   `<`: less than</p>
         * <p>*   `>=`: greater than or equal to</p>
         * <p>*   `<=`: less than or equal to</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeLogMonitorListResponseBodyLogMonitorListValueFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogMonitorListResponseBodyLogMonitorListValueFilter self = new DescribeLogMonitorListResponseBodyLogMonitorListValueFilter();
            return TeaModel.build(map, self);
        }

        public DescribeLogMonitorListResponseBodyLogMonitorListValueFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorListValueFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorListValueFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLogMonitorListResponseBodyLogMonitorList extends TeaModel {
        /**
         * <p>The name of the Log Service project.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID returned by Log Service.</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The ID of the region where the Log Service Logstore resides.</p>
         */
        @NameInMap("LogId")
        public Long logId;

        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The name of the log monitoring metric. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("SlsLogstore")
        public String slsLogstore;

        /**
         * <p>The condition that is used to filter logs. The ValueFilter and ValueFilterRelation parameters are used in pair. The filter condition is equivalent to the WHERE clause in SQL statements.</p>
         * <br>
         * <p>If no filter condition is specified, all logs are processed. Assume that logs contain the Level field, which may be set to Error. If you need to calculate the number of times that logs of the Error level appear every minute, you can set the filter condition to Level=Error and count the number of logs that meet this condition.</p>
         */
        @NameInMap("SlsProject")
        public String slsProject;

        /**
         * <p>The time when the log monitoring metric was created.</p>
         * <br>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("SlsRegionId")
        public String slsRegionId;

        /**
         * <p>The name of the log field used for matching in the filter condition.</p>
         */
        @NameInMap("ValueFilter")
        public java.util.List<DescribeLogMonitorListResponseBodyLogMonitorListValueFilter> valueFilter;

        /**
         * <p>The name of the Log Service Logstore.</p>
         */
        @NameInMap("ValueFilterRelation")
        public String valueFilterRelation;

        public static DescribeLogMonitorListResponseBodyLogMonitorList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogMonitorListResponseBodyLogMonitorList self = new DescribeLogMonitorListResponseBodyLogMonitorList();
            return TeaModel.build(map, self);
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setLogId(Long logId) {
            this.logId = logId;
            return this;
        }
        public Long getLogId() {
            return this.logId;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setSlsLogstore(String slsLogstore) {
            this.slsLogstore = slsLogstore;
            return this;
        }
        public String getSlsLogstore() {
            return this.slsLogstore;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setSlsRegionId(String slsRegionId) {
            this.slsRegionId = slsRegionId;
            return this;
        }
        public String getSlsRegionId() {
            return this.slsRegionId;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setValueFilter(java.util.List<DescribeLogMonitorListResponseBodyLogMonitorListValueFilter> valueFilter) {
            this.valueFilter = valueFilter;
            return this;
        }
        public java.util.List<DescribeLogMonitorListResponseBodyLogMonitorListValueFilter> getValueFilter() {
            return this.valueFilter;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setValueFilterRelation(String valueFilterRelation) {
            this.valueFilterRelation = valueFilterRelation;
            return this;
        }
        public String getValueFilterRelation() {
            return this.valueFilterRelation;
        }

    }

}
