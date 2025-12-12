// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeUserEncryptionKeyListResponseBody extends TeaModel {
    @NameInMap("KmsKeys")
    public java.util.List<DescribeUserEncryptionKeyListResponseBodyKmsKeys> kmsKeys;

    /**
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
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
         * <strong>example:</strong>
         * <p>0275bd3f-fdbb-4d8c-846b-71b211******</p>
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
