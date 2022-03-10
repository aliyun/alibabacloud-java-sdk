// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChartResponseBody extends TeaModel {
    @NameInMap("Charts")
    public java.util.List<ListChartResponseBodyCharts> charts;

    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChartResponseBody self = new ListChartResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChartResponseBody setCharts(java.util.List<ListChartResponseBodyCharts> charts) {
        this.charts = charts;
        return this;
    }
    public java.util.List<ListChartResponseBodyCharts> getCharts() {
        return this.charts;
    }

    public ListChartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChartResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListChartResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChartResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChartResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListChartResponseBodyCharts extends TeaModel {
        @NameInMap("Chart")
        public String chart;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("Status")
        public String status;

        public static ListChartResponseBodyCharts build(java.util.Map<String, ?> map) throws Exception {
            ListChartResponseBodyCharts self = new ListChartResponseBodyCharts();
            return TeaModel.build(map, self);
        }

        public ListChartResponseBodyCharts setChart(String chart) {
            this.chart = chart;
            return this;
        }
        public String getChart() {
            return this.chart;
        }

        public ListChartResponseBodyCharts setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListChartResponseBodyCharts setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListChartResponseBodyCharts setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListChartResponseBodyCharts setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public ListChartResponseBodyCharts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
