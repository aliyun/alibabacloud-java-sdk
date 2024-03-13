// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCloudResourcesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<ListCloudResourcesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowSize")
    public Integer showSize;

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
        @NameInMap("CertEndTime")
        public String certEndTime;

        @NameInMap("CertId")
        public Long certId;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CertStartTime")
        public String certStartTime;

        @NameInMap("CloudAccessId")
        public String cloudAccessId;

        @NameInMap("CloudName")
        public String cloudName;

        @NameInMap("CloudProduct")
        public String cloudProduct;

        @NameInMap("CloudRegion")
        public String cloudRegion;

        @NameInMap("DefaultResource")
        public Integer defaultResource;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EnableHttps")
        public Integer enableHttps;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("ListenerPort")
        public String listenerPort;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UseSsl")
        public Integer useSsl;

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
