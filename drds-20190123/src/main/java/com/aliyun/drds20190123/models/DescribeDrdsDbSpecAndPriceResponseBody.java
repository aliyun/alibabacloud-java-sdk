// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbSpecAndPriceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDrdsDbSpecAndPriceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDrdsDbSpecAndPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbSpecAndPriceResponseBody self = new DescribeDrdsDbSpecAndPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbSpecAndPriceResponseBody setData(DescribeDrdsDbSpecAndPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsDbSpecAndPriceResponseBodyData getData() {
        return this.data;
    }

    public DescribeDrdsDbSpecAndPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsDbPrice extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsDbPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsDbPrice self = new DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsDbPrice();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsDbPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsDbPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsDbPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsDbPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance extends TeaModel {
        @NameInMap("DrdsInstanceId")
        public String drdsInstanceId;

        @NameInMap("InstRole")
        public String instRole;

        @NameInMap("InstanceSeries")
        public String instanceSeries;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        @NameInMap("MachineType")
        public String machineType;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("ProtocolType")
        public Integer protocolType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("VersionAction")
        public String versionAction;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance self = new DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setDrdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setInstRole(String instRole) {
            this.instRole = instRole;
            return this;
        }
        public String getInstRole() {
            return this.instRole;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setInstanceSeries(String instanceSeries) {
            this.instanceSeries = instanceSeries;
            return this;
        }
        public String getInstanceSeries() {
            return this.instanceSeries;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setProtocolType(Integer protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public Integer getProtocolType() {
            return this.protocolType;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setVersionAction(String versionAction) {
            this.versionAction = versionAction;
            return this;
        }
        public String getVersionAction() {
            return this.versionAction;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice extends TeaModel {
        @NameInMap("Coupons")
        public String coupons;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("RuleIds")
        public java.util.List<String> ruleIds;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice self = new DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice setCoupons(String coupons) {
            this.coupons = coupons;
            return this;
        }
        public String getCoupons() {
            return this.coupons;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice setRuleIds(java.util.List<String> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public java.util.List<String> getRuleIds() {
            return this.ruleIds;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance extends TeaModel {
        @NameInMap("ConnectUrl")
        public String connectUrl;

        @NameInMap("DBInstType")
        public String DBInstType;

        @NameInMap("DBInstanceCPU")
        public String DBInstanceCPU;

        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        @NameInMap("DBInstanceClassType")
        public String DBInstanceClassType;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceMemory")
        public Integer DBInstanceMemory;

        @NameInMap("DBInstanceStatus")
        public Integer DBInstanceStatus;

        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RDSInstType")
        public String RDSInstType;

        @NameInMap("ReadWeight")
        public Integer readWeight;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RemainDays")
        public Integer remainDays;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance self = new DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setDBInstType(String DBInstType) {
            this.DBInstType = DBInstType;
            return this;
        }
        public String getDBInstType() {
            return this.DBInstType;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setDBInstanceCPU(String DBInstanceCPU) {
            this.DBInstanceCPU = DBInstanceCPU;
            return this;
        }
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setDBInstanceClassType(String DBInstanceClassType) {
            this.DBInstanceClassType = DBInstanceClassType;
            return this;
        }
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setDBInstanceMemory(Integer DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Integer getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setDBInstanceStatus(Integer DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public Integer getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setRDSInstType(String RDSInstType) {
            this.RDSInstType = RDSInstType;
            return this;
        }
        public String getRDSInstType() {
            return this.RDSInstType;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPrices extends TeaModel {
        @NameInMap("RdsPrice")
        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice rdsPrice;

        @NameInMap("StorageInstance")
        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance storageInstance;

        public static DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPrices build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPrices self = new DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPrices();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPrices setRdsPrice(DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice rdsPrice) {
            this.rdsPrice = rdsPrice;
            return this;
        }
        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesRdsPrice getRdsPrice() {
            return this.rdsPrice;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPrices setStorageInstance(DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance storageInstance) {
            this.storageInstance = storageInstance;
            return this;
        }
        public DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPricesStorageInstance getStorageInstance() {
            return this.storageInstance;
        }

    }

    public static class DescribeDrdsDbSpecAndPriceResponseBodyData extends TeaModel {
        @NameInMap("DrdsDbPrice")
        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsDbPrice drdsDbPrice;

        @NameInMap("DrdsInstance")
        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance drdsInstance;

        @NameInMap("RdsInstanceSpecsAndPrices")
        public java.util.List<DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPrices> rdsInstanceSpecsAndPrices;

        public static DescribeDrdsDbSpecAndPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbSpecAndPriceResponseBodyData self = new DescribeDrdsDbSpecAndPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyData setDrdsDbPrice(DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsDbPrice drdsDbPrice) {
            this.drdsDbPrice = drdsDbPrice;
            return this;
        }
        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsDbPrice getDrdsDbPrice() {
            return this.drdsDbPrice;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyData setDrdsInstance(DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance drdsInstance) {
            this.drdsInstance = drdsInstance;
            return this;
        }
        public DescribeDrdsDbSpecAndPriceResponseBodyDataDrdsInstance getDrdsInstance() {
            return this.drdsInstance;
        }

        public DescribeDrdsDbSpecAndPriceResponseBodyData setRdsInstanceSpecsAndPrices(java.util.List<DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPrices> rdsInstanceSpecsAndPrices) {
            this.rdsInstanceSpecsAndPrices = rdsInstanceSpecsAndPrices;
            return this;
        }
        public java.util.List<DescribeDrdsDbSpecAndPriceResponseBodyDataRdsInstanceSpecsAndPrices> getRdsInstanceSpecsAndPrices() {
            return this.rdsInstanceSpecsAndPrices;
        }

    }

}
