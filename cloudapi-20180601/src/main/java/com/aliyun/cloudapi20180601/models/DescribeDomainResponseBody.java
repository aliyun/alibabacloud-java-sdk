// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeDomainResponseBody extends TeaModel {
    @NameInMap("CertificateBody")
    public String certificateBody;

    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("CertificateName")
    public String certificateName;

    @NameInMap("DomainBindingStatus")
    public String domainBindingStatus;

    @NameInMap("DomainLegalStatus")
    public String domainLegalStatus;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainNameResolution")
    public String domainNameResolution;

    @NameInMap("DomainRemark")
    public String domainRemark;

    @NameInMap("DomainWebSocketStatus")
    public String domainWebSocketStatus;

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

    public DescribeDomainResponseBody setDomainBindingStatus(String domainBindingStatus) {
        this.domainBindingStatus = domainBindingStatus;
        return this;
    }
    public String getDomainBindingStatus() {
        return this.domainBindingStatus;
    }

    public DescribeDomainResponseBody setDomainLegalStatus(String domainLegalStatus) {
        this.domainLegalStatus = domainLegalStatus;
        return this;
    }
    public String getDomainLegalStatus() {
        return this.domainLegalStatus;
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

    public DescribeDomainResponseBody setDomainRemark(String domainRemark) {
        this.domainRemark = domainRemark;
        return this;
    }
    public String getDomainRemark() {
        return this.domainRemark;
    }

    public DescribeDomainResponseBody setDomainWebSocketStatus(String domainWebSocketStatus) {
        this.domainWebSocketStatus = domainWebSocketStatus;
        return this;
    }
    public String getDomainWebSocketStatus() {
        return this.domainWebSocketStatus;
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
