// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertRequest extends TeaModel {
    /**
     * <p>证书的类型 。取值：</p>
     * <ul>
     * <li><strong>CA</strong>：表示CA证书。</li>
     * <li><strong>CERT</strong>：表示签发的证书。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CERT</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The keyword for the query. You can enter a name, domain name, or Subject Alternative Name (SAN) extension. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The number of entries to return on each page. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The source of the certificate. Valid values:</p>
     * <ul>
     * <li><strong>upload</strong>: uploaded certificate</li>
     * <li><strong>aliyun</strong>: Alibaba Cloud certificate</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The status of the certificate. Valid values:</p>
     * <ul>
     * <li><strong>ISSUE</strong>: issued</li>
     * <li><strong>REVOKE</strong>: revoked</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ISSUE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the certificate repository. You can call the ListCertWarehouse API operation to query the IDs of certificate repositories.</p>
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
