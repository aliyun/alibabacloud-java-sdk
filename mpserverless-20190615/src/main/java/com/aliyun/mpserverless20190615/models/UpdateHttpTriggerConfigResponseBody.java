// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateHttpTriggerConfigResponseBody extends TeaModel {
    @NameInMap("EnableService")
    public Boolean enableService;

    @NameInMap("CustomDomainCname")
    public String customDomainCname;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DefaultEndpoint")
    public String defaultEndpoint;

    @NameInMap("CustomDomainCertificateInfo")
    public String customDomainCertificateInfo;

    @NameInMap("CustomDomain")
    public String customDomain;

    public static UpdateHttpTriggerConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpTriggerConfigResponseBody self = new UpdateHttpTriggerConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHttpTriggerConfigResponseBody setEnableService(Boolean enableService) {
        this.enableService = enableService;
        return this;
    }
    public Boolean getEnableService() {
        return this.enableService;
    }

    public UpdateHttpTriggerConfigResponseBody setCustomDomainCname(String customDomainCname) {
        this.customDomainCname = customDomainCname;
        return this;
    }
    public String getCustomDomainCname() {
        return this.customDomainCname;
    }

    public UpdateHttpTriggerConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHttpTriggerConfigResponseBody setDefaultEndpoint(String defaultEndpoint) {
        this.defaultEndpoint = defaultEndpoint;
        return this;
    }
    public String getDefaultEndpoint() {
        return this.defaultEndpoint;
    }

    public UpdateHttpTriggerConfigResponseBody setCustomDomainCertificateInfo(String customDomainCertificateInfo) {
        this.customDomainCertificateInfo = customDomainCertificateInfo;
        return this;
    }
    public String getCustomDomainCertificateInfo() {
        return this.customDomainCertificateInfo;
    }

    public UpdateHttpTriggerConfigResponseBody setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
        return this;
    }
    public String getCustomDomain() {
        return this.customDomain;
    }

}
