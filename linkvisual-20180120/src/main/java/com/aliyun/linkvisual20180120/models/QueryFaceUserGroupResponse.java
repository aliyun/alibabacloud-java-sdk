// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserGroupResponse extends TeaModel {
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
    public QueryFaceUserGroupResponseData data;

    public static QueryFaceUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserGroupResponse self = new QueryFaceUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceUserGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFaceUserGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceUserGroupResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryFaceUserGroupResponse setData(QueryFaceUserGroupResponseData data) {
        this.data = data;
        return this;
    }
    public QueryFaceUserGroupResponseData getData() {
        return this.data;
    }

    public static class QueryFaceUserGroupResponseDataUserGroupList extends TeaModel {
        @NameInMap("UserGroupId")
        @Validation(required = true)
        public String userGroupId;

        @NameInMap("UserGroupName")
        @Validation(required = true)
        public String userGroupName;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        public static QueryFaceUserGroupResponseDataUserGroupList build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserGroupResponseDataUserGroupList self = new QueryFaceUserGroupResponseDataUserGroupList();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserGroupResponseDataUserGroupList setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public QueryFaceUserGroupResponseDataUserGroupList setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public QueryFaceUserGroupResponseDataUserGroupList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class QueryFaceUserGroupResponseData extends TeaModel {
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
        public java.util.List<QueryFaceUserGroupResponseDataUserGroupList> userGroupList;

        public static QueryFaceUserGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceUserGroupResponseData self = new QueryFaceUserGroupResponseData();
            return TeaModel.build(map, self);
        }

        public QueryFaceUserGroupResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryFaceUserGroupResponseData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryFaceUserGroupResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryFaceUserGroupResponseData setUserGroupList(java.util.List<QueryFaceUserGroupResponseDataUserGroupList> userGroupList) {
            this.userGroupList = userGroupList;
            return this;
        }
        public java.util.List<QueryFaceUserGroupResponseDataUserGroupList> getUserGroupList() {
            return this.userGroupList;
        }

    }

}
