// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteClientCaCertificateResponseBody extends TeaModel {
    /**
     * <p>The certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>baba39055622c008b90285a8838ed09a</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
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

    public static DeleteClientCaCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientCaCertificateResponseBody self = new DeleteClientCaCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClientCaCertificateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteClientCaCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteClientCaCertificateResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DeleteClientCaCertificateResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

}
