// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationScoreHistoryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AC9BD94C-D20C-4D27-88D4-89E8D75C051B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The historical scores.</p>
     */
    @NameInMap("ScoreHistory")
    public ListEvaluationScoreHistoryResponseBodyScoreHistory scoreHistory;

    public static ListEvaluationScoreHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationScoreHistoryResponseBody self = new ListEvaluationScoreHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEvaluationScoreHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEvaluationScoreHistoryResponseBody setScoreHistory(ListEvaluationScoreHistoryResponseBodyScoreHistory scoreHistory) {
        this.scoreHistory = scoreHistory;
        return this;
    }
    public ListEvaluationScoreHistoryResponseBodyScoreHistory getScoreHistory() {
        return this.scoreHistory;
    }

    public static class ListEvaluationScoreHistoryResponseBodyScoreHistoryTotalScoreHistory extends TeaModel {
        /**
         * <p>The time when the score was generated. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-30T03:34:02Z</p>
         */
        @NameInMap("EvaluationTime")
        public String evaluationTime;

        /**
         * <p>The score.</p>
         * <p>Valid values: 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6753</p>
         */
        @NameInMap("Score")
        public Double score;

        public static ListEvaluationScoreHistoryResponseBodyScoreHistoryTotalScoreHistory build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationScoreHistoryResponseBodyScoreHistoryTotalScoreHistory self = new ListEvaluationScoreHistoryResponseBodyScoreHistoryTotalScoreHistory();
            return TeaModel.build(map, self);
        }

        public ListEvaluationScoreHistoryResponseBodyScoreHistoryTotalScoreHistory setEvaluationTime(String evaluationTime) {
            this.evaluationTime = evaluationTime;
            return this;
        }
        public String getEvaluationTime() {
            return this.evaluationTime;
        }

        public ListEvaluationScoreHistoryResponseBodyScoreHistoryTotalScoreHistory setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

    public static class ListEvaluationScoreHistoryResponseBodyScoreHistory extends TeaModel {
        /**
         * <p>The historical scores.</p>
         */
        @NameInMap("TotalScoreHistory")
        public java.util.List<ListEvaluationScoreHistoryResponseBodyScoreHistoryTotalScoreHistory> totalScoreHistory;

        public static ListEvaluationScoreHistoryResponseBodyScoreHistory build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationScoreHistoryResponseBodyScoreHistory self = new ListEvaluationScoreHistoryResponseBodyScoreHistory();
            return TeaModel.build(map, self);
        }

        public ListEvaluationScoreHistoryResponseBodyScoreHistory setTotalScoreHistory(java.util.List<ListEvaluationScoreHistoryResponseBodyScoreHistoryTotalScoreHistory> totalScoreHistory) {
            this.totalScoreHistory = totalScoreHistory;
            return this;
        }
        public java.util.List<ListEvaluationScoreHistoryResponseBodyScoreHistoryTotalScoreHistory> getTotalScoreHistory() {
            return this.totalScoreHistory;
        }

    }

}
