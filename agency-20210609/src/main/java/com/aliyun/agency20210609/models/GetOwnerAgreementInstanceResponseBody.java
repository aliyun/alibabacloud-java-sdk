// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20210609.models;

import com.aliyun.tea.*;

public class GetOwnerAgreementInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetOwnerAgreementInstanceResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOwnerAgreementInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOwnerAgreementInstanceResponseBody self = new GetOwnerAgreementInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOwnerAgreementInstanceResponseBody setData(GetOwnerAgreementInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOwnerAgreementInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetOwnerAgreementInstanceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetOwnerAgreementInstanceResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetOwnerAgreementInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOwnerAgreementInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOwnerAgreementInstanceResponseBodyDataAgreementPropertyRoleDTOList extends TeaModel {
        @NameInMap("AgreementCode")
        public String agreementCode;

        public static GetOwnerAgreementInstanceResponseBodyDataAgreementPropertyRoleDTOList build(java.util.Map<String, ?> map) throws Exception {
            GetOwnerAgreementInstanceResponseBodyDataAgreementPropertyRoleDTOList self = new GetOwnerAgreementInstanceResponseBodyDataAgreementPropertyRoleDTOList();
            return TeaModel.build(map, self);
        }

        public GetOwnerAgreementInstanceResponseBodyDataAgreementPropertyRoleDTOList setAgreementCode(String agreementCode) {
            this.agreementCode = agreementCode;
            return this;
        }
        public String getAgreementCode() {
            return this.agreementCode;
        }

    }

    public static class GetOwnerAgreementInstanceResponseBodyData extends TeaModel {
        @NameInMap("AgreementPropertyRoleDTOList")
        public java.util.List<GetOwnerAgreementInstanceResponseBodyDataAgreementPropertyRoleDTOList> agreementPropertyRoleDTOList;

        @NameInMap("Name")
        public String name;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Uid")
        public String uid;

        public static GetOwnerAgreementInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOwnerAgreementInstanceResponseBodyData self = new GetOwnerAgreementInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOwnerAgreementInstanceResponseBodyData setAgreementPropertyRoleDTOList(java.util.List<GetOwnerAgreementInstanceResponseBodyDataAgreementPropertyRoleDTOList> agreementPropertyRoleDTOList) {
            this.agreementPropertyRoleDTOList = agreementPropertyRoleDTOList;
            return this;
        }
        public java.util.List<GetOwnerAgreementInstanceResponseBodyDataAgreementPropertyRoleDTOList> getAgreementPropertyRoleDTOList() {
            return this.agreementPropertyRoleDTOList;
        }

        public GetOwnerAgreementInstanceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOwnerAgreementInstanceResponseBodyData setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetOwnerAgreementInstanceResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
