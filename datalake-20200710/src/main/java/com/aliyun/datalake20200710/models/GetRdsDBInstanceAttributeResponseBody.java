// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetRdsDBInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("DBInstance")
    public GetRdsDBInstanceAttributeResponseBodyDBInstance DBInstance;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetRdsDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRdsDBInstanceAttributeResponseBody self = new GetRdsDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRdsDBInstanceAttributeResponseBody setDBInstance(GetRdsDBInstanceAttributeResponseBodyDBInstance DBInstance) {
        this.DBInstance = DBInstance;
        return this;
    }
    public GetRdsDBInstanceAttributeResponseBodyDBInstance getDBInstance() {
        return this.DBInstance;
    }

    public GetRdsDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRdsDBInstanceAttributeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetRdsDBInstanceAttributeResponseBodyDBInstance extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

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

        @NameInMap("Port")
        public String port;

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

        public static GetRdsDBInstanceAttributeResponseBodyDBInstance build(java.util.Map<String, ?> map) throws Exception {
            GetRdsDBInstanceAttributeResponseBodyDBInstance self = new GetRdsDBInstanceAttributeResponseBodyDBInstance();
            return TeaModel.build(map, self);
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetRdsDBInstanceAttributeResponseBodyDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
