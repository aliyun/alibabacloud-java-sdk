// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorReportsResponseBody extends TeaModel {
    /**
     * <p>The reports.</p>
     */
    @NameInMap("Data")
    public java.util.List<Data> data;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDoctorReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorReportsResponseBody self = new ListDoctorReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDoctorReportsResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public ListDoctorReportsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorReportsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDoctorReportsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SummaryReport extends TeaModel {
        /**
         * <p>The score.</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The optimization suggestion.</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The summary of the report.</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static SummaryReport build(java.util.Map<String, ?> map) throws Exception {
            SummaryReport self = new SummaryReport();
            return TeaModel.build(map, self);
        }

        public SummaryReport setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public SummaryReport setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public SummaryReport setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class Data extends TeaModel {
        /**
         * <p>The service types.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   compute</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   hive</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   hdfs</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   yarn</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   oss</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   hbase</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ComponentTypes")
        public java.util.List<String> componentTypes;

        /**
         * <p>The date on which the report was generated.</p>
         */
        @NameInMap("DateTime")
        public String dateTime;

        /**
         * <p>The summary of the report.</p>
         */
        @NameInMap("SummaryReport")
        public SummaryReport summaryReport;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setComponentTypes(java.util.List<String> componentTypes) {
            this.componentTypes = componentTypes;
            return this;
        }
        public java.util.List<String> getComponentTypes() {
            return this.componentTypes;
        }

        public Data setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public Data setSummaryReport(SummaryReport summaryReport) {
            this.summaryReport = summaryReport;
            return this;
        }
        public SummaryReport getSummaryReport() {
            return this.summaryReport;
        }

    }

}
