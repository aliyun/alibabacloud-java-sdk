// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDbInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the instance.</p>
     */
    @NameInMap("Items")
    public DescribeDbInstancesResponseBodyItems items;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>293275B3-8FC0-4619-A26E-6F062FASD56R</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDbInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbInstancesResponseBody self = new DescribeDbInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDbInstancesResponseBody setItems(DescribeDbInstancesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDbInstancesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDbInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDbInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceId extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        public java.util.List<String> readOnlyDBInstanceId;

        public static DescribeDbInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceId self = new DescribeDbInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

        public DescribeDbInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceId setReadOnlyDBInstanceId(java.util.List<String> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<String> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDbInstancesResponseBodyItemsDBInstance extends TeaModel {
        @NameInMap("AllowAllCategory")
        public Boolean allowAllCategory;

        /**
         * <p>The description of the storage instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The ID of the storage instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-****************</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>Storage layer instance status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: creating</li>
         * <li><strong>1</strong>: In use</li>
         * <li><strong>3</strong>: Deleting</li>
         * <li><strong>5</strong>: restarting</li>
         * <li><strong>6</strong>: upgrading /Downgrading</li>
         * <li><strong>7</strong>: Recovering</li>
         * <li><strong>8</strong>: switching the Internet and intranet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DBInstanceStatus")
        public Integer DBInstanceStatus;

        /**
         * <p>The storage layer instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The engine of the storage instance.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The version of the engine for the storage instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The network type of the storage layer. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: VPC</li>
         * <li>**CLASSIC **: Classic Network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        /**
         * <p>The details about a read-only storage instance.</p>
         */
        @NameInMap("ReadOnlyDBInstanceId")
        public DescribeDbInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceId readOnlyDBInstanceId;

        /**
         * <p>The ID of the region where the storage instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the zone where the storage instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDbInstancesResponseBodyItemsDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbInstancesResponseBodyItemsDBInstance self = new DescribeDbInstancesResponseBodyItemsDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDbInstancesResponseBodyItemsDBInstance setAllowAllCategory(Boolean allowAllCategory) {
            this.allowAllCategory = allowAllCategory;
            return this;
        }
        public Boolean getAllowAllCategory() {
            return this.allowAllCategory;
        }

        public DescribeDbInstancesResponseBodyItemsDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDbInstancesResponseBodyItemsDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDbInstancesResponseBodyItemsDBInstance setDBInstanceStatus(Integer DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public Integer getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDbInstancesResponseBodyItemsDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDbInstancesResponseBodyItemsDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDbInstancesResponseBodyItemsDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDbInstancesResponseBodyItemsDBInstance setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDbInstancesResponseBodyItemsDBInstance setReadOnlyDBInstanceId(DescribeDbInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceId readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public DescribeDbInstancesResponseBodyItemsDBInstanceReadOnlyDBInstanceId getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

        public DescribeDbInstancesResponseBodyItemsDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDbInstancesResponseBodyItemsDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDbInstancesResponseBodyItems extends TeaModel {
        @NameInMap("DBInstance")
        public java.util.List<DescribeDbInstancesResponseBodyItemsDBInstance> DBInstance;

        public static DescribeDbInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbInstancesResponseBodyItems self = new DescribeDbInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDbInstancesResponseBodyItems setDBInstance(java.util.List<DescribeDbInstancesResponseBodyItemsDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeDbInstancesResponseBodyItemsDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
