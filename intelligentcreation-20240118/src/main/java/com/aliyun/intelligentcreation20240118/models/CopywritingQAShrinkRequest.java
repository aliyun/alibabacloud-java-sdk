// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class CopywritingQAShrinkRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("histories")
    public String historiesShrink;

    @NameInMap("history")
    @Deprecated
    public String historyShrink;

    @NameInMap("question")
    public String question;

    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("stream")
    public Boolean stream;

    @NameInMap("subAccountId")
    public String subAccountId;

    public static CopywritingQAShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CopywritingQAShrinkRequest self = new CopywritingQAShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CopywritingQAShrinkRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CopywritingQAShrinkRequest setHistoriesShrink(String historiesShrink) {
        this.historiesShrink = historiesShrink;
        return this;
    }
    public String getHistoriesShrink() {
        return this.historiesShrink;
    }

    public CopywritingQAShrinkRequest setHistoryShrink(String historyShrink) {
        this.historyShrink = historyShrink;
        return this;
    }
    public String getHistoryShrink() {
        return this.historyShrink;
    }

    public CopywritingQAShrinkRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public CopywritingQAShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CopywritingQAShrinkRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public CopywritingQAShrinkRequest setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

}
