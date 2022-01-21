// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeLogMonitorListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogMonitorList")
    public java.util.List<DescribeLogMonitorListResponseBodyLogMonitorList> logMonitorList;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

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
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("LogId")
        public Long logId;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("SlsLogstore")
        public String slsLogstore;

        @NameInMap("SlsProject")
        public String slsProject;

        @NameInMap("SlsRegionId")
        public String slsRegionId;

        @NameInMap("ValueFilter")
        public java.util.List<DescribeLogMonitorListResponseBodyLogMonitorListValueFilter> valueFilter;

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
