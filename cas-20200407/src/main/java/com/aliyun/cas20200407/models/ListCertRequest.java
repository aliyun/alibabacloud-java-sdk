// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertRequest extends TeaModel {
    /**
     * <p>The certificate type. Valid values:</p>
     * <ul>
     * <li><p><strong>CA</strong>: CA certificate</p>
     * </li>
     * <li><p><strong>CERT</strong>: issued certificate</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CERT</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The page number to return. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>A comma-separated list of certificate identifiers.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa,bbb</p>
     */
    @NameInMap("Identifiers")
    public String identifiers;

    /**
     * <p>The keyword for a fuzzy search by name, domain name, or subject alternative name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The number of entries per page. The default value is 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The source of the certificate. Valid values:</p>
     * <ul>
     * <li><p><strong>upload</strong>: uploaded certificate</p>
     * </li>
     * <li><p><strong>aliyun</strong>: Alibaba Cloud certificate</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The certificate status. Valid values:</p>
     * <ul>
     * <li><p><strong>ISSUE</strong>: issued</p>
     * </li>
     * <li><p><strong>REVOKE</strong>: revoked</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ISSUE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The warehouse ID. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/453246.html">ListCertWarehouse</a> API.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("WarehouseId")
    public Long warehouseId;

    public static ListCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCertRequest self = new ListCertRequest();
        return TeaModel.build(map, self);
    }

    public ListCertRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public ListCertRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListCertRequest setIdentifiers(String identifiers) {
        this.identifiers = identifiers;
        return this;
    }
    public String getIdentifiers() {
        return this.identifiers;
    }

    public ListCertRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ListCertRequest setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListCertRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListCertRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListCertRequest setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public Long getWarehouseId() {
        return this.warehouseId;
    }

}
