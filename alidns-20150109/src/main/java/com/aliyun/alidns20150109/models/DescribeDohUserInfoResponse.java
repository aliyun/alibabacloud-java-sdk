// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohUserInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PdnsId")
    @Validation(required = true)
    public Long pdnsId;

    @NameInMap("DomainCount")
    @Validation(required = true)
    public Integer domainCount;

    @NameInMap("SubDomainCount")
    @Validation(required = true)
    public Integer subDomainCount;

    public static DescribeDohUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohUserInfoResponse self = new DescribeDohUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDohUserInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDohUserInfoResponse setPdnsId(Long pdnsId) {
        this.pdnsId = pdnsId;
        return this;
    }
    public Long getPdnsId() {
        return this.pdnsId;
    }

    public DescribeDohUserInfoResponse setDomainCount(Integer domainCount) {
        this.domainCount = domainCount;
        return this;
    }
    public Integer getDomainCount() {
        return this.domainCount;
    }

    public DescribeDohUserInfoResponse setSubDomainCount(Integer subDomainCount) {
        this.subDomainCount = subDomainCount;
        return this;
    }
    public Integer getSubDomainCount() {
        return this.subDomainCount;
    }

}
