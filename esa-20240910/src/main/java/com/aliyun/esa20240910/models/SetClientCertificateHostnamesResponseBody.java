// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetClientCertificateHostnamesResponseBody extends TeaModel {
    @NameInMap("Hostnames")
    public java.util.List<String> hostnames;

    /**
     * <p>The ID of the client CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>babab9db65ee5efcca9f3d41d4b50d66</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ET5BF670-09D5-4D0B-BEBY-D96A2A528000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The website ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
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

    public static SetClientCertificateHostnamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetClientCertificateHostnamesResponseBody self = new SetClientCertificateHostnamesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetClientCertificateHostnamesResponseBody setHostnames(java.util.List<String> hostnames) {
        this.hostnames = hostnames;
        return this;
    }
    public java.util.List<String> getHostnames() {
        return this.hostnames;
    }

    public SetClientCertificateHostnamesResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetClientCertificateHostnamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetClientCertificateHostnamesResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public SetClientCertificateHostnamesResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

}
