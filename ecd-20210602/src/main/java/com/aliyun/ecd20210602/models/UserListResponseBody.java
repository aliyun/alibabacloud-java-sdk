// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UserListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("UserList")
    public java.util.List<UserListResponseBodyUserList> userList;

    public static UserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserListResponseBody self = new UserListResponseBody();
        return TeaModel.build(map, self);
    }

    public UserListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UserListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UserListResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public UserListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public UserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UserListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public UserListResponseBody setUserList(java.util.List<UserListResponseBodyUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<UserListResponseBodyUserList> getUserList() {
        return this.userList;
    }

    public static class UserListResponseBodyUserList extends TeaModel {
        @NameInMap("IsDistribute")
        public Boolean isDistribute;

        @NameInMap("Name")
        public String name;

        @NameInMap("UserEmail")
        public String userEmail;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserType")
        public String userType;

        public static UserListResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            UserListResponseBodyUserList self = new UserListResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public UserListResponseBodyUserList setIsDistribute(Boolean isDistribute) {
            this.isDistribute = isDistribute;
            return this;
        }
        public Boolean getIsDistribute() {
            return this.isDistribute;
        }

        public UserListResponseBodyUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UserListResponseBodyUserList setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

        public UserListResponseBodyUserList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public UserListResponseBodyUserList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
