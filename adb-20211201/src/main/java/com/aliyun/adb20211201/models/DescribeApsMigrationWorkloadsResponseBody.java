// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsMigrationWorkloadsResponseBody extends TeaModel {
    /**
     * <p>The queried migration workloads.</p>
     */
    @NameInMap("MigrationWorkloads")
    public java.util.List<DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads> migrationWorkloads;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
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
     * <p><strong><strong><strong>-3EEC-57F0-9F06-</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeApsMigrationWorkloadsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsMigrationWorkloadsResponseBody self = new DescribeApsMigrationWorkloadsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApsMigrationWorkloadsResponseBody setMigrationWorkloads(java.util.List<DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads> migrationWorkloads) {
        this.migrationWorkloads = migrationWorkloads;
        return this;
    }
    public java.util.List<DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads> getMigrationWorkloads() {
        return this.migrationWorkloads;
    }

    public DescribeApsMigrationWorkloadsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApsMigrationWorkloadsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApsMigrationWorkloadsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApsMigrationWorkloadsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads extends TeaModel {
        /**
         * <p>The number of AnalyticDB compute units (ACUs).</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AcuCount")
        public Integer acuCount;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-21T02:15:16Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("FailedMsg")
        public String failedMsg;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The maximum response time.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxRT")
        public String maxRT;

        /**
         * <p>The time when the migration job was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-21T02:15:16Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the workload.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST-001</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The OSS URL.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://******</p>
         */
        @NameInMap("OssLocation")
        public String ossLocation;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The destination type.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The sub-type of the workload.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadSubType")
        public String workloadSubType;

        public static DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads self = new DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads();
            return TeaModel.build(map, self);
        }

        public DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads setAcuCount(Integer acuCount) {
            this.acuCount = acuCount;
            return this;
        }
        public Integer getAcuCount() {
            return this.acuCount;
        }

        public DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads setFailedMsg(String failedMsg) {
            this.failedMsg = failedMsg;
            return this;
        }
        public String getFailedMsg() {
            return this.failedMsg;
        }

        public DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads setMaxRT(String maxRT) {
            this.maxRT = maxRT;
            return this;
        }
        public String getMaxRT() {
            return this.maxRT;
        }

        public DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads setOssLocation(String ossLocation) {
            this.ossLocation = ossLocation;
            return this;
        }
        public String getOssLocation() {
            return this.ossLocation;
        }

        public DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeApsMigrationWorkloadsResponseBodyMigrationWorkloads setWorkloadSubType(String workloadSubType) {
            this.workloadSubType = workloadSubType;
            return this;
        }
        public String getWorkloadSubType() {
            return this.workloadSubType;
        }

    }

}
