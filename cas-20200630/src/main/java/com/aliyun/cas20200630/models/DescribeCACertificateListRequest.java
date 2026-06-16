// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeCACertificateListRequest extends TeaModel {
    /**
     * <p>The status of the CA. Valid values:</p>
     * <ul>
     * <li><p>issue: enabled.</p>
     * </li>
     * <li><p>forbidden: disabled.</p>
     * </li>
     * <li><p>revoke: revoked.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>issue</p>
     */
    @NameInMap("CaStatus")
    public String caStatus;

    /**
     * <p>The type of the CA. Valid values:</p>
     * <ul>
     * <li><p>root: root CA.</p>
     * </li>
     * <li><p>subRoot: intermediate CA.</p>
     * </li>
     * <li><p>externalCa: an imported external CA.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>subRoot</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The unique identifier of the CA certificate.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/328095.html">DescribeCACertificateList</a> to query the unique identifiers of all CA certificates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1ee47e24-c51b-67cc-aa6b-1f7561cf9d9a</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The issuer of the CA. Valid values:</p>
     * <ul>
     * <li><p>local: private certificate.</p>
     * </li>
     * <li><p>iTrusChina: a trusted CA.</p>
     * </li>
     * <li><p>external: an imported external CA.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>local</p>
     */
    @NameInMap("IssuerType")
    public String issuerType;

    /**
     * <p>The resource group ID. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2716559.html">ListResources</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******4wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The validity status of the CA. Valid values:</p>
     * <ul>
     * <li><p>valid: The CA certificate is valid.</p>
     * </li>
     * <li><p>notValid: The CA certificate has expired.</p>
     * </li>
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

    public DescribeCACertificateListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
