// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeKmsKeysResponseBody extends TeaModel {
    /**
     * <p>The queried KMS keys.</p>
     */
    @NameInMap("KmsKeys")
    public DescribeKmsKeysResponseBodyKmsKeys kmsKeys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F91F25F-8BCF-59E3-AF67-3806DB41FD09</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKmsKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsKeysResponseBody self = new DescribeKmsKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKmsKeysResponseBody setKmsKeys(DescribeKmsKeysResponseBodyKmsKeys kmsKeys) {
        this.kmsKeys = kmsKeys;
        return this;
    }
    public DescribeKmsKeysResponseBodyKmsKeys getKmsKeys() {
        return this.kmsKeys;
    }

    public DescribeKmsKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeKmsKeysResponseBodyKmsKeysKmsKey extends TeaModel {
        /**
         * <p>The alias of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>mykey</p>
         */
        @NameInMap("KeyAlias")
        public String keyAlias;

        /**
         * <p>The ID of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>2e81355b-f8e7-4090-8082-a8f8124a621c</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        public static DescribeKmsKeysResponseBodyKmsKeysKmsKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeKmsKeysResponseBodyKmsKeysKmsKey self = new DescribeKmsKeysResponseBodyKmsKeysKmsKey();
            return TeaModel.build(map, self);
        }

        public DescribeKmsKeysResponseBodyKmsKeysKmsKey setKeyAlias(String keyAlias) {
            this.keyAlias = keyAlias;
            return this;
        }
        public String getKeyAlias() {
            return this.keyAlias;
        }

        public DescribeKmsKeysResponseBodyKmsKeysKmsKey setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

    }

    public static class DescribeKmsKeysResponseBodyKmsKeys extends TeaModel {
        @NameInMap("KmsKey")
        public java.util.List<DescribeKmsKeysResponseBodyKmsKeysKmsKey> kmsKey;

        public static DescribeKmsKeysResponseBodyKmsKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeKmsKeysResponseBodyKmsKeys self = new DescribeKmsKeysResponseBodyKmsKeys();
            return TeaModel.build(map, self);
        }

        public DescribeKmsKeysResponseBodyKmsKeys setKmsKey(java.util.List<DescribeKmsKeysResponseBodyKmsKeysKmsKey> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public java.util.List<DescribeKmsKeysResponseBodyKmsKeysKmsKey> getKmsKey() {
            return this.kmsKey;
        }

    }

}
