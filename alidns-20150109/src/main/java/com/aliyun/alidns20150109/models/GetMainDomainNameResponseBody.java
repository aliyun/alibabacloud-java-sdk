// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetMainDomainNameResponseBody extends TeaModel {
    /**
     * <p>The level of the entered domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DomainLevel")
    public Long domainLevel;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The hostname.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("RR")
    public String RR;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
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
