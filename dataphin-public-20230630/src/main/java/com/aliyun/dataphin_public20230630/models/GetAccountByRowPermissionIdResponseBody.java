// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAccountByRowPermissionIdResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetAccountByRowPermissionIdResponseBodyData> data;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAccountByRowPermissionIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountByRowPermissionIdResponseBody self = new GetAccountByRowPermissionIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountByRowPermissionIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAccountByRowPermissionIdResponseBody setData(java.util.List<GetAccountByRowPermissionIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAccountByRowPermissionIdResponseBodyData> getData() {
        return this.data;
    }

    public GetAccountByRowPermissionIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAccountByRowPermissionIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAccountByRowPermissionIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountByRowPermissionIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAccountByRowPermissionIdResponseBodyDataUserMappingListAccounts extends TeaModel {
        /**
         * <p>The ID of the account associated with the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>300901111</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The name of the account associated with the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        public static GetAccountByRowPermissionIdResponseBodyDataUserMappingListAccounts build(java.util.Map<String, ?> map) throws Exception {
            GetAccountByRowPermissionIdResponseBodyDataUserMappingListAccounts self = new GetAccountByRowPermissionIdResponseBodyDataUserMappingListAccounts();
            return TeaModel.build(map, self);
        }

        public GetAccountByRowPermissionIdResponseBodyDataUserMappingListAccounts setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetAccountByRowPermissionIdResponseBodyDataUserMappingListAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

    public static class GetAccountByRowPermissionIdResponseBodyDataUserMappingList extends TeaModel {
        /**
         * <p>The type of the account associated with the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The accounts associated with the rule.</p>
         */
        @NameInMap("Accounts")
        public java.util.List<GetAccountByRowPermissionIdResponseBodyDataUserMappingListAccounts> accounts;

        public static GetAccountByRowPermissionIdResponseBodyDataUserMappingList build(java.util.Map<String, ?> map) throws Exception {
            GetAccountByRowPermissionIdResponseBodyDataUserMappingList self = new GetAccountByRowPermissionIdResponseBodyDataUserMappingList();
            return TeaModel.build(map, self);
        }

        public GetAccountByRowPermissionIdResponseBodyDataUserMappingList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetAccountByRowPermissionIdResponseBodyDataUserMappingList setAccounts(java.util.List<GetAccountByRowPermissionIdResponseBodyDataUserMappingListAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<GetAccountByRowPermissionIdResponseBodyDataUserMappingListAccounts> getAccounts() {
            return this.accounts;
        }

    }

    public static class GetAccountByRowPermissionIdResponseBodyData extends TeaModel {
        /**
         * <p>The row-level permission rule IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>300001235</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The accounts associated with the rule.</p>
         */
        @NameInMap("UserMappingList")
        public java.util.List<GetAccountByRowPermissionIdResponseBodyDataUserMappingList> userMappingList;

        public static GetAccountByRowPermissionIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAccountByRowPermissionIdResponseBodyData self = new GetAccountByRowPermissionIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAccountByRowPermissionIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAccountByRowPermissionIdResponseBodyData setUserMappingList(java.util.List<GetAccountByRowPermissionIdResponseBodyDataUserMappingList> userMappingList) {
            this.userMappingList = userMappingList;
            return this;
        }
        public java.util.List<GetAccountByRowPermissionIdResponseBodyDataUserMappingList> getUserMappingList() {
            return this.userMappingList;
        }

    }

}
