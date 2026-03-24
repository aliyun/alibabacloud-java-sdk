// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MergeRobot extends TeaModel {
    /**
     * <p>创建时间。</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58.789Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>扩展字段。</p>
     */
    @NameInMap("extend")
    public MergeRobotExtend extend;

    /**
     * <p>最后修改时间。</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58.789Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>机器人唯一标识符。</p>
     * 
     * <strong>example:</strong>
     * <p>robot-12345</p>
     */
    @NameInMap("identifier")
    public String identifier;

    /**
     * <p>语言偏好。</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>机器人名称。</p>
     * 
     * <strong>example:</strong>
     * <p>运维告警机器人</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>机器人来源系统。</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>机器人类型。</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Webhook 地址。</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=abc123">https://oapi.dingtalk.com/robot/send?access_token=abc123</a></p>
     */
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
        /**
         * <p>卡片模板。</p>
         * 
         * <strong>example:</strong>
         * <p>incident-card-template</p>
         */
        @NameInMap("cardTemplate")
        public String cardTemplate;

        /**
         * <p>是否启用每日值班报告。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("dailyNoc")
        public Boolean dailyNoc;

        /**
         * <p>每日值班报告时间。</p>
         * 
         * <strong>example:</strong>
         * <p>09:00</p>
         */
        @NameInMap("dailyNocTime")
        public String dailyNocTime;

        /**
         * <p>钉钉签名密钥。</p>
         * 
         * <strong>example:</strong>
         * <p>abc123</p>
         */
        @NameInMap("dingSignKey")
        public String dingSignKey;

        /**
         * <p>是否启用出站请求。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableOutgoing")
        public Boolean enableOutgoing;

        /**
         * <p>认证令牌。</p>
         * 
         * <strong>example:</strong>
         * <p>token-abc123</p>
         */
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
