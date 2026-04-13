// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRestoreDBInstanceListResponseBody extends TeaModel {
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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("HiddenZoneId")
        public String hiddenZoneId;

        @NameInMap("IsDeleted")
        public Integer isDeleted;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

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
