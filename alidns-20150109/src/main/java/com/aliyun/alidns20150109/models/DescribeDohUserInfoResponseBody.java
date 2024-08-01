// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohUserInfoResponseBody extends TeaModel {
    /**
     * <p>The number of accessed domains.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DomainCount")
    public Integer domainCount;

    /**
     * <p>The ID of the Alibaba Cloud public DNS user.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("PdnsId")
    public Long pdnsId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0F32959D-417B-4D66-8463-68606605E3E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of accessed subdomains.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SubDomainCount")
    public Integer subDomainCount;

    public static DescribeDohUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohUserInfoResponseBody self = new DescribeDohUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDohUserInfoResponseBody setDomainCount(Integer domainCount) {
        this.domainCount = domainCount;
        return this;
    }
    public Integer getDomainCount() {
        return this.domainCount;
    }

    public DescribeDohUserInfoResponseBody setPdnsId(Long pdnsId) {
        this.pdnsId = pdnsId;
        return this;
    }
    public Long getPdnsId() {
        return this.pdnsId;
    }

    public DescribeDohUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDohUserInfoResponseBody setSubDomainCount(Integer subDomainCount) {
        this.subDomainCount = subDomainCount;
        return this;
    }
    public Integer getSubDomainCount() {
        return this.subDomainCount;
    }

}
