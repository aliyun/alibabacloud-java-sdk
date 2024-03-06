// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class SubmitBulletQuestionsShrinkRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    /**
     * <p>questions</p>
     */
    @NameInMap("questions")
    public String questionsShrink;

    @NameInMap("roomId")
    public String roomId;

    @NameInMap("subAccountId")
    public String subAccountId;

    public static SubmitBulletQuestionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBulletQuestionsShrinkRequest self = new SubmitBulletQuestionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBulletQuestionsShrinkRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SubmitBulletQuestionsShrinkRequest setQuestionsShrink(String questionsShrink) {
        this.questionsShrink = questionsShrink;
        return this;
    }
    public String getQuestionsShrink() {
        return this.questionsShrink;
    }

    public SubmitBulletQuestionsShrinkRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public SubmitBulletQuestionsShrinkRequest setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

}
