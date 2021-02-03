// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetMainDomainNameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("RR")
    @Validation(required = true)
    public String RR;

    @NameInMap("DomainLevel")
    @Validation(required = true)
    public Long domainLevel;

    public static GetMainDomainNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMainDomainNameResponse self = new GetMainDomainNameResponse();
        return TeaModel.build(map, self);
    }

    public GetMainDomainNameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMainDomainNameResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetMainDomainNameResponse setRR(String RR) {
        this.RR = RR;
        return this;
    }
    public String getRR() {
        return this.RR;
    }

    public GetMainDomainNameResponse setDomainLevel(Long domainLevel) {
        this.domainLevel = domainLevel;
        return this;
    }
    public Long getDomainLevel() {
        return this.domainLevel;
    }

}
