// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImageSharePermissionResponseBody extends TeaModel {
    /**
     * <p>The account information.</p>
     */
    @NameInMap("Accounts")
    public DescribeImageSharePermissionResponseBodyAccounts accounts;

    /**
     * <p>The ID of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>m-5qkf6jv9a0tzd5ipwx5fi****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The page number of the returned page.</p>
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
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A44EE357-6174-5E37-A801-48F5790F9ACE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of Alibaba Cloud accounts with which you share the image.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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

    public DescribeImageSharePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
         * <p>The Alibaba Cloud account with which you share the image.</p>
         * 
         * <strong>example:</strong>
         * <p>1515285523xxxx</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        public static DescribeImageSharePermissionResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseBodyAccountsAccount self = new DescribeImageSharePermissionResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public DescribeImageSharePermissionResponseBodyAccountsAccount setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
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
