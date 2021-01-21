// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryFaceAllUserGroupResponseData data;

    public static QueryFaceAllUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserGroupResponse self = new QueryFaceAllUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceAllUserGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFaceAllUserGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceAllUserGroupResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceAllUserGroupResponse setData(QueryFaceAllUserGroupResponseData data) {
        this.data = data;
        return this;
    }
    public QueryFaceAllUserGroupResponseData getData() {
        return this.data;
    }

    public static class QueryFaceAllUserGroupResponseDataUserGroupList extends TeaModel {
        @NameInMap("UserGroupId")
        @Validation(required = true)
        public String userGroupId;

        @NameInMap("UserGroupName")
        @Validation(required = true)
        public String userGroupName;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        public static QueryFaceAllUserGroupResponseDataUserGroupList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserGroupResponseDataUserGroupList self = new QueryFaceAllUserGroupResponseDataUserGroupList();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserGroupResponseDataUserGroupList setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public QueryFaceAllUserGroupResponseDataUserGroupList setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public QueryFaceAllUserGroupResponseDataUserGroupList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class QueryFaceAllUserGroupResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageNo")
        @Validation(required = true)
        public Integer pageNo;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("UserGroupList")
        @Validation(required = true)
        public java.util.List<QueryFaceAllUserGroupResponseDataUserGroupList> userGroupList;

        public static QueryFaceAllUserGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceAllUserGroupResponseData self = new QueryFaceAllUserGroupResponseData();
            return TeaModel.build(map, self);
        }

        public QueryFaceAllUserGroupResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryFaceAllUserGroupResponseData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryFaceAllUserGroupResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceAllUserGroupResponseData setUserGroupList(java.util.List<QueryFaceAllUserGroupResponseDataUserGroupList> userGroupList) {
            this.userGroupList = userGroupList;
            return this;
        }
        public java.util.List<QueryFaceAllUserGroupResponseDataUserGroupList> getUserGroupList() {
            return this.userGroupList;
        }

    }

}
