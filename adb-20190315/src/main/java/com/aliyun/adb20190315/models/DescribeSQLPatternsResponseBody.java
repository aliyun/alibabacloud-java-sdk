// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPatternsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PatternDetails")
    public java.util.List<DescribeSQLPatternsResponseBodyPatternDetails> patternDetails;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLPatternsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPatternsResponseBody self = new DescribeSQLPatternsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPatternsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLPatternsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSQLPatternsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSQLPatternsResponseBody setPatternDetails(java.util.List<DescribeSQLPatternsResponseBodyPatternDetails> patternDetails) {
        this.patternDetails = patternDetails;
        return this;
    }
    public java.util.List<DescribeSQLPatternsResponseBodyPatternDetails> getPatternDetails() {
        return this.patternDetails;
    }

    public DescribeSQLPatternsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSQLPatternsResponseBodyPatternDetails extends TeaModel {
        @NameInMap("SQLPattern")
        public String SQLPattern;

        @NameInMap("PatternId")
        public String patternId;

        @NameInMap("Tables")
        public String tables;

        @NameInMap("PatternCreationDate")
        public String patternCreationDate;

        @NameInMap("TotalQueryTime")
        public String totalQueryTime;

        @NameInMap("AverageQueryTime")
        public String averageQueryTime;

        @NameInMap("QueryTimePercentage")
        public String queryTimePercentage;

        @NameInMap("AverageMemory")
        public String averageMemory;

        @NameInMap("TotalScanSize")
        public String totalScanSize;

        @NameInMap("ScanSizePercentage")
        public String scanSizePercentage;

        @NameInMap("QueryCount")
        public Long queryCount;

        @NameInMap("ErrorCount")
        public Long errorCount;

        @NameInMap("Blockable")
        public Boolean blockable;

        public static DescribeSQLPatternsResponseBodyPatternDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLPatternsResponseBodyPatternDetails self = new DescribeSQLPatternsResponseBodyPatternDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setSQLPattern(String SQLPattern) {
            this.SQLPattern = SQLPattern;
            return this;
        }
        public String getSQLPattern() {
            return this.SQLPattern;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setPatternId(String patternId) {
            this.patternId = patternId;
            return this;
        }
        public String getPatternId() {
            return this.patternId;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setTables(String tables) {
            this.tables = tables;
            return this;
        }
        public String getTables() {
            return this.tables;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setPatternCreationDate(String patternCreationDate) {
            this.patternCreationDate = patternCreationDate;
            return this;
        }
        public String getPatternCreationDate() {
            return this.patternCreationDate;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setTotalQueryTime(String totalQueryTime) {
            this.totalQueryTime = totalQueryTime;
            return this;
        }
        public String getTotalQueryTime() {
            return this.totalQueryTime;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setAverageQueryTime(String averageQueryTime) {
            this.averageQueryTime = averageQueryTime;
            return this;
        }
        public String getAverageQueryTime() {
            return this.averageQueryTime;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setQueryTimePercentage(String queryTimePercentage) {
            this.queryTimePercentage = queryTimePercentage;
            return this;
        }
        public String getQueryTimePercentage() {
            return this.queryTimePercentage;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setAverageMemory(String averageMemory) {
            this.averageMemory = averageMemory;
            return this;
        }
        public String getAverageMemory() {
            return this.averageMemory;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setTotalScanSize(String totalScanSize) {
            this.totalScanSize = totalScanSize;
            return this;
        }
        public String getTotalScanSize() {
            return this.totalScanSize;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setScanSizePercentage(String scanSizePercentage) {
            this.scanSizePercentage = scanSizePercentage;
            return this;
        }
        public String getScanSizePercentage() {
            return this.scanSizePercentage;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setQueryCount(Long queryCount) {
            this.queryCount = queryCount;
            return this;
        }
        public Long getQueryCount() {
            return this.queryCount;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public DescribeSQLPatternsResponseBodyPatternDetails setBlockable(Boolean blockable) {
            this.blockable = blockable;
            return this;
        }
        public Boolean getBlockable() {
            return this.blockable;
        }

    }

}
