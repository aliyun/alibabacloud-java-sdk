// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunMedQARequest extends TeaModel {
    @NameInMap("AnswerImageDataList")
    public java.util.List<RunMedQARequestAnswerImageDataList> answerImageDataList;

    @NameInMap("AnswerImageURLList")
    public java.util.List<RunMedQARequestAnswerImageURLList> answerImageURLList;

    @NameInMap("AnswerTextList")
    public java.util.List<RunMedQARequestAnswerTextList> answerTextList;

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

    public static RunMedQARequest build(java.util.Map<String, ?> map) throws Exception {
        RunMedQARequest self = new RunMedQARequest();
        return TeaModel.build(map, self);
    }

    public RunMedQARequest setAnswerImageDataList(java.util.List<RunMedQARequestAnswerImageDataList> answerImageDataList) {
        this.answerImageDataList = answerImageDataList;
        return this;
    }
    public java.util.List<RunMedQARequestAnswerImageDataList> getAnswerImageDataList() {
        return this.answerImageDataList;
    }

    public RunMedQARequest setAnswerImageURLList(java.util.List<RunMedQARequestAnswerImageURLList> answerImageURLList) {
        this.answerImageURLList = answerImageURLList;
        return this;
    }
    public java.util.List<RunMedQARequestAnswerImageURLList> getAnswerImageURLList() {
        return this.answerImageURLList;
    }

    public RunMedQARequest setAnswerTextList(java.util.List<RunMedQARequestAnswerTextList> answerTextList) {
        this.answerTextList = answerTextList;
        return this;
    }
    public java.util.List<RunMedQARequestAnswerTextList> getAnswerTextList() {
        return this.answerTextList;
    }

    public RunMedQARequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public RunMedQARequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public RunMedQARequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public RunMedQARequest setQuestionType(String questionType) {
        this.questionType = questionType;
        return this;
    }
    public String getQuestionType() {
        return this.questionType;
    }

    public RunMedQARequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class RunMedQARequestAnswerImageDataList extends TeaModel {
        @NameInMap("AnswerImageData")
        public byte[] answerImageData;

        public static RunMedQARequestAnswerImageDataList build(java.util.Map<String, ?> map) throws Exception {
            RunMedQARequestAnswerImageDataList self = new RunMedQARequestAnswerImageDataList();
            return TeaModel.build(map, self);
        }

        public RunMedQARequestAnswerImageDataList setAnswerImageData(byte[] answerImageData) {
            this.answerImageData = answerImageData;
            return this;
        }
        public byte[] getAnswerImageData() {
            return this.answerImageData;
        }

    }

    public static class RunMedQARequestAnswerImageURLList extends TeaModel {
        @NameInMap("AnswerImageURL")
        public String answerImageURL;

        public static RunMedQARequestAnswerImageURLList build(java.util.Map<String, ?> map) throws Exception {
            RunMedQARequestAnswerImageURLList self = new RunMedQARequestAnswerImageURLList();
            return TeaModel.build(map, self);
        }

        public RunMedQARequestAnswerImageURLList setAnswerImageURL(String answerImageURL) {
            this.answerImageURL = answerImageURL;
            return this;
        }
        public String getAnswerImageURL() {
            return this.answerImageURL;
        }

    }

    public static class RunMedQARequestAnswerTextList extends TeaModel {
        @NameInMap("AnswerText")
        public String answerText;

        public static RunMedQARequestAnswerTextList build(java.util.Map<String, ?> map) throws Exception {
            RunMedQARequestAnswerTextList self = new RunMedQARequestAnswerTextList();
            return TeaModel.build(map, self);
        }

        public RunMedQARequestAnswerTextList setAnswerText(String answerText) {
            this.answerText = answerText;
            return this;
        }
        public String getAnswerText() {
            return this.answerText;
        }

    }

}
