// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateTrustedOriginRequest extends TeaModel {
    /**
     * <p>The idempotence token.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_example</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The trusted origin name.</p>
     * 
     * <strong>example:</strong>
     * <p>Qoder Production Console</p>
     */
    @NameInMap("TrustOriginName")
    public String trustOriginName;

    /**
     * <p>The trusted origin ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>to_example</p>
     */
    @NameInMap("TrustedOriginId")
    public String trustedOriginId;

    /**
     * <p>The trusted origin scenario.</p>
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
