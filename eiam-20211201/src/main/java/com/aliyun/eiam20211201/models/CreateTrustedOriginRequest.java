// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateTrustedOriginRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. Generate a value on your client and make sure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length.</p>
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
     * <p>The browser origin in the format of scheme://host[:port]. It cannot be modified after creation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://console.qoder.com">https://console.qoder.com</a></p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The name of the trusted origin used for management, display, and auditing. If you do not specify this parameter, it is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Qoder Production Console</p>
     */
    @NameInMap("TrustOriginName")
    public String trustOriginName;

    /**
     * <p>The trusted origin scenarios. Only iframe_embed and cors are supported. Specify at least one value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;iframe_embed&quot;]</p>
     */
    @NameInMap("TrustedOriginScene")
    public java.util.List<String> trustedOriginScene;

    public static CreateTrustedOriginRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustedOriginRequest self = new CreateTrustedOriginRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrustedOriginRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTrustedOriginRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTrustedOriginRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public CreateTrustedOriginRequest setTrustOriginName(String trustOriginName) {
        this.trustOriginName = trustOriginName;
        return this;
    }
    public String getTrustOriginName() {
        return this.trustOriginName;
    }

    public CreateTrustedOriginRequest setTrustedOriginScene(java.util.List<String> trustedOriginScene) {
        this.trustedOriginScene = trustedOriginScene;
        return this;
    }
    public java.util.List<String> getTrustedOriginScene() {
        return this.trustedOriginScene;
    }

}
