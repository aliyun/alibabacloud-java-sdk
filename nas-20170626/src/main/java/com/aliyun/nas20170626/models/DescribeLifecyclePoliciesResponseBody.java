// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLifecyclePoliciesResponseBody extends TeaModel {
    /**
     * <p>The queried lifecycle policies.</p>
     */
    @NameInMap("LifecyclePolicies")
    public java.util.List<DescribeLifecyclePoliciesResponseBodyLifecyclePolicies> lifecyclePolicies;

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
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of lifecycle policies.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLifecyclePoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecyclePoliciesResponseBody self = new DescribeLifecyclePoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLifecyclePoliciesResponseBody setLifecyclePolicies(java.util.List<DescribeLifecyclePoliciesResponseBodyLifecyclePolicies> lifecyclePolicies) {
        this.lifecyclePolicies = lifecyclePolicies;
        return this;
    }
    public java.util.List<DescribeLifecyclePoliciesResponseBodyLifecyclePolicies> getLifecyclePolicies() {
        return this.lifecyclePolicies;
    }

    public DescribeLifecyclePoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLifecyclePoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLifecyclePoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLifecyclePoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLifecyclePoliciesResponseBodyLifecyclePolicies extends TeaModel {
        /**
         * <p>The time when the lifecycle policy was created.</p>
         * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-30T10:08:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>31a8e4****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The name of the lifecycle policy.</p>
         * 
         * <strong>example:</strong>
         * <p>lifecyclepolicy_01</p>
         */
        @NameInMap("LifecyclePolicyName")
        public String lifecyclePolicyName;

        /**
         * <p>The management rule that is associated with the lifecycle policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DEFAULT_ATIME_14: Files that are not accessed in the last 14 days are dumped to the IA storage medium.</li>
         * <li>DEFAULT_ATIME_30: Files that are not accessed in the last 30 days are dumped to the IA storage medium.</li>
         * <li>DEFAULT_ATIME_60: Files that are not accessed in the last 60 days are dumped to the IA storage medium.</li>
         * <li>DEFAULT_ATIME_90: Files that are not accessed in the last 90 days are dumped to the IA storage medium.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_ATIME_14</p>
         */
        @NameInMap("LifecycleRuleName")
        public String lifecycleRuleName;

        /**
         * <p>The absolute path of a directory with which the lifecycle policy is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>/pathway/to/folder</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The absolute paths to multiple directories associated with the lifecycle policy.</p>
         */
        @NameInMap("Paths")
        public java.util.List<String> paths;

        /**
         * <p>The storage type of the data that is dumped to the IA storage medium.</p>
         * <p>Default value: InfrequentAccess (IA).</p>
         * 
         * <strong>example:</strong>
         * <p>InfrequentAccess</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeLifecyclePoliciesResponseBodyLifecyclePolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecyclePoliciesResponseBodyLifecyclePolicies self = new DescribeLifecyclePoliciesResponseBodyLifecyclePolicies();
            return TeaModel.build(map, self);
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setLifecyclePolicyName(String lifecyclePolicyName) {
            this.lifecyclePolicyName = lifecyclePolicyName;
            return this;
        }
        public String getLifecyclePolicyName() {
            return this.lifecyclePolicyName;
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setLifecycleRuleName(String lifecycleRuleName) {
            this.lifecycleRuleName = lifecycleRuleName;
            return this;
        }
        public String getLifecycleRuleName() {
            return this.lifecycleRuleName;
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
