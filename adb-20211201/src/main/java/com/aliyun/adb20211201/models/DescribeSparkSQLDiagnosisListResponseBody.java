// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkSQLDiagnosisListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>A91C9D07-7462-5F35-BB47-83629CE6CCAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SQLDiagnosisList")
    public java.util.List<DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList> SQLDiagnosisList;

    /**
     * <strong>example:</strong>
     * <p>1343</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSparkSQLDiagnosisListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkSQLDiagnosisListResponseBody self = new DescribeSparkSQLDiagnosisListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSparkSQLDiagnosisListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeSparkSQLDiagnosisListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSparkSQLDiagnosisListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSparkSQLDiagnosisListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSparkSQLDiagnosisListResponseBody setSQLDiagnosisList(java.util.List<DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList> SQLDiagnosisList) {
        this.SQLDiagnosisList = SQLDiagnosisList;
        return this;
    }
    public java.util.List<DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList> getSQLDiagnosisList() {
        return this.SQLDiagnosisList;
    }

    public DescribeSparkSQLDiagnosisListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>s202404291020bjd448ad40002122</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ElapsedTime")
        public Long elapsedTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InnerQueryId")
        public Long innerQueryId;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("MaxExclusiveTime")
        public Long maxExclusiveTime;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <strong>example:</strong>
         * <p>select * from device where name = \&quot;105506012112790031\&quot;</p>
         */
        @NameInMap("SQL")
        public String SQL;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ScanRowCount")
        public Long scanRowCount;

        /**
         * <strong>example:</strong>
         * <p>2024-11-20 09:09:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StatementId")
        public Long statementId;

        public static DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList self = new DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList();
            return TeaModel.build(map, self);
        }

        public DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList setInnerQueryId(Long innerQueryId) {
            this.innerQueryId = innerQueryId;
            return this;
        }
        public Long getInnerQueryId() {
            return this.innerQueryId;
        }

        public DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList setMaxExclusiveTime(Long maxExclusiveTime) {
            this.maxExclusiveTime = maxExclusiveTime;
            return this;
        }
        public Long getMaxExclusiveTime() {
            return this.maxExclusiveTime;
        }

        public DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList setScanRowCount(Long scanRowCount) {
            this.scanRowCount = scanRowCount;
            return this;
        }
        public Long getScanRowCount() {
            return this.scanRowCount;
        }

        public DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSparkSQLDiagnosisListResponseBodySQLDiagnosisList setStatementId(Long statementId) {
            this.statementId = statementId;
            return this;
        }
        public Long getStatementId() {
            return this.statementId;
        }

    }

}
