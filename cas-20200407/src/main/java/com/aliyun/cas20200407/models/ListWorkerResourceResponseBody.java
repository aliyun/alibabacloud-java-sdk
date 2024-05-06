// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListWorkerResourceResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<ListWorkerResourceResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowSize")
    public Integer showSize;

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
        @NameInMap("CertDomain")
        public String certDomain;

        @NameInMap("CertId")
        public Long certId;

        @NameInMap("CertInstanceId")
        public String certInstanceId;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CloudName")
        public String cloudName;

        @NameInMap("CloudProduct")
        public String cloudProduct;

        @NameInMap("CloudRegion")
        public String cloudRegion;

        @NameInMap("DefaultResource")
        public Boolean defaultResource;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceCertId")
        public Long resourceCertId;

        @NameInMap("ResourceDomain")
        public String resourceDomain;

        @NameInMap("ResourceId")
        public Long resourceId;

        @NameInMap("Status")
        public String status;

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
