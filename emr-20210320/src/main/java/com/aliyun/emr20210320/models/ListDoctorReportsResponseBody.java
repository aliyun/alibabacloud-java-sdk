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
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
         * 
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The optimization suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The summary of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>eastbuy-mse-plugin-auth</p>
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
         * <p>The component types.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>compute</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>hive</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>hdfs</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>yarn</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>oss</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>hbase</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ComponentTypes")
        public java.util.List<String> componentTypes;

        /**
         * <p>The date on which the report was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-29</p>
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
