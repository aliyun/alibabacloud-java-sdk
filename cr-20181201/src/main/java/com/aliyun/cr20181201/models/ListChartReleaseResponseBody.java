// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChartReleaseResponseBody extends TeaModel {
    /**
     * <p>The list of chart versions.</p>
     */
    @NameInMap("ChartReleases")
    public java.util.List<ListChartReleaseResponseBodyChartReleases> chartReleases;

    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListChartReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChartReleaseResponseBody self = new ListChartReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChartReleaseResponseBody setChartReleases(java.util.List<ListChartReleaseResponseBodyChartReleases> chartReleases) {
        this.chartReleases = chartReleases;
        return this;
    }
    public java.util.List<ListChartReleaseResponseBodyChartReleases> getChartReleases() {
        return this.chartReleases;
    }

    public ListChartReleaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChartReleaseResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListChartReleaseResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChartReleaseResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChartReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChartReleaseResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListChartReleaseResponseBodyChartReleases extends TeaModel {
        /**
         * <p>The name of the chart version.</p>
         */
        @NameInMap("Chart")
        public String chart;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the chart was last modified.</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The version number of the chart.</p>
         */
        @NameInMap("Release")
        public String release;

        /**
         * <p>The ID of the chart repository.</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The size of the chart of the version. Unit: bytes.</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The status of the chart.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListChartReleaseResponseBodyChartReleases build(java.util.Map<String, ?> map) throws Exception {
            ListChartReleaseResponseBodyChartReleases self = new ListChartReleaseResponseBodyChartReleases();
            return TeaModel.build(map, self);
        }

        public ListChartReleaseResponseBodyChartReleases setChart(String chart) {
            this.chart = chart;
            return this;
        }
        public String getChart() {
            return this.chart;
        }

        public ListChartReleaseResponseBodyChartReleases setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListChartReleaseResponseBodyChartReleases setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListChartReleaseResponseBodyChartReleases setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public ListChartReleaseResponseBodyChartReleases setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public ListChartReleaseResponseBodyChartReleases setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListChartReleaseResponseBodyChartReleases setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
