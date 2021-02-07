// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BuySecretNoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SecretBuyInfoDTO")
    @Validation(required = true)
    public BuySecretNoResponseSecretBuyInfoDTO secretBuyInfoDTO;

    public static BuySecretNoResponse build(java.util.Map<String, ?> map) throws Exception {
        BuySecretNoResponse self = new BuySecretNoResponse();
        return TeaModel.build(map, self);
    }

    public BuySecretNoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BuySecretNoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BuySecretNoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BuySecretNoResponse setSecretBuyInfoDTO(BuySecretNoResponseSecretBuyInfoDTO secretBuyInfoDTO) {
        this.secretBuyInfoDTO = secretBuyInfoDTO;
        return this;
    }
    public BuySecretNoResponseSecretBuyInfoDTO getSecretBuyInfoDTO() {
        return this.secretBuyInfoDTO;
    }

    public static class BuySecretNoResponseSecretBuyInfoDTO extends TeaModel {
        @NameInMap("SecretNo")
        @Validation(required = true)
        public String secretNo;

        public static BuySecretNoResponseSecretBuyInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            BuySecretNoResponseSecretBuyInfoDTO self = new BuySecretNoResponseSecretBuyInfoDTO();
            return TeaModel.build(map, self);
        }

        public BuySecretNoResponseSecretBuyInfoDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

    }

}
