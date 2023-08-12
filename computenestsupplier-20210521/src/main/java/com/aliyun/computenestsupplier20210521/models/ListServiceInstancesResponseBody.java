// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceInstancesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceInstances")
    public java.util.List<ListServiceInstancesResponseBodyServiceInstances> serviceInstances;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServiceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstancesResponseBody self = new ListServiceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
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

    public ListServiceInstancesResponseBody setServiceInstances(java.util.List<ListServiceInstancesResponseBodyServiceInstances> serviceInstances) {
        this.serviceInstances = serviceInstances;
        return this;
    }
    public java.util.List<ListServiceInstancesResponseBodyServiceInstances> getServiceInstances() {
        return this.serviceInstances;
    }

    public ListServiceInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos extends TeaModel {
        @NameInMap("Image")
        public String image;

        @NameInMap("Locale")
        public String locale;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShortDescription")
        public String shortDescription;

        public static ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos self = new ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
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
        @NameInMap("DeployMetadata")
        public String deployMetadata;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("EnablePrivateVpcConnection")
        public Boolean enablePrivateVpcConnection;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceInfos")
        public java.util.List<ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos> serviceInfos;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("SourceSupplierName")
        public String sourceSupplierName;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("SupplierUrl")
        public String supplierUrl;

        @NameInMap("Version")
        public String version;

        @NameInMap("VersionName")
        public String versionName;

        public static ListServiceInstancesResponseBodyServiceInstancesService build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesResponseBodyServiceInstancesService self = new ListServiceInstancesResponseBodyServiceInstancesService();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setDeployMetadata(String deployMetadata) {
            this.deployMetadata = deployMetadata;
            return this;
        }
        public String getDeployMetadata() {
            return this.deployMetadata;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setEnablePrivateVpcConnection(Boolean enablePrivateVpcConnection) {
            this.enablePrivateVpcConnection = enablePrivateVpcConnection;
            return this;
        }
        public Boolean getEnablePrivateVpcConnection() {
            return this.enablePrivateVpcConnection;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setServiceInfos(java.util.List<ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos> serviceInfos) {
            this.serviceInfos = serviceInfos;
            return this;
        }
        public java.util.List<ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos> getServiceInfos() {
            return this.serviceInfos;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setSourceSupplierName(String sourceSupplierName) {
            this.sourceSupplierName = sourceSupplierName;
            return this;
        }
        public String getSourceSupplierName() {
            return this.sourceSupplierName;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setSupplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListServiceInstancesResponseBodyServiceInstancesService setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class ListServiceInstancesResponseBodyServiceInstancesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListServiceInstancesResponseBodyServiceInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesResponseBodyServiceInstancesTags self = new ListServiceInstancesResponseBodyServiceInstancesTags();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesResponseBodyServiceInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServiceInstancesResponseBodyServiceInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListServiceInstancesResponseBodyServiceInstances extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EnableInstanceOps")
        public Boolean enableInstanceOps;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("IsOperated")
        public Boolean isOperated;

        @NameInMap("Name")
        public String name;

        @NameInMap("OperatedServiceInstanceId")
        public String operatedServiceInstanceId;

        @NameInMap("OperationEndTime")
        public String operationEndTime;

        @NameInMap("OperationStartTime")
        public String operationStartTime;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Service")
        public ListServiceInstancesResponseBodyServiceInstancesService service;

        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusDetail")
        public String statusDetail;

        @NameInMap("Tags")
        public java.util.List<ListServiceInstancesResponseBodyServiceInstancesTags> tags;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public Long userId;

        public static ListServiceInstancesResponseBodyServiceInstances build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesResponseBodyServiceInstances self = new ListServiceInstancesResponseBodyServiceInstances();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesResponseBodyServiceInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServiceInstancesResponseBodyServiceInstances setEnableInstanceOps(Boolean enableInstanceOps) {
            this.enableInstanceOps = enableInstanceOps;
            return this;
        }
        public Boolean getEnableInstanceOps() {
            return this.enableInstanceOps;
        }

        public ListServiceInstancesResponseBodyServiceInstances setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListServiceInstancesResponseBodyServiceInstances setIsOperated(Boolean isOperated) {
            this.isOperated = isOperated;
            return this;
        }
        public Boolean getIsOperated() {
            return this.isOperated;
        }

        public ListServiceInstancesResponseBodyServiceInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceInstancesResponseBodyServiceInstances setOperatedServiceInstanceId(String operatedServiceInstanceId) {
            this.operatedServiceInstanceId = operatedServiceInstanceId;
            return this;
        }
        public String getOperatedServiceInstanceId() {
            return this.operatedServiceInstanceId;
        }

        public ListServiceInstancesResponseBodyServiceInstances setOperationEndTime(String operationEndTime) {
            this.operationEndTime = operationEndTime;
            return this;
        }
        public String getOperationEndTime() {
            return this.operationEndTime;
        }

        public ListServiceInstancesResponseBodyServiceInstances setOperationStartTime(String operationStartTime) {
            this.operationStartTime = operationStartTime;
            return this;
        }
        public String getOperationStartTime() {
            return this.operationStartTime;
        }

        public ListServiceInstancesResponseBodyServiceInstances setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListServiceInstancesResponseBodyServiceInstances setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public ListServiceInstancesResponseBodyServiceInstances setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ListServiceInstancesResponseBodyServiceInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListServiceInstancesResponseBodyServiceInstances setService(ListServiceInstancesResponseBodyServiceInstancesService service) {
            this.service = service;
            return this;
        }
        public ListServiceInstancesResponseBodyServiceInstancesService getService() {
            return this.service;
        }

        public ListServiceInstancesResponseBodyServiceInstances setServiceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        public ListServiceInstancesResponseBodyServiceInstances setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListServiceInstancesResponseBodyServiceInstances setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListServiceInstancesResponseBodyServiceInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceInstancesResponseBodyServiceInstances setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public ListServiceInstancesResponseBodyServiceInstances setTags(java.util.List<ListServiceInstancesResponseBodyServiceInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListServiceInstancesResponseBodyServiceInstancesTags> getTags() {
            return this.tags;
        }

        public ListServiceInstancesResponseBodyServiceInstances setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListServiceInstancesResponseBodyServiceInstances setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListServiceInstancesResponseBodyServiceInstances setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
