// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPermissionListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryPermissionListResponseData data;

    public static QueryPermissionListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPermissionListResponse self = new QueryPermissionListResponse();
        return TeaModel.build(map, self);
    }

    public QueryPermissionListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPermissionListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPermissionListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPermissionListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPermissionListResponse setData(QueryPermissionListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryPermissionListResponseData getData() {
        return this.data;
    }

    public static class QueryPermissionListResponseDataPermissionList extends TeaModel {
        @NameInMap("PermissionCode")
        @Validation(required = true)
        public String permissionCode;

        @NameInMap("PermissionName")
        @Validation(required = true)
        public String permissionName;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        public static QueryPermissionListResponseDataPermissionList build(java.util.Map<String, ?> map) throws Exception {
            QueryPermissionListResponseDataPermissionList self = new QueryPermissionListResponseDataPermissionList();
            return TeaModel.build(map, self);
        }

        public QueryPermissionListResponseDataPermissionList setPermissionCode(String permissionCode) {
            this.permissionCode = permissionCode;
            return this;
        }
        public String getPermissionCode() {
            return this.permissionCode;
        }

        public QueryPermissionListResponseDataPermissionList setPermissionName(String permissionName) {
            this.permissionName = permissionName;
            return this;
        }
        public String getPermissionName() {
            return this.permissionName;
        }

        public QueryPermissionListResponseDataPermissionList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryPermissionListResponseDataPermissionList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class QueryPermissionListResponseData extends TeaModel {
        @NameInMap("MasterId")
        @Validation(required = true)
        public Long masterId;

        @NameInMap("MemberId")
        @Validation(required = true)
        public Long memberId;

        @NameInMap("RelationType")
        @Validation(required = true)
        public String relationType;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("SetupTime")
        @Validation(required = true)
        public String setupTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("PermissionList")
        @Validation(required = true)
        public java.util.List<QueryPermissionListResponseDataPermissionList> permissionList;

        public static QueryPermissionListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryPermissionListResponseData self = new QueryPermissionListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryPermissionListResponseData setMasterId(Long masterId) {
            this.masterId = masterId;
            return this;
        }
        public Long getMasterId() {
            return this.masterId;
        }

        public QueryPermissionListResponseData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public QueryPermissionListResponseData setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public QueryPermissionListResponseData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryPermissionListResponseData setSetupTime(String setupTime) {
            this.setupTime = setupTime;
            return this;
        }
        public String getSetupTime() {
            return this.setupTime;
        }

        public QueryPermissionListResponseData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryPermissionListResponseData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryPermissionListResponseData setPermissionList(java.util.List<QueryPermissionListResponseDataPermissionList> permissionList) {
            this.permissionList = permissionList;
            return this;
        }
        public java.util.List<QueryPermissionListResponseDataPermissionList> getPermissionList() {
            return this.permissionList;
        }

    }

}
