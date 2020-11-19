// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDbInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDbInstancesResponseItems items;

    public static DescribeDbInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbInstancesResponse self = new DescribeDbInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDbInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDbInstancesResponse setItems(DescribeDbInstancesResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeDbInstancesResponseItems getItems() {
        return this.items;
    }

    public static class DescribeDbInstancesResponseItemsDBInstanceReadOnlyDBInstanceId extends TeaModel {
        // ReadOnlyDBInstanceId
        @NameInMap("ReadOnlyDBInstanceId")
        @Validation(required = true)
        public java.util.List<String> readOnlyDBInstanceId;

        public static DescribeDbInstancesResponseItemsDBInstanceReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbInstancesResponseItemsDBInstanceReadOnlyDBInstanceId self = new DescribeDbInstancesResponseItemsDBInstanceReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

        public DescribeDbInstancesResponseItemsDBInstanceReadOnlyDBInstanceId setReadOnlyDBInstanceId(java.util.List<String> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<String> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDbInstancesResponseItemsDBInstance extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("DBInstanceStatus")
        @Validation(required = true)
        public Integer DBInstanceStatus;

        @NameInMap("DBInstanceType")
        @Validation(required = true)
        public String DBInstanceType;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("DBInstanceDescription")
        @Validation(required = true)
        public String DBInstanceDescription;

        @NameInMap("InstanceNetworkType")
        @Validation(required = true)
        public String instanceNetworkType;

        @NameInMap("ReadOnlyDBInstanceId")
        @Validation(required = true)
        public DescribeDbInstancesResponseItemsDBInstanceReadOnlyDBInstanceId readOnlyDBInstanceId;

        public static DescribeDbInstancesResponseItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbInstancesResponseItemsDBInstance self = new DescribeDbInstancesResponseItemsDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDbInstancesResponseItemsDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDbInstancesResponseItemsDBInstance setDBInstanceStatus(Integer DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public Integer getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDbInstancesResponseItemsDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDbInstancesResponseItemsDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDbInstancesResponseItemsDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDbInstancesResponseItemsDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDbInstancesResponseItemsDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDbInstancesResponseItemsDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDbInstancesResponseItemsDBInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDbInstancesResponseItemsDBInstance setReadOnlyDBInstanceId(DescribeDbInstancesResponseItemsDBInstanceReadOnlyDBInstanceId readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public DescribeDbInstancesResponseItemsDBInstanceReadOnlyDBInstanceId getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDbInstancesResponseItems extends TeaModel {
        @NameInMap("DBInstance")
        @Validation(required = true)
        public java.util.List<DescribeDbInstancesResponseItemsDBInstance> DBInstance;

        public static DescribeDbInstancesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbInstancesResponseItems self = new DescribeDbInstancesResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeDbInstancesResponseItems setDBInstance(java.util.List<DescribeDbInstancesResponseItemsDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeDbInstancesResponseItemsDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
