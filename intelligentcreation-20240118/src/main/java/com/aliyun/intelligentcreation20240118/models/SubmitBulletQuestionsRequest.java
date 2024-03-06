// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class SubmitBulletQuestionsRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    /**
     * <p>questions</p>
     */
    @NameInMap("questions")
    public java.util.List<SubmitBulletQuestionsRequestQuestions> questions;

    @NameInMap("roomId")
    public String roomId;

    @NameInMap("subAccountId")
    public String subAccountId;

    public static SubmitBulletQuestionsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBulletQuestionsRequest self = new SubmitBulletQuestionsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBulletQuestionsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SubmitBulletQuestionsRequest setQuestions(java.util.List<SubmitBulletQuestionsRequestQuestions> questions) {
        this.questions = questions;
        return this;
    }
    public java.util.List<SubmitBulletQuestionsRequestQuestions> getQuestions() {
        return this.questions;
    }

    public SubmitBulletQuestionsRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public SubmitBulletQuestionsRequest setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

    public static class SubmitBulletQuestionsRequestQuestions extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("id")
        public String id;

        @NameInMap("username")
        public String username;

        public static SubmitBulletQuestionsRequestQuestions build(java.util.Map<String, ?> map) throws Exception {
            SubmitBulletQuestionsRequestQuestions self = new SubmitBulletQuestionsRequestQuestions();
            return TeaModel.build(map, self);
        }

        public SubmitBulletQuestionsRequestQuestions setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SubmitBulletQuestionsRequestQuestions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitBulletQuestionsRequestQuestions setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
