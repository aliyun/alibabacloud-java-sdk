// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeDbClusterV5ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public DescribeDbClusterV5ResponseBodyData data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("resultCode")
    public String resultCode;

    @NameInMap("success")
    public Boolean success;

    public static DescribeDbClusterV5ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbClusterV5ResponseBody self = new DescribeDbClusterV5ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDbClusterV5ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDbClusterV5ResponseBody setData(DescribeDbClusterV5ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDbClusterV5ResponseBodyData getData() {
        return this.data;
    }

    public DescribeDbClusterV5ResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDbClusterV5ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDbClusterV5ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeDbClusterV5ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDbClusterV5ResponseBodyDataDbClusterBillingDetails extends TeaModel {
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

        public static DescribeDbClusterV5ResponseBodyDataDbClusterBillingDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterV5ResponseBodyDataDbClusterBillingDetails self = new DescribeDbClusterV5ResponseBodyDataDbClusterBillingDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterBillingDetails setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterBillingDetails setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterBillingDetails setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterBillingDetails setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterBillingDetails setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

    public static class DescribeDbClusterV5ResponseBodyDataDbClusterDeprecatedProperties extends TeaModel {
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

        public static DescribeDbClusterV5ResponseBodyDataDbClusterDeprecatedProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterV5ResponseBodyDataDbClusterDeprecatedProperties self = new DescribeDbClusterV5ResponseBodyDataDbClusterDeprecatedProperties();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterDeprecatedProperties setDbClusterType(String dbClusterType) {
            this.dbClusterType = dbClusterType;
            return this;
        }
        public String getDbClusterType() {
            return this.dbClusterType;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterDeprecatedProperties setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterDeprecatedProperties setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterDeprecatedProperties setInstanceClassGroup(String instanceClassGroup) {
            this.instanceClassGroup = instanceClassGroup;
            return this;
        }
        public String getInstanceClassGroup() {
            return this.instanceClassGroup;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterDeprecatedProperties setStorageCategory(String storageCategory) {
            this.storageCategory = storageCategory;
            return this;
        }
        public String getStorageCategory() {
            return this.storageCategory;
        }

    }

    public static class DescribeDbClusterV5ResponseBodyDataDbClusterLocation extends TeaModel {
        @NameInMap("RegionCode")
        public String regionCode;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SubDomain")
        public String subDomain;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDbClusterV5ResponseBodyDataDbClusterLocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterV5ResponseBodyDataDbClusterLocation self = new DescribeDbClusterV5ResponseBodyDataDbClusterLocation();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterLocation setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterLocation setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterLocation setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterLocation setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDbClusterV5ResponseBodyDataDbClusterNetwork extends TeaModel {
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

        public static DescribeDbClusterV5ResponseBodyDataDbClusterNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterV5ResponseBodyDataDbClusterNetwork self = new DescribeDbClusterV5ResponseBodyDataDbClusterNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterNetwork setCloudInstanceIp(String cloudInstanceIp) {
            this.cloudInstanceIp = cloudInstanceIp;
            return this;
        }
        public String getCloudInstanceIp() {
            return this.cloudInstanceIp;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterNetwork setClusterNetworkType(String clusterNetworkType) {
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }
        public String getClusterNetworkType() {
            return this.clusterNetworkType;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterNetwork setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterNetwork setDbClusterNetType(String dbClusterNetType) {
            this.dbClusterNetType = dbClusterNetType;
            return this;
        }
        public String getDbClusterNetType() {
            return this.dbClusterNetType;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterNetwork setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterNetwork setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public String getTunnelId() {
            return this.tunnelId;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterNetwork setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterNetwork setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeDbClusterV5ResponseBodyDataDbClusterOperationalStatus extends TeaModel {
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

        public static DescribeDbClusterV5ResponseBodyDataDbClusterOperationalStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterV5ResponseBodyDataDbClusterOperationalStatus self = new DescribeDbClusterV5ResponseBodyDataDbClusterOperationalStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterOperationalStatus setFullEngineVersion(String fullEngineVersion) {
            this.fullEngineVersion = fullEngineVersion;
            return this;
        }
        public String getFullEngineVersion() {
            return this.fullEngineVersion;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterOperationalStatus setIsNonStandard(Boolean isNonStandard) {
            this.isNonStandard = isNonStandard;
            return this;
        }
        public Boolean getIsNonStandard() {
            return this.isNonStandard;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterOperationalStatus setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterOperationalStatus setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterOperationalStatus setSampleDatasetStatus(String sampleDatasetStatus) {
            this.sampleDatasetStatus = sampleDatasetStatus;
            return this;
        }
        public String getSampleDatasetStatus() {
            return this.sampleDatasetStatus;
        }

    }

    public static class DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations extends TeaModel {
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

        public static DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations self = new DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations setDbLogicId(Integer dbLogicId) {
            this.dbLogicId = dbLogicId;
            return this;
        }
        public Integer getDbLogicId() {
            return this.dbLogicId;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations setKmsId(String kmsId) {
            this.kmsId = kmsId;
            return this;
        }
        public String getKmsId() {
            return this.kmsId;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations setRdsInstanceId(String rdsInstanceId) {
            this.rdsInstanceId = rdsInstanceId;
            return this;
        }
        public String getRdsInstanceId() {
            return this.rdsInstanceId;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations setResourceMode(String resourceMode) {
            this.resourceMode = resourceMode;
            return this;
        }
        public String getResourceMode() {
            return this.resourceMode;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations setResourceOrderId(String resourceOrderId) {
            this.resourceOrderId = resourceOrderId;
            return this;
        }
        public String getResourceOrderId() {
            return this.resourceOrderId;
        }

    }

    public static class DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec extends TeaModel {
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

        public static DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec self = new DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec setDbNodeClass(String dbNodeClass) {
            this.dbNodeClass = dbNodeClass;
            return this;
        }
        public String getDbNodeClass() {
            return this.dbNodeClass;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec setDbNodeCount(Integer dbNodeCount) {
            this.dbNodeCount = dbNodeCount;
            return this;
        }
        public Integer getDbNodeCount() {
            return this.dbNodeCount;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec setDbNodeStorage(Integer dbNodeStorage) {
            this.dbNodeStorage = dbNodeStorage;
            return this;
        }
        public Integer getDbNodeStorage() {
            return this.dbNodeStorage;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec setDbNodeStorageType(String dbNodeStorageType) {
            this.dbNodeStorageType = dbNodeStorageType;
            return this;
        }
        public String getDbNodeStorageType() {
            return this.dbNodeStorageType;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec setElasticIOResource(Integer elasticIOResource) {
            this.elasticIOResource = elasticIOResource;
            return this;
        }
        public Integer getElasticIOResource() {
            return this.elasticIOResource;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec setElasticIOResourceSize(String elasticIOResourceSize) {
            this.elasticIOResourceSize = elasticIOResourceSize;
            return this;
        }
        public String getElasticIOResourceSize() {
            return this.elasticIOResourceSize;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec setExecutorCount(Integer executorCount) {
            this.executorCount = executorCount;
            return this;
        }
        public Integer getExecutorCount() {
            return this.executorCount;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec setReserveAcu(String reserveAcu) {
            this.reserveAcu = reserveAcu;
            return this;
        }
        public String getReserveAcu() {
            return this.reserveAcu;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec setReservedNodeReplicaCount(Integer reservedNodeReplicaCount) {
            this.reservedNodeReplicaCount = reservedNodeReplicaCount;
            return this;
        }
        public Integer getReservedNodeReplicaCount() {
            return this.reservedNodeReplicaCount;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec setReservedNodeSizeAcu(Integer reservedNodeSizeAcu) {
            this.reservedNodeSizeAcu = reservedNodeSizeAcu;
            return this;
        }
        public Integer getReservedNodeSizeAcu() {
            return this.reservedNodeSizeAcu;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec setStorageResource(String storageResource) {
            this.storageResource = storageResource;
            return this;
        }
        public String getStorageResource() {
            return this.storageResource;
        }

    }

    public static class DescribeDbClusterV5ResponseBodyDataDbClusterUser extends TeaModel {
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

        public static DescribeDbClusterV5ResponseBodyDataDbClusterUser build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterV5ResponseBodyDataDbClusterUser self = new DescribeDbClusterV5ResponseBodyDataDbClusterUser();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterUser setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterUser setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterUser setCustomerLevel(String customerLevel) {
            this.customerLevel = customerLevel;
            return this;
        }
        public String getCustomerLevel() {
            return this.customerLevel;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterUser setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterUser setIsEnterpriseCustomer(Boolean isEnterpriseCustomer) {
            this.isEnterpriseCustomer = isEnterpriseCustomer;
            return this;
        }
        public Boolean getIsEnterpriseCustomer() {
            return this.isEnterpriseCustomer;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterUser setIsInnerCustomer(Boolean isInnerCustomer) {
            this.isInnerCustomer = isInnerCustomer;
            return this;
        }
        public Boolean getIsInnerCustomer() {
            return this.isInnerCustomer;
        }

        public DescribeDbClusterV5ResponseBodyDataDbClusterUser setIsTestCluster(Boolean isTestCluster) {
            this.isTestCluster = isTestCluster;
            return this;
        }
        public Boolean getIsTestCluster() {
            return this.isTestCluster;
        }

    }

    public static class DescribeDbClusterV5ResponseBodyDataDbCluster extends TeaModel {
        @NameInMap("AdminRemark")
        public String adminRemark;

        @NameInMap("BillingDetails")
        public DescribeDbClusterV5ResponseBodyDataDbClusterBillingDetails billingDetails;

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
        public DescribeDbClusterV5ResponseBodyDataDbClusterDeprecatedProperties deprecatedProperties;

        @NameInMap("Location")
        public DescribeDbClusterV5ResponseBodyDataDbClusterLocation location;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Network")
        public DescribeDbClusterV5ResponseBodyDataDbClusterNetwork network;

        @NameInMap("OperationalStatus")
        public DescribeDbClusterV5ResponseBodyDataDbClusterOperationalStatus operationalStatus;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProductForm")
        public String productForm;

        @NameInMap("ResourceAssociations")
        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations resourceAssociations;

        @NameInMap("ResourceSpec")
        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec resourceSpec;

        @NameInMap("User")
        public DescribeDbClusterV5ResponseBodyDataDbClusterUser user;

        public static DescribeDbClusterV5ResponseBodyDataDbCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterV5ResponseBodyDataDbCluster self = new DescribeDbClusterV5ResponseBodyDataDbCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setAdminRemark(String adminRemark) {
            this.adminRemark = adminRemark;
            return this;
        }
        public String getAdminRemark() {
            return this.adminRemark;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setBillingDetails(DescribeDbClusterV5ResponseBodyDataDbClusterBillingDetails billingDetails) {
            this.billingDetails = billingDetails;
            return this;
        }
        public DescribeDbClusterV5ResponseBodyDataDbClusterBillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setDbClusterDescription(String dbClusterDescription) {
            this.dbClusterDescription = dbClusterDescription;
            return this;
        }
        public String getDbClusterDescription() {
            return this.dbClusterDescription;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setDbClusterStatus(String dbClusterStatus) {
            this.dbClusterStatus = dbClusterStatus;
            return this;
        }
        public String getDbClusterStatus() {
            return this.dbClusterStatus;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setDbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public String getDbVersion() {
            return this.dbVersion;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setDeprecatedProperties(DescribeDbClusterV5ResponseBodyDataDbClusterDeprecatedProperties deprecatedProperties) {
            this.deprecatedProperties = deprecatedProperties;
            return this;
        }
        public DescribeDbClusterV5ResponseBodyDataDbClusterDeprecatedProperties getDeprecatedProperties() {
            return this.deprecatedProperties;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setLocation(DescribeDbClusterV5ResponseBodyDataDbClusterLocation location) {
            this.location = location;
            return this;
        }
        public DescribeDbClusterV5ResponseBodyDataDbClusterLocation getLocation() {
            return this.location;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setNetwork(DescribeDbClusterV5ResponseBodyDataDbClusterNetwork network) {
            this.network = network;
            return this;
        }
        public DescribeDbClusterV5ResponseBodyDataDbClusterNetwork getNetwork() {
            return this.network;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setOperationalStatus(DescribeDbClusterV5ResponseBodyDataDbClusterOperationalStatus operationalStatus) {
            this.operationalStatus = operationalStatus;
            return this;
        }
        public DescribeDbClusterV5ResponseBodyDataDbClusterOperationalStatus getOperationalStatus() {
            return this.operationalStatus;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setProductForm(String productForm) {
            this.productForm = productForm;
            return this;
        }
        public String getProductForm() {
            return this.productForm;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setResourceAssociations(DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations resourceAssociations) {
            this.resourceAssociations = resourceAssociations;
            return this;
        }
        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceAssociations getResourceAssociations() {
            return this.resourceAssociations;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setResourceSpec(DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public DescribeDbClusterV5ResponseBodyDataDbClusterResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public DescribeDbClusterV5ResponseBodyDataDbCluster setUser(DescribeDbClusterV5ResponseBodyDataDbClusterUser user) {
            this.user = user;
            return this;
        }
        public DescribeDbClusterV5ResponseBodyDataDbClusterUser getUser() {
            return this.user;
        }

    }

    public static class DescribeDbClusterV5ResponseBodyData extends TeaModel {
        @NameInMap("dbCluster")
        public DescribeDbClusterV5ResponseBodyDataDbCluster dbCluster;

        public static DescribeDbClusterV5ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbClusterV5ResponseBodyData self = new DescribeDbClusterV5ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDbClusterV5ResponseBodyData setDbCluster(DescribeDbClusterV5ResponseBodyDataDbCluster dbCluster) {
            this.dbCluster = dbCluster;
            return this;
        }
        public DescribeDbClusterV5ResponseBodyDataDbCluster getDbCluster() {
            return this.dbCluster;
        }

    }

}
