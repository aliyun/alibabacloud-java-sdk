// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorReportComponentSummaryResponseBody extends TeaModel {
    @NameInMap("Data")
    public Data data;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDoctorReportComponentSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorReportComponentSummaryResponseBody self = new GetDoctorReportComponentSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDoctorReportComponentSummaryResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetDoctorReportComponentSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Data extends TeaModel {
        @NameInMap("Score")
        public Integer score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Summary")
        public String summary;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public Data setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public Data setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

}
