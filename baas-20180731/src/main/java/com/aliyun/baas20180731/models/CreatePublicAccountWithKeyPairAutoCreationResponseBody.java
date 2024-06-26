// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreatePublicAccountWithKeyPairAutoCreationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreatePublicAccountWithKeyPairAutoCreationResponseBodyResult result;

    public static CreatePublicAccountWithKeyPairAutoCreationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicAccountWithKeyPairAutoCreationResponseBody self = new CreatePublicAccountWithKeyPairAutoCreationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePublicAccountWithKeyPairAutoCreationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePublicAccountWithKeyPairAutoCreationResponseBody setResult(CreatePublicAccountWithKeyPairAutoCreationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreatePublicAccountWithKeyPairAutoCreationResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreatePublicAccountWithKeyPairAutoCreationResponseBodyResult extends TeaModel {
        @NameInMap("AccountPrivateKey")
        public String accountPrivateKey;

        @NameInMap("AccountPublicKey")
        public String accountPublicKey;

        @NameInMap("AccountRecoverPrivateKey")
        public String accountRecoverPrivateKey;

        @NameInMap("AccountRecoverPublicKey")
        public String accountRecoverPublicKey;

        public static CreatePublicAccountWithKeyPairAutoCreationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreatePublicAccountWithKeyPairAutoCreationResponseBodyResult self = new CreatePublicAccountWithKeyPairAutoCreationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreatePublicAccountWithKeyPairAutoCreationResponseBodyResult setAccountPrivateKey(String accountPrivateKey) {
            this.accountPrivateKey = accountPrivateKey;
            return this;
        }
        public String getAccountPrivateKey() {
            return this.accountPrivateKey;
        }

        public CreatePublicAccountWithKeyPairAutoCreationResponseBodyResult setAccountPublicKey(String accountPublicKey) {
            this.accountPublicKey = accountPublicKey;
            return this;
        }
        public String getAccountPublicKey() {
            return this.accountPublicKey;
        }

        public CreatePublicAccountWithKeyPairAutoCreationResponseBodyResult setAccountRecoverPrivateKey(String accountRecoverPrivateKey) {
            this.accountRecoverPrivateKey = accountRecoverPrivateKey;
            return this;
        }
        public String getAccountRecoverPrivateKey() {
            return this.accountRecoverPrivateKey;
        }

        public CreatePublicAccountWithKeyPairAutoCreationResponseBodyResult setAccountRecoverPublicKey(String accountRecoverPublicKey) {
            this.accountRecoverPublicKey = accountRecoverPublicKey;
            return this;
        }
        public String getAccountRecoverPublicKey() {
            return this.accountRecoverPublicKey;
        }

    }

}
