// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GetRealPersonVerificationResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetRealPersonVerificationResultResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetRealPersonVerificationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealPersonVerificationResultResponseBody self = new GetRealPersonVerificationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealPersonVerificationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRealPersonVerificationResultResponseBody setData(GetRealPersonVerificationResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRealPersonVerificationResultResponseBodyData getData() {
        return this.data;
    }

    public GetRealPersonVerificationResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRealPersonVerificationResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRealPersonVerificationResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRealPersonVerificationResultResponseBodyData extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("IdentityInfo")
        public String identityInfo;

        @NameInMap("MaterialMatch")
        public String materialMatch;

        public static GetRealPersonVerificationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRealPersonVerificationResultResponseBodyData self = new GetRealPersonVerificationResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRealPersonVerificationResultResponseBodyData setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public GetRealPersonVerificationResultResponseBodyData setIdentityInfo(String identityInfo) {
            this.identityInfo = identityInfo;
            return this;
        }
        public String getIdentityInfo() {
            return this.identityInfo;
        }

        public GetRealPersonVerificationResultResponseBodyData setMaterialMatch(String materialMatch) {
            this.materialMatch = materialMatch;
            return this;
        }
        public String getMaterialMatch() {
            return this.materialMatch;
        }

    }

}
