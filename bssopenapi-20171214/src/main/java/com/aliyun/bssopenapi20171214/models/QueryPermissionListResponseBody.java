// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPermissionListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryPermissionListResponseBodyData data;

    public static QueryPermissionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPermissionListResponseBody self = new QueryPermissionListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPermissionListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPermissionListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPermissionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPermissionListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPermissionListResponseBody setData(QueryPermissionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPermissionListResponseBodyData getData() {
        return this.data;
    }

    public static class QueryPermissionListResponseBodyDataPermissionList extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("PermissionCode")
        public String permissionCode;

        @NameInMap("PermissionName")
        public String permissionName;

        public static QueryPermissionListResponseBodyDataPermissionList build(java.util.Map<String, ?> map) throws Exception {
            QueryPermissionListResponseBodyDataPermissionList self = new QueryPermissionListResponseBodyDataPermissionList();
            return TeaModel.build(map, self);
        }

        public QueryPermissionListResponseBodyDataPermissionList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryPermissionListResponseBodyDataPermissionList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryPermissionListResponseBodyDataPermissionList setPermissionCode(String permissionCode) {
            this.permissionCode = permissionCode;
            return this;
        }
        public String getPermissionCode() {
            return this.permissionCode;
        }

        public QueryPermissionListResponseBodyDataPermissionList setPermissionName(String permissionName) {
            this.permissionName = permissionName;
            return this;
        }
        public String getPermissionName() {
            return this.permissionName;
        }

    }

    public static class QueryPermissionListResponseBodyData extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("RelationType")
        public String relationType;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("MasterId")
        public Long masterId;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("SetupTime")
        public String setupTime;

        @NameInMap("PermissionList")
        public java.util.List<QueryPermissionListResponseBodyDataPermissionList> permissionList;

        public static QueryPermissionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPermissionListResponseBodyData self = new QueryPermissionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPermissionListResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryPermissionListResponseBodyData setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public QueryPermissionListResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryPermissionListResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryPermissionListResponseBodyData setMasterId(Long masterId) {
            this.masterId = masterId;
            return this;
        }
        public Long getMasterId() {
            return this.masterId;
        }

        public QueryPermissionListResponseBodyData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public QueryPermissionListResponseBodyData setSetupTime(String setupTime) {
            this.setupTime = setupTime;
            return this;
        }
        public String getSetupTime() {
            return this.setupTime;
        }

        public QueryPermissionListResponseBodyData setPermissionList(java.util.List<QueryPermissionListResponseBodyDataPermissionList> permissionList) {
            this.permissionList = permissionList;
            return this;
        }
        public java.util.List<QueryPermissionListResponseBodyDataPermissionList> getPermissionList() {
            return this.permissionList;
        }

    }

}
