// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetGroupMemberByIdsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetGroupMemberByIdsResponseBodyResult result;

    public static GetGroupMemberByIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupMemberByIdsResponseBody self = new GetGroupMemberByIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupMemberByIdsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGroupMemberByIdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGroupMemberByIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGroupMemberByIdsResponseBody setResult(GetGroupMemberByIdsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetGroupMemberByIdsResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetGroupMemberByIdsResponseBodyResultMembers extends TeaModel {
        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        @NameInMap("JoinTime")
        public Long joinTime;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("Role")
        public Integer role;

        public static GetGroupMemberByIdsResponseBodyResultMembers build(java.util.Map<String, ?> map) throws Exception {
            GetGroupMemberByIdsResponseBodyResultMembers self = new GetGroupMemberByIdsResponseBodyResultMembers();
            return TeaModel.build(map, self);
        }

        public GetGroupMemberByIdsResponseBodyResultMembers setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public GetGroupMemberByIdsResponseBodyResultMembers setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public GetGroupMemberByIdsResponseBodyResultMembers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public GetGroupMemberByIdsResponseBodyResultMembers setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetGroupMemberByIdsResponseBodyResultMembers setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

    }

    public static class GetGroupMemberByIdsResponseBodyResult extends TeaModel {
        @NameInMap("Members")
        public java.util.List<GetGroupMemberByIdsResponseBodyResultMembers> members;

        public static GetGroupMemberByIdsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetGroupMemberByIdsResponseBodyResult self = new GetGroupMemberByIdsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetGroupMemberByIdsResponseBodyResult setMembers(java.util.List<GetGroupMemberByIdsResponseBodyResultMembers> members) {
            this.members = members;
            return this;
        }
        public java.util.List<GetGroupMemberByIdsResponseBodyResultMembers> getMembers() {
            return this.members;
        }

    }

}
