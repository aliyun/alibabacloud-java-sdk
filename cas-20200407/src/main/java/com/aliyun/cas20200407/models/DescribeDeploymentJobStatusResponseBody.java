// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeDeploymentJobStatusResponseBody extends TeaModel {
    /**
     * <p>The total number of purchased resources.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("BuyCount")
    public Integer buyCount;

    /**
     * <p>The number of certificates involved in the deployment task.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("CertCount")
    public Integer certCount;

    /**
     * <p>The number of resources consumed by worker tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("CostCount")
    public Integer costCount;

    /**
     * <p>The number of failed worker tasks, excluding rollback tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("FailedCount")
    public Integer failedCount;

    /**
     * <p>The total number of worker tasks that match the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MatchWorkerCount")
    public Integer matchWorkerCount;

    /**
     * <p>The number of cloud resources to which certificates are deployed in the deployment task.</p>
     */
    @NameInMap("ProductWorkerCount")
    public java.util.List<DescribeDeploymentJobStatusResponseBodyProductWorkerCount> productWorkerCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of resources.</p>
     * 
     * <strong>example:</strong>
     * <p>4127</p>
     */
    @NameInMap("ResourceCount")
    public Integer resourceCount;

    /**
     * <p>The number of worker tasks that are rolled backed.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RollbackCount")
    public Integer rollbackCount;

    /**
     * <p>The number of worker tasks that failed to be rolled back.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RollbackFailedCount")
    public Integer rollbackFailedCount;

    /**
     * <p>The number of worker tasks that are successfully rolled back.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RollbackSuccessCount")
    public Integer rollbackSuccessCount;

    /**
     * <p>The number of successful worker tasks, excluding rollback tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    /**
     * <p>The total number of used resources.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("UseCount")
    public Integer useCount;

    /**
     * <p>The total number of resources to which certificate are deployed in the current cloud service. The value indicates the total number of worker tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("WorkerCount")
    public Integer workerCount;

    public static DescribeDeploymentJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentJobStatusResponseBody self = new DescribeDeploymentJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentJobStatusResponseBody setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
        return this;
    }
    public Integer getBuyCount() {
        return this.buyCount;
    }

    public DescribeDeploymentJobStatusResponseBody setCertCount(Integer certCount) {
        this.certCount = certCount;
        return this;
    }
    public Integer getCertCount() {
        return this.certCount;
    }

    public DescribeDeploymentJobStatusResponseBody setCostCount(Integer costCount) {
        this.costCount = costCount;
        return this;
    }
    public Integer getCostCount() {
        return this.costCount;
    }

    public DescribeDeploymentJobStatusResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public DescribeDeploymentJobStatusResponseBody setMatchWorkerCount(Integer matchWorkerCount) {
        this.matchWorkerCount = matchWorkerCount;
        return this;
    }
    public Integer getMatchWorkerCount() {
        return this.matchWorkerCount;
    }

    public DescribeDeploymentJobStatusResponseBody setProductWorkerCount(java.util.List<DescribeDeploymentJobStatusResponseBodyProductWorkerCount> productWorkerCount) {
        this.productWorkerCount = productWorkerCount;
        return this;
    }
    public java.util.List<DescribeDeploymentJobStatusResponseBodyProductWorkerCount> getProductWorkerCount() {
        return this.productWorkerCount;
    }

    public DescribeDeploymentJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeploymentJobStatusResponseBody setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }
    public Integer getResourceCount() {
        return this.resourceCount;
    }

    public DescribeDeploymentJobStatusResponseBody setRollbackCount(Integer rollbackCount) {
        this.rollbackCount = rollbackCount;
        return this;
    }
    public Integer getRollbackCount() {
        return this.rollbackCount;
    }

    public DescribeDeploymentJobStatusResponseBody setRollbackFailedCount(Integer rollbackFailedCount) {
        this.rollbackFailedCount = rollbackFailedCount;
        return this;
    }
    public Integer getRollbackFailedCount() {
        return this.rollbackFailedCount;
    }

    public DescribeDeploymentJobStatusResponseBody setRollbackSuccessCount(Integer rollbackSuccessCount) {
        this.rollbackSuccessCount = rollbackSuccessCount;
        return this;
    }
    public Integer getRollbackSuccessCount() {
        return this.rollbackSuccessCount;
    }

    public DescribeDeploymentJobStatusResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public DescribeDeploymentJobStatusResponseBody setUseCount(Integer useCount) {
        this.useCount = useCount;
        return this;
    }
    public Integer getUseCount() {
        return this.useCount;
    }

    public DescribeDeploymentJobStatusResponseBody setWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
        return this;
    }
    public Integer getWorkerCount() {
        return this.workerCount;
    }

    public static class DescribeDeploymentJobStatusResponseBodyProductWorkerCount extends TeaModel {
        /**
         * <p>The total number of resources of a cloud service in the deployment task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The name of the cloud service. Valid values:</p>
         * <ul>
         * <li><strong>SLB</strong>: Classic Load Balancer (CLB). This value is supported only at the China site (aliyun.com).</li>
         * <li><strong>LIVE</strong>: ApsaraVideo Live. This value is supported only at the China site (aliyun.com).</li>
         * <li><strong>webHosting</strong>: Cloud Web Hosting. This value is supported only at the China site (aliyun.com).</li>
         * <li><strong>VOD</strong>: ApsaraVideo VOD. This value is supported only at the China site (aliyun.com).</li>
         * <li><strong>CR</strong>: Container Registry. This value is supported only at the China site (aliyun.com).</li>
         * <li><strong>DCDN</strong>: Dynamic Content Delivery Network (DCDN).</li>
         * <li><strong>DDOS</strong>: Anti-DDoS.</li>
         * <li><strong>CDN</strong>: Alibaba Cloud CDN (CDN).</li>
         * <li><strong>ALB</strong>: Application Load Balancer (ALB).</li>
         * <li><strong>APIGateway</strong>: API Gateway.</li>
         * <li><strong>FC</strong>: Function Compute.</li>
         * <li><strong>GA</strong>: Global Accelerator (GA).</li>
         * <li><strong>MSE</strong>: Microservices Engine (MSE).</li>
         * <li><strong>NLB</strong>: Network Load Balancer (NLB).</li>
         * <li><strong>OSS</strong>: Object Storage Service (OSS).</li>
         * <li><strong>SAE</strong>: Serverless App Engine (SAE).</li>
         * <li><strong>TencentCDN</strong>: Tencent Cloud Content Delivery Network (CDN).</li>
         * <li><strong>WAF</strong>: Web Application Firewall (WAF).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NLB</p>
         */
        @NameInMap("ProductName")
        public String productName;

        public static DescribeDeploymentJobStatusResponseBodyProductWorkerCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentJobStatusResponseBodyProductWorkerCount self = new DescribeDeploymentJobStatusResponseBodyProductWorkerCount();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentJobStatusResponseBodyProductWorkerCount setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeDeploymentJobStatusResponseBodyProductWorkerCount setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

}
