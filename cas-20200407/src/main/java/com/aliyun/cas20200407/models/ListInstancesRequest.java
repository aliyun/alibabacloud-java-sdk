// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The certification authority (CA) brand. Valid values: WoSign, CFCA, DigiCert, GeoTrust, GlobalSign, vTrus, and Alibaba.</p>
     * 
     * <strong>example:</strong>
     * <p>Digicert</p>
     */
    @NameInMap("Brand")
    public String brand;

    /**
     * <p>The status of the certificate. Valid values:</p>
     * <ul>
     * <li><strong>issued</strong>: issued.</li>
     * <li><strong>revoked</strong>: revoked.</li>
     * <li><strong>willExpire</strong>: about to expire.</li>
     * <li><strong>expired</strong>: expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>issued</p>
     */
    @NameInMap("CertificateStatus")
    public String certificateStatus;

    /**
     * <p>The type of the certificate. Valid values: DV, OV, and EV.</p>
     * 
     * <strong>example:</strong>
     * <p>DV</p>
     */
    @NameInMap("CertificateType")
    public String certificateType;

    /**
     * <p>The page number of the current page in a paged query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The instance type. Valid values: BUY (official certificate) and TEST (test certificate).</p>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The keyword for fuzzy match. Matches domain names, instance names, or corresponding resource IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******4wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The number of instances to display per page in a paged query. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><strong>inactive</strong>: pending use.</li>
     * <li><strong>pending</strong>: under review. The latest certificate is being reviewed.</li>
     * <li><strong>willExpire</strong>: about to expire.</li>
     * <li><strong>expired</strong>: expired.</li>
     * <li><strong>refund</strong>: refunded.</li>
     * <li><strong>normal</strong>: normal.</li>
     * <li><strong>closed</strong>: closed and unavailable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>inactive</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public ListInstancesRequest setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
        return this;
    }
    public String getCertificateStatus() {
        return this.certificateStatus;
    }

    public ListInstancesRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public ListInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListInstancesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListInstancesRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
