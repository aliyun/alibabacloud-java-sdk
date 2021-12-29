// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListPrivacyRuleSharedMemberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListPrivacyRuleSharedMemberResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPrivacyRuleSharedMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivacyRuleSharedMemberResponseBody self = new ListPrivacyRuleSharedMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivacyRuleSharedMemberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPrivacyRuleSharedMemberResponseBody setData(java.util.List<ListPrivacyRuleSharedMemberResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPrivacyRuleSharedMemberResponseBodyData> getData() {
        return this.data;
    }

    public ListPrivacyRuleSharedMemberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPrivacyRuleSharedMemberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrivacyRuleSharedMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrivacyRuleSharedMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPrivacyRuleSharedMemberResponseBodyDataMemberList extends TeaModel {
        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Shared")
        public String shared;

        public static ListPrivacyRuleSharedMemberResponseBodyDataMemberList build(java.util.Map<String, ?> map) throws Exception {
            ListPrivacyRuleSharedMemberResponseBodyDataMemberList self = new ListPrivacyRuleSharedMemberResponseBodyDataMemberList();
            return TeaModel.build(map, self);
        }

        public ListPrivacyRuleSharedMemberResponseBodyDataMemberList setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListPrivacyRuleSharedMemberResponseBodyDataMemberList setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public ListPrivacyRuleSharedMemberResponseBodyDataMemberList setShared(String shared) {
            this.shared = shared;
            return this;
        }
        public String getShared() {
            return this.shared;
        }

    }

    public static class ListPrivacyRuleSharedMemberResponseBodyData extends TeaModel {
        @NameInMap("BizChainId")
        public String bizChainId;

        @NameInMap("BizChainName")
        public String bizChainName;

        @NameInMap("MemberList")
        public java.util.List<ListPrivacyRuleSharedMemberResponseBodyDataMemberList> memberList;

        public static ListPrivacyRuleSharedMemberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPrivacyRuleSharedMemberResponseBodyData self = new ListPrivacyRuleSharedMemberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPrivacyRuleSharedMemberResponseBodyData setBizChainId(String bizChainId) {
            this.bizChainId = bizChainId;
            return this;
        }
        public String getBizChainId() {
            return this.bizChainId;
        }

        public ListPrivacyRuleSharedMemberResponseBodyData setBizChainName(String bizChainName) {
            this.bizChainName = bizChainName;
            return this;
        }
        public String getBizChainName() {
            return this.bizChainName;
        }

        public ListPrivacyRuleSharedMemberResponseBodyData setMemberList(java.util.List<ListPrivacyRuleSharedMemberResponseBodyDataMemberList> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<ListPrivacyRuleSharedMemberResponseBodyDataMemberList> getMemberList() {
            return this.memberList;
        }

    }

}
