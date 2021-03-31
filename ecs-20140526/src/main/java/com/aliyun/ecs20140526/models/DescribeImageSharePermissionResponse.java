// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSharePermissionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("ShareGroups")
    @Validation(required = true)
    public DescribeImageSharePermissionResponseShareGroups shareGroups;

    @NameInMap("Accounts")
    @Validation(required = true)
    public DescribeImageSharePermissionResponseAccounts accounts;

    public static DescribeImageSharePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSharePermissionResponse self = new DescribeImageSharePermissionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageSharePermissionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageSharePermissionResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageSharePermissionResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeImageSharePermissionResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeImageSharePermissionResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageSharePermissionResponse setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImageSharePermissionResponse setShareGroups(DescribeImageSharePermissionResponseShareGroups shareGroups) {
        this.shareGroups = shareGroups;
        return this;
    }
    public DescribeImageSharePermissionResponseShareGroups getShareGroups() {
        return this.shareGroups;
    }

    public DescribeImageSharePermissionResponse setAccounts(DescribeImageSharePermissionResponseAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public DescribeImageSharePermissionResponseAccounts getAccounts() {
        return this.accounts;
    }

    public static class DescribeImageSharePermissionResponseShareGroupsShareGroup extends TeaModel {
        @NameInMap("Group")
        @Validation(required = true)
        public String group;

        public static DescribeImageSharePermissionResponseShareGroupsShareGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseShareGroupsShareGroup self = new DescribeImageSharePermissionResponseShareGroupsShareGroup();
            return TeaModel.build(map, self);
        }

        public DescribeImageSharePermissionResponseShareGroupsShareGroup setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class DescribeImageSharePermissionResponseShareGroups extends TeaModel {
        @NameInMap("ShareGroup")
        @Validation(required = true)
        public java.util.List<DescribeImageSharePermissionResponseShareGroupsShareGroup> shareGroup;

        public static DescribeImageSharePermissionResponseShareGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseShareGroups self = new DescribeImageSharePermissionResponseShareGroups();
            return TeaModel.build(map, self);
        }

        public DescribeImageSharePermissionResponseShareGroups setShareGroup(java.util.List<DescribeImageSharePermissionResponseShareGroupsShareGroup> shareGroup) {
            this.shareGroup = shareGroup;
            return this;
        }
        public java.util.List<DescribeImageSharePermissionResponseShareGroupsShareGroup> getShareGroup() {
            return this.shareGroup;
        }

    }

    public static class DescribeImageSharePermissionResponseAccountsAccount extends TeaModel {
        @NameInMap("AliyunId")
        @Validation(required = true)
        public String aliyunId;

        public static DescribeImageSharePermissionResponseAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseAccountsAccount self = new DescribeImageSharePermissionResponseAccountsAccount();
            return TeaModel.build(map, self);
        }

        public DescribeImageSharePermissionResponseAccountsAccount setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

    }

    public static class DescribeImageSharePermissionResponseAccounts extends TeaModel {
        @NameInMap("Account")
        @Validation(required = true)
        public java.util.List<DescribeImageSharePermissionResponseAccountsAccount> account;

        public static DescribeImageSharePermissionResponseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseAccounts self = new DescribeImageSharePermissionResponseAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeImageSharePermissionResponseAccounts setAccount(java.util.List<DescribeImageSharePermissionResponseAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<DescribeImageSharePermissionResponseAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
