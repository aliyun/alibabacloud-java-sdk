// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertificatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("CertificateSource")
    public String certificateSource;

    /**
     * <strong>example:</strong>
     * <p>issued</p>
     */
    @NameInMap("CertificateStatus")
    public String certificateStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>cas-ivauto-hqito6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>rg-aek****wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    public static ListCertificatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCertificatesRequest self = new ListCertificatesRequest();
        return TeaModel.build(map, self);
    }

    public ListCertificatesRequest setCertificateSource(String certificateSource) {
        this.certificateSource = certificateSource;
        return this;
    }
    public String getCertificateSource() {
        return this.certificateSource;
    }

    public ListCertificatesRequest setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
        return this;
    }
    public String getCertificateStatus() {
        return this.certificateStatus;
    }

    public ListCertificatesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCertificatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCertificatesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListCertificatesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListCertificatesRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}
