// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateHttpTriggerConfigRequest extends TeaModel {
    @NameInMap("EnableService")
    public Boolean enableService;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("CustomDomain")
    public String customDomain;

    @NameInMap("CustomDomainCertificate")
    public String customDomainCertificate;

    @NameInMap("CustomDomainPrivateKey")
    public String customDomainPrivateKey;

    public static UpdateHttpTriggerConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpTriggerConfigRequest self = new UpdateHttpTriggerConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpTriggerConfigRequest setEnableService(Boolean enableService) {
        this.enableService = enableService;
        return this;
    }
    public Boolean getEnableService() {
        return this.enableService;
    }

    public UpdateHttpTriggerConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public UpdateHttpTriggerConfigRequest setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
        return this;
    }
    public String getCustomDomain() {
        return this.customDomain;
    }

    public UpdateHttpTriggerConfigRequest setCustomDomainCertificate(String customDomainCertificate) {
        this.customDomainCertificate = customDomainCertificate;
        return this;
    }
    public String getCustomDomainCertificate() {
        return this.customDomainCertificate;
    }

    public UpdateHttpTriggerConfigRequest setCustomDomainPrivateKey(String customDomainPrivateKey) {
        this.customDomainPrivateKey = customDomainPrivateKey;
        return this;
    }
    public String getCustomDomainPrivateKey() {
        return this.customDomainPrivateKey;
    }

}
