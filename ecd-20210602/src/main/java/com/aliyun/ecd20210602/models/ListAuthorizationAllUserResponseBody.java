// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAuthorizationAllUserResponseBody extends TeaModel {
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
    public java.util.List<ListAuthorizationAllUserResponseBodyUserList> userList;

    public static ListAuthorizationAllUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationAllUserResponseBody self = new ListAuthorizationAllUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationAllUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAuthorizationAllUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuthorizationAllUserResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizationAllUserResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizationAllUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizationAllUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListAuthorizationAllUserResponseBody setUserList(java.util.List<ListAuthorizationAllUserResponseBodyUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<ListAuthorizationAllUserResponseBodyUserList> getUserList() {
        return this.userList;
    }

    public static class ListAuthorizationAllUserResponseBodyUserList extends TeaModel {
        @NameInMap("IsDistributeUser")
        public Boolean isDistributeUser;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("SubscribeId")
        public Long subscribeId;

        @NameInMap("UserEmail")
        public String userEmail;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserType")
        public String userType;

        public static ListAuthorizationAllUserResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationAllUserResponseBodyUserList self = new ListAuthorizationAllUserResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationAllUserResponseBodyUserList setIsDistributeUser(Boolean isDistributeUser) {
            this.isDistributeUser = isDistributeUser;
            return this;
        }
        public Boolean getIsDistributeUser() {
            return this.isDistributeUser;
        }

        public ListAuthorizationAllUserResponseBodyUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAuthorizationAllUserResponseBodyUserList setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListAuthorizationAllUserResponseBodyUserList setSubscribeId(Long subscribeId) {
            this.subscribeId = subscribeId;
            return this;
        }
        public Long getSubscribeId() {
            return this.subscribeId;
        }

        public ListAuthorizationAllUserResponseBodyUserList setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

        public ListAuthorizationAllUserResponseBodyUserList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListAuthorizationAllUserResponseBodyUserList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
