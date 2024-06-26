// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAccountWithKeyPairAutoCreationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAccountWithKeyPairAutoCreationResponseBodyResult result;

    public static CreateAccountWithKeyPairAutoCreationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountWithKeyPairAutoCreationResponseBody self = new CreateAccountWithKeyPairAutoCreationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccountWithKeyPairAutoCreationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAccountWithKeyPairAutoCreationResponseBody setResult(CreateAccountWithKeyPairAutoCreationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAccountWithKeyPairAutoCreationResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAccountWithKeyPairAutoCreationResponseBodyResult extends TeaModel {
        @NameInMap("AccountPrivateKey")
        public String accountPrivateKey;

        @NameInMap("AccountPublicKey")
        public String accountPublicKey;

        @NameInMap("AccountRecoverPrivateKey")
        public String accountRecoverPrivateKey;

        @NameInMap("AccountRecoverPublicKey")
        public String accountRecoverPublicKey;

        public static CreateAccountWithKeyPairAutoCreationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAccountWithKeyPairAutoCreationResponseBodyResult self = new CreateAccountWithKeyPairAutoCreationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAccountWithKeyPairAutoCreationResponseBodyResult setAccountPrivateKey(String accountPrivateKey) {
            this.accountPrivateKey = accountPrivateKey;
            return this;
        }
        public String getAccountPrivateKey() {
            return this.accountPrivateKey;
        }

        public CreateAccountWithKeyPairAutoCreationResponseBodyResult setAccountPublicKey(String accountPublicKey) {
            this.accountPublicKey = accountPublicKey;
            return this;
        }
        public String getAccountPublicKey() {
            return this.accountPublicKey;
        }

        public CreateAccountWithKeyPairAutoCreationResponseBodyResult setAccountRecoverPrivateKey(String accountRecoverPrivateKey) {
            this.accountRecoverPrivateKey = accountRecoverPrivateKey;
            return this;
        }
        public String getAccountRecoverPrivateKey() {
            return this.accountRecoverPrivateKey;
        }

        public CreateAccountWithKeyPairAutoCreationResponseBodyResult setAccountRecoverPublicKey(String accountRecoverPublicKey) {
            this.accountRecoverPublicKey = accountRecoverPublicKey;
            return this;
        }
        public String getAccountRecoverPublicKey() {
            return this.accountRecoverPublicKey;
        }

    }

}
