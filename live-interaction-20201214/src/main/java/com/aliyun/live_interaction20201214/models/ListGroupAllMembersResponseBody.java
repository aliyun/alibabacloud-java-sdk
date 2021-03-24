// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListGroupAllMembersResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // 拉取群成员列表的结果
    @NameInMap("Result")
    public ListGroupAllMembersResponseBodyResult result;

    public static ListGroupAllMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupAllMembersResponseBody self = new ListGroupAllMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupAllMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public ListGroupAllMembersResponseBody setResult(ListGroupAllMembersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListGroupAllMembersResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListGroupAllMembersResponseBodyResultMembers extends TeaModel {
        // 群成员ID
        @NameInMap("AppUid")
        public String appUid;

        // 群成员角色
        @NameInMap("Role")
        public Integer role;

        // 群成员昵称
        @NameInMap("Nick")
        public String nick;

        // 群成员入群时间
        @NameInMap("JoinTime")
        public Long joinTime;

        // 群成员扩展信息
        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

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

        public ListGroupAllMembersResponseBodyResultMembers setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public ListGroupAllMembersResponseBodyResultMembers setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ListGroupAllMembersResponseBodyResultMembers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public ListGroupAllMembersResponseBodyResultMembers setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

    }

    public static class ListGroupAllMembersResponseBodyResult extends TeaModel {
        // 群成员列表
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
