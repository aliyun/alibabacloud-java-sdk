// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLifecyclePoliciesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("LifecyclePolicies")
    @Validation(required = true)
    public java.util.List<DescribeLifecyclePoliciesResponseLifecyclePolicies> lifecyclePolicies;

    public static DescribeLifecyclePoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecyclePoliciesResponse self = new DescribeLifecyclePoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLifecyclePoliciesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLifecyclePoliciesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLifecyclePoliciesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLifecyclePoliciesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLifecyclePoliciesResponse setLifecyclePolicies(java.util.List<DescribeLifecyclePoliciesResponseLifecyclePolicies> lifecyclePolicies) {
        this.lifecyclePolicies = lifecyclePolicies;
        return this;
    }
    public java.util.List<DescribeLifecyclePoliciesResponseLifecyclePolicies> getLifecyclePolicies() {
        return this.lifecyclePolicies;
    }

    public static class DescribeLifecyclePoliciesResponseLifecyclePolicies extends TeaModel {
        @NameInMap("FileSystemId")
        @Validation(required = true)
        public String fileSystemId;

        @NameInMap("LifecyclePolicyName")
        @Validation(required = true)
        public String lifecyclePolicyName;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("LifecycleRuleName")
        @Validation(required = true)
        public String lifecycleRuleName;

        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static DescribeLifecyclePoliciesResponseLifecyclePolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecyclePoliciesResponseLifecyclePolicies self = new DescribeLifecyclePoliciesResponseLifecyclePolicies();
            return TeaModel.build(map, self);
        }

        public DescribeLifecyclePoliciesResponseLifecyclePolicies setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeLifecyclePoliciesResponseLifecyclePolicies setLifecyclePolicyName(String lifecyclePolicyName) {
            this.lifecyclePolicyName = lifecyclePolicyName;
            return this;
        }
        public String getLifecyclePolicyName() {
            return this.lifecyclePolicyName;
        }

        public DescribeLifecyclePoliciesResponseLifecyclePolicies setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeLifecyclePoliciesResponseLifecyclePolicies setLifecycleRuleName(String lifecycleRuleName) {
            this.lifecycleRuleName = lifecycleRuleName;
            return this;
        }
        public String getLifecycleRuleName() {
            return this.lifecycleRuleName;
        }

        public DescribeLifecyclePoliciesResponseLifecyclePolicies setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeLifecyclePoliciesResponseLifecyclePolicies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
