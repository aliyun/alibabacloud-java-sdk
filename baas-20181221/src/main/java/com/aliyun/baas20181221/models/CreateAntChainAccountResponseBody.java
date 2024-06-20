// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0301F6CB-4FA6-4D03-8668-963623B63D0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAntChainAccountResponseBodyResult result;

    public static CreateAntChainAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainAccountResponseBody self = new CreateAntChainAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAntChainAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAntChainAccountResponseBody setResult(CreateAntChainAccountResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAntChainAccountResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAntChainAccountResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <strong>example:</strong>
         * <p>bDXK6boZ</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        public static CreateAntChainAccountResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAntChainAccountResponseBodyResult self = new CreateAntChainAccountResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAntChainAccountResponseBodyResult setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public CreateAntChainAccountResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

    }

}
