// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainAccountWithKeyPairAutoCreationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5F058BB4-3043-4638-86D4-EED84AD1AE54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult result;

    public static CreateAntChainAccountWithKeyPairAutoCreationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainAccountWithKeyPairAutoCreationResponseBody self = new CreateAntChainAccountWithKeyPairAutoCreationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAntChainAccountWithKeyPairAutoCreationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAntChainAccountWithKeyPairAutoCreationResponseBody setResult(CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>accountname</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <strong>example:</strong>
         * <p>-----BEGIN ENCRYPTED PRIVATE KEY-----\nM***8=\n-----END ENCRYPTED PRIVATE KEY-----\n</p>
         */
        @NameInMap("AccountPrivateKey")
        public String accountPrivateKey;

        /**
         * <strong>example:</strong>
         * <p>b***7</p>
         */
        @NameInMap("AccountPublicKey")
        public String accountPublicKey;

        /**
         * <strong>example:</strong>
         * <p>-----BEGIN ENCRYPTED PRIVATE KEY-----\nM***Io=\n-----END ENCRYPTED PRIVATE KEY-----\n</p>
         */
        @NameInMap("AccountRecoverPrivateKey")
        public String accountRecoverPrivateKey;

        /**
         * <strong>example:</strong>
         * <p>d***b</p>
         */
        @NameInMap("AccountRecoverPublicKey")
        public String accountRecoverPublicKey;

        /**
         * <strong>example:</strong>
         * <p>1q8B5R9p</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        public static CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult self = new CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult setAccountPrivateKey(String accountPrivateKey) {
            this.accountPrivateKey = accountPrivateKey;
            return this;
        }
        public String getAccountPrivateKey() {
            return this.accountPrivateKey;
        }

        public CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult setAccountPublicKey(String accountPublicKey) {
            this.accountPublicKey = accountPublicKey;
            return this;
        }
        public String getAccountPublicKey() {
            return this.accountPublicKey;
        }

        public CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult setAccountRecoverPrivateKey(String accountRecoverPrivateKey) {
            this.accountRecoverPrivateKey = accountRecoverPrivateKey;
            return this;
        }
        public String getAccountRecoverPrivateKey() {
            return this.accountRecoverPrivateKey;
        }

        public CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult setAccountRecoverPublicKey(String accountRecoverPublicKey) {
            this.accountRecoverPublicKey = accountRecoverPublicKey;
            return this;
        }
        public String getAccountRecoverPublicKey() {
            return this.accountRecoverPublicKey;
        }

        public CreateAntChainAccountWithKeyPairAutoCreationResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

    }

}
