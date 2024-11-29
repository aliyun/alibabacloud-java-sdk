// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateClientCertificateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("CSR")
    public String CSR;

    /**
     * <strong>example:</strong>
     * <p>RSA</p>
     */
    @NameInMap("PkeyType")
    public String pkeyType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("ValidityDays")
    public Long validityDays;

    public static CreateClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClientCertificateRequest self = new CreateClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateClientCertificateRequest setCSR(String CSR) {
        this.CSR = CSR;
        return this;
    }
    public String getCSR() {
        return this.CSR;
    }

    public CreateClientCertificateRequest setPkeyType(String pkeyType) {
        this.pkeyType = pkeyType;
        return this;
    }
    public String getPkeyType() {
        return this.pkeyType;
    }

    public CreateClientCertificateRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateClientCertificateRequest setValidityDays(Long validityDays) {
        this.validityDays = validityDays;
        return this;
    }
    public Long getValidityDays() {
        return this.validityDays;
    }

}
