// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLifecyclePoliciesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("LifecyclePolicies")
    public java.util.List<DescribeLifecyclePoliciesResponseBodyLifecyclePolicies> lifecyclePolicies;

    public static DescribeLifecyclePoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecyclePoliciesResponseBody self = new DescribeLifecyclePoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLifecyclePoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLifecyclePoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLifecyclePoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLifecyclePoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLifecyclePoliciesResponseBody setLifecyclePolicies(java.util.List<DescribeLifecyclePoliciesResponseBodyLifecyclePolicies> lifecyclePolicies) {
        this.lifecyclePolicies = lifecyclePolicies;
        return this;
    }
    public java.util.List<DescribeLifecyclePoliciesResponseBodyLifecyclePolicies> getLifecyclePolicies() {
        return this.lifecyclePolicies;
    }

    public static class DescribeLifecyclePoliciesResponseBodyLifecyclePolicies extends TeaModel {
        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("LifecycleRuleName")
        public String lifecycleRuleName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Path")
        public String path;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("LifecyclePolicyName")
        public String lifecyclePolicyName;

        public static DescribeLifecyclePoliciesResponseBodyLifecyclePolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecyclePoliciesResponseBodyLifecyclePolicies self = new DescribeLifecyclePoliciesResponseBodyLifecyclePolicies();
            return TeaModel.build(map, self);
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setLifecycleRuleName(String lifecycleRuleName) {
            this.lifecycleRuleName = lifecycleRuleName;
            return this;
        }
        public String getLifecycleRuleName() {
            return this.lifecycleRuleName;
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeLifecyclePoliciesResponseBodyLifecyclePolicies setLifecyclePolicyName(String lifecyclePolicyName) {
            this.lifecyclePolicyName = lifecyclePolicyName;
            return this;
        }
        public String getLifecyclePolicyName() {
            return this.lifecyclePolicyName;
        }

    }

}
