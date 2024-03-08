// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class SubmitBulletQuestionsCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("questions")
    public java.util.List<SubmitBulletQuestionsCmdQuestions> questions;

    @NameInMap("roomId")
    public String roomId;

    @NameInMap("subAccountId")
    public String subAccountId;

    public static SubmitBulletQuestionsCmd build(java.util.Map<String, ?> map) throws Exception {
        SubmitBulletQuestionsCmd self = new SubmitBulletQuestionsCmd();
        return TeaModel.build(map, self);
    }

    public SubmitBulletQuestionsCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SubmitBulletQuestionsCmd setQuestions(java.util.List<SubmitBulletQuestionsCmdQuestions> questions) {
        this.questions = questions;
        return this;
    }
    public java.util.List<SubmitBulletQuestionsCmdQuestions> getQuestions() {
        return this.questions;
    }

    public SubmitBulletQuestionsCmd setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public SubmitBulletQuestionsCmd setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

    public static class SubmitBulletQuestionsCmdQuestions extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("id")
        public String id;

        @NameInMap("time")
        public Long time;

        @NameInMap("username")
        public String username;

        public static SubmitBulletQuestionsCmdQuestions build(java.util.Map<String, ?> map) throws Exception {
            SubmitBulletQuestionsCmdQuestions self = new SubmitBulletQuestionsCmdQuestions();
            return TeaModel.build(map, self);
        }

        public SubmitBulletQuestionsCmdQuestions setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SubmitBulletQuestionsCmdQuestions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitBulletQuestionsCmdQuestions setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public SubmitBulletQuestionsCmdQuestions setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
