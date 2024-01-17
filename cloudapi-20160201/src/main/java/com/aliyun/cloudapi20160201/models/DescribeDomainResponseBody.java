// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeDomainResponseBody extends TeaModel {
    @NameInMap("CertificateBody")
    public String certificateBody;

    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("CertificateName")
    public String certificateName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainNameResolution")
    public String domainNameResolution;

    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubDomain")
    public String subDomain;

    public static DescribeDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResponseBody self = new DescribeDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResponseBody setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
        return this;
    }
    public String getCertificateBody() {
        return this.certificateBody;
    }

    public DescribeDomainResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public DescribeDomainResponseBody setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public DescribeDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainResponseBody setDomainNameResolution(String domainNameResolution) {
        this.domainNameResolution = domainNameResolution;
        return this;
    }
    public String getDomainNameResolution() {
        return this.domainNameResolution;
    }

    public DescribeDomainResponseBody setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public DescribeDomainResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDomainResponseBody setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public DescribeDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

}
