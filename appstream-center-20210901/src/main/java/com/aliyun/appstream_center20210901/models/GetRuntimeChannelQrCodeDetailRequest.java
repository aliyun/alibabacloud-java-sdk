// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetRuntimeChannelQrCodeDetailRequest extends TeaModel {
    /**
     * <p>The agent platform.</p>
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
     * <p>The channel code. It must be the same as the channel code used when initiating the QR code configuration channel, such as dingtalk-connector (DingTalk), feishu (Lark), and wecom (WeCom).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk-connector</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the runtime, such as a cloud desktop ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-sdfdsx</p>
     */
    @NameInMap("RuntimeId")
    public String runtimeId;

    /**
     * <p>The runtime environment type of the runtime resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("RuntimeType")
    public String runtimeType;

    public static GetRuntimeChannelQrCodeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuntimeChannelQrCodeDetailRequest self = new GetRuntimeChannelQrCodeDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetRuntimeChannelQrCodeDetailRequest setAgentPlatform(String agentPlatform) {
        this.agentPlatform = agentPlatform;
        return this;
    }
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    public GetRuntimeChannelQrCodeDetailRequest setAgentProvider(String agentProvider) {
        this.agentProvider = agentProvider;
        return this;
    }
    public String getAgentProvider() {
        return this.agentProvider;
    }

    public GetRuntimeChannelQrCodeDetailRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuntimeChannelQrCodeDetailRequest setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public String getRuntimeId() {
        return this.runtimeId;
    }

    public GetRuntimeChannelQrCodeDetailRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

}
