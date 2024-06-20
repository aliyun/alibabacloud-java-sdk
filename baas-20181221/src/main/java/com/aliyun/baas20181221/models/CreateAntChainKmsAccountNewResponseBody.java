// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainKmsAccountNewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>063C2175-C755-5C85-9C42-5EB432B67D9B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAntChainKmsAccountNewResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAntChainKmsAccountNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainKmsAccountNewResponseBody self = new CreateAntChainKmsAccountNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAntChainKmsAccountNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAntChainKmsAccountNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateAntChainKmsAccountNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAntChainKmsAccountNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAntChainKmsAccountNewResponseBody setResult(CreateAntChainKmsAccountNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAntChainKmsAccountNewResponseBodyResult getResult() {
        return this.result;
    }

    public CreateAntChainKmsAccountNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAntChainKmsAccountNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateAntChainKmsAccountNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAntChainKmsAccountNewResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234565181228596659400e4-3bd7-4a83-b9af-d12654bb5779</p>
         */
        @NameInMap("MyKmsKeyId")
        public String myKmsKeyId;

        /**
         * <strong>example:</strong>
         * <p>d408f5c5c3c118b23646f4059c81fbe5a1b067a12f96f4a7a5e09eae10c81288cdf64aa887af89738b9ec5d16bc124594bf820a4afa24fe0de9d8dcfd1d99500</p>
         */
        @NameInMap("PubKey")
        public String pubKey;

        public static CreateAntChainKmsAccountNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAntChainKmsAccountNewResponseBodyResult self = new CreateAntChainKmsAccountNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAntChainKmsAccountNewResponseBodyResult setMyKmsKeyId(String myKmsKeyId) {
            this.myKmsKeyId = myKmsKeyId;
            return this;
        }
        public String getMyKmsKeyId() {
            return this.myKmsKeyId;
        }

        public CreateAntChainKmsAccountNewResponseBodyResult setPubKey(String pubKey) {
            this.pubKey = pubKey;
            return this;
        }
        public String getPubKey() {
            return this.pubKey;
        }

    }

}
