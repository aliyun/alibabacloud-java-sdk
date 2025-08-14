// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosMcpServerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-u0t2xzvxa06</p>
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
     * <p>fc0f6e40-****-946b-45e3af313707</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DeleteNacosMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosMcpServerRequest self = new DeleteNacosMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNacosMcpServerRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteNacosMcpServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteNacosMcpServerRequest setMcpServerId(String mcpServerId) {
        this.mcpServerId = mcpServerId;
        return this;
    }
    public String getMcpServerId() {
        return this.mcpServerId;
    }

    public DeleteNacosMcpServerRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
