// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAntChainAccountResponseBody extends TeaModel {
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
        @NameInMap("Account")
        public String account;

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
