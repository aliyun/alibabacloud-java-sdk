// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetDcvDelegationResponseBody extends TeaModel {
    /**
     * <p>The DCV managed domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****.dcv.aliyun-esa.com</p>
     */
    @NameInMap("DelegationDomain")
    public String delegationDomain;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The site name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    public static GetDcvDelegationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDcvDelegationResponseBody self = new GetDcvDelegationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDcvDelegationResponseBody setDelegationDomain(String delegationDomain) {
        this.delegationDomain = delegationDomain;
        return this;
    }
    public String getDelegationDomain() {
        return this.delegationDomain;
    }

    public GetDcvDelegationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDcvDelegationResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetDcvDelegationResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

}
