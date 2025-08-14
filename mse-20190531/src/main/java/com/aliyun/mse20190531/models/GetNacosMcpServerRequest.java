// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosMcpServerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-tl327w****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>5e3c5211-d365-4013-8540-c4106ec2a5dc</p>
     */
    @NameInMap("McpServerId")
    public String mcpServerId;

    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("McpServerVersion")
    public String mcpServerVersion;

    /**
     * <strong>example:</strong>
     * <p>5e3ee449-b5c0-4aee-b857-32c0acbebf26</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static GetNacosMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNacosMcpServerRequest self = new GetNacosMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public GetNacosMcpServerRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetNacosMcpServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetNacosMcpServerRequest setMcpServerId(String mcpServerId) {
        this.mcpServerId = mcpServerId;
        return this;
    }
    public String getMcpServerId() {
        return this.mcpServerId;
    }

    public GetNacosMcpServerRequest setMcpServerVersion(String mcpServerVersion) {
        this.mcpServerVersion = mcpServerVersion;
        return this;
    }
    public String getMcpServerVersion() {
        return this.mcpServerVersion;
    }

    public GetNacosMcpServerRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
