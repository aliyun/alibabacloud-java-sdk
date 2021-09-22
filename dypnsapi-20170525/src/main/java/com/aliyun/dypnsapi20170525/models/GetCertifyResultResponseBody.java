// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetCertifyResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetCertifyResultResponseBodyData> data;

    public static GetCertifyResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCertifyResultResponseBody self = new GetCertifyResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCertifyResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCertifyResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCertifyResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCertifyResultResponseBody setData(java.util.List<GetCertifyResultResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCertifyResultResponseBodyData> getData() {
        return this.data;
    }

    public static class GetCertifyResultResponseBodyData extends TeaModel {
        @NameInMap("MaterialInfo")
        public String materialInfo;

        @NameInMap("IdentityInfo")
        public String identityInfo;

        @NameInMap("VerifyDesc")
        public String verifyDesc;

        @NameInMap("VerifyResult")
        public String verifyResult;

        @NameInMap("DeviceToken")
        public String deviceToken;

        public static GetCertifyResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCertifyResultResponseBodyData self = new GetCertifyResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCertifyResultResponseBodyData setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public GetCertifyResultResponseBodyData setIdentityInfo(String identityInfo) {
            this.identityInfo = identityInfo;
            return this;
        }
        public String getIdentityInfo() {
            return this.identityInfo;
        }

        public GetCertifyResultResponseBodyData setVerifyDesc(String verifyDesc) {
            this.verifyDesc = verifyDesc;
            return this;
        }
        public String getVerifyDesc() {
            return this.verifyDesc;
        }

        public GetCertifyResultResponseBodyData setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public GetCertifyResultResponseBodyData setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
            return this;
        }
        public String getDeviceToken() {
            return this.deviceToken;
        }

    }

}
