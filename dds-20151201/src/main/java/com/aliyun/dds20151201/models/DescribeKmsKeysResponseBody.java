// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeKmsKeysResponseBody extends TeaModel {
    /**
     * <p>The KMS keys.</p>
     */
    @NameInMap("KmsKeys")
    public java.util.List<DescribeKmsKeysResponseBodyKmsKeys> kmsKeys;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKmsKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsKeysResponseBody self = new DescribeKmsKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKmsKeysResponseBody setKmsKeys(java.util.List<DescribeKmsKeysResponseBodyKmsKeys> kmsKeys) {
        this.kmsKeys = kmsKeys;
        return this;
    }
    public java.util.List<DescribeKmsKeysResponseBodyKmsKeys> getKmsKeys() {
        return this.kmsKeys;
    }

    public DescribeKmsKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeKmsKeysResponseBodyKmsKeys extends TeaModel {
        /**
         * <p>The alias of the key.</p>
         */
        @NameInMap("KeyAlias")
        public String keyAlias;

        /**
         * <p>The key ID.</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        public static DescribeKmsKeysResponseBodyKmsKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeKmsKeysResponseBodyKmsKeys self = new DescribeKmsKeysResponseBodyKmsKeys();
            return TeaModel.build(map, self);
        }

        public DescribeKmsKeysResponseBodyKmsKeys setKeyAlias(String keyAlias) {
            this.keyAlias = keyAlias;
            return this;
        }
        public String getKeyAlias() {
            return this.keyAlias;
        }

        public DescribeKmsKeysResponseBodyKmsKeys setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

    }

}
