// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpIdaas2SubConfig extends TeaModel {
    /**
     * <p>The unique identifier of the application within the IDaaS instance.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The client ID of the application registered with the identity provider.</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The client secret used to authenticate the application with the identity provider.</p>
     */
    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>The AES encryption key for securing event data.</p>
     */
    @NameInMap("EventAesKey")
    public String eventAesKey;

    /**
     * <p>A label that identifies the event subscription.</p>
     */
    @NameInMap("EventLabel")
    public String eventLabel;

    /**
     * <p>The unique identifier of the IDaaS instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The URL of the endpoint providing the public key for token signature verification.</p>
     */
    @NameInMap("PublicKeyEndpoint")
    public String publicKeyEndpoint;

    /**
     * <p>The deployment region of the IDaaS instance.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The SAML metadata in XML format. It specifies the identity provider\&quot;s configuration, including endpoints and certificates.</p>
     */
    @NameInMap("SamlMetadata")
    public String samlMetadata;

    public static IdpIdaas2SubConfig build(java.util.Map<String, ?> map) throws Exception {
        IdpIdaas2SubConfig self = new IdpIdaas2SubConfig();
        return TeaModel.build(map, self);
    }

    public IdpIdaas2SubConfig setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public IdpIdaas2SubConfig setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public IdpIdaas2SubConfig setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public IdpIdaas2SubConfig setEventAesKey(String eventAesKey) {
        this.eventAesKey = eventAesKey;
        return this;
    }
    public String getEventAesKey() {
        return this.eventAesKey;
    }

    public IdpIdaas2SubConfig setEventLabel(String eventLabel) {
        this.eventLabel = eventLabel;
        return this;
    }
    public String getEventLabel() {
        return this.eventLabel;
    }

    public IdpIdaas2SubConfig setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public IdpIdaas2SubConfig setPublicKeyEndpoint(String publicKeyEndpoint) {
        this.publicKeyEndpoint = publicKeyEndpoint;
        return this;
    }
    public String getPublicKeyEndpoint() {
        return this.publicKeyEndpoint;
    }

    public IdpIdaas2SubConfig setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public IdpIdaas2SubConfig setSamlMetadata(String samlMetadata) {
        this.samlMetadata = samlMetadata;
        return this;
    }
    public String getSamlMetadata() {
        return this.samlMetadata;
    }

}
