// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20210609.models;

import com.aliyun.tea.*;

public class GetPartnerByUidResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetPartnerByUidResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPartnerByUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPartnerByUidResponseBody self = new GetPartnerByUidResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPartnerByUidResponseBody setData(GetPartnerByUidResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPartnerByUidResponseBodyData getData() {
        return this.data;
    }

    public GetPartnerByUidResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetPartnerByUidResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetPartnerByUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPartnerByUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPartnerByUidResponseBodyDataAgreementPropertyRoleDTOList extends TeaModel {
        @NameInMap("AgreementCode")
        public String agreementCode;

        public static GetPartnerByUidResponseBodyDataAgreementPropertyRoleDTOList build(java.util.Map<String, ?> map) throws Exception {
            GetPartnerByUidResponseBodyDataAgreementPropertyRoleDTOList self = new GetPartnerByUidResponseBodyDataAgreementPropertyRoleDTOList();
            return TeaModel.build(map, self);
        }

        public GetPartnerByUidResponseBodyDataAgreementPropertyRoleDTOList setAgreementCode(String agreementCode) {
            this.agreementCode = agreementCode;
            return this;
        }
        public String getAgreementCode() {
            return this.agreementCode;
        }

    }

    public static class GetPartnerByUidResponseBodyData extends TeaModel {
        @NameInMap("AgreementPropertyRoleDTOList")
        public java.util.List<GetPartnerByUidResponseBodyDataAgreementPropertyRoleDTOList> agreementPropertyRoleDTOList;

        @NameInMap("Name")
        public String name;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Uid")
        public String uid;

        public static GetPartnerByUidResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPartnerByUidResponseBodyData self = new GetPartnerByUidResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPartnerByUidResponseBodyData setAgreementPropertyRoleDTOList(java.util.List<GetPartnerByUidResponseBodyDataAgreementPropertyRoleDTOList> agreementPropertyRoleDTOList) {
            this.agreementPropertyRoleDTOList = agreementPropertyRoleDTOList;
            return this;
        }
        public java.util.List<GetPartnerByUidResponseBodyDataAgreementPropertyRoleDTOList> getAgreementPropertyRoleDTOList() {
            return this.agreementPropertyRoleDTOList;
        }

        public GetPartnerByUidResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPartnerByUidResponseBodyData setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetPartnerByUidResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
