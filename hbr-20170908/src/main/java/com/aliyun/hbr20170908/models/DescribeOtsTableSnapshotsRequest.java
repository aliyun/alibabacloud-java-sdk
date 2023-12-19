// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeOtsTableSnapshotsRequest extends TeaModel {
    /**
     * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>Specifies whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
     * <br>
     * <p>*   SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.</p>
     * <p>*   CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The UID of the source account used for cross-account backup.</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The end time of the backup. The value must be a UNIX timestamp. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The maximum number of rows that you want the current query to return.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The token that is required to obtain the next page of backup snapshots.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The Tablestore instances that are backed up.</p>
     */
    @NameInMap("OtsInstances")
    public java.util.List<DescribeOtsTableSnapshotsRequestOtsInstances> otsInstances;

    /**
     * <p>The snapshot IDs.</p>
     */
    @NameInMap("SnapshotIds")
    public java.util.List<String> snapshotIds;

    /**
     * <p>The start time of the backup. The value must be a UNIX timestamp. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeOtsTableSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOtsTableSnapshotsRequest self = new DescribeOtsTableSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOtsTableSnapshotsRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public DescribeOtsTableSnapshotsRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public DescribeOtsTableSnapshotsRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public DescribeOtsTableSnapshotsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeOtsTableSnapshotsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeOtsTableSnapshotsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeOtsTableSnapshotsRequest setOtsInstances(java.util.List<DescribeOtsTableSnapshotsRequestOtsInstances> otsInstances) {
        this.otsInstances = otsInstances;
        return this;
    }
    public java.util.List<DescribeOtsTableSnapshotsRequestOtsInstances> getOtsInstances() {
        return this.otsInstances;
    }

    public DescribeOtsTableSnapshotsRequest setSnapshotIds(java.util.List<String> snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }
    public java.util.List<String> getSnapshotIds() {
        return this.snapshotIds;
    }

    public DescribeOtsTableSnapshotsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class DescribeOtsTableSnapshotsRequestOtsInstances extends TeaModel {
        /**
         * <p>The name of the Tablestore instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The names of the tables in the Tablestore instance.</p>
         */
        @NameInMap("TableNames")
        public java.util.List<String> tableNames;

        public static DescribeOtsTableSnapshotsRequestOtsInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeOtsTableSnapshotsRequestOtsInstances self = new DescribeOtsTableSnapshotsRequestOtsInstances();
            return TeaModel.build(map, self);
        }

        public DescribeOtsTableSnapshotsRequestOtsInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeOtsTableSnapshotsRequestOtsInstances setTableNames(java.util.List<String> tableNames) {
            this.tableNames = tableNames;
            return this;
        }
        public java.util.List<String> getTableNames() {
            return this.tableNames;
        }

    }

}
