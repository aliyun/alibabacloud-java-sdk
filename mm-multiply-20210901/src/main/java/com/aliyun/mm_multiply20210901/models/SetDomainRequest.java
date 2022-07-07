// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class SetDomainRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("TlsCert")
    public String tlsCert;

    @NameInMap("TlsKey")
    public String tlsKey;

    public static SetDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDomainRequest self = new SetDomainRequest();
        return TeaModel.build(map, self);
    }

    public SetDomainRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public SetDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SetDomainRequest setTlsCert(String tlsCert) {
        this.tlsCert = tlsCert;
        return this;
    }
    public String getTlsCert() {
        return this.tlsCert;
    }

    public SetDomainRequest setTlsKey(String tlsKey) {
        this.tlsKey = tlsKey;
        return this;
    }
    public String getTlsKey() {
        return this.tlsKey;
    }

}
