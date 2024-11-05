// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRestoreDBInstanceListResponseBody extends TeaModel {
    /**
     * <p>DB instances list.</p>
     */
    @NameInMap("DBInstances")
    public DescribeRestoreDBInstanceListResponseBodyDBInstances DBInstances;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AF0AD89-ED4F-44AD-B65F-BFC1D5Cxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of instances in the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRestoreDBInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreDBInstanceListResponseBody self = new DescribeRestoreDBInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreDBInstanceListResponseBody setDBInstances(DescribeRestoreDBInstanceListResponseBodyDBInstances DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public DescribeRestoreDBInstanceListResponseBodyDBInstances getDBInstances() {
        return this.DBInstances;
    }

    public DescribeRestoreDBInstanceListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRestoreDBInstanceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRestoreDBInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreDBInstanceListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance extends TeaModel {
        /**
         * <p>The time of instance creation, formatted as <i>yyyy-MM-dd</i>T<i>HH:00:00</i>Z (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-02T07:43:59Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-database</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp12c5b040dc****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/63870.html">Instance states</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <ul>
         * <li><strong>sharding</strong>: sharded cluster instance</li>
         * <li><strong>replicate</strong>: replica set or standalone instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>replicate</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The database engine version of the instance. Valid values:</p>
         * <ul>
         * <li><strong>7.0</strong></li>
         * <li><strong>6.0</strong></li>
         * <li><strong>5.0</strong></li>
         * <li><strong>4.4</strong></li>
         * <li><strong>4.2</strong></li>
         * <li><strong>4.0</strong></li>
         * <li><strong>3.4</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4.2</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The secondary availability zone 2 for the instance when implementing multi-AZ deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("HiddenZoneId")
        public String hiddenZoneId;

        /**
         * <p>Specifies whether the instance is deleted. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not deleted</li>
         * <li><strong>1</strong>: deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsDeleted")
        public Integer isDeleted;

        /**
         * <p>The locked state of the instance, value description:</p>
         * <ul>
         * <li>Unlock: Normal.</li>
         * <li>ManualLock: Manually triggered lock.</li>
         * <li>LockByExpiration: Automatically locked due to expiration.</li>
         * <li>LockByRestoration: Automatically locked before restoration.</li>
         * <li>LockByDiskQuota: Automatically locked due to disk quota exceeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The secondary availability zone 1 for the instance when implementing multi-AZ deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        /**
         * <p>The zone ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance self = new DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance setHiddenZoneId(String hiddenZoneId) {
            this.hiddenZoneId = hiddenZoneId;
            return this;
        }
        public String getHiddenZoneId() {
            return this.hiddenZoneId;
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance setIsDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Integer getIsDeleted() {
            return this.isDeleted;
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance setSecondaryZoneId(String secondaryZoneId) {
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeRestoreDBInstanceListResponseBodyDBInstances extends TeaModel {
        @NameInMap("DBInstance")
        public java.util.List<DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance> DBInstance;

        public static DescribeRestoreDBInstanceListResponseBodyDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreDBInstanceListResponseBodyDBInstances self = new DescribeRestoreDBInstanceListResponseBodyDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreDBInstanceListResponseBodyDBInstances setDBInstance(java.util.List<DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeRestoreDBInstanceListResponseBodyDBInstancesDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
