// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySubUserAuthListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QuerySubUserAuthListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySubUserAuthListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySubUserAuthListResponseBody self = new QuerySubUserAuthListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySubUserAuthListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySubUserAuthListResponseBody setData(java.util.List<QuerySubUserAuthListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySubUserAuthListResponseBodyData> getData() {
        return this.data;
    }

    public QuerySubUserAuthListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySubUserAuthListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySubUserAuthListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySubUserAuthListResponseBodyData extends TeaModel {
        @NameInMap("delete")
        public String delete;

        @NameInMap("displayName")
        public String displayName;

        @NameInMap("id")
        public Long id;

        @NameInMap("parentUid")
        public String parentUid;

        @NameInMap("roleType")
        public Integer roleType;

        @NameInMap("subUserId")
        public String subUserId;

        @NameInMap("userName")
        public String userName;

        public static QuerySubUserAuthListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySubUserAuthListResponseBodyData self = new QuerySubUserAuthListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySubUserAuthListResponseBodyData setDelete(String delete) {
            this.delete = delete;
            return this;
        }
        public String getDelete() {
            return this.delete;
        }

        public QuerySubUserAuthListResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QuerySubUserAuthListResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuerySubUserAuthListResponseBodyData setParentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public String getParentUid() {
            return this.parentUid;
        }

        public QuerySubUserAuthListResponseBodyData setRoleType(Integer roleType) {
            this.roleType = roleType;
            return this;
        }
        public Integer getRoleType() {
            return this.roleType;
        }

        public QuerySubUserAuthListResponseBodyData setSubUserId(String subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public String getSubUserId() {
            return this.subUserId;
        }

        public QuerySubUserAuthListResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
