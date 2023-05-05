// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListDistributeAllUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("UserList")
    public java.util.List<ListDistributeAllUserResponseBodyUserList> userList;

    public static ListDistributeAllUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDistributeAllUserResponseBody self = new ListDistributeAllUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDistributeAllUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDistributeAllUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDistributeAllUserResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDistributeAllUserResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDistributeAllUserResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDistributeAllUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDistributeAllUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDistributeAllUserResponseBody setUserList(java.util.List<ListDistributeAllUserResponseBodyUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<ListDistributeAllUserResponseBodyUserList> getUserList() {
        return this.userList;
    }

    public static class ListDistributeAllUserResponseBodyUserList extends TeaModel {
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

        public static ListDistributeAllUserResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            ListDistributeAllUserResponseBodyUserList self = new ListDistributeAllUserResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public ListDistributeAllUserResponseBodyUserList setIsDistributeUser(Boolean isDistributeUser) {
            this.isDistributeUser = isDistributeUser;
            return this;
        }
        public Boolean getIsDistributeUser() {
            return this.isDistributeUser;
        }

        public ListDistributeAllUserResponseBodyUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDistributeAllUserResponseBodyUserList setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListDistributeAllUserResponseBodyUserList setSubscribeId(Long subscribeId) {
            this.subscribeId = subscribeId;
            return this;
        }
        public Long getSubscribeId() {
            return this.subscribeId;
        }

        public ListDistributeAllUserResponseBodyUserList setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

        public ListDistributeAllUserResponseBodyUserList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListDistributeAllUserResponseBodyUserList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
