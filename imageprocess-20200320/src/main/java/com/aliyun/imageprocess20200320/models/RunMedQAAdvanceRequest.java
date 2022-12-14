// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunMedQAAdvanceRequest extends TeaModel {
    @NameInMap("AnswerImageDataList")
    public java.util.List<RunMedQAAdvanceRequestAnswerImageDataList> answerImageDataList;

    @NameInMap("AnswerImageURLList")
    public java.util.List<RunMedQAAdvanceRequestAnswerImageURLList> answerImageURLList;

    @NameInMap("AnswerTextList")
    public java.util.List<RunMedQAAdvanceRequestAnswerTextList> answerTextList;

    @NameInMap("Department")
    public String department;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OrgName")
    public String orgName;

    @NameInMap("QuestionType")
    public String questionType;

    @NameInMap("SessionId")
    public String sessionId;

    public static RunMedQAAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RunMedQAAdvanceRequest self = new RunMedQAAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RunMedQAAdvanceRequest setAnswerImageDataList(java.util.List<RunMedQAAdvanceRequestAnswerImageDataList> answerImageDataList) {
        this.answerImageDataList = answerImageDataList;
        return this;
    }
    public java.util.List<RunMedQAAdvanceRequestAnswerImageDataList> getAnswerImageDataList() {
        return this.answerImageDataList;
    }

    public RunMedQAAdvanceRequest setAnswerImageURLList(java.util.List<RunMedQAAdvanceRequestAnswerImageURLList> answerImageURLList) {
        this.answerImageURLList = answerImageURLList;
        return this;
    }
    public java.util.List<RunMedQAAdvanceRequestAnswerImageURLList> getAnswerImageURLList() {
        return this.answerImageURLList;
    }

    public RunMedQAAdvanceRequest setAnswerTextList(java.util.List<RunMedQAAdvanceRequestAnswerTextList> answerTextList) {
        this.answerTextList = answerTextList;
        return this;
    }
    public java.util.List<RunMedQAAdvanceRequestAnswerTextList> getAnswerTextList() {
        return this.answerTextList;
    }

    public RunMedQAAdvanceRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public RunMedQAAdvanceRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public RunMedQAAdvanceRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public RunMedQAAdvanceRequest setQuestionType(String questionType) {
        this.questionType = questionType;
        return this;
    }
    public String getQuestionType() {
        return this.questionType;
    }

    public RunMedQAAdvanceRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class RunMedQAAdvanceRequestAnswerImageDataList extends TeaModel {
        @NameInMap("AnswerImageData")
        public String answerImageData;

        public static RunMedQAAdvanceRequestAnswerImageDataList build(java.util.Map<String, ?> map) throws Exception {
            RunMedQAAdvanceRequestAnswerImageDataList self = new RunMedQAAdvanceRequestAnswerImageDataList();
            return TeaModel.build(map, self);
        }

        public RunMedQAAdvanceRequestAnswerImageDataList setAnswerImageData(String answerImageData) {
            this.answerImageData = answerImageData;
            return this;
        }
        public String getAnswerImageData() {
            return this.answerImageData;
        }

    }

    public static class RunMedQAAdvanceRequestAnswerImageURLList extends TeaModel {
        @NameInMap("AnswerImageURL")
        public java.io.InputStream answerImageURLObject;

        public static RunMedQAAdvanceRequestAnswerImageURLList build(java.util.Map<String, ?> map) throws Exception {
            RunMedQAAdvanceRequestAnswerImageURLList self = new RunMedQAAdvanceRequestAnswerImageURLList();
            return TeaModel.build(map, self);
        }

        public RunMedQAAdvanceRequestAnswerImageURLList setAnswerImageURLObject(java.io.InputStream answerImageURLObject) {
            this.answerImageURLObject = answerImageURLObject;
            return this;
        }
        public java.io.InputStream getAnswerImageURLObject() {
            return this.answerImageURLObject;
        }

    }

    public static class RunMedQAAdvanceRequestAnswerTextList extends TeaModel {
        @NameInMap("AnswerText")
        public String answerText;

        public static RunMedQAAdvanceRequestAnswerTextList build(java.util.Map<String, ?> map) throws Exception {
            RunMedQAAdvanceRequestAnswerTextList self = new RunMedQAAdvanceRequestAnswerTextList();
            return TeaModel.build(map, self);
        }

        public RunMedQAAdvanceRequestAnswerTextList setAnswerText(String answerText) {
            this.answerText = answerText;
            return this;
        }
        public String getAnswerText() {
            return this.answerText;
        }

    }

}
