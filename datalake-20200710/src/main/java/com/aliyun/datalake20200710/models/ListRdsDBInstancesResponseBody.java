// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListRdsDBInstancesResponseBody extends TeaModel {
    @NameInMap("RdsInstances")
    public java.util.List<ListRdsDBInstancesResponseBodyRdsInstances> rdsInstances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRdsDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRdsDBInstancesResponseBody self = new ListRdsDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRdsDBInstancesResponseBody setRdsInstances(java.util.List<ListRdsDBInstancesResponseBodyRdsInstances> rdsInstances) {
        this.rdsInstances = rdsInstances;
        return this;
    }
    public java.util.List<ListRdsDBInstancesResponseBodyRdsInstances> getRdsInstances() {
        return this.rdsInstances;
    }

    public ListRdsDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRdsDBInstancesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListRdsDBInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRdsDBInstancesResponseBodyRdsInstances extends TeaModel {
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("MutriORsignle")
        public Boolean mutriORsignle;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListRdsDBInstancesResponseBodyRdsInstances build(java.util.Map<String, ?> map) throws Exception {
            ListRdsDBInstancesResponseBodyRdsInstances self = new ListRdsDBInstancesResponseBodyRdsInstances();
            return TeaModel.build(map, self);
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setMutriORsignle(Boolean mutriORsignle) {
            this.mutriORsignle = mutriORsignle;
            return this;
        }
        public Boolean getMutriORsignle() {
            return this.mutriORsignle;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListRdsDBInstancesResponseBodyRdsInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
