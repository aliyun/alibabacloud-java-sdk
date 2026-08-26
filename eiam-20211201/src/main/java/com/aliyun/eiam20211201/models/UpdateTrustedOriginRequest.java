// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateTrustedOriginRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the IDaaS EIAM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_example</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>If this parameter is not specified, the trusted origin name is not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>Qoder Production Console</p>
     */
    @NameInMap("TrustOriginName")
    public String trustOriginName;

    /**
     * <p>The ID of the trusted origin.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>to_example</p>
     */
    @NameInMap("TrustedOriginId")
    public String trustedOriginId;

    /**
     * <p>When specified, the existing values are entirely replaced. Only iframe_embed and cors are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>iframe_embed</p>
     */
    @NameInMap("TrustedOriginScene")
    public java.util.List<String> trustedOriginScene;

    public static UpdateTrustedOriginRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrustedOriginRequest self = new UpdateTrustedOriginRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTrustedOriginRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTrustedOriginRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTrustedOriginRequest setTrustOriginName(String trustOriginName) {
        this.trustOriginName = trustOriginName;
        return this;
    }
    public String getTrustOriginName() {
        return this.trustOriginName;
    }

    public UpdateTrustedOriginRequest setTrustedOriginId(String trustedOriginId) {
        this.trustedOriginId = trustedOriginId;
        return this;
    }
    public String getTrustedOriginId() {
        return this.trustedOriginId;
    }

    public UpdateTrustedOriginRequest setTrustedOriginScene(java.util.List<String> trustedOriginScene) {
        this.trustedOriginScene = trustedOriginScene;
        return this;
    }
    public java.util.List<String> getTrustedOriginScene() {
        return this.trustedOriginScene;
    }

}
