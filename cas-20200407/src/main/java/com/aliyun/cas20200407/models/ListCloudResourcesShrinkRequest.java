// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCloudResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The certificate IDs. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("CertIds")
    public String certIdsShrink;

    /**
     * <p>The cloud service provider.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Tencent</p>
     * </li>
     * <li><p>Huawei</p>
     * </li>
     * <li><p>Aws</p>
     * </li>
     * <li><p>aliyun</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("CloudName")
    public String cloudName;

    /**
     * <p>The cloud service name. Used to filter resources by cloud service.</p>
     * <p>Valid values when CloudName is set to aliyun:</p>
     * <ul>
     * <li><p>SLB: Classic Load Balancer (CLB). This value is available only on the China site (aliyun.com).</p>
     * </li>
     * <li><p>LIVE: ApsaraVideo Live. This value is available only on the China site (aliyun.com).</p>
     * </li>
     * <li><p>webHosting: Cloud Web Hosting. This value is available only on the China site (aliyun.com).</p>
     * </li>
     * <li><p>VOD: ApsaraVideo VOD. This value is available only on the China site (aliyun.com).</p>
     * </li>
     * <li><p>CR: Container Registry. This value is available only on the China site (aliyun.com).</p>
     * </li>
     * <li><p>DCDN: Dynamic Content Delivery Network (DCDN).</p>
     * </li>
     * <li><p>DDOS: Anti-DDoS.</p>
     * </li>
     * <li><p>CDN: Alibaba Cloud CDN (CDN).</p>
     * </li>
     * <li><p>ALB: Application Load Balancer (ALB).</p>
     * </li>
     * <li><p>APIGateway: API Gateway.</p>
     * </li>
     * <li><p>FC: Function Compute.</p>
     * </li>
     * <li><p>GA: Global Accelerator (GA).</p>
     * </li>
     * <li><p>MSE: Microservices Engine (MSE).</p>
     * </li>
     * <li><p>NLB: Network Load Balancer (NLB).</p>
     * </li>
     * <li><p>OSS: Object Storage Service (OSS).</p>
     * </li>
     * <li><p>SAE: Serverless App Engine (SAE).</p>
     * </li>
     * <li><p>WAF: Web Application Firewall (WAF).</p>
     * </li>
     * </ul>
     * <p>Valid values when CloudName is set to Tencent:</p>
     * <ul>
     * <li><p>TencentCDN: Content Delivery Network (CDN).</p>
     * </li>
     * <li><p>TencentCLB: CLB.</p>
     * </li>
     * <li><p>TencentWAF: WAF.</p>
     * </li>
     * </ul>
     * <p>Valid value when CloudName is set to Huawei:</p>
     * <ul>
     * <li>HuaweiCDN: CDN.</li>
     * </ul>
     * <p>Valid values when CloudName is set to Aws:</p>
     * <ul>
     * <li><p>AwsCloudFront: Amazon CloudFront.</p>
     * </li>
     * <li><p>AwsCLB: CLB.</p>
     * </li>
     * <li><p>AwsALB: ALB.</p>
     * </li>
     * <li><p>AwsNLB: NLB.</p>
     * </li>
     * </ul>
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
     * <p>The keyword of the domain name or instance ID bound to the cloud resource.</p>
     * 
     * <strong>example:</strong>
     * <p>cert-instanceId</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The AccessKey ID that is used to access cloud resources.</p>
     * 
     * <strong>example:</strong>
     * <p>AK96*******6M</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    public static ListCloudResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudResourcesShrinkRequest self = new ListCloudResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudResourcesShrinkRequest setCertIdsShrink(String certIdsShrink) {
        this.certIdsShrink = certIdsShrink;
        return this;
    }
    public String getCertIdsShrink() {
        return this.certIdsShrink;
    }

    public ListCloudResourcesShrinkRequest setCloudName(String cloudName) {
        this.cloudName = cloudName;
        return this;
    }
    public String getCloudName() {
        return this.cloudName;
    }

    public ListCloudResourcesShrinkRequest setCloudProduct(String cloudProduct) {
        this.cloudProduct = cloudProduct;
        return this;
    }
    public String getCloudProduct() {
        return this.cloudProduct;
    }

    public ListCloudResourcesShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCloudResourcesShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListCloudResourcesShrinkRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

    public ListCloudResourcesShrinkRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}
