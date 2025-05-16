// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherEnglishParaphraseChatMessageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6788e0b475a4631ffc626722</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>How much is this?</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("grade")
    public Long grade;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxx</p>
     */
    @NameInMap("questionId")
    public String questionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>How to inquire about the price</p>
     */
    @NameInMap("questionInfo")
    public String questionInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sreaming</p>
     */
    @NameInMap("responseMode")
    public String responseMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>How much is this?</p>
     */
    @NameInMap("userAnswer")
    public String userAnswer;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ExecuteAITeacherEnglishParaphraseChatMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherEnglishParaphraseChatMessageRequest self = new ExecuteAITeacherEnglishParaphraseChatMessageRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageRequest setGrade(Long grade) {
        this.grade = grade;
        return this;
    }
    public Long getGrade() {
        return this.grade;
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageRequest setQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }
    public String getQuestionId() {
        return this.questionId;
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageRequest setQuestionInfo(String questionInfo) {
        this.questionInfo = questionInfo;
        return this;
    }
    public String getQuestionInfo() {
        return this.questionInfo;
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageRequest setResponseMode(String responseMode) {
        this.responseMode = responseMode;
        return this;
    }
    public String getResponseMode() {
        return this.responseMode;
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageRequest setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
        return this;
    }
    public String getUserAnswer() {
        return this.userAnswer;
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
