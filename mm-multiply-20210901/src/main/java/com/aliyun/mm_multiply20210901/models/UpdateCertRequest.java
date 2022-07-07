// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdateCertRequest extends TeaModel {
    // businessId
    @NameInMap("BusinessId")
    public String businessId;

    // 域名
    @NameInMap("Domain")
    public String domain;

    // 证书Cert
    @NameInMap("TlsCert")
    public String tlsCert;

    // 证书key
    @NameInMap("TlsKey")
    public String tlsKey;

    public static UpdateCertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCertRequest self = new UpdateCertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCertRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public UpdateCertRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateCertRequest setTlsCert(String tlsCert) {
        this.tlsCert = tlsCert;
        return this;
    }
    public String getTlsCert() {
        return this.tlsCert;
    }

    public UpdateCertRequest setTlsKey(String tlsKey) {
        this.tlsKey = tlsKey;
        return this;
    }
    public String getTlsKey() {
        return this.tlsKey;
    }

}
