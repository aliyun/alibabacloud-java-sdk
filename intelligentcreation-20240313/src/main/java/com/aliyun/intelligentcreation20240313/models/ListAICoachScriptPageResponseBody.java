// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAICoachScriptPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PARAM_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("list")
    public java.util.List<ListAICoachScriptPageResponseBodyList> list;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>86A90C40-D1AB-50DA-A4B1-0D545F80F2FE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListAICoachScriptPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAICoachScriptPageResponseBody self = new ListAICoachScriptPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAICoachScriptPageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAICoachScriptPageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAICoachScriptPageResponseBody setList(java.util.List<ListAICoachScriptPageResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListAICoachScriptPageResponseBodyList> getList() {
        return this.list;
    }

    public ListAICoachScriptPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAICoachScriptPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAICoachScriptPageResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAICoachScriptPageResponseBodyListCompleteStrategy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("clickCompleteAutoEnd")
        public Boolean clickCompleteAutoEnd;

        /**
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("fullCoverageAutoEnd")
        public Boolean fullCoverageAutoEnd;

        public static ListAICoachScriptPageResponseBodyListCompleteStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListCompleteStrategy self = new ListAICoachScriptPageResponseBodyListCompleteStrategy();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListCompleteStrategy setClickCompleteAutoEnd(Boolean clickCompleteAutoEnd) {
            this.clickCompleteAutoEnd = clickCompleteAutoEnd;
            return this;
        }
        public Boolean getClickCompleteAutoEnd() {
            return this.clickCompleteAutoEnd;
        }

        public ListAICoachScriptPageResponseBodyListCompleteStrategy setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListAICoachScriptPageResponseBodyListCompleteStrategy setFullCoverageAutoEnd(Boolean fullCoverageAutoEnd) {
            this.fullCoverageAutoEnd = fullCoverageAutoEnd;
            return this;
        }
        public Boolean getFullCoverageAutoEnd() {
            return this.fullCoverageAutoEnd;
        }

    }

    public static class ListAICoachScriptPageResponseBodyListSampleDialogueList extends TeaModel {
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>student</p>
         */
        @NameInMap("role")
        public String role;

        public static ListAICoachScriptPageResponseBodyListSampleDialogueList build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListSampleDialogueList self = new ListAICoachScriptPageResponseBodyListSampleDialogueList();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListSampleDialogueList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAICoachScriptPageResponseBodyListSampleDialogueList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ListAICoachScriptPageResponseBodyListWeights extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("assessmentPoint")
        public Integer assessmentPoint;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("expressiveness")
        public Integer expressiveness;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("standard")
        public Integer standard;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("standardEnabled")
        public Boolean standardEnabled;

        public static ListAICoachScriptPageResponseBodyListWeights build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyListWeights self = new ListAICoachScriptPageResponseBodyListWeights();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyListWeights setAssessmentPoint(Integer assessmentPoint) {
            this.assessmentPoint = assessmentPoint;
            return this;
        }
        public Integer getAssessmentPoint() {
            return this.assessmentPoint;
        }

        public ListAICoachScriptPageResponseBodyListWeights setExpressiveness(Integer expressiveness) {
            this.expressiveness = expressiveness;
            return this;
        }
        public Integer getExpressiveness() {
            return this.expressiveness;
        }

        public ListAICoachScriptPageResponseBodyListWeights setStandard(Integer standard) {
            this.standard = standard;
            return this;
        }
        public Integer getStandard() {
            return this.standard;
        }

        public ListAICoachScriptPageResponseBodyListWeights setStandardEnabled(Boolean standardEnabled) {
            this.standardEnabled = standardEnabled;
            return this;
        }
        public Boolean getStandardEnabled() {
            return this.standardEnabled;
        }

    }

    public static class ListAICoachScriptPageResponseBodyList extends TeaModel {
        @NameInMap("completeStrategy")
        public ListAICoachScriptPageResponseBodyListCompleteStrategy completeStrategy;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oss-ata.alibaba.com/front/live/banner1.png">https://oss-ata.alibaba.com/front/live/banner1.png</a></p>
         */
        @NameInMap("coverUrl")
        public String coverUrl;

        @NameInMap("expressiveness")
        public java.util.Map<String, String> expressiveness;

        /**
         * <strong>example:</strong>
         * <p>2024-12-25 14:00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-12-25 14:00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>student</p>
         */
        @NameInMap("initiator")
        public String initiator;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("interactionType")
        public String interactionType;

        @NameInMap("introduce")
        public String introduce;

        /**
         * <strong>example:</strong>
         * <p>prod-ydsf</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("sampleDialogueList")
        public java.util.List<ListAICoachScriptPageResponseBodyListSampleDialogueList> sampleDialogueList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("scriptRecordId")
        public String scriptRecordId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        @NameInMap("weights")
        public ListAICoachScriptPageResponseBodyListWeights weights;

        public static ListAICoachScriptPageResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachScriptPageResponseBodyList self = new ListAICoachScriptPageResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListAICoachScriptPageResponseBodyList setCompleteStrategy(ListAICoachScriptPageResponseBodyListCompleteStrategy completeStrategy) {
            this.completeStrategy = completeStrategy;
            return this;
        }
        public ListAICoachScriptPageResponseBodyListCompleteStrategy getCompleteStrategy() {
            return this.completeStrategy;
        }

        public ListAICoachScriptPageResponseBodyList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListAICoachScriptPageResponseBodyList setExpressiveness(java.util.Map<String, String> expressiveness) {
            this.expressiveness = expressiveness;
            return this;
        }
        public java.util.Map<String, String> getExpressiveness() {
            return this.expressiveness;
        }

        public ListAICoachScriptPageResponseBodyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAICoachScriptPageResponseBodyList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAICoachScriptPageResponseBodyList setInitiator(String initiator) {
            this.initiator = initiator;
            return this;
        }
        public String getInitiator() {
            return this.initiator;
        }

        public ListAICoachScriptPageResponseBodyList setInteractionType(String interactionType) {
            this.interactionType = interactionType;
            return this;
        }
        public String getInteractionType() {
            return this.interactionType;
        }

        public ListAICoachScriptPageResponseBodyList setIntroduce(String introduce) {
            this.introduce = introduce;
            return this;
        }
        public String getIntroduce() {
            return this.introduce;
        }

        public ListAICoachScriptPageResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAICoachScriptPageResponseBodyList setSampleDialogueList(java.util.List<ListAICoachScriptPageResponseBodyListSampleDialogueList> sampleDialogueList) {
            this.sampleDialogueList = sampleDialogueList;
            return this;
        }
        public java.util.List<ListAICoachScriptPageResponseBodyListSampleDialogueList> getSampleDialogueList() {
            return this.sampleDialogueList;
        }

        public ListAICoachScriptPageResponseBodyList setScriptRecordId(String scriptRecordId) {
            this.scriptRecordId = scriptRecordId;
            return this;
        }
        public String getScriptRecordId() {
            return this.scriptRecordId;
        }

        public ListAICoachScriptPageResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAICoachScriptPageResponseBodyList setWeights(ListAICoachScriptPageResponseBodyListWeights weights) {
            this.weights = weights;
            return this;
        }
        public ListAICoachScriptPageResponseBodyListWeights getWeights() {
            return this.weights;
        }

    }

}
