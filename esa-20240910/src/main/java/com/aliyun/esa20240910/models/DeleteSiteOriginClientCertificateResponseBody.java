// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteSiteOriginClientCertificateResponseBody extends TeaModel {
    /**
     * <p>The certificate ID on ESA.</p>
     * 
     * <strong>example:</strong>
     * <p>babaabcd****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The website name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    public static DeleteSiteOriginClientCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteOriginClientCertificateResponseBody self = new DeleteSiteOriginClientCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSiteOriginClientCertificateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteSiteOriginClientCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSiteOriginClientCertificateResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DeleteSiteOriginClientCertificateResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

}
