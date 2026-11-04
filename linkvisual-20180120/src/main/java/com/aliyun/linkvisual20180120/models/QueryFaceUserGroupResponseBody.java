// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserGroupResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public QueryFaceUserGroupResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A13279A-5640-45E7-87AA-83750541AD0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserGroupResponseBody self = new QueryFaceUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public QueryFaceUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceUserGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceUserGroupResponseBodyDataUserGroupList extends TeaModel {
        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-12 17:12:37</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestUserGroupId</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestUserGroupName</p>
         */
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
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of user groups.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>The list of user groups.</p>
         */
        @NameInMap("UserGroupList")
        public java.util.List<QueryFaceUserGroupResponseBodyDataUserGroupList> userGroupList;

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

        public QueryFaceUserGroupResponseBodyData setUserGroupList(java.util.List<QueryFaceUserGroupResponseBodyDataUserGroupList> userGroupList) {
            this.userGroupList = userGroupList;
            return this;
        }
        public java.util.List<QueryFaceUserGroupResponseBodyDataUserGroupList> getUserGroupList() {
            return this.userGroupList;
        }

    }

}
