// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GenerateKMSDataKeyResponseBody extends TeaModel {
    @NameInMap("DataKey")
    public GenerateKMSDataKeyResponseBodyDataKey dataKey;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateKMSDataKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateKMSDataKeyResponseBody self = new GenerateKMSDataKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateKMSDataKeyResponseBody setDataKey(GenerateKMSDataKeyResponseBodyDataKey dataKey) {
        this.dataKey = dataKey;
        return this;
    }
    public GenerateKMSDataKeyResponseBodyDataKey getDataKey() {
        return this.dataKey;
    }

    public GenerateKMSDataKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateKMSDataKeyResponseBodyDataKey extends TeaModel {
        @NameInMap("CiphertextBlob")
        public String ciphertextBlob;

        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("Plaintext")
        public String plaintext;

        public static GenerateKMSDataKeyResponseBodyDataKey build(java.util.Map<String, ?> map) throws Exception {
            GenerateKMSDataKeyResponseBodyDataKey self = new GenerateKMSDataKeyResponseBodyDataKey();
            return TeaModel.build(map, self);
        }

        public GenerateKMSDataKeyResponseBodyDataKey setCiphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }
        public String getCiphertextBlob() {
            return this.ciphertextBlob;
        }

        public GenerateKMSDataKeyResponseBodyDataKey setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public GenerateKMSDataKeyResponseBodyDataKey setPlaintext(String plaintext) {
            this.plaintext = plaintext;
            return this;
        }
        public String getPlaintext() {
            return this.plaintext;
        }

    }

}
