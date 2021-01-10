// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryFaceAllUserGroupResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceAllUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserGroupResponseBody self = new QueryFaceAllUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceAllUserGroupResponseBody setData(QueryFaceAllUserGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceAllUserGroupResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceAllUserGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceAllUserGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceAllUserGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceAllUserGroupResponseBodyDataUserGroupList extends TeaModel {
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("UserGroupId")
        public String userGroupId;

        @NameInMap("UserGroupName")
        public String userGroupName;

        public static QueryFaceAllUserGroupResponseBodyDataUserGroupList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserGroupResponseBodyDataUserGroupList self = new QueryFaceAllUserGroupResponseBodyDataUserGroupList();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserGroupResponseBodyDataUserGroupList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryFaceAllUserGroupResponseBodyDataUserGroupList setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public QueryFaceAllUserGroupResponseBodyDataUserGroupList setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

    public static class QueryFaceAllUserGroupResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("UserGroupList")
        public java.util.List<QueryFaceAllUserGroupResponseBodyDataUserGroupList> userGroupList;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryFaceAllUserGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserGroupResponseBodyData self = new QueryFaceAllUserGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserGroupResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryFaceAllUserGroupResponseBodyData setUserGroupList(java.util.List<QueryFaceAllUserGroupResponseBodyDataUserGroupList> userGroupList) {
            this.userGroupList = userGroupList;
            return this;
        }
        public java.util.List<QueryFaceAllUserGroupResponseBodyDataUserGroupList> getUserGroupList() {
            return this.userGroupList;
        }

        public QueryFaceAllUserGroupResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceAllUserGroupResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
