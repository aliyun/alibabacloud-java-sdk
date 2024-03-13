// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListDeploymentJobResourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListDeploymentJobResourceResponseBodyData> data;

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

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        @NameInMap("UseSsl")
        public Integer useSsl;

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
