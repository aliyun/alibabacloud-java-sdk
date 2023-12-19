// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeCrossAccountsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CrossAccounts")
    public DescribeCrossAccountsResponseBodyCrossAccounts crossAccounts;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeCrossAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossAccountsResponseBody self = new DescribeCrossAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCrossAccountsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCrossAccountsResponseBody setCrossAccounts(DescribeCrossAccountsResponseBodyCrossAccounts crossAccounts) {
        this.crossAccounts = crossAccounts;
        return this;
    }
    public DescribeCrossAccountsResponseBodyCrossAccounts getCrossAccounts() {
        return this.crossAccounts;
    }

    public DescribeCrossAccountsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCrossAccountsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossAccountsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCrossAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossAccountsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeCrossAccountsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount self = new DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount();
            return TeaModel.build(map, self);
        }

        public DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount setCrossAccountRoleName(String crossAccountRoleName) {
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        public DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount setCrossAccountUserId(Long crossAccountUserId) {
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
        }

        public DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class DescribeCrossAccountsResponseBodyCrossAccounts extends TeaModel {
        @NameInMap("CrossAccount")
        public java.util.List<DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount> crossAccount;

        public static DescribeCrossAccountsResponseBodyCrossAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossAccountsResponseBodyCrossAccounts self = new DescribeCrossAccountsResponseBodyCrossAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeCrossAccountsResponseBodyCrossAccounts setCrossAccount(java.util.List<DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount> crossAccount) {
            this.crossAccount = crossAccount;
            return this;
        }
        public java.util.List<DescribeCrossAccountsResponseBodyCrossAccountsCrossAccount> getCrossAccount() {
            return this.crossAccount;
        }

    }

}
