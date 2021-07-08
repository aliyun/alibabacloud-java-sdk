// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListGroupSilenceMembersResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Result")
    public ListGroupSilenceMembersResponseBodyResult result;

    public static ListGroupSilenceMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupSilenceMembersResponseBody self = new ListGroupSilenceMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupSilenceMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupSilenceMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGroupSilenceMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGroupSilenceMembersResponseBody setResult(ListGroupSilenceMembersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListGroupSilenceMembersResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListGroupSilenceMembersResponseBodyResult extends TeaModel {
        // 群会话id
        @NameInMap("AppCid")
        public String appCid;

        // 禁言白名单
        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        // 禁言黑名单用户及对应禁言截止时间
        @NameInMap("Blacklist")
        public java.util.Map<String, Long> blacklist;

        public static ListGroupSilenceMembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListGroupSilenceMembersResponseBodyResult self = new ListGroupSilenceMembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListGroupSilenceMembersResponseBodyResult setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public ListGroupSilenceMembersResponseBodyResult setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

        public ListGroupSilenceMembersResponseBodyResult setBlacklist(java.util.Map<String, Long> blacklist) {
            this.blacklist = blacklist;
            return this;
        }
        public java.util.Map<String, Long> getBlacklist() {
            return this.blacklist;
        }

    }

}
