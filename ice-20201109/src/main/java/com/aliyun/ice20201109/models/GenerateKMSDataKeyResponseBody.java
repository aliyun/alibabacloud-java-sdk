// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GenerateKMSDataKeyResponseBody extends TeaModel {
    @NameInMap("DataKey")
    public GenerateKMSDataKeyResponseBodyDataKey dataKey;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>ODZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmS7FmDBBQ0BkKsQrtRnidtPwirmDcS0ZuJCU41xxAAWk4Z8qsADfbV0b+i6kQmlvj79dJdGOvtX69Uycs901qOjop4bTS****</p>
         */
        @NameInMap("CiphertextBlob")
        public String ciphertextBlob;

        /**
         * <strong>example:</strong>
         * <p>7906979c-8e06-46a2-be2d-68e3ccbc****</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <strong>example:</strong>
         * <p>QmFzZTY0IGVuY29kZWQgcGxhaW50****</p>
         */
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
