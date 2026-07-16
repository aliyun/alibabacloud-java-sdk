// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetMainDomainNameResponseBody extends TeaModel {
    /**
     * <p>The level of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DomainLevel")
    public Integer domainLevel;

    /**
     * <p>The root domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("MainDomainName")
    public String mainDomainName;

    /**
     * <p>The host record.</p>
     * 
     * <strong>example:</strong>
     * <p>sub</p>
     */
    @NameInMap("RR")
    public String RR;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMainDomainNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMainDomainNameResponseBody self = new GetMainDomainNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMainDomainNameResponseBody setDomainLevel(Integer domainLevel) {
        this.domainLevel = domainLevel;
        return this;
    }
    public Integer getDomainLevel() {
        return this.domainLevel;
    }

    public GetMainDomainNameResponseBody setMainDomainName(String mainDomainName) {
        this.mainDomainName = mainDomainName;
        return this;
    }
    public String getMainDomainName() {
        return this.mainDomainName;
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
