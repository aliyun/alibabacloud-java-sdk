// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListGroupAllMembersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListGroupAllMembersResponseBodyResult result;

    public static ListGroupAllMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupAllMembersResponseBody self = new ListGroupAllMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupAllMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGroupAllMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGroupAllMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupAllMembersResponseBody setResult(ListGroupAllMembersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListGroupAllMembersResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListGroupAllMembersResponseBodyResultMembers extends TeaModel {
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

        public static ListGroupAllMembersResponseBodyResultMembers build(java.util.Map<String, ?> map) throws Exception {
            ListGroupAllMembersResponseBodyResultMembers self = new ListGroupAllMembersResponseBodyResultMembers();
            return TeaModel.build(map, self);
        }

        public ListGroupAllMembersResponseBodyResultMembers setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ListGroupAllMembersResponseBodyResultMembers setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public ListGroupAllMembersResponseBodyResultMembers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public ListGroupAllMembersResponseBodyResultMembers setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ListGroupAllMembersResponseBodyResultMembers setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

    }

    public static class ListGroupAllMembersResponseBodyResult extends TeaModel {
        @NameInMap("Members")
        public java.util.List<ListGroupAllMembersResponseBodyResultMembers> members;

        public static ListGroupAllMembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListGroupAllMembersResponseBodyResult self = new ListGroupAllMembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListGroupAllMembersResponseBodyResult setMembers(java.util.List<ListGroupAllMembersResponseBodyResultMembers> members) {
            this.members = members;
            return this;
        }
        public java.util.List<ListGroupAllMembersResponseBodyResultMembers> getMembers() {
            return this.members;
        }

    }

}
