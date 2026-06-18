// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetClientCaCertificateHostnamesResponseBody extends TeaModel {
    /**
     * <p>A list of bound hostnames.</p>
     */
    @NameInMap("Hostnames")
    public java.util.List<String> hostnames;

    /**
     * <p>The client CA certificate ID.</p>
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
     * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The site ID. You can obtain the ID by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
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

    public static SetClientCaCertificateHostnamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetClientCaCertificateHostnamesResponseBody self = new SetClientCaCertificateHostnamesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetClientCaCertificateHostnamesResponseBody setHostnames(java.util.List<String> hostnames) {
        this.hostnames = hostnames;
        return this;
    }
    public java.util.List<String> getHostnames() {
        return this.hostnames;
    }

    public SetClientCaCertificateHostnamesResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetClientCaCertificateHostnamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetClientCaCertificateHostnamesResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public SetClientCaCertificateHostnamesResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

}
