// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceResponseBody extends TeaModel {
    /**
     * <p>The alert configurations of the service.</p>
     * <blockquote>
     * <p> This parameter takes effect only when you specify an alert policy for <strong>PolicyNames</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;TemplateUrl&quot;: &quot;<a href="http://template.file.url">http://template.file.url</a>&quot;,
     *   // 应用分组级别告警元数据
     *   &quot;ApplicationGroups&quot;: [
     *     {
     *       &quot;Name&quot;: &quot;applicationGroup1&quot;,
     *       &quot;TemplateUrl&quot;: &quot;url1&quot;
     *     },
     *     {
     *       &quot;Name&quot;: &quot;applicationGroup2&quot;,
     *       &quot;TemplateUrl&quot;: &quot;url2&quot;
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("AlarmMetadata")
    public String alarmMetadata;

    /**
     * <p>The approval type of the service usage application. Valid values:</p>
     * <ul>
     * <li>Manual: The application is manually approved.</li>
     * <li>AutoPass: The application is automatically approved.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("ApprovalType")
    public String approvalType;

    /**
     * <p>The information of build service information.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;RepoUrl&quot;: &quot;<a href="https://github.com/user/repo.git">https://github.com/user/repo.git</a>&quot;, &quot;Brancn&quot;: &quot;main&quot;}</p>
     */
    @NameInMap("BuildInfo")
    public String buildInfo;

    /**
     * <p>The category of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>DevOps</p>
     */
    @NameInMap("Categories")
    public String categories;

    /**
     * <p>The commodity details.</p>
     */
    @NameInMap("Commodity")
    public GetServiceResponseBodyCommodity commodity;

    /**
     * <p>The commodity code of the service in Alibaba Cloud Marketplace.</p>
     * 
     * <strong>example:</strong>
     * <p>cmjj00xxxx</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The time when the service was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The binding configurations of the commodity module.</p>
     * 
     * <strong>example:</strong>
     * <p>componesConfigs</p>
     */
    @NameInMap("CrossRegionConnectionStatus")
    public String crossRegionConnectionStatus;

    /**
     * <p>The validity period of the default license. Unit: day. Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefaultLicenseDays")
    public Long defaultLicenseDays;

    /**
     * <p>The storage configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;TemplateConfigs\&quot;:[{\&quot;Name\&quot;:\&quot;模板1\&quot;,\&quot;Url\&quot;:\&quot;oss://computenest-test/template&quot; 
     *             + &quot;.json?RegionId=cn-beijing\&quot;,\&quot;PredefinedParameters\&quot;:[{\&quot;Name\&quot;:\&quot;低配版\&quot;,&quot; 
     *             + &quot;\&quot;Parameters\&quot;:{\&quot;InstanceType\&quot;:\&quot;ecs.g5.large\&quot;,\&quot;DataDiskSize\&quot;:40}},{\&quot;Name\&quot;:\&quot;高配版\&quot;,&quot; 
     *             + &quot;\&quot;Parameters\&quot;:{\&quot;InstanceType\&quot;:\&quot;ecs.g5.large\&quot;,\&quot;DataDiskSize\&quot;:200}}]}]}</p>
     */
    @NameInMap("DeployMetadata")
    public String deployMetadata;

    /**
     * <p>The deployment type of the service. Valid values:</p>
     * <ul>
     * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
     * <li>terraform: The service is deployed by using Terraform.</li>
     * <li>spi: The service is deployed by calling a service provider interface (SPI).</li>
     * <li>operation: The service is deployed by using a hosted O\&amp;M service.</li>
     * <li>container: The service is deployed by using a container.</li>
     * <li>pkg: The service is deployed by using a package.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ros</p>
     */
    @NameInMap("DeployType")
    public String deployType;

    /**
     * <p>The duration for which hosted O\&amp;M is implemented. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>259200</p>
     */
    @NameInMap("Duration")
    public Long duration;

    /**
     * <p>The report source.</p>
     */
    @NameInMap("EntitySource")
    public java.util.Map<String, String> entitySource;

    /**
     * <p>Indicates whether the hosted O\&amp;M feature is enabled for the service. Default value: false. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is returned if you set <strong>ServiceType</strong> to <strong>private</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSupportOperated")
    public Boolean isSupportOperated;

    /**
     * <p>The license metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;renewType&quot;:&quot;MONTHLY&quot;}</p>
     */
    @NameInMap("LicenseMetadata")
    public String licenseMetadata;

    /**
     * <p>The logging configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Logstores&quot;: [ { &quot;LogstoreName&quot;: &quot;access-log&quot;, &quot;LogPath&quot;: &quot;/home/admin/app/logs&quot;, # This parameter is not required for containers. Configure the parameter in the YAML file. &quot;FilePattern&quot;: &quot;access.log\*&quot; # This parameter is not required for containers. Configure the parameter in the YAML file. } ] }</p>
     */
    @NameInMap("LogMetadata")
    public String logMetadata;

    /**
     * <p>The hosted O\&amp;M configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;PrometheusConfigMap\&quot;:{\&quot;New_Vpc_Ack_And_Jumpserver\&quot;:{}}}</p>
     */
    @NameInMap("OperationMetadata")
    public String operationMetadata;

    /**
     * <p>The source for which fees are generated. Valid values:</p>
     * <ul>
     * <li>None: No fees are generated.</li>
     * <li>Marketplace: Fees are generated for Alibaba Cloud Marketplace.</li>
     * <li>Custom: The custom fees.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("PayFromType")
    public String payFromType;

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
     * <p>Permanent</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The permissions on the service. Valid values:</p>
     * <ul>
     * <li>Deployable: Permissions to deploy the service.</li>
     * <li>Accessible: Permissions to access the service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Deployable</p>
     */
    @NameInMap("Permission")
    public String permission;

    /**
     * <p>The policy name. The name can be up to 128 characters in length. Separate multiple names with commas (,). Only hosted O\&amp;M policies are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>policyName1, policyName2</p>
     */
    @NameInMap("PolicyNames")
    public String policyNames;

    /**
     * <p>The deployment progress of the service instance. Unit: percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("Progress")
    public Long progress;

    /**
     * <p>The time when the service was published.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-21T00:00:00Z</p>
     */
    @NameInMap("PublishTime")
    public String publishTime;

    /**
     * <p>The registration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sr-04056c2ab4b94bxxxxxx</p>
     */
    @NameInMap("RegistrationId")
    public String registrationId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B1A0198B-F316-1B72-B8DD-28B6F6D6XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the distribution is supported. Valid values:</p>
     * <ul>
     * <li>false</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Resellable")
    public Boolean resellable;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzuqyxxxxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The URL of the service audit file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://service-info-public.oss-cn-hangzhou.aliyuncs.com/1690707531xxxxxx/service-document/be3382cd-xxxx-xxxx-xxxx-f8707ec12879.docx">https://service-info-public.oss-cn-hangzhou.aliyuncs.com/1690707531xxxxxx/service-document/be3382cd-xxxx-xxxx-xxxx-f8707ec12879.docx</a></p>
     */
    @NameInMap("ServiceAuditDocumentUrl")
    public String serviceAuditDocumentUrl;

    /**
     * <p>Indicates whether the service is visible. Valid values:</p>
     * <ul>
     * <li>INVISIBLE</li>
     * <li>DISCOVERABLE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DISCOVERABLE</p>
     */
    @NameInMap("ServiceDiscoverable")
    public String serviceDiscoverable;

    /**
     * <p>The URL of the service documentation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example1.com">http://example1.com</a></p>
     */
    @NameInMap("ServiceDocUrl")
    public String serviceDocUrl;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>service-70a3b15bb62643xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The information about the service.</p>
     */
    @NameInMap("ServiceInfos")
    public java.util.List<GetServiceResponseBodyServiceInfos> serviceInfos;

    /**
     * <p>The URL of the service page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example2.com">http://example2.com</a></p>
     */
    @NameInMap("ServiceProductUrl")
    public String serviceProductUrl;

    /**
     * <p>The type of the service. Valid values:</p>
     * <ul>
     * <li>private: The service is a private service and is deployed within the account of a customer.</li>
     * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
     * <li>operation: The service is a hosted O\&amp;M service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The permission type of the deployment URL. Valid values:</p>
     * <ul>
     * <li>Public: All users can go to the URL to create a service instance or a trial service instance.</li>
     * <li>Restricted: Only users in the whitelist can go to the URL to create a service instance or a trial service instance.</li>
     * <li>OnlyFormalRestricted: Only users in the whitelist can go to the URL to create a service instance.</li>
     * <li>OnlyTrailRestricted: Only users in the whitelist can go to the URL to create a trial service instance.</li>
     * <li>Hidden: Users not in the whitelist cannot see the service details page when they go to the URL and cannot request deployment permissions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    /**
     * <p>The share status of the instance.</p>
     * <blockquote>
     * <p>This parameter is discontinued.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>This parameter is discontinued.</p>
     */
    @NameInMap("ShareTypeStatus")
    public String shareTypeStatus;

    /**
     * <p>The ID of the distribution source service.</p>
     * 
     * <strong>example:</strong>
     * <p>service-70a3b15bb62643xxxxxx</p>
     */
    @NameInMap("SourceServiceId")
    public String sourceServiceId;

    /**
     * <p>The version of the distribution source service.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SourceServiceVersion")
    public String sourceServiceVersion;

    /**
     * <p>The name of the distribution source service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>SourceSupplier</p>
     */
    @NameInMap("SourceSupplierName")
    public String sourceSupplierName;

    /**
     * <p>The statistics.</p>
     */
    @NameInMap("Statistic")
    public GetServiceResponseBodyStatistic statistic;

    /**
     * <p>The status of the service. Valid values:</p>
     * <ul>
     * <li>Draft: The service is a draft.</li>
     * <li>Submitted: The service is submitted for review. You cannot modify services in this state.</li>
     * <li>Approved: The service is approved. You cannot modify services in this state. You can publish services in this state.</li>
     * <li>Launching: The service is being published.</li>
     * <li>Online: The service is published.</li>
     * <li>Offline: The service is unpublished.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The description of the service status.</p>
     * 
     * <strong>example:</strong>
     * <p>deploy successfully</p>
     */
    @NameInMap("StatusDetail")
    public String statusDetail;

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
     * <p>The service tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetServiceResponseBodyTags> tags;

    /**
     * <p>The type of the tenant. Valid values:</p>
     * <ul>
     * <li>SingleTenant</li>
     * <li>MultiTenant</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SingleTenant</p>
     */
    @NameInMap("TenantType")
    public String tenantType;

    /**
     * <p>The status of the test. Valid values:</p>
     * <ul>
     * <li><code>CONFIG_IS_NULL</code>: No test configurations exist.</li>
     * <li><code>SERVICE_TEST_SUCCEED</code>: The service passed the test.</li>
     * <li><code>SERVICE_TSET_DOING</code>: The service does not pass the test.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SERVICE_TEST_SUCCEED</p>
     */
    @NameInMap("TestStatus")
    public String testStatus;

    /**
     * <p>The trial duration. Unit: day. The maximum trial duration cannot exceed 30 days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TrialDuration")
    public Long trialDuration;

    /**
     * <p>The trial policy. Valid values:</p>
     * <ul>
     * <li>Trial: Trials are supported.</li>
     * <li>NotTrial: Trials are not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Trial</p>
     */
    @NameInMap("TrialType")
    public String trialType;

    /**
     * <p>The time when the service was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-22T00:00:00Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The metadata about the upgrade.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Description\&quot;:\&quot;xxx\&quot;,\&quot;SupportRollback\&quot;:true,\&quot;SupportUpgradeFromVersions\&quot;:[],\&quot;UpgradeComponents\&quot;:[\&quot;Configuration\&quot;]}</p>
     */
    @NameInMap("UpgradeMetadata")
    public String upgradeMetadata;

    /**
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Version")
    public String version;

    /**
     * <p>The version name.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    /**
     * <p>Indicates whether the service is a virtual Internet service. Valid values:</p>
     * <ul>
     * <li>false</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VirtualInternetService")
    public String virtualInternetService;

    /**
     * <p>The ID of the virtual Internet service.</p>
     * 
     * <strong>example:</strong>
     * <p>service-70a3b15bb62643xxxxxx</p>
     */
    @NameInMap("VirtualInternetServiceId")
    public String virtualInternetServiceId;

    public static GetServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceResponseBody self = new GetServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceResponseBody setAlarmMetadata(String alarmMetadata) {
        this.alarmMetadata = alarmMetadata;
        return this;
    }
    public String getAlarmMetadata() {
        return this.alarmMetadata;
    }

    public GetServiceResponseBody setApprovalType(String approvalType) {
        this.approvalType = approvalType;
        return this;
    }
    public String getApprovalType() {
        return this.approvalType;
    }

    public GetServiceResponseBody setBuildInfo(String buildInfo) {
        this.buildInfo = buildInfo;
        return this;
    }
    public String getBuildInfo() {
        return this.buildInfo;
    }

    public GetServiceResponseBody setCategories(String categories) {
        this.categories = categories;
        return this;
    }
    public String getCategories() {
        return this.categories;
    }

    public GetServiceResponseBody setCommodity(GetServiceResponseBodyCommodity commodity) {
        this.commodity = commodity;
        return this;
    }
    public GetServiceResponseBodyCommodity getCommodity() {
        return this.commodity;
    }

    public GetServiceResponseBody setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public GetServiceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetServiceResponseBody setCrossRegionConnectionStatus(String crossRegionConnectionStatus) {
        this.crossRegionConnectionStatus = crossRegionConnectionStatus;
        return this;
    }
    public String getCrossRegionConnectionStatus() {
        return this.crossRegionConnectionStatus;
    }

    public GetServiceResponseBody setDefaultLicenseDays(Long defaultLicenseDays) {
        this.defaultLicenseDays = defaultLicenseDays;
        return this;
    }
    public Long getDefaultLicenseDays() {
        return this.defaultLicenseDays;
    }

    public GetServiceResponseBody setDeployMetadata(String deployMetadata) {
        this.deployMetadata = deployMetadata;
        return this;
    }
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

    public GetServiceResponseBody setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public GetServiceResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public GetServiceResponseBody setEntitySource(java.util.Map<String, String> entitySource) {
        this.entitySource = entitySource;
        return this;
    }
    public java.util.Map<String, String> getEntitySource() {
        return this.entitySource;
    }

    public GetServiceResponseBody setIsSupportOperated(Boolean isSupportOperated) {
        this.isSupportOperated = isSupportOperated;
        return this;
    }
    public Boolean getIsSupportOperated() {
        return this.isSupportOperated;
    }

    public GetServiceResponseBody setLicenseMetadata(String licenseMetadata) {
        this.licenseMetadata = licenseMetadata;
        return this;
    }
    public String getLicenseMetadata() {
        return this.licenseMetadata;
    }

    public GetServiceResponseBody setLogMetadata(String logMetadata) {
        this.logMetadata = logMetadata;
        return this;
    }
    public String getLogMetadata() {
        return this.logMetadata;
    }

    public GetServiceResponseBody setOperationMetadata(String operationMetadata) {
        this.operationMetadata = operationMetadata;
        return this;
    }
    public String getOperationMetadata() {
        return this.operationMetadata;
    }

    public GetServiceResponseBody setPayFromType(String payFromType) {
        this.payFromType = payFromType;
        return this;
    }
    public String getPayFromType() {
        return this.payFromType;
    }

    public GetServiceResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public GetServiceResponseBody setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public GetServiceResponseBody setPolicyNames(String policyNames) {
        this.policyNames = policyNames;
        return this;
    }
    public String getPolicyNames() {
        return this.policyNames;
    }

    public GetServiceResponseBody setProgress(Long progress) {
        this.progress = progress;
        return this;
    }
    public Long getProgress() {
        return this.progress;
    }

    public GetServiceResponseBody setPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public String getPublishTime() {
        return this.publishTime;
    }

    public GetServiceResponseBody setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }
    public String getRegistrationId() {
        return this.registrationId;
    }

    public GetServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceResponseBody setResellable(Boolean resellable) {
        this.resellable = resellable;
        return this;
    }
    public Boolean getResellable() {
        return this.resellable;
    }

    public GetServiceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetServiceResponseBody setServiceAuditDocumentUrl(String serviceAuditDocumentUrl) {
        this.serviceAuditDocumentUrl = serviceAuditDocumentUrl;
        return this;
    }
    public String getServiceAuditDocumentUrl() {
        return this.serviceAuditDocumentUrl;
    }

    public GetServiceResponseBody setServiceDiscoverable(String serviceDiscoverable) {
        this.serviceDiscoverable = serviceDiscoverable;
        return this;
    }
    public String getServiceDiscoverable() {
        return this.serviceDiscoverable;
    }

    public GetServiceResponseBody setServiceDocUrl(String serviceDocUrl) {
        this.serviceDocUrl = serviceDocUrl;
        return this;
    }
    public String getServiceDocUrl() {
        return this.serviceDocUrl;
    }

    public GetServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceResponseBody setServiceInfos(java.util.List<GetServiceResponseBodyServiceInfos> serviceInfos) {
        this.serviceInfos = serviceInfos;
        return this;
    }
    public java.util.List<GetServiceResponseBodyServiceInfos> getServiceInfos() {
        return this.serviceInfos;
    }

    public GetServiceResponseBody setServiceProductUrl(String serviceProductUrl) {
        this.serviceProductUrl = serviceProductUrl;
        return this;
    }
    public String getServiceProductUrl() {
        return this.serviceProductUrl;
    }

    public GetServiceResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetServiceResponseBody setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public GetServiceResponseBody setShareTypeStatus(String shareTypeStatus) {
        this.shareTypeStatus = shareTypeStatus;
        return this;
    }
    public String getShareTypeStatus() {
        return this.shareTypeStatus;
    }

    public GetServiceResponseBody setSourceServiceId(String sourceServiceId) {
        this.sourceServiceId = sourceServiceId;
        return this;
    }
    public String getSourceServiceId() {
        return this.sourceServiceId;
    }

    public GetServiceResponseBody setSourceServiceVersion(String sourceServiceVersion) {
        this.sourceServiceVersion = sourceServiceVersion;
        return this;
    }
    public String getSourceServiceVersion() {
        return this.sourceServiceVersion;
    }

    public GetServiceResponseBody setSourceSupplierName(String sourceSupplierName) {
        this.sourceSupplierName = sourceSupplierName;
        return this;
    }
    public String getSourceSupplierName() {
        return this.sourceSupplierName;
    }

    public GetServiceResponseBody setStatistic(GetServiceResponseBodyStatistic statistic) {
        this.statistic = statistic;
        return this;
    }
    public GetServiceResponseBodyStatistic getStatistic() {
        return this.statistic;
    }

    public GetServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetServiceResponseBody setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }
    public String getStatusDetail() {
        return this.statusDetail;
    }

    public GetServiceResponseBody setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public GetServiceResponseBody setSupplierUrl(String supplierUrl) {
        this.supplierUrl = supplierUrl;
        return this;
    }
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

    public GetServiceResponseBody setTags(java.util.List<GetServiceResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetServiceResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetServiceResponseBody setTenantType(String tenantType) {
        this.tenantType = tenantType;
        return this;
    }
    public String getTenantType() {
        return this.tenantType;
    }

    public GetServiceResponseBody setTestStatus(String testStatus) {
        this.testStatus = testStatus;
        return this;
    }
    public String getTestStatus() {
        return this.testStatus;
    }

    public GetServiceResponseBody setTrialDuration(Long trialDuration) {
        this.trialDuration = trialDuration;
        return this;
    }
    public Long getTrialDuration() {
        return this.trialDuration;
    }

    public GetServiceResponseBody setTrialType(String trialType) {
        this.trialType = trialType;
        return this;
    }
    public String getTrialType() {
        return this.trialType;
    }

    public GetServiceResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetServiceResponseBody setUpgradeMetadata(String upgradeMetadata) {
        this.upgradeMetadata = upgradeMetadata;
        return this;
    }
    public String getUpgradeMetadata() {
        return this.upgradeMetadata;
    }

    public GetServiceResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetServiceResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public GetServiceResponseBody setVirtualInternetService(String virtualInternetService) {
        this.virtualInternetService = virtualInternetService;
        return this;
    }
    public String getVirtualInternetService() {
        return this.virtualInternetService;
    }

    public GetServiceResponseBody setVirtualInternetServiceId(String virtualInternetServiceId) {
        this.virtualInternetServiceId = virtualInternetServiceId;
        return this;
    }
    public String getVirtualInternetServiceId() {
        return this.virtualInternetServiceId;
    }

    public static class GetServiceResponseBodyCommodityCssMetadataComponentsMappings extends TeaModel {
        /**
         * <p>The mappings.</p>
         */
        @NameInMap("Mappings")
        public java.util.Map<String, String> mappings;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Template 1</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static GetServiceResponseBodyCommodityCssMetadataComponentsMappings build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityCssMetadataComponentsMappings self = new GetServiceResponseBodyCommodityCssMetadataComponentsMappings();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityCssMetadataComponentsMappings setMappings(java.util.Map<String, String> mappings) {
            this.mappings = mappings;
            return this;
        }
        public java.util.Map<String, String> getMappings() {
            return this.mappings;
        }

        public GetServiceResponseBodyCommodityCssMetadataComponentsMappings setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetServiceResponseBodyCommodityCssMetadataMeteringEntityExtraInfos extends TeaModel {
        /**
         * <p>The ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>cmgj0048****-Frequency-1</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>Name of a measurement indicator.</p>
         * 
         * <strong>example:</strong>
         * <p>AvgMemory</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>Custom PromQL.</p>
         * 
         * <strong>example:</strong>
         * <p>avg_over_time(count(kube_pod_info{namespace=\&quot;default\&quot;})[1h:1m])</p>
         */
        @NameInMap("Promql")
        public String promql;

        /**
         * <p>Measurement indicators.</p>
         * 
         * <strong>example:</strong>
         * <p>ComputeNestPrometheus</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetServiceResponseBodyCommodityCssMetadataMeteringEntityExtraInfos build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityCssMetadataMeteringEntityExtraInfos self = new GetServiceResponseBodyCommodityCssMetadataMeteringEntityExtraInfos();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityCssMetadataMeteringEntityExtraInfos setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetServiceResponseBodyCommodityCssMetadataMeteringEntityExtraInfos setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public GetServiceResponseBodyCommodityCssMetadataMeteringEntityExtraInfos setPromql(String promql) {
            this.promql = promql;
            return this;
        }
        public String getPromql() {
            return this.promql;
        }

        public GetServiceResponseBodyCommodityCssMetadataMeteringEntityExtraInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServiceResponseBodyCommodityCssMetadataMeteringEntityMappings extends TeaModel {
        /**
         * <p>The ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>cmgj0015****-Frequency-1</p>
         */
        @NameInMap("EntityIds")
        public String entityIds;

        /**
         * <p>The package name.</p>
         * 
         * <strong>example:</strong>
         * <p>按量付费套餐</p>
         */
        @NameInMap("SpecificationName")
        public String specificationName;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>模板1</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static GetServiceResponseBodyCommodityCssMetadataMeteringEntityMappings build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityCssMetadataMeteringEntityMappings self = new GetServiceResponseBodyCommodityCssMetadataMeteringEntityMappings();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityCssMetadataMeteringEntityMappings setEntityIds(String entityIds) {
            this.entityIds = entityIds;
            return this;
        }
        public String getEntityIds() {
            return this.entityIds;
        }

        public GetServiceResponseBodyCommodityCssMetadataMeteringEntityMappings setSpecificationName(String specificationName) {
            this.specificationName = specificationName;
            return this;
        }
        public String getSpecificationName() {
            return this.specificationName;
        }

        public GetServiceResponseBodyCommodityCssMetadataMeteringEntityMappings setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetServiceResponseBodyCommodityCssMetadata extends TeaModel {
        /**
         * <p>The mapping information about the billing items.</p>
         */
        @NameInMap("ComponentsMappings")
        public java.util.List<GetServiceResponseBodyCommodityCssMetadataComponentsMappings> componentsMappings;

        /**
         * <p>Metering item configuration information.</p>
         */
        @NameInMap("MeteringEntityExtraInfos")
        public java.util.List<GetServiceResponseBodyCommodityCssMetadataMeteringEntityExtraInfos> meteringEntityExtraInfos;

        /**
         * <p>The binding relationship between package and measurement dimension.</p>
         */
        @NameInMap("MeteringEntityMappings")
        public java.util.List<GetServiceResponseBodyCommodityCssMetadataMeteringEntityMappings> meteringEntityMappings;

        public static GetServiceResponseBodyCommodityCssMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityCssMetadata self = new GetServiceResponseBodyCommodityCssMetadata();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityCssMetadata setComponentsMappings(java.util.List<GetServiceResponseBodyCommodityCssMetadataComponentsMappings> componentsMappings) {
            this.componentsMappings = componentsMappings;
            return this;
        }
        public java.util.List<GetServiceResponseBodyCommodityCssMetadataComponentsMappings> getComponentsMappings() {
            return this.componentsMappings;
        }

        public GetServiceResponseBodyCommodityCssMetadata setMeteringEntityExtraInfos(java.util.List<GetServiceResponseBodyCommodityCssMetadataMeteringEntityExtraInfos> meteringEntityExtraInfos) {
            this.meteringEntityExtraInfos = meteringEntityExtraInfos;
            return this;
        }
        public java.util.List<GetServiceResponseBodyCommodityCssMetadataMeteringEntityExtraInfos> getMeteringEntityExtraInfos() {
            return this.meteringEntityExtraInfos;
        }

        public GetServiceResponseBodyCommodityCssMetadata setMeteringEntityMappings(java.util.List<GetServiceResponseBodyCommodityCssMetadataMeteringEntityMappings> meteringEntityMappings) {
            this.meteringEntityMappings = meteringEntityMappings;
            return this;
        }
        public java.util.List<GetServiceResponseBodyCommodityCssMetadataMeteringEntityMappings> getMeteringEntityMappings() {
            return this.meteringEntityMappings;
        }

    }

    public static class GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityExtraInfos extends TeaModel {
        /**
         * <p>The ID of the billable item.</p>
         * 
         * <strong>example:</strong>
         * <p>cmgjxxxxxxxx-NetworkOut-2</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>NetworkLantency</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The custom prometheus statement.</p>
         * 
         * <strong>example:</strong>
         * <p>avg_over_time(count(kube_pod_info{namespace=\&quot;default\&quot;})[1h:1m])</p>
         */
        @NameInMap("Promql")
        public String promql;

        /**
         * <p>The metric.</p>
         * 
         * <strong>example:</strong>
         * <p>AvgPod</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityExtraInfos build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityExtraInfos self = new GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityExtraInfos();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityExtraInfos setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityExtraInfos setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityExtraInfos setPromql(String promql) {
            this.promql = promql;
            return this;
        }
        public String getPromql() {
            return this.promql;
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityExtraInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityMappings extends TeaModel {
        /**
         * <p>The ID of the billable item.</p>
         * 
         * <strong>example:</strong>
         * <p>cmgjxxxxxxxx-NetworkOut-2</p>
         */
        @NameInMap("EntityIds")
        public String entityIds;

        /**
         * <p>The name of the specification package.</p>
         * 
         * <strong>example:</strong>
         * <p>Pay-as-you-go Package</p>
         */
        @NameInMap("SpecificationName")
        public String specificationName;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Template 1</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityMappings build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityMappings self = new GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityMappings();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityMappings setEntityIds(String entityIds) {
            this.entityIds = entityIds;
            return this;
        }
        public String getEntityIds() {
            return this.entityIds;
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityMappings setSpecificationName(String specificationName) {
            this.specificationName = specificationName;
            return this;
        }
        public String getSpecificationName() {
            return this.specificationName;
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityMappings setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings extends TeaModel {
        /**
         * <p>The specification code of the service in Alibaba Cloud Marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>cmjj00xxxx</p>
         */
        @NameInMap("SpecificationCode")
        public String specificationCode;

        /**
         * <p>The name of the specification package.</p>
         * 
         * <strong>example:</strong>
         * <p>Pay-as-you-go</p>
         */
        @NameInMap("SpecificationName")
        public String specificationName;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Template 1</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The trial policy. Valid values:</p>
         * <ul>
         * <li>Trial: Trials are supported.</li>
         * <li>NotTrial: Trials are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotTrial</p>
         */
        @NameInMap("TrialType")
        public String trialType;

        public static GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings self = new GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings setSpecificationCode(String specificationCode) {
            this.specificationCode = specificationCode;
            return this;
        }
        public String getSpecificationCode() {
            return this.specificationCode;
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings setSpecificationName(String specificationName) {
            this.specificationName = specificationName;
            return this;
        }
        public String getSpecificationName() {
            return this.specificationName;
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings setTrialType(String trialType) {
            this.trialType = trialType;
            return this;
        }
        public String getTrialType() {
            return this.trialType;
        }

    }

    public static class GetServiceResponseBodyCommodityMarketplaceMetadata extends TeaModel {
        /**
         * <p>The configurations of the billable items.</p>
         */
        @NameInMap("MeteringEntityExtraInfos")
        public java.util.List<GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityExtraInfos> meteringEntityExtraInfos;

        /**
         * <p>The billable items that are associated with the package.</p>
         */
        @NameInMap("MeteringEntityMappings")
        public java.util.List<GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityMappings> meteringEntityMappings;

        /**
         * <p>The mappings between the service specifications and the template or package.</p>
         */
        @NameInMap("SpecificationMappings")
        public java.util.List<GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings> specificationMappings;

        public static GetServiceResponseBodyCommodityMarketplaceMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityMarketplaceMetadata self = new GetServiceResponseBodyCommodityMarketplaceMetadata();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadata setMeteringEntityExtraInfos(java.util.List<GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityExtraInfos> meteringEntityExtraInfos) {
            this.meteringEntityExtraInfos = meteringEntityExtraInfos;
            return this;
        }
        public java.util.List<GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityExtraInfos> getMeteringEntityExtraInfos() {
            return this.meteringEntityExtraInfos;
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadata setMeteringEntityMappings(java.util.List<GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityMappings> meteringEntityMappings) {
            this.meteringEntityMappings = meteringEntityMappings;
            return this;
        }
        public java.util.List<GetServiceResponseBodyCommodityMarketplaceMetadataMeteringEntityMappings> getMeteringEntityMappings() {
            return this.meteringEntityMappings;
        }

        public GetServiceResponseBodyCommodityMarketplaceMetadata setSpecificationMappings(java.util.List<GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings> specificationMappings) {
            this.specificationMappings = specificationMappings;
            return this;
        }
        public java.util.List<GetServiceResponseBodyCommodityMarketplaceMetadataSpecificationMappings> getSpecificationMappings() {
            return this.specificationMappings;
        }

    }

    public static class GetServiceResponseBodyCommodityMeteringEntities extends TeaModel {
        /**
         * <p>The ID of the billable item.</p>
         * 
         * <strong>example:</strong>
         * <p>cmgjxxxxxxxx-NetworkOut</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The name of the billable item.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-boot-demo</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetServiceResponseBodyCommodityMeteringEntities build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodityMeteringEntities self = new GetServiceResponseBodyCommodityMeteringEntities();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodityMeteringEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetServiceResponseBodyCommodityMeteringEntities setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetServiceResponseBodyCommoditySpecifications extends TeaModel {
        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>cmjj00xxxx</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The specification name.</p>
         * 
         * <strong>example:</strong>
         * <p>specifications1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The subscription duration. Unit: week or year.</p>
         */
        @NameInMap("Times")
        public java.util.List<String> times;

        public static GetServiceResponseBodyCommoditySpecifications build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommoditySpecifications self = new GetServiceResponseBodyCommoditySpecifications();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommoditySpecifications setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetServiceResponseBodyCommoditySpecifications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceResponseBodyCommoditySpecifications setTimes(java.util.List<String> times) {
            this.times = times;
            return this;
        }
        public java.util.List<String> getTimes() {
            return this.times;
        }

    }

    public static class GetServiceResponseBodyCommodity extends TeaModel {
        /**
         * <p>The billing method of the service. Valid values:</p>
         * <ul>
         * <li><strong>PREPAY</strong> (default): subscription.</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The commodity code of the service in Alibaba Cloud Marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>cmjj00xxxx</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The commodity modules.</p>
         */
        @NameInMap("Components")
        public java.util.List<String> components;

        /**
         * <p>The configuration metadata related to Lingxiao.</p>
         */
        @NameInMap("CssMetadata")
        public GetServiceResponseBodyCommodityCssMetadata cssMetadata;

        /**
         * <p>The metadata of Alibaba Cloud Marketplace.</p>
         */
        @NameInMap("MarketplaceMetadata")
        public GetServiceResponseBodyCommodityMarketplaceMetadata marketplaceMetadata;

        /**
         * <p>The information about the billable item.</p>
         */
        @NameInMap("MeteringEntities")
        public java.util.List<GetServiceResponseBodyCommodityMeteringEntities> meteringEntities;

        /**
         * <p>The configuration metadata related to Saas Boost.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Enabled&quot;:false // The public endpoint of the SaaS Boost instance. &quot;PublicAccessUrl&quot;:&quot;<a href="https://example.com">https://example.com</a>&quot; }</p>
         */
        @NameInMap("SaasBoostMetadata")
        public String saasBoostMetadata;

        /**
         * <p>The specification details of the service in Alibaba Cloud Marketplace.</p>
         */
        @NameInMap("Specifications")
        public java.util.List<GetServiceResponseBodyCommoditySpecifications> specifications;

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li>marketplace: Alibaba Cloud Marketplace.</li>
         * <li>Css: Lingxiao.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Marketplace</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetServiceResponseBodyCommodity build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyCommodity self = new GetServiceResponseBodyCommodity();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyCommodity setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetServiceResponseBodyCommodity setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetServiceResponseBodyCommodity setComponents(java.util.List<String> components) {
            this.components = components;
            return this;
        }
        public java.util.List<String> getComponents() {
            return this.components;
        }

        public GetServiceResponseBodyCommodity setCssMetadata(GetServiceResponseBodyCommodityCssMetadata cssMetadata) {
            this.cssMetadata = cssMetadata;
            return this;
        }
        public GetServiceResponseBodyCommodityCssMetadata getCssMetadata() {
            return this.cssMetadata;
        }

        public GetServiceResponseBodyCommodity setMarketplaceMetadata(GetServiceResponseBodyCommodityMarketplaceMetadata marketplaceMetadata) {
            this.marketplaceMetadata = marketplaceMetadata;
            return this;
        }
        public GetServiceResponseBodyCommodityMarketplaceMetadata getMarketplaceMetadata() {
            return this.marketplaceMetadata;
        }

        public GetServiceResponseBodyCommodity setMeteringEntities(java.util.List<GetServiceResponseBodyCommodityMeteringEntities> meteringEntities) {
            this.meteringEntities = meteringEntities;
            return this;
        }
        public java.util.List<GetServiceResponseBodyCommodityMeteringEntities> getMeteringEntities() {
            return this.meteringEntities;
        }

        public GetServiceResponseBodyCommodity setSaasBoostMetadata(String saasBoostMetadata) {
            this.saasBoostMetadata = saasBoostMetadata;
            return this;
        }
        public String getSaasBoostMetadata() {
            return this.saasBoostMetadata;
        }

        public GetServiceResponseBodyCommodity setSpecifications(java.util.List<GetServiceResponseBodyCommoditySpecifications> specifications) {
            this.specifications = specifications;
            return this;
        }
        public java.util.List<GetServiceResponseBodyCommoditySpecifications> getSpecifications() {
            return this.specifications;
        }

        public GetServiceResponseBodyCommodity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServiceResponseBodyServiceInfosAgreements extends TeaModel {
        /**
         * <p>The agreement name.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The agreement URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/xxxxxxxx.html">https://aliyun.com/xxxxxxxx.html</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetServiceResponseBodyServiceInfosAgreements build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyServiceInfosAgreements self = new GetServiceResponseBodyServiceInfosAgreements();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyServiceInfosAgreements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceResponseBodyServiceInfosAgreements setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceResponseBodyServiceInfos extends TeaModel {
        /**
         * <p>The agreement information about the service.</p>
         */
        @NameInMap("Agreements")
        public java.util.List<GetServiceResponseBodyServiceInfosAgreements> agreements;

        /**
         * <p>The URL of the service icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png">https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png</a></p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The language of the service. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("Locale")
        public String locale;

        /**
         * <p>The URL of the detailed description of the service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("LongDescriptionUrl")
        public String longDescriptionUrl;

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

        public static GetServiceResponseBodyServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyServiceInfos self = new GetServiceResponseBodyServiceInfos();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyServiceInfos setAgreements(java.util.List<GetServiceResponseBodyServiceInfosAgreements> agreements) {
            this.agreements = agreements;
            return this;
        }
        public java.util.List<GetServiceResponseBodyServiceInfosAgreements> getAgreements() {
            return this.agreements;
        }

        public GetServiceResponseBodyServiceInfos setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetServiceResponseBodyServiceInfos setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public GetServiceResponseBodyServiceInfos setLongDescriptionUrl(String longDescriptionUrl) {
            this.longDescriptionUrl = longDescriptionUrl;
            return this;
        }
        public String getLongDescriptionUrl() {
            return this.longDescriptionUrl;
        }

        public GetServiceResponseBodyServiceInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceResponseBodyServiceInfos setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

    }

    public static class GetServiceResponseBodyStatistic extends TeaModel {
        /**
         * <p>The total number of service instances that belong to the service. The service instances that are deleted are counted.</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("AccumulativeInstanceCount")
        public Integer accumulativeInstanceCount;

        /**
         * <p>The total amount consumed for trial service instances. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>80.35</p>
         */
        @NameInMap("AccumulativePocAmount")
        public Double accumulativePocAmount;

        /**
         * <p>The total number of users who use the service. The historical users are counted.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("AccumulativeUserCount")
        public Integer accumulativeUserCount;

        /**
         * <p>The average amount consumed for trial service instances per instance. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>40.17</p>
         */
        @NameInMap("AveragePocAmount")
        public Double averagePocAmount;

        /**
         * <p>The average duration for which trial service instances are in use. Unit: Hour.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AveragePocDuration")
        public Double averagePocDuration;

        /**
         * <p>The average amount consumed for trial service instances per a period of time. Unit: CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>167.9</p>
         */
        @NameInMap("AveragePocUnitAmount")
        public Double averagePocUnitAmount;

        /**
         * <p>The number of online service instances. It means the number of service instances that are successfully deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DeployedServiceInstanceCount")
        public Integer deployedServiceInstanceCount;

        /**
         * <p>The number of online users. It means the number of users who successfully deployed the service instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DeployedUserCount")
        public Integer deployedUserCount;

        /**
         * <p>The number of service applications that are in the Submitted state.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SubmittedUsageCount")
        public Integer submittedUsageCount;

        public static GetServiceResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyStatistic self = new GetServiceResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyStatistic setAccumulativeInstanceCount(Integer accumulativeInstanceCount) {
            this.accumulativeInstanceCount = accumulativeInstanceCount;
            return this;
        }
        public Integer getAccumulativeInstanceCount() {
            return this.accumulativeInstanceCount;
        }

        public GetServiceResponseBodyStatistic setAccumulativePocAmount(Double accumulativePocAmount) {
            this.accumulativePocAmount = accumulativePocAmount;
            return this;
        }
        public Double getAccumulativePocAmount() {
            return this.accumulativePocAmount;
        }

        public GetServiceResponseBodyStatistic setAccumulativeUserCount(Integer accumulativeUserCount) {
            this.accumulativeUserCount = accumulativeUserCount;
            return this;
        }
        public Integer getAccumulativeUserCount() {
            return this.accumulativeUserCount;
        }

        public GetServiceResponseBodyStatistic setAveragePocAmount(Double averagePocAmount) {
            this.averagePocAmount = averagePocAmount;
            return this;
        }
        public Double getAveragePocAmount() {
            return this.averagePocAmount;
        }

        public GetServiceResponseBodyStatistic setAveragePocDuration(Double averagePocDuration) {
            this.averagePocDuration = averagePocDuration;
            return this;
        }
        public Double getAveragePocDuration() {
            return this.averagePocDuration;
        }

        public GetServiceResponseBodyStatistic setAveragePocUnitAmount(Double averagePocUnitAmount) {
            this.averagePocUnitAmount = averagePocUnitAmount;
            return this;
        }
        public Double getAveragePocUnitAmount() {
            return this.averagePocUnitAmount;
        }

        public GetServiceResponseBodyStatistic setDeployedServiceInstanceCount(Integer deployedServiceInstanceCount) {
            this.deployedServiceInstanceCount = deployedServiceInstanceCount;
            return this;
        }
        public Integer getDeployedServiceInstanceCount() {
            return this.deployedServiceInstanceCount;
        }

        public GetServiceResponseBodyStatistic setDeployedUserCount(Integer deployedUserCount) {
            this.deployedUserCount = deployedUserCount;
            return this;
        }
        public Integer getDeployedUserCount() {
            return this.deployedUserCount;
        }

        public GetServiceResponseBodyStatistic setSubmittedUsageCount(Integer submittedUsageCount) {
            this.submittedUsageCount = submittedUsageCount;
            return this;
        }
        public Integer getSubmittedUsageCount() {
            return this.submittedUsageCount;
        }

    }

    public static class GetServiceResponseBodyTags extends TeaModel {
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

        public static GetServiceResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyTags self = new GetServiceResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetServiceResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
