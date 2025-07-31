// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceProjectAddableUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("UserList")
    public java.util.List<GetDataServiceProjectAddableUsersResponseBodyUserList> userList;

    public static GetDataServiceProjectAddableUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceProjectAddableUsersResponseBody self = new GetDataServiceProjectAddableUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceProjectAddableUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataServiceProjectAddableUsersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceProjectAddableUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataServiceProjectAddableUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceProjectAddableUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataServiceProjectAddableUsersResponseBody setUserList(java.util.List<GetDataServiceProjectAddableUsersResponseBodyUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<GetDataServiceProjectAddableUsersResponseBodyUserList> getUserList() {
        return this.userList;
    }

    public static class GetDataServiceProjectAddableUsersResponseBodyUserList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:xx@aliyuncs.com">xx@aliyuncs.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetDataServiceProjectAddableUsersResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceProjectAddableUsersResponseBodyUserList self = new GetDataServiceProjectAddableUsersResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceProjectAddableUsersResponseBodyUserList setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetDataServiceProjectAddableUsersResponseBodyUserList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetDataServiceProjectAddableUsersResponseBodyUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
