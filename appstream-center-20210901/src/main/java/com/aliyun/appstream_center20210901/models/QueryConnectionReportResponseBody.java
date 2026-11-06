// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryConnectionReportResponseBody extends TeaModel {
    /**
     * <p>The business status code. <code>200</code> indicates that the request is successful. Other values indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of connection report data.</p>
     */
    @NameInMap("ConnectionReportDataModel")
    public java.util.List<QueryConnectionReportResponseBodyConnectionReportDataModel> connectionReportDataModel;

    /**
     * <p>The total number of records that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The description of the request processing result. <code>success</code> is usually returned when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

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
     * <p>The unique identifier of the current request, which can be used to troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryConnectionReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConnectionReportResponseBody self = new QueryConnectionReportResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConnectionReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConnectionReportResponseBody setConnectionReportDataModel(java.util.List<QueryConnectionReportResponseBodyConnectionReportDataModel> connectionReportDataModel) {
        this.connectionReportDataModel = connectionReportDataModel;
        return this;
    }
    public java.util.List<QueryConnectionReportResponseBodyConnectionReportDataModel> getConnectionReportDataModel() {
        return this.connectionReportDataModel;
    }

    public QueryConnectionReportResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryConnectionReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryConnectionReportResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryConnectionReportResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryConnectionReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryConnectionReportResponseBodyConnectionReportDataModel extends TeaModel {
        /**
         * <p>The ID of the app instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The average duration of successful connections. In the current version, the return value is in milliseconds, so parse it as milliseconds. The <code>Seconds</code> in the field name is retained for compatibility and does not indicate the unit. This value may not be returned if there are no successful connections.</p>
         * 
         * <strong>example:</strong>
         * <p>1250</p>
         */
        @NameInMap("ConnectionAvgDurationSeconds")
        public Double connectionAvgDurationSeconds;

        /**
         * <p>The number of connection failures within the statistical window.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ConnectionFailureCount")
        public Long connectionFailureCount;

        /**
         * <p>The number of successful connections within the statistical window.</p>
         * 
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("ConnectionSuccessCount")
        public Long connectionSuccessCount;

        /**
         * <p>The connection success rate, which is calculated by dividing the number of successful connections by the sum of successful and failed connections. The value ranges from 0 to 1. Multiply the value by 100 to get the percentage. This value may not be returned if there are no connection records.</p>
         * 
         * <strong>example:</strong>
         * <p>0.98</p>
         */
        @NameInMap("ConnectionSuccessRate")
        public Double connectionSuccessRate;

        /**
         * <p>The ID of the business region to which the report data belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The end time of the statistical window. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The string itself does not carry a time zone and is interpreted in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01 10:05:00</p>
         */
        @NameInMap("StatEndDate")
        public String statEndDate;

        /**
         * <p>The start time of the statistical window. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The string itself does not carry a time zone and is interpreted in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01 10:00:00</p>
         */
        @NameInMap("StatStartDate")
        public String statStartDate;

        public static QueryConnectionReportResponseBodyConnectionReportDataModel build(java.util.Map<String, ?> map) throws Exception {
            QueryConnectionReportResponseBodyConnectionReportDataModel self = new QueryConnectionReportResponseBodyConnectionReportDataModel();
            return TeaModel.build(map, self);
        }

        public QueryConnectionReportResponseBodyConnectionReportDataModel setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public QueryConnectionReportResponseBodyConnectionReportDataModel setConnectionAvgDurationSeconds(Double connectionAvgDurationSeconds) {
            this.connectionAvgDurationSeconds = connectionAvgDurationSeconds;
            return this;
        }
        public Double getConnectionAvgDurationSeconds() {
            return this.connectionAvgDurationSeconds;
        }

        public QueryConnectionReportResponseBodyConnectionReportDataModel setConnectionFailureCount(Long connectionFailureCount) {
            this.connectionFailureCount = connectionFailureCount;
            return this;
        }
        public Long getConnectionFailureCount() {
            return this.connectionFailureCount;
        }

        public QueryConnectionReportResponseBodyConnectionReportDataModel setConnectionSuccessCount(Long connectionSuccessCount) {
            this.connectionSuccessCount = connectionSuccessCount;
            return this;
        }
        public Long getConnectionSuccessCount() {
            return this.connectionSuccessCount;
        }

        public QueryConnectionReportResponseBodyConnectionReportDataModel setConnectionSuccessRate(Double connectionSuccessRate) {
            this.connectionSuccessRate = connectionSuccessRate;
            return this;
        }
        public Double getConnectionSuccessRate() {
            return this.connectionSuccessRate;
        }

        public QueryConnectionReportResponseBodyConnectionReportDataModel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryConnectionReportResponseBodyConnectionReportDataModel setStatEndDate(String statEndDate) {
            this.statEndDate = statEndDate;
            return this;
        }
        public String getStatEndDate() {
            return this.statEndDate;
        }

        public QueryConnectionReportResponseBodyConnectionReportDataModel setStatStartDate(String statStartDate) {
            this.statStartDate = statStartDate;
            return this;
        }
        public String getStatStartDate() {
            return this.statStartDate;
        }

    }

}
