// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSharePermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ShareGroups")
    public DescribeImageSharePermissionResponseBodyShareGroups shareGroups;

    @NameInMap("Accounts")
    public DescribeImageSharePermissionResponseBodyAccounts accounts;

    public static DescribeImageSharePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSharePermissionResponseBody self = new DescribeImageSharePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageSharePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageSharePermissionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeImageSharePermissionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageSharePermissionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeImageSharePermissionResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImageSharePermissionResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageSharePermissionResponseBody setShareGroups(DescribeImageSharePermissionResponseBodyShareGroups shareGroups) {
        this.shareGroups = shareGroups;
        return this;
    }
    public DescribeImageSharePermissionResponseBodyShareGroups getShareGroups() {
        return this.shareGroups;
    }

    public DescribeImageSharePermissionResponseBody setAccounts(DescribeImageSharePermissionResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public DescribeImageSharePermissionResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public static class DescribeImageSharePermissionResponseBodyShareGroupsShareGroup extends TeaModel {
        @NameInMap("Group")
        public String group;

        public static DescribeImageSharePermissionResponseBodyShareGroupsShareGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseBodyShareGroupsShareGroup self = new DescribeImageSharePermissionResponseBodyShareGroupsShareGroup();
            return TeaModel.build(map, self);
        }

        public DescribeImageSharePermissionResponseBodyShareGroupsShareGroup setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class DescribeImageSharePermissionResponseBodyShareGroups extends TeaModel {
        @NameInMap("ShareGroup")
        public java.util.List<DescribeImageSharePermissionResponseBodyShareGroupsShareGroup> shareGroup;

        public static DescribeImageSharePermissionResponseBodyShareGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseBodyShareGroups self = new DescribeImageSharePermissionResponseBodyShareGroups();
            return TeaModel.build(map, self);
        }

        public DescribeImageSharePermissionResponseBodyShareGroups setShareGroup(java.util.List<DescribeImageSharePermissionResponseBodyShareGroupsShareGroup> shareGroup) {
            this.shareGroup = shareGroup;
            return this;
        }
        public java.util.List<DescribeImageSharePermissionResponseBodyShareGroupsShareGroup> getShareGroup() {
            return this.shareGroup;
        }

    }

    public static class DescribeImageSharePermissionResponseBodyAccountsAccount extends TeaModel {
        @NameInMap("AliyunId")
        public String aliyunId;

        public static DescribeImageSharePermissionResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseBodyAccountsAccount self = new DescribeImageSharePermissionResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public DescribeImageSharePermissionResponseBodyAccountsAccount setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

    }

    public static class DescribeImageSharePermissionResponseBodyAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<DescribeImageSharePermissionResponseBodyAccountsAccount> account;

        public static DescribeImageSharePermissionResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseBodyAccounts self = new DescribeImageSharePermissionResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeImageSharePermissionResponseBodyAccounts setAccount(java.util.List<DescribeImageSharePermissionResponseBodyAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<DescribeImageSharePermissionResponseBodyAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
