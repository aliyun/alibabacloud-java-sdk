// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AssociateWebCertRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("CertId")
    public Integer certId;

    @NameInMap("CertName")
    public String certName;

    @NameInMap("Cert")
    public String cert;

    @NameInMap("Key")
    public String key;

    public static AssociateWebCertRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateWebCertRequest self = new AssociateWebCertRequest();
        return TeaModel.build(map, self);
    }

    public AssociateWebCertRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AssociateWebCertRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AssociateWebCertRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AssociateWebCertRequest setCertId(Integer certId) {
        this.certId = certId;
        return this;
    }
    public Integer getCertId() {
        return this.certId;
    }

    public AssociateWebCertRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public AssociateWebCertRequest setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public AssociateWebCertRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
