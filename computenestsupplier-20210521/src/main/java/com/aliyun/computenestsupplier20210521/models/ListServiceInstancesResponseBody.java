// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceInstancesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("ServiceInstances")
    public java.util.List<ListServiceInstancesResponseBodyServiceInstances> serviceInstances;

    public static ListServiceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstancesResponseBody self = new ListServiceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListServiceInstancesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstancesResponseBody setServiceInstances(java.util.List<ListServiceInstancesResponseBodyServiceInstances> serviceInstances) {
        this.serviceInstances = serviceInstances;
        return this;
    }
    public java.util.List<ListServiceInstancesResponseBodyServiceInstances> getServiceInstances() {
        return this.serviceInstances;
    }

    public static class ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos extends TeaModel {
        @NameInMap("Locale")
        public String locale;

        @NameInMap("Image")
        public String image;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShortDescription")
        public String shortDescription;

        public static ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos self = new ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

    }

    public static class ListServiceInstancesResponseBodyServiceInstancesService extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("Version")
        public String version;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("SupplierUrl")
        public String supplierUrl;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("ServiceInfos")
        public java.util.List<ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos> serviceInfos;

        public static ListServiceInstancesResponseBodyServiceInstancesService build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesResponseBodyServiceInstancesService self = new ListServiceInstancesResponseBodyServiceInstancesService();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setSupplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setServiceInfos(java.util.List<ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos> serviceInfos) {
            this.serviceInfos = serviceInfos;
            return this;
        }
        public java.util.List<ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos> getServiceInfos() {
            return this.serviceInfos;
        }

    }

    public static class ListServiceInstancesResponseBodyServiceInstances extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("Service")
        public ListServiceInstancesResponseBodyServiceInstancesService service;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("StatusDetail")
        public String statusDetail;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("TemplateName")
        public String templateName;

        public static ListServiceInstancesResponseBodyServiceInstances build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesResponseBodyServiceInstances self = new ListServiceInstancesResponseBodyServiceInstances();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesResponseBodyServiceInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceInstancesResponseBodyServiceInstances setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListServiceInstancesResponseBodyServiceInstances setServiceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        public ListServiceInstancesResponseBodyServiceInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServiceInstancesResponseBodyServiceInstances setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListServiceInstancesResponseBodyServiceInstances setService(ListServiceInstancesResponseBodyServiceInstancesService service) {
            this.service = service;
            return this;
        }
        public ListServiceInstancesResponseBodyServiceInstancesService getService() {
            return this.service;
        }

        public ListServiceInstancesResponseBodyServiceInstances setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListServiceInstancesResponseBodyServiceInstances setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public ListServiceInstancesResponseBodyServiceInstances setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ListServiceInstancesResponseBodyServiceInstances setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
