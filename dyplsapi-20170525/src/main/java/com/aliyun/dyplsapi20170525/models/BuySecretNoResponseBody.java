// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BuySecretNoResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   Other values indicate that the request failed. For more information, see [Error codes](https://help.aliyun.com/document_detail/109196.html).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information returned after the operation was called.</p>
     */
    @NameInMap("SecretBuyInfoDTO")
    public BuySecretNoResponseBodySecretBuyInfoDTO secretBuyInfoDTO;

    public static BuySecretNoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BuySecretNoResponseBody self = new BuySecretNoResponseBody();
        return TeaModel.build(map, self);
    }

    public BuySecretNoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public static class BuySecretNoResponseBodySecretBuyInfoDTO extends TeaModel {
        /**
         * <p>The private number, that is, phone number X.</p>
         */
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
