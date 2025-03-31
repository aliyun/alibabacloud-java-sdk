// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetOriginClientCertificateHostnamesResponseBody extends TeaModel {
    /**
     * <p>The domain name.</p>
     */
    @NameInMap("Hostnames")
    public java.util.List<String> hostnames;

    /**
     * <p>The ID of the client certificate.</p>
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
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The website ID.</p>
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

    public static SetOriginClientCertificateHostnamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetOriginClientCertificateHostnamesResponseBody self = new SetOriginClientCertificateHostnamesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetOriginClientCertificateHostnamesResponseBody setHostnames(java.util.List<String> hostnames) {
        this.hostnames = hostnames;
        return this;
    }
    public java.util.List<String> getHostnames() {
        return this.hostnames;
    }

    public SetOriginClientCertificateHostnamesResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetOriginClientCertificateHostnamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetOriginClientCertificateHostnamesResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public SetOriginClientCertificateHostnamesResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

}
