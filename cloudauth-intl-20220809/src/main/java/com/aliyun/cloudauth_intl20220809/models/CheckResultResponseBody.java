// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CheckResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CheckResultResponseBodyResult result;

    public static CheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckResultResponseBody self = new CheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckResultResponseBody setResult(CheckResultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckResultResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckResultResponseBodyResult extends TeaModel {
        @NameInMap("EkycResult")
        public String ekycResult;

        @NameInMap("ExtBasicInfo")
        public String extBasicInfo;

        @NameInMap("ExtFaceInfo")
        public String extFaceInfo;

        @NameInMap("ExtIdInfo")
        public String extIdInfo;

        @NameInMap("ExtRiskInfo")
        public String extRiskInfo;

        public static CheckResultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckResultResponseBodyResult self = new CheckResultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckResultResponseBodyResult setEkycResult(String ekycResult) {
            this.ekycResult = ekycResult;
            return this;
        }
        public String getEkycResult() {
            return this.ekycResult;
        }

        public CheckResultResponseBodyResult setExtBasicInfo(String extBasicInfo) {
            this.extBasicInfo = extBasicInfo;
            return this;
        }
        public String getExtBasicInfo() {
            return this.extBasicInfo;
        }

        public CheckResultResponseBodyResult setExtFaceInfo(String extFaceInfo) {
            this.extFaceInfo = extFaceInfo;
            return this;
        }
        public String getExtFaceInfo() {
            return this.extFaceInfo;
        }

        public CheckResultResponseBodyResult setExtIdInfo(String extIdInfo) {
            this.extIdInfo = extIdInfo;
            return this;
        }
        public String getExtIdInfo() {
            return this.extIdInfo;
        }

        public CheckResultResponseBodyResult setExtRiskInfo(String extRiskInfo) {
            this.extRiskInfo = extRiskInfo;
            return this;
        }
        public String getExtRiskInfo() {
            return this.extRiskInfo;
        }

    }

}
