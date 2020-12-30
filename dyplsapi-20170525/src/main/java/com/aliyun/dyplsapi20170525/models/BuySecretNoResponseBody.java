// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BuySecretNoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretBuyInfoDTO")
    public BuySecretNoResponseBodySecretBuyInfoDTO secretBuyInfoDTO;

    @NameInMap("Code")
    public String code;

    public static BuySecretNoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BuySecretNoResponseBody self = new BuySecretNoResponseBody();
        return TeaModel.build(map, self);
    }

    public BuySecretNoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BuySecretNoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BuySecretNoResponseBody setSecretBuyInfoDTO(BuySecretNoResponseBodySecretBuyInfoDTO secretBuyInfoDTO) {
        this.secretBuyInfoDTO = secretBuyInfoDTO;
        return this;
    }
    public BuySecretNoResponseBodySecretBuyInfoDTO getSecretBuyInfoDTO() {
        return this.secretBuyInfoDTO;
    }

    public BuySecretNoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class BuySecretNoResponseBodySecretBuyInfoDTO extends TeaModel {
        @NameInMap("SecretNo")
        public String secretNo;

        public static BuySecretNoResponseBodySecretBuyInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            BuySecretNoResponseBodySecretBuyInfoDTO self = new BuySecretNoResponseBodySecretBuyInfoDTO();
            return TeaModel.build(map, self);
        }

        public BuySecretNoResponseBodySecretBuyInfoDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

    }

}
