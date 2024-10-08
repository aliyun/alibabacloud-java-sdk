// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCloudResourcesRequest extends TeaModel {
    @NameInMap("CertIds")
    public java.util.List<Long> certIds;

    /**
     * <p>The cloud service provider.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Tencent: Tencent Cloud</li>
     * <li>aliyun: Alibaba Cloud</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Tencent</p>
     */
    @NameInMap("CloudName")
    public String cloudName;

    /**
     * <p>The cloud service. Only Content Delivery Network (CDN) is supported for Tencent Cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>SLB</p>
     */
    @NameInMap("CloudProduct")
    public String cloudProduct;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The domain name bound to the cloud resource.</p>
     * 
     * <strong>example:</strong>
     * <p>cert-instanceId</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The AccessKey ID used to access cloud resources.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    /**
     * <p>The number of revoked certificates per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    public static ListCloudResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudResourcesRequest self = new ListCloudResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudResourcesRequest setCertIds(java.util.List<Long> certIds) {
        this.certIds = certIds;
        return this;
    }
    public java.util.List<Long> getCertIds() {
        return this.certIds;
    }

    public ListCloudResourcesRequest setCloudName(String cloudName) {
        this.cloudName = cloudName;
        return this;
    }
    public String getCloudName() {
        return this.cloudName;
    }

    public ListCloudResourcesRequest setCloudProduct(String cloudProduct) {
        this.cloudProduct = cloudProduct;
        return this;
    }
    public String getCloudProduct() {
        return this.cloudProduct;
    }

    public ListCloudResourcesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCloudResourcesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListCloudResourcesRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

    public ListCloudResourcesRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}
