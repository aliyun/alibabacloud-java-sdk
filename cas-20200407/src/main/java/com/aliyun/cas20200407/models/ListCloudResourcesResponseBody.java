// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCloudResourcesResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data returned for the request.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCloudResourcesResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
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
     * <p>440</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListCloudResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudResourcesResponseBody self = new ListCloudResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudResourcesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCloudResourcesResponseBody setData(java.util.List<ListCloudResourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCloudResourcesResponseBodyData> getData() {
        return this.data;
    }

    public ListCloudResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudResourcesResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListCloudResourcesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListCloudResourcesResponseBodyData extends TeaModel {
        /**
         * <p>The end date of the certificate bound to the cloud resource. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1737795520000</p>
         */
        @NameInMap("CertEndTime")
        public String certEndTime;

        /**
         * <p>The ID of the certificate bound to the cloud resource.</p>
         * 
         * <strong>example:</strong>
         * <p>12433121</p>
         */
        @NameInMap("CertId")
        public Long certId;

        /**
         * <p>The name of the certificate bound to the cloud resource.</p>
         * 
         * <strong>example:</strong>
         * <p>shop.amsaudio.cn</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The start date of the certificate bound to the cloud resource. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1706259520000</p>
         */
        @NameInMap("CertStartTime")
        public String certStartTime;

        /**
         * <p>The AccessKey ID that is used to access cloud resources.</p>
         * <blockquote>
         * <p> This parameter is returned only when you deploy certificates to cloud services of third-party clouds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("CloudAccessId")
        public String cloudAccessId;

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
         * <p>aliyun</p>
         */
        @NameInMap("CloudName")
        public String cloudName;

        /**
         * <p>The cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("CloudProduct")
        public String cloudProduct;

        /**
         * <p>The region ID of the cloud service provider to which the cloud resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("CloudRegion")
        public String cloudRegion;

        /**
         * <p>Indicates whether the cloud resource is the default resource. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DefaultResource")
        public Integer defaultResource;

        /**
         * <p>The domain name bound to the cloud resource.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.tkgeo.ru">www.tkgeo.ru</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether HTTPS is enabled for the cloud resource. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes.</li>
         * <li><strong>0</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnableHttps")
        public Integer enableHttps;

        /**
         * <p>The time when the cloud resource was created. The time is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1673423339000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the cloud resource was last modified. The time is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1696911946000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the cloud resource.</p>
         * 
         * <strong>example:</strong>
         * <p>2356</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The instance ID of the cloud resource.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>nlb-rv05agjc97ovm14il5</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The listener ID of the cloud resource.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>lsn-jiugof6t23et66lsnc@443</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The listening port of the cloud resource.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8047</p>
         */
        @NameInMap("ListenerPort")
        public String listenerPort;

        /**
         * <p>The region ID of the cloud resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the cloud resource.</p>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether an Alibaba Cloud SSL certificate is used. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required only when you deploy certificates to services of multiple clouds.</p>
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
         * <p>1666884372152785</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ListCloudResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCloudResourcesResponseBodyData self = new ListCloudResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCloudResourcesResponseBodyData setCertEndTime(String certEndTime) {
            this.certEndTime = certEndTime;
            return this;
        }
        public String getCertEndTime() {
            return this.certEndTime;
        }

        public ListCloudResourcesResponseBodyData setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public ListCloudResourcesResponseBodyData setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public ListCloudResourcesResponseBodyData setCertStartTime(String certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public String getCertStartTime() {
            return this.certStartTime;
        }

        public ListCloudResourcesResponseBodyData setCloudAccessId(String cloudAccessId) {
            this.cloudAccessId = cloudAccessId;
            return this;
        }
        public String getCloudAccessId() {
            return this.cloudAccessId;
        }

        public ListCloudResourcesResponseBodyData setCloudName(String cloudName) {
            this.cloudName = cloudName;
            return this;
        }
        public String getCloudName() {
            return this.cloudName;
        }

        public ListCloudResourcesResponseBodyData setCloudProduct(String cloudProduct) {
            this.cloudProduct = cloudProduct;
            return this;
        }
        public String getCloudProduct() {
            return this.cloudProduct;
        }

        public ListCloudResourcesResponseBodyData setCloudRegion(String cloudRegion) {
            this.cloudRegion = cloudRegion;
            return this;
        }
        public String getCloudRegion() {
            return this.cloudRegion;
        }

        public ListCloudResourcesResponseBodyData setDefaultResource(Integer defaultResource) {
            this.defaultResource = defaultResource;
            return this;
        }
        public Integer getDefaultResource() {
            return this.defaultResource;
        }

        public ListCloudResourcesResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListCloudResourcesResponseBodyData setEnableHttps(Integer enableHttps) {
            this.enableHttps = enableHttps;
            return this;
        }
        public Integer getEnableHttps() {
            return this.enableHttps;
        }

        public ListCloudResourcesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCloudResourcesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCloudResourcesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCloudResourcesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCloudResourcesResponseBodyData setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListCloudResourcesResponseBodyData setListenerPort(String listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public String getListenerPort() {
            return this.listenerPort;
        }

        public ListCloudResourcesResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCloudResourcesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCloudResourcesResponseBodyData setUseSsl(Integer useSsl) {
            this.useSsl = useSsl;
            return this;
        }
        public Integer getUseSsl() {
            return this.useSsl;
        }

        public ListCloudResourcesResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
