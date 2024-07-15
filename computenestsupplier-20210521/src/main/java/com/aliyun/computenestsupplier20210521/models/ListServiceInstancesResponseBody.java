// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceInstancesResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E50287CB-AABF-4877-92C0-289B339A1546</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about service instances.</p>
     */
    @NameInMap("ServiceInstances")
    public java.util.List<ListServiceInstancesResponseBodyServiceInstances> serviceInstances;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The URL of the service icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png">https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png</a></p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The language of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("Locale")
        public String locale;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>WordPress</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>B是A公司自主设计并研发的开源分布式的关系型数据库</p>
         */
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
        /**
         * <p>The storage configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.</p>
         */
        @NameInMap("DeployMetadata")
        public String deployMetadata;

        /**
         * <p>The deployment type of the service. Valid values:</p>
         * <ul>
         * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
         * <li>terraform: The service is deployed by using Terraform.</li>
         * <li>ack: The service is deployed by using Container Service for Kubernetes (ACK).</li>
         * <li>spi: The service is deployed by calling a service provider interface (SPI).</li>
         * <li>operation: The service is deployed by using a hosted O\&amp;M service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ros</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>Indicates whether the private connection feature is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnablePrivateVpcConnection")
        public Boolean enablePrivateVpcConnection;

        /**
         * <p>The time when the service was published.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-21T00:00:00Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-0e6fca6a51a54420****</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The information about the service.</p>
         */
        @NameInMap("ServiceInfos")
        public java.util.List<ListServiceInstancesResponseBodyServiceInstancesServiceServiceInfos> serviceInfos;

        /**
         * <p>The type of the service. Valid values:</p>
         * <ul>
         * <li>private: The service is a private service and is deployed within the account of a customer.</li>
         * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
         * <li>operation: The service is a hosted O\&amp;M service.</li>
         * <li>poc: The service is a trial service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The name of the distribution source service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Company A</p>
         */
        @NameInMap("SourceSupplierName")
        public String sourceSupplierName;

        /**
         * <p>The status of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        @NameInMap("SupplierName")
        public String supplierName;

        /**
         * <p>The URL of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        @NameInMap("SupplierUrl")
        public String supplierUrl;

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The custom version name defined by the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>版本A</p>
         */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
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
        /**
         * <p>The business status of the service instance. Valid values:</p>
         * <ul>
         * <li>Normal: The service instance is normal.</li>
         * <li>Renewing: The service instance is being renewed.</li>
         * <li>RenewFailed: The service instance failed to be renewed.</li>
         * <li>Expired: The service instance expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BizStatus")
        public String bizStatus;

        /**
         * <p>The time when the service instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the service instance supports the hosted O\&amp;M feature. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableInstanceOps")
        public Boolean enableInstanceOps;

        /**
         * <p>The time when the service instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T12:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Indicates whether the hosted O\&amp;M feature is enabled for the service instance. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsOperated")
        public Boolean isOperated;

        /**
         * <p>The name of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TestName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the service instance that is used to implement hosted O\&amp;M.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        @NameInMap("OperatedServiceInstanceId")
        public String operatedServiceInstanceId;

        /**
         * <p>The end of the time range during which hosted O\&amp;M is implemented.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-29T06:48:56Z</p>
         */
        @NameInMap("OperationEndTime")
        public String operationEndTime;

        /**
         * <p>The beginning of the time range during which hosted O\&amp;M is implemented.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-29T06:48:56Z</p>
         */
        @NameInMap("OperationStartTime")
        public String operationStartTime;

        /**
         * <p>The parameters of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;param&quot;:&quot;value&quot;}</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The billing method of the service. Valid values:</p>
         * <ul>
         * <li>Permanent: Once you purchase the service, you can use it permanently.</li>
         * <li>Subscription: You purchase the service from Alibaba Cloud Marketplace and are charged for the service on a subscription basis.</li>
         * <li>PayAsYouGo: You purchase the service from Alibaba Cloud Marketplace and are charged for the service on a pay-as-you-go basis.</li>
         * <li>CustomFixTime: You are charged for the service based on a custom duration fixed by the service provider.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The deployment progress of the service instance. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Progress")
        public Long progress;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccxxxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The information about the service.</p>
         */
        @NameInMap("Service")
        public ListServiceInstancesResponseBodyServiceInstancesService service;

        /**
         * <p>The ID of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        /**
         * <p>The type of the service. Valid values:</p>
         * <ul>
         * <li>private: The service is a private service and is deployed within the account of a customer.</li>
         * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
         * <li>operation: The service is a hosted O\&amp;M service.</li>
         * <li>poc: The service is a trial service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The source from which the service instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>Supplier</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the service instance. Valid values:</p>
         * <ul>
         * <li>Created</li>
         * <li>Deploying</li>
         * <li>DeployedFailed</li>
         * <li>Deployed</li>
         * <li>Upgrading</li>
         * <li>Deleting</li>
         * <li>Deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The description of the deployment of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>deploy successfully</p>
         */
        @NameInMap("StatusDetail")
        public String statusDetail;

        /**
         * <p>The custom tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListServiceInstancesResponseBodyServiceInstancesTags> tags;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>模板1</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The time when the service instance was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The Alibaba Cloud account ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ListServiceInstancesResponseBodyServiceInstances build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesResponseBodyServiceInstances self = new ListServiceInstancesResponseBodyServiceInstances();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesResponseBodyServiceInstances setBizStatus(String bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }
        public String getBizStatus() {
            return this.bizStatus;
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
