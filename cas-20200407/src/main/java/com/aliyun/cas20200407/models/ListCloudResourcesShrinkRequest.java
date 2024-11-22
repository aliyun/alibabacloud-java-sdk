// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCloudResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The certificate IDs.</p>
     */
    @NameInMap("CertIds")
    public String certIdsShrink;

    /**
     * <p>The cloud service provider.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Tencent</li>
     * <li>Huawei</li>
     * <li>Aws</li>
     * <li>aliyun</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Tencent</p>
     */
    @NameInMap("CloudName")
    public String cloudName;

    /**
     * <p>The cloud service.</p>
     * <p>Valid values when CloudName is set to aliyun:</p>
     * <ul>
     * <li>SLB: Classic Load Balancer (CLB). This value is available only on the China site (aliyun.com).</li>
     * <li>LIVE: ApsaraVideo Live. This value is available only on the China site (aliyun.com).</li>
     * <li>webHosting: Cloud Web Hosting. This value is available only on the China site (aliyun.com).</li>
     * <li>VOD: ApsaraVideo VOD. This value is available only on the China site (aliyun.com).</li>
     * <li>CR: Container Registry. This value is available only on the China site (aliyun.com).</li>
     * <li>DCDN: Dynamic Content Delivery Network (DCDN).</li>
     * <li>DDOS: Anti-DDoS.</li>
     * <li>CDN: Alibaba Cloud CDN (CDN).</li>
     * <li>ALB: Application Load Balancer (ALB).</li>
     * <li>APIGateway: API Gateway.</li>
     * <li>FC: Function Compute.</li>
     * <li>GA: Global Accelerator (GA).</li>
     * <li>MSE: Microservices Engine (MSE).</li>
     * <li>NLB: Network Load Balancer (NLB).</li>
     * <li>OSS: Object Storage Service (OSS).</li>
     * <li>SAE: Serverless App Engine (SAE).</li>
     * <li>WAF: Web Application Firewall (WAF).</li>
     * </ul>
     * <p>Valid values when CloudName is set to Tencent:</p>
     * <ul>
     * <li>TencentCDN: Content Delivery Network (CDN).</li>
     * <li>TencentCLB: CLB.</li>
     * <li>TencentWAF: WAF.</li>
     * </ul>
     * <p>Valid value when CloudName is set to Huawei:</p>
     * <ul>
     * <li>HuaweiCDN: CDN.</li>
     * </ul>
     * <p>Valid values when CloudName is set to Aws:</p>
     * <ul>
     * <li>AwsCloudFront: Amazon CloudFront.</li>
     * <li>AwsCLB: CLB.</li>
     * <li>AwsALB: ALB.</li>
     * <li>AwsNLB: NLB.</li>
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
     * <p>21</p>
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
