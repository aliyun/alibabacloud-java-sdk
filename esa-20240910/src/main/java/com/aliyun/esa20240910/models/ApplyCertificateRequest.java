// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ApplyCertificateRequest extends TeaModel {
    /**
     * <p>The algorithm type.</p>
     */
    @NameInMap("AlgType")
    public String algType;

    /**
     * <p>The list of domain names, separated by commas.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com,blog.example.com">www.example.com,blog.example.com</a></p>
     */
    @NameInMap("Domains")
    public String domains;

    /**
     * <p>The site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The certificate type. Valid values:</p>
     * <ul>
     * <li>lets_encrypt: Let\&quot;s Encrypt certificate.</li>
     * <li>digicert_single: DigiCert single-domain certificate.</li>
     * <li>digicert_wildcard: DigiCert wildcard domain certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lets_encrypt</p>
     */
    @NameInMap("Type")
    public String type;

    public static ApplyCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCertificateRequest self = new ApplyCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCertificateRequest setAlgType(String algType) {
        this.algType = algType;
        return this;
    }
    public String getAlgType() {
        return this.algType;
    }

    public ApplyCertificateRequest setDomains(String domains) {
        this.domains = domains;
        return this;
    }
    public String getDomains() {
        return this.domains;
    }

    public ApplyCertificateRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ApplyCertificateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
