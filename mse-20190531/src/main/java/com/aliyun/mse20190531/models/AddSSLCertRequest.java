// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddSSLCertRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("DomainId")
    public Long domainId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static AddSSLCertRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSSLCertRequest self = new AddSSLCertRequest();
        return TeaModel.build(map, self);
    }

    public AddSSLCertRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddSSLCertRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public AddSSLCertRequest setDomainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }
    public Long getDomainId() {
        return this.domainId;
    }

    public AddSSLCertRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}
