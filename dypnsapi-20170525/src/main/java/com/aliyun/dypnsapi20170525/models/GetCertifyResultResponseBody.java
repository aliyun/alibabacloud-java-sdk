// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetCertifyResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetCertifyResultResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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

    public GetCertifyResultResponseBody setData(java.util.List<GetCertifyResultResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCertifyResultResponseBodyData> getData() {
        return this.data;
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

    public static class GetCertifyResultResponseBodyData extends TeaModel {
        @NameInMap("DeviceToken")
        public String deviceToken;

        @NameInMap("IdentityInfo")
        public String identityInfo;

        @NameInMap("MaterialInfo")
        public String materialInfo;

        @NameInMap("VerifyDesc")
        public String verifyDesc;

        @NameInMap("VerifyResult")
        public String verifyResult;

        public static GetCertifyResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCertifyResultResponseBodyData self = new GetCertifyResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCertifyResultResponseBodyData setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
            return this;
        }
        public String getDeviceToken() {
            return this.deviceToken;
        }

        public GetCertifyResultResponseBodyData setIdentityInfo(String identityInfo) {
            this.identityInfo = identityInfo;
            return this;
        }
        public String getIdentityInfo() {
            return this.identityInfo;
        }

        public GetCertifyResultResponseBodyData setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
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

    }

}
