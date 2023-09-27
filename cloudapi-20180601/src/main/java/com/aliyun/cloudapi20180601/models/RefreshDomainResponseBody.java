// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class RefreshDomainResponseBody extends TeaModel {
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

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubDomain")
    public String subDomain;

    public static RefreshDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshDomainResponseBody self = new RefreshDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshDomainResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public RefreshDomainResponseBody setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public RefreshDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RefreshDomainResponseBody setDomainNameResolution(String domainNameResolution) {
        this.domainNameResolution = domainNameResolution;
        return this;
    }
    public String getDomainNameResolution() {
        return this.domainNameResolution;
    }

    public RefreshDomainResponseBody setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public RefreshDomainResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RefreshDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshDomainResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

}
