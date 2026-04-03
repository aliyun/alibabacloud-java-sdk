// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateIMBotInput extends TeaModel {
    @NameInMap("botBizId")
    public String botBizId;

    /**
     * <p>若提供则不可为空字符串</p>
     */
    @NameInMap("botBizSecret")
    public String botBizSecret;

    @NameInMap("botBizType")
    public String botBizType;

    /**
     * <p>不可与租户已固定的 deployment 模式冲突</p>
     */
    @NameInMap("botMode")
    public String botMode;

    @NameInMap("botName")
    public String botName;

    /**
     * <p>Bot 描述信息</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("metadata")
    public IMBotMetadata metadata;

    /**
     * <p>≥ 1，更新账号级 FC 最小实例</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("minInstances")
    public Integer minInstances;

    @NameInMap("status")
    public String status;

    public static UpdateIMBotInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateIMBotInput self = new UpdateIMBotInput();
        return TeaModel.build(map, self);
    }

    public UpdateIMBotInput setBotBizId(String botBizId) {
        this.botBizId = botBizId;
        return this;
    }
    public String getBotBizId() {
        return this.botBizId;
    }

    public UpdateIMBotInput setBotBizSecret(String botBizSecret) {
        this.botBizSecret = botBizSecret;
        return this;
    }
    public String getBotBizSecret() {
        return this.botBizSecret;
    }

    public UpdateIMBotInput setBotBizType(String botBizType) {
        this.botBizType = botBizType;
        return this;
    }
    public String getBotBizType() {
        return this.botBizType;
    }

    public UpdateIMBotInput setBotMode(String botMode) {
        this.botMode = botMode;
        return this;
    }
    public String getBotMode() {
        return this.botMode;
    }

    public UpdateIMBotInput setBotName(String botName) {
        this.botName = botName;
        return this;
    }
    public String getBotName() {
        return this.botName;
    }

    public UpdateIMBotInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIMBotInput setMetadata(IMBotMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public IMBotMetadata getMetadata() {
        return this.metadata;
    }

    public UpdateIMBotInput setMinInstances(Integer minInstances) {
        this.minInstances = minInstances;
        return this;
    }
    public Integer getMinInstances() {
        return this.minInstances;
    }

    public UpdateIMBotInput setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
