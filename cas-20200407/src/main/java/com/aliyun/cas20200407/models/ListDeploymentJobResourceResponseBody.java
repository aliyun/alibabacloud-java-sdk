// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobResourceResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDeploymentJobResourceResponseBodyData> data;

    /**
     * <p>The unique ID of the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDeploymentJobResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentJobResourceResponseBody self = new ListDeploymentJobResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeploymentJobResourceResponseBody setData(java.util.List<ListDeploymentJobResourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDeploymentJobResourceResponseBodyData> getData() {
        return this.data;
    }

    public ListDeploymentJobResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeploymentJobResourceResponseBodyData extends TeaModel {
        /**
         * <p>The expiration date of the certificate that is attached to the cloud product resource. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1681956830000</p>
         */
        @NameInMap("CertEndTime")
        public String certEndTime;

        /**
         * <p>The ID of the certificate that is attached to the cloud product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>11599949</p>
         */
        @NameInMap("CertId")
        public Long certId;

        /**
         * <p>The name of the certificate that is attached to the cloud product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>sc-SSL</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The start date of the certificate that is attached to the cloud product resource. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1681956830000</p>
         */
        @NameInMap("CertStartTime")
        public String certStartTime;

        /**
         * <p>The key ID used to access the cloud resource set.</p>
         * <blockquote>
         * <p>This parameter is returned only for multicloud deployments.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("CloudAccessId")
        public String cloudAccessId;

        /**
         * <p>The provider of the cloud product resource.</p>
         * <ul>
         * <li><p><strong>aliyun</strong>: Alibaba Cloud</p>
         * </li>
         * <li><p><strong>Tencent</strong>: Tencent Cloud</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("CloudName")
        public String cloudName;

        /**
         * <p>The cloud service.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><p><strong>SLB</strong>: Classic Load Balancer (CLB) (China site only)</p>
         * </li>
         * <li><p><strong>LIVE</strong>: ApsaraVideo Live (China site only)</p>
         * </li>
         * <li><p><strong>webHosting</strong>: Cloud Web Hosting (China site only)</p>
         * </li>
         * <li><p><strong>VOD</strong>: ApsaraVideo VOD (China site only)</p>
         * </li>
         * <li><p><strong>CR</strong>: Container Registry (China site only)</p>
         * </li>
         * <li><p><strong>DCDN</strong>: DCDN</p>
         * </li>
         * <li><p><strong>DDOS</strong>: Anti-DDoS</p>
         * </li>
         * <li><p><strong>CDN</strong>: Alibaba Cloud CDN</p>
         * </li>
         * <li><p><strong>ALB</strong>: Application Load Balancer</p>
         * </li>
         * <li><p><strong>APIGateway</strong>: API Gateway</p>
         * </li>
         * <li><p><strong>FC</strong>: Function Compute</p>
         * </li>
         * <li><p><strong>GA</strong>: Global Accelerator</p>
         * </li>
         * <li><p><strong>MSE</strong>: MSE</p>
         * </li>
         * <li><p><strong>NLB</strong>: Network Load Balancer</p>
         * </li>
         * <li><p><strong>OSS</strong>: OSS</p>
         * </li>
         * <li><p><strong>SAE</strong>: SAE</p>
         * </li>
         * <li><p><strong>TencentCDN</strong>: Tencent CDN</p>
         * </li>
         * <li><p><strong>WAF</strong>: WAF</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SLB</p>
         */
        @NameInMap("CloudProduct")
        public String cloudProduct;

        /**
         * <p>The region ID of the cloud product resource from the cloud provider.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("CloudRegion")
        public String cloudRegion;

        /**
         * <p>Indicates whether the cloud product resource is a default resource.</p>
         * <ul>
         * <li><p><strong>1</strong>: Default resource</p>
         * </li>
         * <li><p><strong>0</strong>: Not a default resource</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only for deployments of SLB, NLB, ALB, and GA.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DefaultResource")
        public Integer defaultResource;

        /**
         * <p>The domain name that is attached to the cloud product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether HTTPS is enabled for the cloud product resource.</p>
         * <ul>
         * <li><p><strong>1</strong>: Enabled</p>
         * </li>
         * <li><p><strong>0</strong>: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnableHttps")
        public Integer enableHttps;

        /**
         * <p>The time when the synchronized resource was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1673423339000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the synchronized resource was last modified. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1681956830000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the cloud product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>20979</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The instance ID of the cloud product resource.</p>
         * <blockquote>
         * <p>This parameter is returned only for deployments of SLB, NLB, ALB, and GA.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cas-cn-m7r1qocw91at</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The listener ID of the cloud product resource.</p>
         * <blockquote>
         * <p>This parameter is returned only for deployments of SLB, NLB, ALB, and GA.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>lsn-vwdff0q20poq5xazb9@443</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The listener port of the cloud product resource.</p>
         * <blockquote>
         * <p>This parameter is returned only for deployments of SLB, NLB, ALB, and GA.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8047</p>
         */
        @NameInMap("ListenerPort")
        public String listenerPort;

        /**
         * <p>The region ID of the synchronized cloud product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Other metadata about the cloud product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;camera_model\&quot;:\&quot;GIFSHOW [1267087617][OnePlus</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the synchronized cloud product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether an Alibaba Cloud SSL certificate is used.</p>
         * <ul>
         * <li><p><strong>1</strong>: Yes</p>
         * </li>
         * <li><p><strong>0</strong>: No</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only for multicloud deployments.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UseSsl")
        public Integer useSsl;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1666884372******</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ListDeploymentJobResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeploymentJobResourceResponseBodyData self = new ListDeploymentJobResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeploymentJobResourceResponseBodyData setCertEndTime(String certEndTime) {
            this.certEndTime = certEndTime;
            return this;
        }
        public String getCertEndTime() {
            return this.certEndTime;
        }

        public ListDeploymentJobResourceResponseBodyData setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public ListDeploymentJobResourceResponseBodyData setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public ListDeploymentJobResourceResponseBodyData setCertStartTime(String certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public String getCertStartTime() {
            return this.certStartTime;
        }

        public ListDeploymentJobResourceResponseBodyData setCloudAccessId(String cloudAccessId) {
            this.cloudAccessId = cloudAccessId;
            return this;
        }
        public String getCloudAccessId() {
            return this.cloudAccessId;
        }

        public ListDeploymentJobResourceResponseBodyData setCloudName(String cloudName) {
            this.cloudName = cloudName;
            return this;
        }
        public String getCloudName() {
            return this.cloudName;
        }

        public ListDeploymentJobResourceResponseBodyData setCloudProduct(String cloudProduct) {
            this.cloudProduct = cloudProduct;
            return this;
        }
        public String getCloudProduct() {
            return this.cloudProduct;
        }

        public ListDeploymentJobResourceResponseBodyData setCloudRegion(String cloudRegion) {
            this.cloudRegion = cloudRegion;
            return this;
        }
        public String getCloudRegion() {
            return this.cloudRegion;
        }

        public ListDeploymentJobResourceResponseBodyData setDefaultResource(Integer defaultResource) {
            this.defaultResource = defaultResource;
            return this;
        }
        public Integer getDefaultResource() {
            return this.defaultResource;
        }

        public ListDeploymentJobResourceResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListDeploymentJobResourceResponseBodyData setEnableHttps(Integer enableHttps) {
            this.enableHttps = enableHttps;
            return this;
        }
        public Integer getEnableHttps() {
            return this.enableHttps;
        }

        public ListDeploymentJobResourceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDeploymentJobResourceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDeploymentJobResourceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDeploymentJobResourceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDeploymentJobResourceResponseBodyData setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListDeploymentJobResourceResponseBodyData setListenerPort(String listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public String getListenerPort() {
            return this.listenerPort;
        }

        public ListDeploymentJobResourceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDeploymentJobResourceResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListDeploymentJobResourceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDeploymentJobResourceResponseBodyData setUseSsl(Integer useSsl) {
            this.useSsl = useSsl;
            return this;
        }
        public Integer getUseSsl() {
            return this.useSsl;
        }

        public ListDeploymentJobResourceResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
