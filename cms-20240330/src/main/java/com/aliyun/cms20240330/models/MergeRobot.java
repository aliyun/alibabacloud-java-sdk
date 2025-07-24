// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MergeRobot extends TeaModel {
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("extend")
    public MergeRobotExtend extend;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("identifier")
    public String identifier;

    @NameInMap("lang")
    public String lang;

    @NameInMap("name")
    public String name;

    @NameInMap("source")
    public String source;

    @NameInMap("type")
    public String type;

    @NameInMap("webhook")
    public String webhook;

    public static MergeRobot build(java.util.Map<String, ?> map) throws Exception {
        MergeRobot self = new MergeRobot();
        return TeaModel.build(map, self);
    }

    public MergeRobot setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MergeRobot setExtend(MergeRobotExtend extend) {
        this.extend = extend;
        return this;
    }
    public MergeRobotExtend getExtend() {
        return this.extend;
    }

    public MergeRobot setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MergeRobot setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public MergeRobot setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MergeRobot setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MergeRobot setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public MergeRobot setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MergeRobot setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

    public static class MergeRobotExtend extends TeaModel {
        @NameInMap("cardTemplate")
        public String cardTemplate;

        @NameInMap("dailyNoc")
        public Boolean dailyNoc;

        @NameInMap("dailyNocTime")
        public String dailyNocTime;

        @NameInMap("dingSignKey")
        public String dingSignKey;

        @NameInMap("enableOutgoing")
        public Boolean enableOutgoing;

        @NameInMap("token")
        public String token;

        public static MergeRobotExtend build(java.util.Map<String, ?> map) throws Exception {
            MergeRobotExtend self = new MergeRobotExtend();
            return TeaModel.build(map, self);
        }

        public MergeRobotExtend setCardTemplate(String cardTemplate) {
            this.cardTemplate = cardTemplate;
            return this;
        }
        public String getCardTemplate() {
            return this.cardTemplate;
        }

        public MergeRobotExtend setDailyNoc(Boolean dailyNoc) {
            this.dailyNoc = dailyNoc;
            return this;
        }
        public Boolean getDailyNoc() {
            return this.dailyNoc;
        }

        public MergeRobotExtend setDailyNocTime(String dailyNocTime) {
            this.dailyNocTime = dailyNocTime;
            return this;
        }
        public String getDailyNocTime() {
            return this.dailyNocTime;
        }

        public MergeRobotExtend setDingSignKey(String dingSignKey) {
            this.dingSignKey = dingSignKey;
            return this;
        }
        public String getDingSignKey() {
            return this.dingSignKey;
        }

        public MergeRobotExtend setEnableOutgoing(Boolean enableOutgoing) {
            this.enableOutgoing = enableOutgoing;
            return this;
        }
        public Boolean getEnableOutgoing() {
            return this.enableOutgoing;
        }

        public MergeRobotExtend setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
