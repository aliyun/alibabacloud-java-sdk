// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetUserDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetUserDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserDetailResponseBody self = new GetUserDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserDetailResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetUserDetailResponseBody setData(GetUserDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserDetailResponseBodyData getData() {
        return this.data;
    }

    public GetUserDetailResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserDetailResponseBodyDataSdfMemberExtInfo extends TeaModel {
        @NameInMap("AliyunAccount")
        public String aliyunAccount;

        @NameInMap("AliyunNick")
        public String aliyunNick;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Uid")
        public String uid;

        public static GetUserDetailResponseBodyDataSdfMemberExtInfo build(java.util.Map<String, ?> map) throws Exception {
            GetUserDetailResponseBodyDataSdfMemberExtInfo self = new GetUserDetailResponseBodyDataSdfMemberExtInfo();
            return TeaModel.build(map, self);
        }

        public GetUserDetailResponseBodyDataSdfMemberExtInfo setAliyunAccount(String aliyunAccount) {
            this.aliyunAccount = aliyunAccount;
            return this;
        }
        public String getAliyunAccount() {
            return this.aliyunAccount;
        }

        public GetUserDetailResponseBodyDataSdfMemberExtInfo setAliyunNick(String aliyunNick) {
            this.aliyunNick = aliyunNick;
            return this;
        }
        public String getAliyunNick() {
            return this.aliyunNick;
        }

        public GetUserDetailResponseBodyDataSdfMemberExtInfo setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public GetUserDetailResponseBodyDataSdfMemberExtInfo setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public GetUserDetailResponseBodyDataSdfMemberExtInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetUserDetailResponseBodyDataSdfMemberExtInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class GetUserDetailResponseBodyDataSdfServiceDetail extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Type")
        public Integer type;

        public static GetUserDetailResponseBodyDataSdfServiceDetail build(java.util.Map<String, ?> map) throws Exception {
            GetUserDetailResponseBodyDataSdfServiceDetail self = new GetUserDetailResponseBodyDataSdfServiceDetail();
            return TeaModel.build(map, self);
        }

        public GetUserDetailResponseBodyDataSdfServiceDetail setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetUserDetailResponseBodyDataSdfServiceDetail setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public GetUserDetailResponseBodyDataSdfServiceDetail setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetUserDetailResponseBodyDataSdfServiceDetail setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class GetUserDetailResponseBodyData extends TeaModel {
        @NameInMap("Bid")
        public Integer bid;

        @NameInMap("CsccMode")
        public String csccMode;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MemberStatus")
        public Integer memberStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("SdfMemberExtInfo")
        public GetUserDetailResponseBodyDataSdfMemberExtInfo sdfMemberExtInfo;

        @NameInMap("SdfServiceDetail")
        public java.util.List<GetUserDetailResponseBodyDataSdfServiceDetail> sdfServiceDetail;

        @NameInMap("Uri")
        public String uri;

        public static GetUserDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserDetailResponseBodyData self = new GetUserDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserDetailResponseBodyData setBid(Integer bid) {
            this.bid = bid;
            return this;
        }
        public Integer getBid() {
            return this.bid;
        }

        public GetUserDetailResponseBodyData setCsccMode(String csccMode) {
            this.csccMode = csccMode;
            return this;
        }
        public String getCsccMode() {
            return this.csccMode;
        }

        public GetUserDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUserDetailResponseBodyData setMemberStatus(Integer memberStatus) {
            this.memberStatus = memberStatus;
            return this;
        }
        public Integer getMemberStatus() {
            return this.memberStatus;
        }

        public GetUserDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetUserDetailResponseBodyData setSdfMemberExtInfo(GetUserDetailResponseBodyDataSdfMemberExtInfo sdfMemberExtInfo) {
            this.sdfMemberExtInfo = sdfMemberExtInfo;
            return this;
        }
        public GetUserDetailResponseBodyDataSdfMemberExtInfo getSdfMemberExtInfo() {
            return this.sdfMemberExtInfo;
        }

        public GetUserDetailResponseBodyData setSdfServiceDetail(java.util.List<GetUserDetailResponseBodyDataSdfServiceDetail> sdfServiceDetail) {
            this.sdfServiceDetail = sdfServiceDetail;
            return this;
        }
        public java.util.List<GetUserDetailResponseBodyDataSdfServiceDetail> getSdfServiceDetail() {
            return this.sdfServiceDetail;
        }

        public GetUserDetailResponseBodyData setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
