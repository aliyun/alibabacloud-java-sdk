// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPatternAttributeResponseBody extends TeaModel {
    @NameInMap("PatternDetail")
    public DescribeSQLPatternAttributeResponseBodyPatternDetail patternDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSQLPatternAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPatternAttributeResponseBody self = new DescribeSQLPatternAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPatternAttributeResponseBody setPatternDetail(DescribeSQLPatternAttributeResponseBodyPatternDetail patternDetail) {
        this.patternDetail = patternDetail;
        return this;
    }
    public DescribeSQLPatternAttributeResponseBodyPatternDetail getPatternDetail() {
        return this.patternDetail;
    }

    public DescribeSQLPatternAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSQLPatternAttributeResponseBodyPatternDetail extends TeaModel {
        @NameInMap("SQLPattern")
        public String SQLPattern;

        @NameInMap("QueryCount")
        public Long queryCount;

        @NameInMap("TotalQueryTime")
        public String totalQueryTime;

        @NameInMap("AverageQueryTime")
        public String averageQueryTime;

        @NameInMap("AverageMemory")
        public String averageMemory;

        public static DescribeSQLPatternAttributeResponseBodyPatternDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLPatternAttributeResponseBodyPatternDetail self = new DescribeSQLPatternAttributeResponseBodyPatternDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSQLPatternAttributeResponseBodyPatternDetail setSQLPattern(String SQLPattern) {
            this.SQLPattern = SQLPattern;
            return this;
        }
        public String getSQLPattern() {
            return this.SQLPattern;
        }

        public DescribeSQLPatternAttributeResponseBodyPatternDetail setQueryCount(Long queryCount) {
            this.queryCount = queryCount;
            return this;
        }
        public Long getQueryCount() {
            return this.queryCount;
        }

        public DescribeSQLPatternAttributeResponseBodyPatternDetail setTotalQueryTime(String totalQueryTime) {
            this.totalQueryTime = totalQueryTime;
            return this;
        }
        public String getTotalQueryTime() {
            return this.totalQueryTime;
        }

        public DescribeSQLPatternAttributeResponseBodyPatternDetail setAverageQueryTime(String averageQueryTime) {
            this.averageQueryTime = averageQueryTime;
            return this;
        }
        public String getAverageQueryTime() {
            return this.averageQueryTime;
        }

        public DescribeSQLPatternAttributeResponseBodyPatternDetail setAverageMemory(String averageMemory) {
            this.averageMemory = averageMemory;
            return this;
        }
        public String getAverageMemory() {
            return this.averageMemory;
        }

    }

}
