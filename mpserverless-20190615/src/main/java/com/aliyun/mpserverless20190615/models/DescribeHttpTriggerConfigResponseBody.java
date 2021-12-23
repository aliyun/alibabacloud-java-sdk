// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeHttpTriggerConfigResponseBody extends TeaModel {
    @NameInMap("CustomDomain")
    public String customDomain;

    @NameInMap("CustomDomainCertificateInfo")
    public String customDomainCertificateInfo;

    @NameInMap("CustomDomainCname")
    public String customDomainCname;

    @NameInMap("DefaultEndpoint")
    public String defaultEndpoint;

    @NameInMap("EnableService")
    public Boolean enableService;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHttpTriggerConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpTriggerConfigResponseBody self = new DescribeHttpTriggerConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHttpTriggerConfigResponseBody setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
        return this;
    }
    public String getCustomDomain() {
        return this.customDomain;
    }

    public DescribeHttpTriggerConfigResponseBody setCustomDomainCertificateInfo(String customDomainCertificateInfo) {
        this.customDomainCertificateInfo = customDomainCertificateInfo;
        return this;
    }
    public String getCustomDomainCertificateInfo() {
        return this.customDomainCertificateInfo;
    }

    public DescribeHttpTriggerConfigResponseBody setCustomDomainCname(String customDomainCname) {
        this.customDomainCname = customDomainCname;
        return this;
    }
    public String getCustomDomainCname() {
        return this.customDomainCname;
    }

    public DescribeHttpTriggerConfigResponseBody setDefaultEndpoint(String defaultEndpoint) {
        this.defaultEndpoint = defaultEndpoint;
        return this;
    }
    public String getDefaultEndpoint() {
        return this.defaultEndpoint;
    }

    public DescribeHttpTriggerConfigResponseBody setEnableService(Boolean enableService) {
        this.enableService = enableService;
        return this;
    }
    public Boolean getEnableService() {
        return this.enableService;
    }

    public DescribeHttpTriggerConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
