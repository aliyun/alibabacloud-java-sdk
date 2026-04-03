// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateIMBotInput extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("botBizId")
    public String botBizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("botBizSecret")
    public String botBizSecret;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("botBizType")
    public String botBizType;

    /**
     * <p>standard、custom；不传时可能继承租户已有部署模式</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("botMode")
    public String botMode;

    /**
     * <p>This parameter is required.</p>
     */
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
     * <p>botMode 为 standard 时条件必填；custom 模式不进行标准运行时绑定校验</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("metadata")
    public IMBotMetadata metadata;

    /**
     * <p>FC 最小实例数，≥ 1；与租户账号级配置相关</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("minInstances")
    public Integer minInstances;

    public static CreateIMBotInput build(java.util.Map<String, ?> map) throws Exception {
        CreateIMBotInput self = new CreateIMBotInput();
        return TeaModel.build(map, self);
    }

    public CreateIMBotInput setBotBizId(String botBizId) {
        this.botBizId = botBizId;
        return this;
    }
    public String getBotBizId() {
        return this.botBizId;
    }

    public CreateIMBotInput setBotBizSecret(String botBizSecret) {
        this.botBizSecret = botBizSecret;
        return this;
    }
    public String getBotBizSecret() {
        return this.botBizSecret;
    }

    public CreateIMBotInput setBotBizType(String botBizType) {
        this.botBizType = botBizType;
        return this;
    }
    public String getBotBizType() {
        return this.botBizType;
    }

    public CreateIMBotInput setBotMode(String botMode) {
        this.botMode = botMode;
        return this;
    }
    public String getBotMode() {
        return this.botMode;
    }

    public CreateIMBotInput setBotName(String botName) {
        this.botName = botName;
        return this;
    }
    public String getBotName() {
        return this.botName;
    }

    public CreateIMBotInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIMBotInput setMetadata(IMBotMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public IMBotMetadata getMetadata() {
        return this.metadata;
    }

    public CreateIMBotInput setMinInstances(Integer minInstances) {
        this.minInstances = minInstances;
        return this;
    }
    public Integer getMinInstances() {
        return this.minInstances;
    }

}
