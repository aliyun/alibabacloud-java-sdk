// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class CopywritingQARequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("histories")
    public java.util.List<CopywritingQARequestHistories> histories;

    @NameInMap("history")
    @Deprecated
    public CopywritingQARequestHistory history;

    @NameInMap("question")
    public String question;

    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("stream")
    public Boolean stream;

    @NameInMap("subAccountId")
    public String subAccountId;

    public static CopywritingQARequest build(java.util.Map<String, ?> map) throws Exception {
        CopywritingQARequest self = new CopywritingQARequest();
        return TeaModel.build(map, self);
    }

    public CopywritingQARequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CopywritingQARequest setHistories(java.util.List<CopywritingQARequestHistories> histories) {
        this.histories = histories;
        return this;
    }
    public java.util.List<CopywritingQARequestHistories> getHistories() {
        return this.histories;
    }

    public CopywritingQARequest setHistory(CopywritingQARequestHistory history) {
        this.history = history;
        return this;
    }
    public CopywritingQARequestHistory getHistory() {
        return this.history;
    }

    public CopywritingQARequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public CopywritingQARequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CopywritingQARequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public CopywritingQARequest setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

    public static class CopywritingQARequestHistories extends TeaModel {
        @NameInMap("bot")
        public String bot;

        @NameInMap("user")
        public String user;

        public static CopywritingQARequestHistories build(java.util.Map<String, ?> map) throws Exception {
            CopywritingQARequestHistories self = new CopywritingQARequestHistories();
            return TeaModel.build(map, self);
        }

        public CopywritingQARequestHistories setBot(String bot) {
            this.bot = bot;
            return this;
        }
        public String getBot() {
            return this.bot;
        }

        public CopywritingQARequestHistories setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class CopywritingQARequestHistory extends TeaModel {
        @NameInMap("bot")
        public String bot;

        @NameInMap("user")
        public String user;

        public static CopywritingQARequestHistory build(java.util.Map<String, ?> map) throws Exception {
            CopywritingQARequestHistory self = new CopywritingQARequestHistory();
            return TeaModel.build(map, self);
        }

        public CopywritingQARequestHistory setBot(String bot) {
            this.bot = bot;
            return this;
        }
        public String getBot() {
            return this.bot;
        }

        public CopywritingQARequestHistory setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
