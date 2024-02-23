// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertRequest extends TeaModel {
    /**
     * <p>The type of the certificate.</p>
     * <br>
     * <p>*   **CA**: the CA certificate.</p>
     * <p>*   **CERT**: a issued certificate.</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The keyword that is used for queries. The value can be a name, domain name, or subject alternative name (SAN) attribute. Fuzzy match is supported.</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The number of entries to return on each page. Default value: 50.</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The source of the certificate. Valid values:</p>
     * <br>
     * <p>*   **upload**: uploaded certificate</p>
     * <p>*   **aliyun**: Alibaba Cloud certificate</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The status of the certificate. Valid values:</p>
     * <br>
     * <p>*   **ISSUE**: issued</p>
     * <p>*   **REVOKE**: revoked</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the certificate repository. You can call the ListCertWarehouse API operation to query the IDs of certificate repositories.</p>
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
