// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclBackupListResponseBody extends TeaModel {
    /**
     * <p>The collection of backup records.</p>
     */
    @NameInMap("Backups")
    public java.util.List<DescribeAclBackupListResponseBodyBackups> backups;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6C9105F2-9F31-5A62-8D52-FA65A3E5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAclBackupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclBackupListResponseBody self = new DescribeAclBackupListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAclBackupListResponseBody setBackups(java.util.List<DescribeAclBackupListResponseBodyBackups> backups) {
        this.backups = backups;
        return this;
    }
    public java.util.List<DescribeAclBackupListResponseBodyBackups> getBackups() {
        return this.backups;
    }

    public DescribeAclBackupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAclBackupListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAclBackupListResponseBodyBackups extends TeaModel {
        /**
         * <p>The number of ACLs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AclCount")
        public Integer aclCount;

        /**
         * <p>The backup time. The value is a UNIX timestamp in seconds, which indicates the number of seconds that have elapsed since January 1, 1970 (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>1743683400</p>
         */
        @NameInMap("BackUpTime")
        public Long backUpTime;

        /**
         * <p>The description of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        public static DescribeAclBackupListResponseBodyBackups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclBackupListResponseBodyBackups self = new DescribeAclBackupListResponseBodyBackups();
            return TeaModel.build(map, self);
        }

        public DescribeAclBackupListResponseBodyBackups setAclCount(Integer aclCount) {
            this.aclCount = aclCount;
            return this;
        }
        public Integer getAclCount() {
            return this.aclCount;
        }

        public DescribeAclBackupListResponseBodyBackups setBackUpTime(Long backUpTime) {
            this.backUpTime = backUpTime;
            return this;
        }
        public Long getBackUpTime() {
            return this.backUpTime;
        }

        public DescribeAclBackupListResponseBodyBackups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
