// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAppAuthorizedUsersResponseBody extends TeaModel {
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
    public java.util.List<GetDataServiceAppAuthorizedUsersResponseBodyUserList> userList;

    public static GetDataServiceAppAuthorizedUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAppAuthorizedUsersResponseBody self = new GetDataServiceAppAuthorizedUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAppAuthorizedUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataServiceAppAuthorizedUsersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceAppAuthorizedUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataServiceAppAuthorizedUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceAppAuthorizedUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataServiceAppAuthorizedUsersResponseBody setUserList(java.util.List<GetDataServiceAppAuthorizedUsersResponseBodyUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<GetDataServiceAppAuthorizedUsersResponseBodyUserList> getUserList() {
        return this.userList;
    }

    public static class GetDataServiceAppAuthorizedUsersResponseBodyUserList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>30002101</p>
         */
        @NameInMap("Id")
        public String id;

        public static GetDataServiceAppAuthorizedUsersResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceAppAuthorizedUsersResponseBodyUserList self = new GetDataServiceAppAuthorizedUsersResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceAppAuthorizedUsersResponseBodyUserList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetDataServiceAppAuthorizedUsersResponseBodyUserList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
