// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeImageSharePermissionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    public DescribeImageSharePermissionResponse setAccounts(DescribeImageSharePermissionResponseAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public DescribeImageSharePermissionResponseAccounts getAccounts() {
        return this.accounts;
    }

    public static class DescribeImageSharePermissionResponseAccounts extends TeaModel {
        @NameInMap("Account")
        @Validation(required = true)
        public java.util.List<String> account;

        public static DescribeImageSharePermissionResponseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSharePermissionResponseAccounts self = new DescribeImageSharePermissionResponseAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeImageSharePermissionResponseAccounts setAccount(java.util.List<String> account) {
            this.account = account;
            return this;
        }
        public java.util.List<String> getAccount() {
            return this.account;
        }

    }

}
