// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateListRequest extends TeaModel {
    /**
     * <p>CaStatus.</p>
     * <ul>
     * <li>issue：inUse.</li>
     * <li>forbidden ：forbidden.</li>
     * <li>revoke：revoked.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>issue</p>
     */
    @NameInMap("CaStatus")
    public String caStatus;

    /**
     * <p>The type of the certificate. Valid values:</p>
     * <ul>
     * <li>root：rootCA.</li>
     * <li>subRoot：subCA.</li>
     * <li>externalCa：import.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>subRoot</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The unique identifier of the CA certificate.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/328095.html">DescribeCACertificateList</a> operation to query the unique identifiers of all CA certificates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The CA Issuer Type.</p>
     * <ul>
     * <li>local：Private certificate.</li>
     * <li>iTrusChina： Compliance CA.</li>
     * <li>external：External Import.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>local</p>
     */
    @NameInMap("IssuerType")
    public String issuerType;

    /**
     * <p>The number of CA certificates per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>valid time.</p>
     * <ul>
     * <li>valid：means in the valid period.</li>
     * <li>notValid：means expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>valid</p>
     */
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
