// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPermissionListResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryPermissionListResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public QueryPermissionListResponseBody setData(QueryPermissionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPermissionListResponseBodyData getData() {
        return this.data;
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

    public static class QueryPermissionListResponseBodyDataPermissionList extends TeaModel {
        /**
         * <p>The time when the permission expired. If no value is returned, the permission is still valid. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC. For example, 2016-05-23T12:00:00Z indicates that the permission expired at 20:00:00 on May 23, 2016 (UTC+8).</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The code of the permission.</p>
         */
        @NameInMap("PermissionCode")
        public String permissionCode;

        /**
         * <p>The name of the permission.</p>
         */
        @NameInMap("PermissionName")
        public String permissionName;

        /**
         * <p>The time when the permission took effect. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC. For example, 2016-05-23T12:00:00Z indicates that the permission took effect at 20:00:00 on May 23, 2016 (UTC+8).</p>
         */
        @NameInMap("StartTime")
        public String startTime;

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

        public QueryPermissionListResponseBodyDataPermissionList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryPermissionListResponseBodyData extends TeaModel {
        /**
         * <p>The time when the relationship expired. If no value is returned, the relationship is still valid.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the management account.</p>
         */
        @NameInMap("MasterId")
        public Long masterId;

        /**
         * <p>The ID of the member.</p>
         */
        @NameInMap("MemberId")
        public Long memberId;

        /**
         * <p>The list of permissions.</p>
         */
        @NameInMap("PermissionList")
        public java.util.List<QueryPermissionListResponseBodyDataPermissionList> permissionList;

        /**
         * <p>The type of the relationship. Valid values: FinancialManagement and FinancialTrusteeship.</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The time when the relationship was established. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC. For example, 2016-05-23T12:00:00Z indicates that the relationship was established at 20:00:00 on May 23, 2016 (UTC+8).</p>
         */
        @NameInMap("SetupTime")
        public String setupTime;

        /**
         * <p>The time when the relationship took effect. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC. For example, 2016-05-23T12:00:00Z indicates that the relationship took effect at 20:00:00 on May 23, 2016 (UTC+8).</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the relationship. For more information about valid values of this parameter, see the enumeration values of the RelationshipStatusEnum type in the following table.</p>
         */
        @NameInMap("State")
        public String state;

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

        public QueryPermissionListResponseBodyData setPermissionList(java.util.List<QueryPermissionListResponseBodyDataPermissionList> permissionList) {
            this.permissionList = permissionList;
            return this;
        }
        public java.util.List<QueryPermissionListResponseBodyDataPermissionList> getPermissionList() {
            return this.permissionList;
        }

        public QueryPermissionListResponseBodyData setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public QueryPermissionListResponseBodyData setSetupTime(String setupTime) {
            this.setupTime = setupTime;
            return this;
        }
        public String getSetupTime() {
            return this.setupTime;
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

    }

}
