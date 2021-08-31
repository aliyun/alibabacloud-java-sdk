// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChartReleaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("ChartReleases")
    public java.util.List<ListChartReleaseResponseBodyChartReleases> chartReleases;

    public static ListChartReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChartReleaseResponseBody self = new ListChartReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChartReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChartReleaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChartReleaseResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChartReleaseResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListChartReleaseResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChartReleaseResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListChartReleaseResponseBody setChartReleases(java.util.List<ListChartReleaseResponseBodyChartReleases> chartReleases) {
        this.chartReleases = chartReleases;
        return this;
    }
    public java.util.List<ListChartReleaseResponseBodyChartReleases> getChartReleases() {
        return this.chartReleases;
    }

    public static class ListChartReleaseResponseBodyChartReleases extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("RepoId")
        public String repoId;

        @NameInMap("Release")
        public String release;

        @NameInMap("Size")
        public String size;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Chart")
        public String chart;

        public static ListChartReleaseResponseBodyChartReleases build(java.util.Map<String, ?> map) throws Exception {
            ListChartReleaseResponseBodyChartReleases self = new ListChartReleaseResponseBodyChartReleases();
            return TeaModel.build(map, self);
        }

        public ListChartReleaseResponseBodyChartReleases setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListChartReleaseResponseBodyChartReleases setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListChartReleaseResponseBodyChartReleases setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public ListChartReleaseResponseBodyChartReleases setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public ListChartReleaseResponseBodyChartReleases setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListChartReleaseResponseBodyChartReleases setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListChartReleaseResponseBodyChartReleases setChart(String chart) {
            this.chart = chart;
            return this;
        }
        public String getChart() {
            return this.chart;
        }

    }

}
