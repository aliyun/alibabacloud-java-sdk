// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpIdaas2SubConfig extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientSecret")
    public String clientSecret;

    @NameInMap("EventAesKey")
    public String eventAesKey;

    @NameInMap("EventLabel")
    public String eventLabel;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PublicKeyEndpoint")
    public String publicKeyEndpoint;

    @NameInMap("Region")
    public String region;

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
