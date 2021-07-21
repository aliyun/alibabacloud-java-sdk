// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeLogMonitorListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Long total;

    @NameInMap("LogMonitorList")
    public java.util.List<DescribeLogMonitorListResponseBodyLogMonitorList> logMonitorList;

    public static DescribeLogMonitorListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogMonitorListResponseBody self = new DescribeLogMonitorListResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeLogMonitorListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeLogMonitorListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLogMonitorListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLogMonitorListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLogMonitorListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeLogMonitorListResponseBody setLogMonitorList(java.util.List<DescribeLogMonitorListResponseBodyLogMonitorList> logMonitorList) {
        this.logMonitorList = logMonitorList;
        return this;
    }
    public java.util.List<DescribeLogMonitorListResponseBodyLogMonitorList> getLogMonitorList() {
        return this.logMonitorList;
    }

    public static class DescribeLogMonitorListResponseBodyLogMonitorListValueFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Operator")
        public String operator;

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

        public DescribeLogMonitorListResponseBodyLogMonitorListValueFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorListValueFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class DescribeLogMonitorListResponseBodyLogMonitorList extends TeaModel {
        @NameInMap("ValueFilterRelation")
        public String valueFilterRelation;

        @NameInMap("SlsLogstore")
        public String slsLogstore;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("LogId")
        public Long logId;

        @NameInMap("SlsRegionId")
        public String slsRegionId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("SlsProject")
        public String slsProject;

        @NameInMap("ValueFilter")
        public java.util.List<DescribeLogMonitorListResponseBodyLogMonitorListValueFilter> valueFilter;

        public static DescribeLogMonitorListResponseBodyLogMonitorList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogMonitorListResponseBodyLogMonitorList self = new DescribeLogMonitorListResponseBodyLogMonitorList();
            return TeaModel.build(map, self);
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setValueFilterRelation(String valueFilterRelation) {
            this.valueFilterRelation = valueFilterRelation;
            return this;
        }
        public String getValueFilterRelation() {
            return this.valueFilterRelation;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setSlsLogstore(String slsLogstore) {
            this.slsLogstore = slsLogstore;
            return this;
        }
        public String getSlsLogstore() {
            return this.slsLogstore;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
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

        public DescribeLogMonitorListResponseBodyLogMonitorList setSlsRegionId(String slsRegionId) {
            this.slsRegionId = slsRegionId;
            return this;
        }
        public String getSlsRegionId() {
            return this.slsRegionId;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

        public DescribeLogMonitorListResponseBodyLogMonitorList setValueFilter(java.util.List<DescribeLogMonitorListResponseBodyLogMonitorListValueFilter> valueFilter) {
            this.valueFilter = valueFilter;
            return this;
        }
        public java.util.List<DescribeLogMonitorListResponseBodyLogMonitorListValueFilter> getValueFilter() {
            return this.valueFilter;
        }

    }

}
