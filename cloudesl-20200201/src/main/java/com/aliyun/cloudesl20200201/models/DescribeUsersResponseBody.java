// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

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
    public Integer totalCount;

    @NameInMap("Users")
    public java.util.List<DescribeUsersResponseBodyUsers> users;

    public static DescribeUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersResponseBody self = new DescribeUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeUsersResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeUsersResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeUsersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeUsersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeUsersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUsersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeUsersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeUsersResponseBody setUsers(java.util.List<DescribeUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<DescribeUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class DescribeUsersResponseBodyUsersDingTalkInfos extends TeaModel {
        @NameInMap("DingTalkCompanyId")
        public String dingTalkCompanyId;

        @NameInMap("DingTalkUserId")
        public String dingTalkUserId;

        public static DescribeUsersResponseBodyUsersDingTalkInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersResponseBodyUsersDingTalkInfos self = new DescribeUsersResponseBodyUsersDingTalkInfos();
            return TeaModel.build(map, self);
        }

        public DescribeUsersResponseBodyUsersDingTalkInfos setDingTalkCompanyId(String dingTalkCompanyId) {
            this.dingTalkCompanyId = dingTalkCompanyId;
            return this;
        }
        public String getDingTalkCompanyId() {
            return this.dingTalkCompanyId;
        }

        public DescribeUsersResponseBodyUsersDingTalkInfos setDingTalkUserId(String dingTalkUserId) {
            this.dingTalkUserId = dingTalkUserId;
            return this;
        }
        public String getDingTalkUserId() {
            return this.dingTalkUserId;
        }

    }

    public static class DescribeUsersResponseBodyUsers extends TeaModel {
        @NameInMap("Bid")
        public String bid;

        @NameInMap("DingTalkInfos")
        public java.util.List<DescribeUsersResponseBodyUsersDingTalkInfos> dingTalkInfos;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Stores")
        public String stores;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserType")
        public String userType;

        public static DescribeUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersResponseBodyUsers self = new DescribeUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public DescribeUsersResponseBodyUsers setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeUsersResponseBodyUsers setDingTalkInfos(java.util.List<DescribeUsersResponseBodyUsersDingTalkInfos> dingTalkInfos) {
            this.dingTalkInfos = dingTalkInfos;
            return this;
        }
        public java.util.List<DescribeUsersResponseBodyUsersDingTalkInfos> getDingTalkInfos() {
            return this.dingTalkInfos;
        }

        public DescribeUsersResponseBodyUsers setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeUsersResponseBodyUsers setStores(String stores) {
            this.stores = stores;
            return this;
        }
        public String getStores() {
            return this.stores;
        }

        public DescribeUsersResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeUsersResponseBodyUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeUsersResponseBodyUsers setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
