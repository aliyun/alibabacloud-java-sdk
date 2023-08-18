// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListWhitelistUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("WhitelistUsers")
    public java.util.List<ListWhitelistUserResponseBodyWhitelistUsers> whitelistUsers;

    public static ListWhitelistUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWhitelistUserResponseBody self = new ListWhitelistUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWhitelistUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWhitelistUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWhitelistUserResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListWhitelistUserResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWhitelistUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWhitelistUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWhitelistUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListWhitelistUserResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public ListWhitelistUserResponseBody setWhitelistUsers(java.util.List<ListWhitelistUserResponseBodyWhitelistUsers> whitelistUsers) {
        this.whitelistUsers = whitelistUsers;
        return this;
    }
    public java.util.List<ListWhitelistUserResponseBodyWhitelistUsers> getWhitelistUsers() {
        return this.whitelistUsers;
    }

    public static class ListWhitelistUserResponseBodyWhitelistUsers extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("State")
        public Integer state;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static ListWhitelistUserResponseBodyWhitelistUsers build(java.util.Map<String, ?> map) throws Exception {
            ListWhitelistUserResponseBodyWhitelistUsers self = new ListWhitelistUserResponseBodyWhitelistUsers();
            return TeaModel.build(map, self);
        }

        public ListWhitelistUserResponseBodyWhitelistUsers setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWhitelistUserResponseBodyWhitelistUsers setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListWhitelistUserResponseBodyWhitelistUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWhitelistUserResponseBodyWhitelistUsers setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListWhitelistUserResponseBodyWhitelistUsers setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public ListWhitelistUserResponseBodyWhitelistUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListWhitelistUserResponseBodyWhitelistUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
