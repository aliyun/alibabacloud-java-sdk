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

    public static class DescribeImageSharePermissionResponseShareGroupsShareGroup extends TeaModel {
        @NameInMap("Group")
        @Validation(required = true)
        public String group;

        public static DescribeImageSharePermissionResponseShareGroupsShareGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseShareGroupsShareGroup self = new DescribeImageSharePermissionResponseShareGroupsShareGroup();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeImageSharePermissionResponseAccountsAccount extends TeaModel {
        @NameInMap("AliyunId")
        @Validation(required = true)
        public String aliyunId;

        public static DescribeImageSharePermissionResponseAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseAccountsAccount self = new DescribeImageSharePermissionResponseAccountsAccount();
            return TeaModel.build(map, self);
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

    }

}
