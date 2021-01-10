// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryFaceUserGroupResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserGroupResponseBody self = new QueryFaceUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceUserGroupResponseBody setData(QueryFaceUserGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceUserGroupResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceUserGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceUserGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceUserGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceUserGroupResponseBodyDataUserGroupList extends TeaModel {
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("UserGroupId")
        public String userGroupId;

        @NameInMap("UserGroupName")
        public String userGroupName;

        public static QueryFaceUserGroupResponseBodyDataUserGroupList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserGroupResponseBodyDataUserGroupList self = new QueryFaceUserGroupResponseBodyDataUserGroupList();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserGroupResponseBodyDataUserGroupList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryFaceUserGroupResponseBodyDataUserGroupList setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public QueryFaceUserGroupResponseBodyDataUserGroupList setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

    public static class QueryFaceUserGroupResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("UserGroupList")
        public java.util.List<QueryFaceUserGroupResponseBodyDataUserGroupList> userGroupList;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryFaceUserGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserGroupResponseBodyData self = new QueryFaceUserGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserGroupResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryFaceUserGroupResponseBodyData setUserGroupList(java.util.List<QueryFaceUserGroupResponseBodyDataUserGroupList> userGroupList) {
            this.userGroupList = userGroupList;
            return this;
        }
        public java.util.List<QueryFaceUserGroupResponseBodyDataUserGroupList> getUserGroupList() {
            return this.userGroupList;
        }

        public QueryFaceUserGroupResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceUserGroupResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
