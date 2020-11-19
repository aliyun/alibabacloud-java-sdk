// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsInstInfosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeRdsInstInfosResponseItems items;

    public static DescribeRdsInstInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsInstInfosResponse self = new DescribeRdsInstInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsInstInfosResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsInstInfosResponse setItems(DescribeRdsInstInfosResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeRdsInstInfosResponseItems getItems() {
        return this.items;
    }

    public static class DescribeRdsInstInfosResponseItemsDBInstanceReadOnlyDBInstanceId extends TeaModel {
        // ReadOnlyDBInstanceId
        @NameInMap("ReadOnlyDBInstanceId")
        @Validation(required = true)
        public java.util.List<String> readOnlyDBInstanceId;

        public static DescribeRdsInstInfosResponseItemsDBInstanceReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsInstInfosResponseItemsDBInstanceReadOnlyDBInstanceId self = new DescribeRdsInstInfosResponseItemsDBInstanceReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

        public DescribeRdsInstInfosResponseItemsDBInstanceReadOnlyDBInstanceId setReadOnlyDBInstanceId(java.util.List<String> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<String> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeRdsInstInfosResponseItemsDBInstance extends TeaModel {
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
        public DescribeRdsInstInfosResponseItemsDBInstanceReadOnlyDBInstanceId readOnlyDBInstanceId;

        public static DescribeRdsInstInfosResponseItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsInstInfosResponseItemsDBInstance self = new DescribeRdsInstInfosResponseItemsDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeRdsInstInfosResponseItemsDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeRdsInstInfosResponseItemsDBInstance setDBInstanceStatus(Integer DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public Integer getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeRdsInstInfosResponseItemsDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeRdsInstInfosResponseItemsDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeRdsInstInfosResponseItemsDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeRdsInstInfosResponseItemsDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRdsInstInfosResponseItemsDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeRdsInstInfosResponseItemsDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeRdsInstInfosResponseItemsDBInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeRdsInstInfosResponseItemsDBInstance setReadOnlyDBInstanceId(DescribeRdsInstInfosResponseItemsDBInstanceReadOnlyDBInstanceId readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public DescribeRdsInstInfosResponseItemsDBInstanceReadOnlyDBInstanceId getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeRdsInstInfosResponseItems extends TeaModel {
        @NameInMap("DBInstance")
        @Validation(required = true)
        public java.util.List<DescribeRdsInstInfosResponseItemsDBInstance> DBInstance;

        public static DescribeRdsInstInfosResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsInstInfosResponseItems self = new DescribeRdsInstInfosResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeRdsInstInfosResponseItems setDBInstance(java.util.List<DescribeRdsInstInfosResponseItemsDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeRdsInstInfosResponseItemsDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
