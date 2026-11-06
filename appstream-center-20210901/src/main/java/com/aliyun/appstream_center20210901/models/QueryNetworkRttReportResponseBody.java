// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryNetworkRttReportResponseBody extends TeaModel {
    /**
     * <p>The business status code. <code>200</code> indicates that the request is processed successfully. Other values indicate that the processing failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of records that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The description of the request processing result. If the request is successful, <code>success</code> is usually returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of network RTT report data.</p>
     */
    @NameInMap("NetworkRttReportDataModel")
    public java.util.List<QueryNetworkRttReportResponseBodyNetworkRttReportDataModel> networkRttReportDataModel;

    /**
     * <p>The page number corresponding to the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page used in the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryNetworkRttReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryNetworkRttReportResponseBody self = new QueryNetworkRttReportResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryNetworkRttReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryNetworkRttReportResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryNetworkRttReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryNetworkRttReportResponseBody setNetworkRttReportDataModel(java.util.List<QueryNetworkRttReportResponseBodyNetworkRttReportDataModel> networkRttReportDataModel) {
        this.networkRttReportDataModel = networkRttReportDataModel;
        return this;
    }
    public java.util.List<QueryNetworkRttReportResponseBodyNetworkRttReportDataModel> getNetworkRttReportDataModel() {
        return this.networkRttReportDataModel;
    }

    public QueryNetworkRttReportResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryNetworkRttReportResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryNetworkRttReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryNetworkRttReportResponseBodyNetworkRttReportDataModel extends TeaModel {
        /**
         * <p>The ID of the app instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The number of users that meet the low-RTT criteria of the report. Unit: users. The current API operation does not return the specific threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        @NameInMap("LowRttUserCount")
        public Long lowRttUserCount;

        /**
         * <p>The ratio of low-RTT users to the total number of users involved in the statistics. Valid values: 0 to 1. To obtain the percentage, multiply the value by 100.</p>
         * 
         * <strong>example:</strong>
         * <p>0.85</p>
         */
        @NameInMap("LowRttUserRate")
        public Double lowRttUserRate;

        /**
         * <p>The ID of the business region to which the report data belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The average RTT of all users involved in the statistics. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>35.8</p>
         */
        @NameInMap("RttAvg")
        public Double rttAvg;

        /**
         * <p>The maximum value among the average RTTs of all users. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86.2</p>
         */
        @NameInMap("RttMax")
        public Double rttMax;

        /**
         * <p>The minimum value among the average RTTs of all users. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12.5</p>
         */
        @NameInMap("RttMin")
        public Double rttMin;

        /**
         * <p>The end time of the statistical window. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01 10:05:00</p>
         */
        @NameInMap("StatEndDate")
        public String statEndDate;

        /**
         * <p>The start time of the statistical window. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01 10:00:00</p>
         */
        @NameInMap("StatStartDate")
        public String statStartDate;

        /**
         * <p>The total number of users involved in the RTT calculation for the current statistical window. Unit: users.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalUserCount")
        public Long totalUserCount;

        public static QueryNetworkRttReportResponseBodyNetworkRttReportDataModel build(java.util.Map<String, ?> map) throws Exception {
            QueryNetworkRttReportResponseBodyNetworkRttReportDataModel self = new QueryNetworkRttReportResponseBodyNetworkRttReportDataModel();
            return TeaModel.build(map, self);
        }

        public QueryNetworkRttReportResponseBodyNetworkRttReportDataModel setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public QueryNetworkRttReportResponseBodyNetworkRttReportDataModel setLowRttUserCount(Long lowRttUserCount) {
            this.lowRttUserCount = lowRttUserCount;
            return this;
        }
        public Long getLowRttUserCount() {
            return this.lowRttUserCount;
        }

        public QueryNetworkRttReportResponseBodyNetworkRttReportDataModel setLowRttUserRate(Double lowRttUserRate) {
            this.lowRttUserRate = lowRttUserRate;
            return this;
        }
        public Double getLowRttUserRate() {
            return this.lowRttUserRate;
        }

        public QueryNetworkRttReportResponseBodyNetworkRttReportDataModel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryNetworkRttReportResponseBodyNetworkRttReportDataModel setRttAvg(Double rttAvg) {
            this.rttAvg = rttAvg;
            return this;
        }
        public Double getRttAvg() {
            return this.rttAvg;
        }

        public QueryNetworkRttReportResponseBodyNetworkRttReportDataModel setRttMax(Double rttMax) {
            this.rttMax = rttMax;
            return this;
        }
        public Double getRttMax() {
            return this.rttMax;
        }

        public QueryNetworkRttReportResponseBodyNetworkRttReportDataModel setRttMin(Double rttMin) {
            this.rttMin = rttMin;
            return this;
        }
        public Double getRttMin() {
            return this.rttMin;
        }

        public QueryNetworkRttReportResponseBodyNetworkRttReportDataModel setStatEndDate(String statEndDate) {
            this.statEndDate = statEndDate;
            return this;
        }
        public String getStatEndDate() {
            return this.statEndDate;
        }

        public QueryNetworkRttReportResponseBodyNetworkRttReportDataModel setStatStartDate(String statStartDate) {
            this.statStartDate = statStartDate;
            return this;
        }
        public String getStatStartDate() {
            return this.statStartDate;
        }

        public QueryNetworkRttReportResponseBodyNetworkRttReportDataModel setTotalUserCount(Long totalUserCount) {
            this.totalUserCount = totalUserCount;
            return this;
        }
        public Long getTotalUserCount() {
            return this.totalUserCount;
        }

    }

}
