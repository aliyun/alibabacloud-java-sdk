// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class DigitalHumanLiveBroadcastQACmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("history")
    public java.util.List<DigitalHumanLiveBroadcastQACmdHistory> history;

    @NameInMap("question")
    public String question;

    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("stream")
    public Boolean stream;

    @NameInMap("subAccountId")
    public String subAccountId;

    public static DigitalHumanLiveBroadcastQACmd build(java.util.Map<String, ?> map) throws Exception {
        DigitalHumanLiveBroadcastQACmd self = new DigitalHumanLiveBroadcastQACmd();
        return TeaModel.build(map, self);
    }

    public DigitalHumanLiveBroadcastQACmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DigitalHumanLiveBroadcastQACmd setHistory(java.util.List<DigitalHumanLiveBroadcastQACmdHistory> history) {
        this.history = history;
        return this;
    }
    public java.util.List<DigitalHumanLiveBroadcastQACmdHistory> getHistory() {
        return this.history;
    }

    public DigitalHumanLiveBroadcastQACmd setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public DigitalHumanLiveBroadcastQACmd setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DigitalHumanLiveBroadcastQACmd setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public DigitalHumanLiveBroadcastQACmd setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

    public static class DigitalHumanLiveBroadcastQACmdHistory extends TeaModel {
        @NameInMap("bot")
        public String bot;

        @NameInMap("user")
        public String user;

        public static DigitalHumanLiveBroadcastQACmdHistory build(java.util.Map<String, ?> map) throws Exception {
            DigitalHumanLiveBroadcastQACmdHistory self = new DigitalHumanLiveBroadcastQACmdHistory();
            return TeaModel.build(map, self);
        }

        public DigitalHumanLiveBroadcastQACmdHistory setBot(String bot) {
            this.bot = bot;
            return this;
        }
        public String getBot() {
            return this.bot;
        }

        public DigitalHumanLiveBroadcastQACmdHistory setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
