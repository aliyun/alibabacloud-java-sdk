// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateListRequest extends TeaModel {
    @NameInMap("CaStatus")
    public String caStatus;

    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The unique identifier of the client certificate or server certificate that you want to revoke.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/330884.html">ListClientCertificate</a> operation to query the unique identifiers of all client certificates and server certificates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("IssuerType")
    public String issuerType;

    /**
     * <p>The number of CA certificates to return on each page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    @NameInMap("ValidStatus")
    public String validStatus;

    public static DescribeCACertificateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCACertificateListRequest self = new DescribeCACertificateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCACertificateListRequest setCaStatus(String caStatus) {
        this.caStatus = caStatus;
        return this;
    }
    public String getCaStatus() {
        return this.caStatus;
    }

    public DescribeCACertificateListRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public DescribeCACertificateListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCACertificateListRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public DescribeCACertificateListRequest setIssuerType(String issuerType) {
        this.issuerType = issuerType;
        return this;
    }
    public String getIssuerType() {
        return this.issuerType;
    }

    public DescribeCACertificateListRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public DescribeCACertificateListRequest setValidStatus(String validStatus) {
        this.validStatus = validStatus;
        return this;
    }
    public String getValidStatus() {
        return this.validStatus;
    }

}
