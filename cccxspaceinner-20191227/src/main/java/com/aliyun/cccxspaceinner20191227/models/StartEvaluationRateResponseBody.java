// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class StartEvaluationRateResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public StartEvaluationRateResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static StartEvaluationRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartEvaluationRateResponseBody self = new StartEvaluationRateResponseBody();
        return TeaModel.build(map, self);
    }

    public StartEvaluationRateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartEvaluationRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartEvaluationRateResponseBody setData(StartEvaluationRateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartEvaluationRateResponseBodyData getData() {
        return this.data;
    }

    public StartEvaluationRateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartEvaluationRateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StartEvaluationRateResponseBodyDataEvaluationInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Purpose")
        public String purpose;

        @NameInMap("Type")
        public String type;

        @NameInMap("SenceId")
        public Long senceId;

        @NameInMap("IsEmpty")
        public Boolean isEmpty;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        @NameInMap("Creator")
        public Long creator;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("LastModifier")
        public Long lastModifier;

        @NameInMap("ExtMap")
        public java.util.Map<String, ?> extMap;

        @NameInMap("IsSimpleEvaluation")
        public Boolean isSimpleEvaluation;

        @NameInMap("Description")
        public String description;

        @NameInMap("Title")
        public String title;

        @NameInMap("ExtAttrs")
        public String extAttrs;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LanguageId")
        public Integer languageId;

        public static StartEvaluationRateResponseBodyDataEvaluationInfo build(java.util.Map<String, ?> map) throws Exception {
            StartEvaluationRateResponseBodyDataEvaluationInfo self = new StartEvaluationRateResponseBodyDataEvaluationInfo();
            return TeaModel.build(map, self);
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setPurpose(String purpose) {
            this.purpose = purpose;
            return this;
        }
        public String getPurpose() {
            return this.purpose;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setSenceId(Long senceId) {
            this.senceId = senceId;
            return this;
        }
        public Long getSenceId() {
            return this.senceId;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setIsEmpty(Boolean isEmpty) {
            this.isEmpty = isEmpty;
            return this;
        }
        public Boolean getIsEmpty() {
            return this.isEmpty;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setLastModifier(Long lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public Long getLastModifier() {
            return this.lastModifier;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setExtMap(java.util.Map<String, ?> extMap) {
            this.extMap = extMap;
            return this;
        }
        public java.util.Map<String, ?> getExtMap() {
            return this.extMap;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setIsSimpleEvaluation(Boolean isSimpleEvaluation) {
            this.isSimpleEvaluation = isSimpleEvaluation;
            return this;
        }
        public Boolean getIsSimpleEvaluation() {
            return this.isSimpleEvaluation;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setExtAttrs(String extAttrs) {
            this.extAttrs = extAttrs;
            return this;
        }
        public String getExtAttrs() {
            return this.extAttrs;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public StartEvaluationRateResponseBodyDataEvaluationInfo setLanguageId(Integer languageId) {
            this.languageId = languageId;
            return this;
        }
        public Integer getLanguageId() {
            return this.languageId;
        }

    }

    public static class StartEvaluationRateResponseBodyData extends TeaModel {
        @NameInMap("EvaluationInfo")
        public StartEvaluationRateResponseBodyDataEvaluationInfo evaluationInfo;

        @NameInMap("Questions")
        public java.util.Map<String, ?> questions;

        public static StartEvaluationRateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartEvaluationRateResponseBodyData self = new StartEvaluationRateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartEvaluationRateResponseBodyData setEvaluationInfo(StartEvaluationRateResponseBodyDataEvaluationInfo evaluationInfo) {
            this.evaluationInfo = evaluationInfo;
            return this;
        }
        public StartEvaluationRateResponseBodyDataEvaluationInfo getEvaluationInfo() {
            return this.evaluationInfo;
        }

        public StartEvaluationRateResponseBodyData setQuestions(java.util.Map<String, ?> questions) {
            this.questions = questions;
            return this;
        }
        public java.util.Map<String, ?> getQuestions() {
            return this.questions;
        }

    }

}
