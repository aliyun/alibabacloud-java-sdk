// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetMainDomainNameResponseBody extends TeaModel {
    @NameInMap("DomainLevel")
    public Long domainLevel;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("RR")
    public String RR;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMainDomainNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMainDomainNameResponseBody self = new GetMainDomainNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMainDomainNameResponseBody setDomainLevel(Long domainLevel) {
        this.domainLevel = domainLevel;
        return this;
    }
    public Long getDomainLevel() {
        return this.domainLevel;
    }

    public GetMainDomainNameResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetMainDomainNameResponseBody setRR(String RR) {
        this.RR = RR;
        return this;
    }
    public String getRR() {
        return this.RR;
    }

    public GetMainDomainNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
