// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserGroupResponseBody extends TeaModel {
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
    public QueryFaceAllUserGroupResponseBodyData data;

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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryFaceAllUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserGroupResponseBody self = new QueryFaceAllUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public QueryFaceAllUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceAllUserGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFaceAllUserGroupResponseBodyDataUserGroupList extends TeaModel {
        /**
         * <p>The last modified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-12 17:12:37</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dmjpxfdk</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>The user group name.</p>
         * 
         * <strong>example:</strong>
         * <p>TestUserGroupName</p>
         */
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
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The page size.</p>
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
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>The list of user group information.</p>
         */
        @NameInMap("UserGroupList")
        public java.util.List<QueryFaceAllUserGroupResponseBodyDataUserGroupList> userGroupList;

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

        public QueryFaceAllUserGroupResponseBodyData setUserGroupList(java.util.List<QueryFaceAllUserGroupResponseBodyDataUserGroupList> userGroupList) {
            this.userGroupList = userGroupList;
            return this;
        }
        public java.util.List<QueryFaceAllUserGroupResponseBodyDataUserGroupList> getUserGroupList() {
            return this.userGroupList;
        }

    }

}
