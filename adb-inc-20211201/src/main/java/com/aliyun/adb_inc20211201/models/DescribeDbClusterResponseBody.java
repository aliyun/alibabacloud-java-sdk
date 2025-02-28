// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeDbClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public DescribeDbClusterResponseBodyData data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("resultCode")
    public String resultCode;

    @NameInMap("success")
    public Boolean success;

    public static DescribeDbClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbClusterResponseBody self = new DescribeDbClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDbClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDbClusterResponseBody setData(DescribeDbClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDbClusterResponseBodyData getData() {
        return this.data;
    }

    public DescribeDbClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDbClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDbClusterResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeDbClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDbClusterResponseBodyDataDbClusterBillingDetails extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("PayType")
        public String payType;

        public static DescribeDbClusterResponseBodyDataDbClusterBillingDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterResponseBodyDataDbClusterBillingDetails self = new DescribeDbClusterResponseBodyDataDbClusterBillingDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterResponseBodyDataDbClusterBillingDetails setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeDbClusterResponseBodyDataDbClusterBillingDetails setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDbClusterResponseBodyDataDbClusterBillingDetails setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDbClusterResponseBodyDataDbClusterBillingDetails setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public DescribeDbClusterResponseBodyDataDbClusterBillingDetails setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

    public static class DescribeDbClusterResponseBodyDataDbClusterDeprecatedProperties extends TeaModel {
        @NameInMap("DbClusterType")
        public String dbClusterType;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("InstanceClassGroup")
        public String instanceClassGroup;

        @NameInMap("StorageCategory")
        public String storageCategory;

        public static DescribeDbClusterResponseBodyDataDbClusterDeprecatedProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterResponseBodyDataDbClusterDeprecatedProperties self = new DescribeDbClusterResponseBodyDataDbClusterDeprecatedProperties();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterResponseBodyDataDbClusterDeprecatedProperties setDbClusterType(String dbClusterType) {
            this.dbClusterType = dbClusterType;
            return this;
        }
        public String getDbClusterType() {
            return this.dbClusterType;
        }

        public DescribeDbClusterResponseBodyDataDbClusterDeprecatedProperties setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDbClusterResponseBodyDataDbClusterDeprecatedProperties setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDbClusterResponseBodyDataDbClusterDeprecatedProperties setInstanceClassGroup(String instanceClassGroup) {
            this.instanceClassGroup = instanceClassGroup;
            return this;
        }
        public String getInstanceClassGroup() {
            return this.instanceClassGroup;
        }

        public DescribeDbClusterResponseBodyDataDbClusterDeprecatedProperties setStorageCategory(String storageCategory) {
            this.storageCategory = storageCategory;
            return this;
        }
        public String getStorageCategory() {
            return this.storageCategory;
        }

    }

    public static class DescribeDbClusterResponseBodyDataDbClusterLocation extends TeaModel {
        @NameInMap("RegionCode")
        public String regionCode;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SubDomain")
        public String subDomain;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDbClusterResponseBodyDataDbClusterLocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterResponseBodyDataDbClusterLocation self = new DescribeDbClusterResponseBodyDataDbClusterLocation();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterResponseBodyDataDbClusterLocation setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public DescribeDbClusterResponseBodyDataDbClusterLocation setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDbClusterResponseBodyDataDbClusterLocation setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribeDbClusterResponseBodyDataDbClusterLocation setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDbClusterResponseBodyDataDbClusterNetwork extends TeaModel {
        @NameInMap("CloudInstanceIp")
        public String cloudInstanceIp;

        @NameInMap("ClusterNetworkType")
        public String clusterNetworkType;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("DbClusterNetType")
        public String dbClusterNetType;

        @NameInMap("Port")
        public String port;

        @NameInMap("TunnelId")
        public String tunnelId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeDbClusterResponseBodyDataDbClusterNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterResponseBodyDataDbClusterNetwork self = new DescribeDbClusterResponseBodyDataDbClusterNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterResponseBodyDataDbClusterNetwork setCloudInstanceIp(String cloudInstanceIp) {
            this.cloudInstanceIp = cloudInstanceIp;
            return this;
        }
        public String getCloudInstanceIp() {
            return this.cloudInstanceIp;
        }

        public DescribeDbClusterResponseBodyDataDbClusterNetwork setClusterNetworkType(String clusterNetworkType) {
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }
        public String getClusterNetworkType() {
            return this.clusterNetworkType;
        }

        public DescribeDbClusterResponseBodyDataDbClusterNetwork setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDbClusterResponseBodyDataDbClusterNetwork setDbClusterNetType(String dbClusterNetType) {
            this.dbClusterNetType = dbClusterNetType;
            return this;
        }
        public String getDbClusterNetType() {
            return this.dbClusterNetType;
        }

        public DescribeDbClusterResponseBodyDataDbClusterNetwork setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDbClusterResponseBodyDataDbClusterNetwork setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public String getTunnelId() {
            return this.tunnelId;
        }

        public DescribeDbClusterResponseBodyDataDbClusterNetwork setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDbClusterResponseBodyDataDbClusterNetwork setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDbClusterResponseBodyDataDbClusterNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeDbClusterResponseBodyDataDbClusterOperationalStatus extends TeaModel {
        @NameInMap("FullEngineVersion")
        public String fullEngineVersion;

        @NameInMap("IsNonStandard")
        public Boolean isNonStandard;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("SampleDatasetStatus")
        public String sampleDatasetStatus;

        public static DescribeDbClusterResponseBodyDataDbClusterOperationalStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterResponseBodyDataDbClusterOperationalStatus self = new DescribeDbClusterResponseBodyDataDbClusterOperationalStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterResponseBodyDataDbClusterOperationalStatus setFullEngineVersion(String fullEngineVersion) {
            this.fullEngineVersion = fullEngineVersion;
            return this;
        }
        public String getFullEngineVersion() {
            return this.fullEngineVersion;
        }

        public DescribeDbClusterResponseBodyDataDbClusterOperationalStatus setIsNonStandard(Boolean isNonStandard) {
            this.isNonStandard = isNonStandard;
            return this;
        }
        public Boolean getIsNonStandard() {
            return this.isNonStandard;
        }

        public DescribeDbClusterResponseBodyDataDbClusterOperationalStatus setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDbClusterResponseBodyDataDbClusterOperationalStatus setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDbClusterResponseBodyDataDbClusterOperationalStatus setSampleDatasetStatus(String sampleDatasetStatus) {
            this.sampleDatasetStatus = sampleDatasetStatus;
            return this;
        }
        public String getSampleDatasetStatus() {
            return this.sampleDatasetStatus;
        }

    }

    public static class DescribeDbClusterResponseBodyDataDbClusterResourceAssociations extends TeaModel {
        @NameInMap("DbLogicId")
        public Integer dbLogicId;

        @NameInMap("KmsId")
        public String kmsId;

        @NameInMap("RdsInstanceId")
        public String rdsInstanceId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceMode")
        public String resourceMode;

        @NameInMap("ResourceOrderId")
        public String resourceOrderId;

        public static DescribeDbClusterResponseBodyDataDbClusterResourceAssociations build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterResponseBodyDataDbClusterResourceAssociations self = new DescribeDbClusterResponseBodyDataDbClusterResourceAssociations();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceAssociations setDbLogicId(Integer dbLogicId) {
            this.dbLogicId = dbLogicId;
            return this;
        }
        public Integer getDbLogicId() {
            return this.dbLogicId;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceAssociations setKmsId(String kmsId) {
            this.kmsId = kmsId;
            return this;
        }
        public String getKmsId() {
            return this.kmsId;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceAssociations setRdsInstanceId(String rdsInstanceId) {
            this.rdsInstanceId = rdsInstanceId;
            return this;
        }
        public String getRdsInstanceId() {
            return this.rdsInstanceId;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceAssociations setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceAssociations setResourceMode(String resourceMode) {
            this.resourceMode = resourceMode;
            return this;
        }
        public String getResourceMode() {
            return this.resourceMode;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceAssociations setResourceOrderId(String resourceOrderId) {
            this.resourceOrderId = resourceOrderId;
            return this;
        }
        public String getResourceOrderId() {
            return this.resourceOrderId;
        }

    }

    public static class DescribeDbClusterResponseBodyDataDbClusterResourceSpec extends TeaModel {
        @NameInMap("ComputeResource")
        public String computeResource;

        @NameInMap("DbNodeClass")
        public String dbNodeClass;

        @NameInMap("DbNodeCount")
        public Integer dbNodeCount;

        @NameInMap("DbNodeStorage")
        public Integer dbNodeStorage;

        @NameInMap("DbNodeStorageType")
        public String dbNodeStorageType;

        @NameInMap("ElasticIOResource")
        public Integer elasticIOResource;

        @NameInMap("ElasticIOResourceSize")
        public String elasticIOResourceSize;

        @NameInMap("ExecutorCount")
        public Integer executorCount;

        @NameInMap("ReserveAcu")
        public String reserveAcu;

        @NameInMap("ReservedNodeReplicaCount")
        public Integer reservedNodeReplicaCount;

        @NameInMap("ReservedNodeSizeAcu")
        public Integer reservedNodeSizeAcu;

        @NameInMap("StorageResource")
        public String storageResource;

        public static DescribeDbClusterResponseBodyDataDbClusterResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterResponseBodyDataDbClusterResourceSpec self = new DescribeDbClusterResponseBodyDataDbClusterResourceSpec();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec setDbNodeClass(String dbNodeClass) {
            this.dbNodeClass = dbNodeClass;
            return this;
        }
        public String getDbNodeClass() {
            return this.dbNodeClass;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec setDbNodeCount(Integer dbNodeCount) {
            this.dbNodeCount = dbNodeCount;
            return this;
        }
        public Integer getDbNodeCount() {
            return this.dbNodeCount;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec setDbNodeStorage(Integer dbNodeStorage) {
            this.dbNodeStorage = dbNodeStorage;
            return this;
        }
        public Integer getDbNodeStorage() {
            return this.dbNodeStorage;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec setDbNodeStorageType(String dbNodeStorageType) {
            this.dbNodeStorageType = dbNodeStorageType;
            return this;
        }
        public String getDbNodeStorageType() {
            return this.dbNodeStorageType;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec setElasticIOResource(Integer elasticIOResource) {
            this.elasticIOResource = elasticIOResource;
            return this;
        }
        public Integer getElasticIOResource() {
            return this.elasticIOResource;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec setElasticIOResourceSize(String elasticIOResourceSize) {
            this.elasticIOResourceSize = elasticIOResourceSize;
            return this;
        }
        public String getElasticIOResourceSize() {
            return this.elasticIOResourceSize;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec setExecutorCount(Integer executorCount) {
            this.executorCount = executorCount;
            return this;
        }
        public Integer getExecutorCount() {
            return this.executorCount;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec setReserveAcu(String reserveAcu) {
            this.reserveAcu = reserveAcu;
            return this;
        }
        public String getReserveAcu() {
            return this.reserveAcu;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec setReservedNodeReplicaCount(Integer reservedNodeReplicaCount) {
            this.reservedNodeReplicaCount = reservedNodeReplicaCount;
            return this;
        }
        public Integer getReservedNodeReplicaCount() {
            return this.reservedNodeReplicaCount;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec setReservedNodeSizeAcu(Integer reservedNodeSizeAcu) {
            this.reservedNodeSizeAcu = reservedNodeSizeAcu;
            return this;
        }
        public Integer getReservedNodeSizeAcu() {
            return this.reservedNodeSizeAcu;
        }

        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec setStorageResource(String storageResource) {
            this.storageResource = storageResource;
            return this;
        }
        public String getStorageResource() {
            return this.storageResource;
        }

    }

    public static class DescribeDbClusterResponseBodyDataDbClusterUser extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("Bid")
        public String bid;

        @NameInMap("CustomerLevel")
        public String customerLevel;

        @NameInMap("CustomerName")
        public String customerName;

        @NameInMap("IsEnterpriseCustomer")
        public Boolean isEnterpriseCustomer;

        @NameInMap("IsInnerCustomer")
        public Boolean isInnerCustomer;

        @NameInMap("IsTestCluster")
        public Boolean isTestCluster;

        public static DescribeDbClusterResponseBodyDataDbClusterUser build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterResponseBodyDataDbClusterUser self = new DescribeDbClusterResponseBodyDataDbClusterUser();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterResponseBodyDataDbClusterUser setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeDbClusterResponseBodyDataDbClusterUser setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeDbClusterResponseBodyDataDbClusterUser setCustomerLevel(String customerLevel) {
            this.customerLevel = customerLevel;
            return this;
        }
        public String getCustomerLevel() {
            return this.customerLevel;
        }

        public DescribeDbClusterResponseBodyDataDbClusterUser setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public DescribeDbClusterResponseBodyDataDbClusterUser setIsEnterpriseCustomer(Boolean isEnterpriseCustomer) {
            this.isEnterpriseCustomer = isEnterpriseCustomer;
            return this;
        }
        public Boolean getIsEnterpriseCustomer() {
            return this.isEnterpriseCustomer;
        }

        public DescribeDbClusterResponseBodyDataDbClusterUser setIsInnerCustomer(Boolean isInnerCustomer) {
            this.isInnerCustomer = isInnerCustomer;
            return this;
        }
        public Boolean getIsInnerCustomer() {
            return this.isInnerCustomer;
        }

        public DescribeDbClusterResponseBodyDataDbClusterUser setIsTestCluster(Boolean isTestCluster) {
            this.isTestCluster = isTestCluster;
            return this;
        }
        public Boolean getIsTestCluster() {
            return this.isTestCluster;
        }

    }

    public static class DescribeDbClusterResponseBodyDataDbCluster extends TeaModel {
        @NameInMap("AdminRemark")
        public String adminRemark;

        @NameInMap("BillingDetails")
        public DescribeDbClusterResponseBodyDataDbClusterBillingDetails billingDetails;

        @NameInMap("Category")
        public String category;

        @NameInMap("DbClusterDescription")
        public String dbClusterDescription;

        @NameInMap("DbClusterId")
        public String dbClusterId;

        @NameInMap("DbClusterStatus")
        public String dbClusterStatus;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("DbVersion")
        public String dbVersion;

        @NameInMap("DeprecatedProperties")
        public DescribeDbClusterResponseBodyDataDbClusterDeprecatedProperties deprecatedProperties;

        @NameInMap("Location")
        public DescribeDbClusterResponseBodyDataDbClusterLocation location;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Network")
        public DescribeDbClusterResponseBodyDataDbClusterNetwork network;

        @NameInMap("OperationalStatus")
        public DescribeDbClusterResponseBodyDataDbClusterOperationalStatus operationalStatus;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProductForm")
        public String productForm;

        @NameInMap("ResourceAssociations")
        public DescribeDbClusterResponseBodyDataDbClusterResourceAssociations resourceAssociations;

        @NameInMap("ResourceSpec")
        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec resourceSpec;

        @NameInMap("User")
        public DescribeDbClusterResponseBodyDataDbClusterUser user;

        public static DescribeDbClusterResponseBodyDataDbCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterResponseBodyDataDbCluster self = new DescribeDbClusterResponseBodyDataDbCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterResponseBodyDataDbCluster setAdminRemark(String adminRemark) {
            this.adminRemark = adminRemark;
            return this;
        }
        public String getAdminRemark() {
            return this.adminRemark;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setBillingDetails(DescribeDbClusterResponseBodyDataDbClusterBillingDetails billingDetails) {
            this.billingDetails = billingDetails;
            return this;
        }
        public DescribeDbClusterResponseBodyDataDbClusterBillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setDbClusterDescription(String dbClusterDescription) {
            this.dbClusterDescription = dbClusterDescription;
            return this;
        }
        public String getDbClusterDescription() {
            return this.dbClusterDescription;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setDbClusterStatus(String dbClusterStatus) {
            this.dbClusterStatus = dbClusterStatus;
            return this;
        }
        public String getDbClusterStatus() {
            return this.dbClusterStatus;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setDbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public String getDbVersion() {
            return this.dbVersion;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setDeprecatedProperties(DescribeDbClusterResponseBodyDataDbClusterDeprecatedProperties deprecatedProperties) {
            this.deprecatedProperties = deprecatedProperties;
            return this;
        }
        public DescribeDbClusterResponseBodyDataDbClusterDeprecatedProperties getDeprecatedProperties() {
            return this.deprecatedProperties;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setLocation(DescribeDbClusterResponseBodyDataDbClusterLocation location) {
            this.location = location;
            return this;
        }
        public DescribeDbClusterResponseBodyDataDbClusterLocation getLocation() {
            return this.location;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setNetwork(DescribeDbClusterResponseBodyDataDbClusterNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeDbClusterResponseBodyDataDbClusterNetwork getNetwork() {
            return this.network;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setOperationalStatus(DescribeDbClusterResponseBodyDataDbClusterOperationalStatus operationalStatus) {
            this.operationalStatus = operationalStatus;
            return this;
        }
        public DescribeDbClusterResponseBodyDataDbClusterOperationalStatus getOperationalStatus() {
            return this.operationalStatus;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setProductForm(String productForm) {
            this.productForm = productForm;
            return this;
        }
        public String getProductForm() {
            return this.productForm;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setResourceAssociations(DescribeDbClusterResponseBodyDataDbClusterResourceAssociations resourceAssociations) {
            this.resourceAssociations = resourceAssociations;
            return this;
        }
        public DescribeDbClusterResponseBodyDataDbClusterResourceAssociations getResourceAssociations() {
            return this.resourceAssociations;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setResourceSpec(DescribeDbClusterResponseBodyDataDbClusterResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public DescribeDbClusterResponseBodyDataDbClusterResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public DescribeDbClusterResponseBodyDataDbCluster setUser(DescribeDbClusterResponseBodyDataDbClusterUser user) {
            this.user = user;
            return this;
        }
        public DescribeDbClusterResponseBodyDataDbClusterUser getUser() {
            return this.user;
        }

    }

    public static class DescribeDbClusterResponseBodyData extends TeaModel {
        @NameInMap("dbCluster")
        public DescribeDbClusterResponseBodyDataDbCluster dbCluster;

        public static DescribeDbClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterResponseBodyData self = new DescribeDbClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterResponseBodyData setDbCluster(DescribeDbClusterResponseBodyDataDbCluster dbCluster) {
            this.dbCluster = dbCluster;
            return this;
        }
        public DescribeDbClusterResponseBodyDataDbCluster getDbCluster() {
            return this.dbCluster;
        }

    }

}
