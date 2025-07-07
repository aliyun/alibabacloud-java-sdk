// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody extends TeaModel {
    @NameInMap("Accounts")
    public java.util.List<EnterpriseRoleQueryAccountForRoleGrantByPageResponseBodyAccounts> accounts;

    @NameInMap("Code")
    public String code;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody self = new EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody setAccounts(java.util.List<EnterpriseRoleQueryAccountForRoleGrantByPageResponseBodyAccounts> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<EnterpriseRoleQueryAccountForRoleGrantByPageResponseBodyAccounts> getAccounts() {
        return this.accounts;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class EnterpriseRoleQueryAccountForRoleGrantByPageResponseBodyAccounts extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("Granted")
        public Boolean granted;

        @NameInMap("Pk")
        public String pk;

        public static EnterpriseRoleQueryAccountForRoleGrantByPageResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseRoleQueryAccountForRoleGrantByPageResponseBodyAccounts self = new EnterpriseRoleQueryAccountForRoleGrantByPageResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBodyAccounts setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBodyAccounts setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBodyAccounts setGranted(Boolean granted) {
            this.granted = granted;
            return this;
        }
        public Boolean getGranted() {
            return this.granted;
        }

        public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBodyAccounts setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

    }

}
