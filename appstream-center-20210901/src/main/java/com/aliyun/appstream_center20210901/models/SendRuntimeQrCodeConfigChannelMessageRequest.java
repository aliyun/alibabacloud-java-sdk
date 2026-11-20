// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class SendRuntimeQrCodeConfigChannelMessageRequest extends TeaModel {
    /**
     * <p>The agent platform type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("AgentPlatform")
    public String agentPlatform;

    /**
     * <p>The agent provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenClaw</p>
     */
    @NameInMap("AgentProvider")
    public String agentProvider;

    /**
     * <p>The third-party channel code, such as dingtalk-connector (DingTalk), feishu (Lark), or wecom (WeCom). If the current agent platform and provider do not support the channel, the error code ChannelConfig.NotSupported is returned, and no messages are sent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>feishu</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of runtime resource IDs, such as cloud desktop IDs. You can specify 1 to 200 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuntimeIds")
    public java.util.List<String> runtimeIds;

    /**
     * <p>The runtime environment type of the runtime resource. Currently, only CloudDesktop is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("RuntimeType")
    public String runtimeType;

    public static SendRuntimeQrCodeConfigChannelMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendRuntimeQrCodeConfigChannelMessageRequest self = new SendRuntimeQrCodeConfigChannelMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendRuntimeQrCodeConfigChannelMessageRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public SendRuntimeQrCodeConfigChannelMessageRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public SendRuntimeQrCodeConfigChannelMessageRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendRuntimeQrCodeConfigChannelMessageRequest setRuntimeIds(java.util.List<String> runtimeIds) {
        this.runtimeIds = runtimeIds;
        return this;
    }
    public java.util.List<String> getRuntimeIds() {
        return this.runtimeIds;
    }

    public SendRuntimeQrCodeConfigChannelMessageRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

}
