// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSharePermissionResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud accounts.</p>
     */
    @NameInMap("Accounts")
    public DescribeImageSharePermissionResponseBodyAccounts accounts;

    /**
     * <p>The ID of the custom image.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp1caf3yicx5jlfl****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

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
     * <p>The region ID of the custom image.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The shared groups.</p>
     */
    @NameInMap("ShareGroups")
    public DescribeImageSharePermissionResponseBodyShareGroups shareGroups;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImageSharePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSharePermissionResponseBody self = new DescribeImageSharePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageSharePermissionResponseBody setAccounts(DescribeImageSharePermissionResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public DescribeImageSharePermissionResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public DescribeImageSharePermissionResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
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

    public DescribeImageSharePermissionResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageSharePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageSharePermissionResponseBody setShareGroups(DescribeImageSharePermissionResponseBodyShareGroups shareGroups) {
        this.shareGroups = shareGroups;
        return this;
    }
    public DescribeImageSharePermissionResponseBodyShareGroups getShareGroups() {
        return this.shareGroups;
    }

    public DescribeImageSharePermissionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImageSharePermissionResponseBodyAccountsAccount extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("AliyunId")
        public String aliyunId;

        /**
         * <p>The time when the image was shared. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01T12:05:00Z</p>
         */
        @NameInMap("SharedTime")
        public String sharedTime;

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

        public DescribeImageSharePermissionResponseBodyAccountsAccount setSharedTime(String sharedTime) {
            this.sharedTime = sharedTime;
            return this;
        }
        public String getSharedTime() {
            return this.sharedTime;
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

    public static class DescribeImageSharePermissionResponseBodyShareGroupsShareGroup extends TeaModel {
        /**
         * <p>The shared group.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
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

}
