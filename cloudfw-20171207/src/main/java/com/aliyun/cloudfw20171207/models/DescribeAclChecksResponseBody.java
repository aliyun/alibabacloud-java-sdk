// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclChecksResponseBody extends TeaModel {
    @NameInMap("CheckRecords")
    public DescribeAclChecksResponseBodyCheckRecords checkRecords;

    /**
     * <strong>example:</strong>
     * <p>9AABB1B7-C81F-5158-9EF9-B2DD5D3D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAclChecksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclChecksResponseBody self = new DescribeAclChecksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAclChecksResponseBody setCheckRecords(DescribeAclChecksResponseBodyCheckRecords checkRecords) {
        this.checkRecords = checkRecords;
        return this;
    }
    public DescribeAclChecksResponseBodyCheckRecords getCheckRecords() {
        return this.checkRecords;
    }

    public DescribeAclChecksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAclChecksResponseBodyCheckRecordsRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AclPendingCount")
        public Long aclPendingCount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AclTotalCount")
        public Long aclTotalCount;

        /**
         * <strong>example:</strong>
         * <p>AddressBookDomainValid</p>
         */
        @NameInMap("CheckName")
        public String checkName;

        /**
         * <strong>example:</strong>
         * <p>Checked</p>
         */
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <strong>example:</strong>
         * <p>AddressBookGather</p>
         */
        @NameInMap("CheckType")
        public String checkType;

        /**
         * <strong>example:</strong>
         * <p>1724982259</p>
         */
        @NameInMap("LastCheckTime")
        public String lastCheckTime;

        /**
         * <strong>example:</strong>
         * <p>Medium</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>task-c92d4544ef7b6a42</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeAclChecksResponseBodyCheckRecordsRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclChecksResponseBodyCheckRecordsRecords self = new DescribeAclChecksResponseBodyCheckRecordsRecords();
            return TeaModel.build(map, self);
        }

        public DescribeAclChecksResponseBodyCheckRecordsRecords setAclPendingCount(Long aclPendingCount) {
            this.aclPendingCount = aclPendingCount;
            return this;
        }
        public Long getAclPendingCount() {
            return this.aclPendingCount;
        }

        public DescribeAclChecksResponseBodyCheckRecordsRecords setAclTotalCount(Long aclTotalCount) {
            this.aclTotalCount = aclTotalCount;
            return this;
        }
        public Long getAclTotalCount() {
            return this.aclTotalCount;
        }

        public DescribeAclChecksResponseBodyCheckRecordsRecords setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public DescribeAclChecksResponseBodyCheckRecordsRecords setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeAclChecksResponseBodyCheckRecordsRecords setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public DescribeAclChecksResponseBodyCheckRecordsRecords setLastCheckTime(String lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        public DescribeAclChecksResponseBodyCheckRecordsRecords setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeAclChecksResponseBodyCheckRecordsRecords setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeAclChecksResponseBodyCheckRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("AclType")
        public String aclType;

        @NameInMap("Records")
        public java.util.List<DescribeAclChecksResponseBodyCheckRecordsRecords> records;

        public static DescribeAclChecksResponseBodyCheckRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclChecksResponseBodyCheckRecords self = new DescribeAclChecksResponseBodyCheckRecords();
            return TeaModel.build(map, self);
        }

        public DescribeAclChecksResponseBodyCheckRecords setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public DescribeAclChecksResponseBodyCheckRecords setRecords(java.util.List<DescribeAclChecksResponseBodyCheckRecordsRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeAclChecksResponseBodyCheckRecordsRecords> getRecords() {
            return this.records;
        }

    }

}
