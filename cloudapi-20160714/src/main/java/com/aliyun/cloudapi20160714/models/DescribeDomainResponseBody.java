// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDomainResponseBody extends TeaModel {
    @NameInMap("CertificatePrivateKey")
    public String certificatePrivateKey;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainBindingStatus")
    public String domainBindingStatus;

    @NameInMap("DomainRemark")
    public String domainRemark;

    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("DomainWebSocketStatus")
    public String domainWebSocketStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertificateName")
    public String certificateName;

    @NameInMap("DomainLegalStatus")
    public String domainLegalStatus;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("CertificateBody")
    public String certificateBody;

    @NameInMap("SubDomain")
    public String subDomain;

    @NameInMap("DomainCNAMEStatus")
    public String domainCNAMEStatus;

    public static DescribeDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResponseBody self = new DescribeDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResponseBody setCertificatePrivateKey(String certificatePrivateKey) {
        this.certificatePrivateKey = certificatePrivateKey;
        return this;
    }
    public String getCertificatePrivateKey() {
        return this.certificatePrivateKey;
    }

    public DescribeDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainResponseBody setDomainBindingStatus(String domainBindingStatus) {
        this.domainBindingStatus = domainBindingStatus;
        return this;
    }
    public String getDomainBindingStatus() {
        return this.domainBindingStatus;
    }

    public DescribeDomainResponseBody setDomainRemark(String domainRemark) {
        this.domainRemark = domainRemark;
        return this;
    }
    public String getDomainRemark() {
        return this.domainRemark;
    }

    public DescribeDomainResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public DescribeDomainResponseBody setDomainWebSocketStatus(String domainWebSocketStatus) {
        this.domainWebSocketStatus = domainWebSocketStatus;
        return this;
    }
    public String getDomainWebSocketStatus() {
        return this.domainWebSocketStatus;
    }

    public DescribeDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainResponseBody setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public DescribeDomainResponseBody setDomainLegalStatus(String domainLegalStatus) {
        this.domainLegalStatus = domainLegalStatus;
        return this;
    }
    public String getDomainLegalStatus() {
        return this.domainLegalStatus;
    }

    public DescribeDomainResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDomainResponseBody setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
        return this;
    }
    public String getCertificateBody() {
        return this.certificateBody;
    }

    public DescribeDomainResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public DescribeDomainResponseBody setDomainCNAMEStatus(String domainCNAMEStatus) {
        this.domainCNAMEStatus = domainCNAMEStatus;
        return this;
    }
    public String getDomainCNAMEStatus() {
        return this.domainCNAMEStatus;
    }

}
