// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeUserEncryptionKeyListResponseBody extends TeaModel {
    /**
     * <p>Details about the KMS keys.</p>
     */
    @NameInMap("KmsKeys")
    public java.util.List<DescribeUserEncryptionKeyListResponseBodyKmsKeys> kmsKeys;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserEncryptionKeyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEncryptionKeyListResponseBody self = new DescribeUserEncryptionKeyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserEncryptionKeyListResponseBody setKmsKeys(java.util.List<DescribeUserEncryptionKeyListResponseBodyKmsKeys> kmsKeys) {
        this.kmsKeys = kmsKeys;
        return this;
    }
    public java.util.List<DescribeUserEncryptionKeyListResponseBodyKmsKeys> getKmsKeys() {
        return this.kmsKeys;
    }

    public DescribeUserEncryptionKeyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserEncryptionKeyListResponseBodyKmsKeys extends TeaModel {
        /**
         * <p>The ID of the KMS key.</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        public static DescribeUserEncryptionKeyListResponseBodyKmsKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserEncryptionKeyListResponseBodyKmsKeys self = new DescribeUserEncryptionKeyListResponseBodyKmsKeys();
            return TeaModel.build(map, self);
        }

        public DescribeUserEncryptionKeyListResponseBodyKmsKeys setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

    }

}
