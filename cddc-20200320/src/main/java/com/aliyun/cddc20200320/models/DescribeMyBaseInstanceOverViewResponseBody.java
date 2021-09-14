// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeMyBaseInstanceOverViewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Regions")
    public DescribeMyBaseInstanceOverViewResponseBodyRegions regions;

    public static DescribeMyBaseInstanceOverViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMyBaseInstanceOverViewResponseBody self = new DescribeMyBaseInstanceOverViewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMyBaseInstanceOverViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMyBaseInstanceOverViewResponseBody setRegions(DescribeMyBaseInstanceOverViewResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeMyBaseInstanceOverViewResponseBodyRegions getRegions() {
        return this.regions;
    }

    public static class DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel extends TeaModel {
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("CreatedTime")
        public String createdTime;

        public static DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel self = new DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel();
            return TeaModel.build(map, self);
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

    }

    public static class DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModels extends TeaModel {
        @NameInMap("InstanceModel")
        public java.util.List<DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel> instanceModel;

        public static DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModels self = new DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModels();
            return TeaModel.build(map, self);
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModels setInstanceModel(java.util.List<DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel> instanceModel) {
            this.instanceModel = instanceModel;
            return this;
        }
        public java.util.List<DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModelsInstanceModel> getInstanceModel() {
            return this.instanceModel;
        }

    }

    public static class DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("InstanceDateType")
        public String instanceDateType;

        @NameInMap("InstanceEngineCount")
        public String instanceEngineCount;

        @NameInMap("InstanceModels")
        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModels instanceModels;

        public static DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel self = new DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel();
            return TeaModel.build(map, self);
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel setInstanceDateType(String instanceDateType) {
            this.instanceDateType = instanceDateType;
            return this;
        }
        public String getInstanceDateType() {
            return this.instanceDateType;
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel setInstanceEngineCount(String instanceEngineCount) {
            this.instanceEngineCount = instanceEngineCount;
            return this;
        }
        public String getInstanceEngineCount() {
            return this.instanceEngineCount;
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel setInstanceModels(DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModels instanceModels) {
            this.instanceModels = instanceModels;
            return this;
        }
        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModelInstanceModels getInstanceModels() {
            return this.instanceModels;
        }

    }

    public static class DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModels extends TeaModel {
        @NameInMap("TypeModel")
        public java.util.List<DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel> typeModel;

        public static DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModels self = new DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModels();
            return TeaModel.build(map, self);
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModels setTypeModel(java.util.List<DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel> typeModel) {
            this.typeModel = typeModel;
            return this;
        }
        public java.util.List<DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModelsTypeModel> getTypeModel() {
            return this.typeModel;
        }

    }

    public static class DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModel extends TeaModel {
        @NameInMap("EngineCount")
        public String engineCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Region")
        public String region;

        @NameInMap("TypeModels")
        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModels typeModels;

        public static DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModel self = new DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModel();
            return TeaModel.build(map, self);
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModel setEngineCount(String engineCount) {
            this.engineCount = engineCount;
            return this;
        }
        public String getEngineCount() {
            return this.engineCount;
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModel setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModel setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModel setTypeModels(DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModels typeModels) {
            this.typeModels = typeModels;
            return this;
        }
        public DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModelTypeModels getTypeModels() {
            return this.typeModels;
        }

    }

    public static class DescribeMyBaseInstanceOverViewResponseBodyRegions extends TeaModel {
        @NameInMap("RegionModel")
        public java.util.List<DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModel> regionModel;

        public static DescribeMyBaseInstanceOverViewResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeMyBaseInstanceOverViewResponseBodyRegions self = new DescribeMyBaseInstanceOverViewResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeMyBaseInstanceOverViewResponseBodyRegions setRegionModel(java.util.List<DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModel> regionModel) {
            this.regionModel = regionModel;
            return this;
        }
        public java.util.List<DescribeMyBaseInstanceOverViewResponseBodyRegionsRegionModel> getRegionModel() {
            return this.regionModel;
        }

    }

}
