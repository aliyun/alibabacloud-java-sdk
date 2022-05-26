// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetDingTalkUserOrgByAliyunTmpCodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDingTalkUserOrgByAliyunTmpCodeResponseBodyData data;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDingTalkUserOrgByAliyunTmpCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDingTalkUserOrgByAliyunTmpCodeResponseBody self = new GetDingTalkUserOrgByAliyunTmpCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDingTalkUserOrgByAliyunTmpCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDingTalkUserOrgByAliyunTmpCodeResponseBody setData(GetDingTalkUserOrgByAliyunTmpCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDingTalkUserOrgByAliyunTmpCodeResponseBodyData getData() {
        return this.data;
    }

    public GetDingTalkUserOrgByAliyunTmpCodeResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetDingTalkUserOrgByAliyunTmpCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDingTalkUserOrgByAliyunTmpCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDingTalkUserOrgByAliyunTmpCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDingTalkUserOrgByAliyunTmpCodeResponseBodyDataOrgDtoList extends TeaModel {
        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("OrgId")
        public String orgId;

        @NameInMap("OrgName")
        public String orgName;

        public static GetDingTalkUserOrgByAliyunTmpCodeResponseBodyDataOrgDtoList build(java.util.Map<String, ?> map) throws Exception {
            GetDingTalkUserOrgByAliyunTmpCodeResponseBodyDataOrgDtoList self = new GetDingTalkUserOrgByAliyunTmpCodeResponseBodyDataOrgDtoList();
            return TeaModel.build(map, self);
        }

        public GetDingTalkUserOrgByAliyunTmpCodeResponseBodyDataOrgDtoList setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetDingTalkUserOrgByAliyunTmpCodeResponseBodyDataOrgDtoList setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public GetDingTalkUserOrgByAliyunTmpCodeResponseBodyDataOrgDtoList setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

    }

    public static class GetDingTalkUserOrgByAliyunTmpCodeResponseBodyData extends TeaModel {
        @NameInMap("AssociatedUnionId")
        public String associatedUnionId;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("OrgDtoList")
        public java.util.List<GetDingTalkUserOrgByAliyunTmpCodeResponseBodyDataOrgDtoList> orgDtoList;

        public static GetDingTalkUserOrgByAliyunTmpCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDingTalkUserOrgByAliyunTmpCodeResponseBodyData self = new GetDingTalkUserOrgByAliyunTmpCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDingTalkUserOrgByAliyunTmpCodeResponseBodyData setAssociatedUnionId(String associatedUnionId) {
            this.associatedUnionId = associatedUnionId;
            return this;
        }
        public String getAssociatedUnionId() {
            return this.associatedUnionId;
        }

        public GetDingTalkUserOrgByAliyunTmpCodeResponseBodyData setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetDingTalkUserOrgByAliyunTmpCodeResponseBodyData setOrgDtoList(java.util.List<GetDingTalkUserOrgByAliyunTmpCodeResponseBodyDataOrgDtoList> orgDtoList) {
            this.orgDtoList = orgDtoList;
            return this;
        }
        public java.util.List<GetDingTalkUserOrgByAliyunTmpCodeResponseBodyDataOrgDtoList> getOrgDtoList() {
            return this.orgDtoList;
        }

    }

}
