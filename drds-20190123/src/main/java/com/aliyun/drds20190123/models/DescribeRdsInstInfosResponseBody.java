// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsInstInfosResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeRdsInstInfosResponseBodyItems items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRdsInstInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsInstInfosResponseBody self = new DescribeRdsInstInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsInstInfosResponseBody setItems(DescribeRdsInstInfosResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeRdsInstInfosResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeRdsInstInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRdsInstInfosResponseBodyItemsDBInstanceReadOnlyDBInstanceId extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        public java.util.List<String> readOnlyDBInstanceId;

        public static DescribeRdsInstInfosResponseBodyItemsDBInstanceReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsInstInfosResponseBodyItemsDBInstanceReadOnlyDBInstanceId self = new DescribeRdsInstInfosResponseBodyItemsDBInstanceReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

        public DescribeRdsInstInfosResponseBodyItemsDBInstanceReadOnlyDBInstanceId setReadOnlyDBInstanceId(java.util.List<String> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<String> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeRdsInstInfosResponseBodyItemsDBInstance extends TeaModel {
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceStatus")
        public Integer DBInstanceStatus;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        @NameInMap("ReadOnlyDBInstanceId")
        public DescribeRdsInstInfosResponseBodyItemsDBInstanceReadOnlyDBInstanceId readOnlyDBInstanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRdsInstInfosResponseBodyItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsInstInfosResponseBodyItemsDBInstance self = new DescribeRdsInstInfosResponseBodyItemsDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeRdsInstInfosResponseBodyItemsDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeRdsInstInfosResponseBodyItemsDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeRdsInstInfosResponseBodyItemsDBInstance setDBInstanceStatus(Integer DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public Integer getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeRdsInstInfosResponseBodyItemsDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeRdsInstInfosResponseBodyItemsDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeRdsInstInfosResponseBodyItemsDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeRdsInstInfosResponseBodyItemsDBInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeRdsInstInfosResponseBodyItemsDBInstance setReadOnlyDBInstanceId(DescribeRdsInstInfosResponseBodyItemsDBInstanceReadOnlyDBInstanceId readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public DescribeRdsInstInfosResponseBodyItemsDBInstanceReadOnlyDBInstanceId getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

        public DescribeRdsInstInfosResponseBodyItemsDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRdsInstInfosResponseBodyItemsDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeRdsInstInfosResponseBodyItems extends TeaModel {
        @NameInMap("DBInstance")
        public java.util.List<DescribeRdsInstInfosResponseBodyItemsDBInstance> DBInstance;

        public static DescribeRdsInstInfosResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsInstInfosResponseBodyItems self = new DescribeRdsInstInfosResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeRdsInstInfosResponseBodyItems setDBInstance(java.util.List<DescribeRdsInstInfosResponseBodyItemsDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeRdsInstInfosResponseBodyItemsDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
