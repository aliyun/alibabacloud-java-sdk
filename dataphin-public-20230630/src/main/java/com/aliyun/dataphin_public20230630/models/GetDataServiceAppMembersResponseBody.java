// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAppMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDataServiceAppMembersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDataServiceAppMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAppMembersResponseBody self = new GetDataServiceAppMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAppMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataServiceAppMembersResponseBody setData(GetDataServiceAppMembersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceAppMembersResponseBodyData getData() {
        return this.data;
    }

    public GetDataServiceAppMembersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceAppMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataServiceAppMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceAppMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServiceAppMembersResponseBodyDataMemberList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-12-12</p>
         */
        @NameInMap("EffectiveEnd")
        public String effectiveEnd;

        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>200000245</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetDataServiceAppMembersResponseBodyDataMemberList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceAppMembersResponseBodyDataMemberList self = new GetDataServiceAppMembersResponseBodyDataMemberList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceAppMembersResponseBodyDataMemberList setEffectiveEnd(String effectiveEnd) {
            this.effectiveEnd = effectiveEnd;
            return this;
        }
        public String getEffectiveEnd() {
            return this.effectiveEnd;
        }

        public GetDataServiceAppMembersResponseBodyDataMemberList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetDataServiceAppMembersResponseBodyDataMemberList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetDataServiceAppMembersResponseBodyData extends TeaModel {
        @NameInMap("MemberList")
        public java.util.List<GetDataServiceAppMembersResponseBodyDataMemberList> memberList;

        public static GetDataServiceAppMembersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceAppMembersResponseBodyData self = new GetDataServiceAppMembersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataServiceAppMembersResponseBodyData setMemberList(java.util.List<GetDataServiceAppMembersResponseBodyDataMemberList> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<GetDataServiceAppMembersResponseBodyDataMemberList> getMemberList() {
            return this.memberList;
        }

    }

}
