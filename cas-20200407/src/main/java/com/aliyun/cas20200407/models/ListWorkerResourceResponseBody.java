// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListWorkerResourceResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListWorkerResourceResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3E50D480-9765-5CFD-9650-9BACCECA5135</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries per page. Default value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListWorkerResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkerResourceResponseBody self = new ListWorkerResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkerResourceResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListWorkerResourceResponseBody setData(java.util.List<ListWorkerResourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWorkerResourceResponseBodyData> getData() {
        return this.data;
    }

    public ListWorkerResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkerResourceResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListWorkerResourceResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListWorkerResourceResponseBodyData extends TeaModel {
        /**
         * <p>The domain name bound to the certificate in the worker task.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("CertDomain")
        public String certDomain;

        /**
         * <p>The ID of the certificate in the worker task.</p>
         * 
         * <strong>example:</strong>
         * <p>12073663</p>
         */
        @NameInMap("CertId")
        public Long certId;

        /**
         * <p>The instance ID of the certificate in the worker task.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-jzk2h0xz5dmynuphb8@1883</p>
         */
        @NameInMap("CertInstanceId")
        public String certInstanceId;

        /**
         * <p>The name of the certificate in the worker task.</p>
         * 
         * <strong>example:</strong>
         * <p>testCertName</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The cloud service provider to which the cloud resource in the worker task belongs.</p>
         * <blockquote>
         * <p> This parameter is not returned if you deploy certificates to Alibaba Cloud services.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("CloudName")
        public String cloudName;

        /**
         * <p>The cloud service to which the cloud resource in the worker task belongs. Valid values:</p>
         * <ul>
         * <li><strong>CDN</strong>: Alibaba Cloud CDN (CDN). This value is supported only at the China site (aliyun.com).</li>
         * <li><strong>SLB</strong>: Classic Load Balancer (CLB). This value is supported only at the China site (aliyun.com).</li>
         * <li><strong>DCDN</strong>: Dynamic Content Delivery Network (DCDN). This value is supported only at the China site (aliyun.com).</li>
         * <li><strong>DDOS</strong>: Anti-DDoS. This value is supported only at the China site (aliyun.com).</li>
         * <li><strong>LIVE</strong>: ApsaraVideo Live. This value is supported only at the China site (aliyun.com).</li>
         * <li><strong>webHosting</strong>: Cloud Web Hosting. This value is supported only at the China site (aliyun.com).</li>
         * <li><strong>VOD</strong>: ApsaraVideo VOD. This value is supported only at the China site (aliyun.com).</li>
         * <li><strong>CR</strong>: Container Registry. This value is supported only at the China site (aliyun.com).</li>
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
         * <p>SLB</p>
         */
        @NameInMap("CloudProduct")
        public String cloudProduct;

        /**
         * <p>The original region ID of the cloud resource in the worker task. The value is the region ID defined by the cloud service provider. This parameter is required only when you deploy certificates to services of multiple clouds.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("CloudRegion")
        public String cloudRegion;

        /**
         * <p>Indicates whether the cloud resource in the worker task is the default resource. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DefaultResource")
        public Boolean defaultResource;

        /**
         * <p>The time when the worker task was created. The time is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1680228896000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the worker task was last modified. The time is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1681956830000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the worker task.</p>
         * 
         * <strong>example:</strong>
         * <p>22487</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the cloud resource in the worker task.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cas-cn-0pp118nuu40b</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the deployment task to which the worker task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>8888</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <p>The listener ID of the cloud resource in the worker task.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>lsn-lhl8y7s1e1ngc3m3zz@81</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The ID of the namespace in SAE. This parameter is returned only if you deploy certificates to SAE.</p>
         * 
         * <strong>example:</strong>
         * <p>32fed52a-4bf7-44f6-955f-e82ada68ef18</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The order ID of the worker task, which is the same as the order ID of the certificate.</p>
         * <blockquote>
         * <p> If the CertId parameter is returned, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9349278</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The listening port of the cloud resource in the worker task.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4431</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The region ID of the cloud resource in the worker task.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the certificate that was originally bound to the cloud resource in the worker task.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ResourceCertId")
        public Long resourceCertId;

        /**
         * <p>The domain name that was originally bound to the cloud resource in the worker task.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("ResourceDomain")
        public String resourceDomain;

        /**
         * <p>The ID of the cloud resource in the worker task.</p>
         * 
         * <strong>example:</strong>
         * <p>1286999</p>
         */
        @NameInMap("ResourceId")
        public Long resourceId;

        /**
         * <p>The status of the worker task. Valid values:</p>
         * <ul>
         * <li><strong>editing</strong></li>
         * <li><strong>pending</strong></li>
         * <li><strong>scheduling</strong></li>
         * <li><strong>processing</strong></li>
         * <li><strong>error</strong></li>
         * <li><strong>success</strong></li>
         * <li><strong>rollback</strong></li>
         * <li><strong>rollback_success</strong></li>
         * <li><strong>rollback_error</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>editing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the Alibaba Cloud account to which the worker task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1666884372152785</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ListWorkerResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkerResourceResponseBodyData self = new ListWorkerResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkerResourceResponseBodyData setCertDomain(String certDomain) {
            this.certDomain = certDomain;
            return this;
        }
        public String getCertDomain() {
            return this.certDomain;
        }

        public ListWorkerResourceResponseBodyData setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public ListWorkerResourceResponseBodyData setCertInstanceId(String certInstanceId) {
            this.certInstanceId = certInstanceId;
            return this;
        }
        public String getCertInstanceId() {
            return this.certInstanceId;
        }

        public ListWorkerResourceResponseBodyData setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public ListWorkerResourceResponseBodyData setCloudName(String cloudName) {
            this.cloudName = cloudName;
            return this;
        }
        public String getCloudName() {
            return this.cloudName;
        }

        public ListWorkerResourceResponseBodyData setCloudProduct(String cloudProduct) {
            this.cloudProduct = cloudProduct;
            return this;
        }
        public String getCloudProduct() {
            return this.cloudProduct;
        }

        public ListWorkerResourceResponseBodyData setCloudRegion(String cloudRegion) {
            this.cloudRegion = cloudRegion;
            return this;
        }
        public String getCloudRegion() {
            return this.cloudRegion;
        }

        public ListWorkerResourceResponseBodyData setDefaultResource(Boolean defaultResource) {
            this.defaultResource = defaultResource;
            return this;
        }
        public Boolean getDefaultResource() {
            return this.defaultResource;
        }

        public ListWorkerResourceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWorkerResourceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListWorkerResourceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWorkerResourceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListWorkerResourceResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListWorkerResourceResponseBodyData setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListWorkerResourceResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListWorkerResourceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListWorkerResourceResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListWorkerResourceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListWorkerResourceResponseBodyData setResourceCertId(Long resourceCertId) {
            this.resourceCertId = resourceCertId;
            return this;
        }
        public Long getResourceCertId() {
            return this.resourceCertId;
        }

        public ListWorkerResourceResponseBodyData setResourceDomain(String resourceDomain) {
            this.resourceDomain = resourceDomain;
            return this;
        }
        public String getResourceDomain() {
            return this.resourceDomain;
        }

        public ListWorkerResourceResponseBodyData setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

        public ListWorkerResourceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkerResourceResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
