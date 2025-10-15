// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationTokenResponseBody extends TeaModel {
    @NameInMap("ApplicationTokens")
    public CreateApplicationTokenResponseBodyApplicationTokens applicationTokens;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApplicationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationTokenResponseBody self = new CreateApplicationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationTokenResponseBody setApplicationTokens(CreateApplicationTokenResponseBodyApplicationTokens applicationTokens) {
        this.applicationTokens = applicationTokens;
        return this;
    }
    public CreateApplicationTokenResponseBodyApplicationTokens getApplicationTokens() {
        return this.applicationTokens;
    }

    public CreateApplicationTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateApplicationTokenResponseBodyApplicationTokens extends TeaModel {
        /**
         * <p>应用token</p>
         * 
         * <strong>example:</strong>
         * <p>SATFwqX8zxGf83pJcJw78KFGjmrft4erWeZYBGS8oE7NN6qoE217yaJpUdMb1UuuGqhDiF43sCA4CF91CTL5iGntqwyLuaAcS9FJ9HfGadE5a7TjiwVafwrBYkt3XXX</p>
         */
        @NameInMap("ApplicationToken")
        public String applicationToken;

        /**
         * <p>应用token ID</p>
         * 
         * <strong>example:</strong>
         * <p>token_ndfxxigahelfne2y2hodehrxxxx</p>
         */
        @NameInMap("ApplicationTokenId")
        public String applicationTokenId;

        /**
         * <p>应用token类型</p>
         * 
         * <strong>example:</strong>
         * <p>bearer_token</p>
         */
        @NameInMap("ApplicationTokenType")
        public String applicationTokenType;

        public static CreateApplicationTokenResponseBodyApplicationTokens build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationTokenResponseBodyApplicationTokens self = new CreateApplicationTokenResponseBodyApplicationTokens();
            return TeaModel.build(map, self);
        }

        public CreateApplicationTokenResponseBodyApplicationTokens setApplicationToken(String applicationToken) {
            this.applicationToken = applicationToken;
            return this;
        }
        public String getApplicationToken() {
            return this.applicationToken;
        }

        public CreateApplicationTokenResponseBodyApplicationTokens setApplicationTokenId(String applicationTokenId) {
            this.applicationTokenId = applicationTokenId;
            return this;
        }
        public String getApplicationTokenId() {
            return this.applicationTokenId;
        }

        public CreateApplicationTokenResponseBodyApplicationTokens setApplicationTokenType(String applicationTokenType) {
            this.applicationTokenType = applicationTokenType;
            return this;
        }
        public String getApplicationTokenType() {
            return this.applicationTokenType;
        }

    }

}
