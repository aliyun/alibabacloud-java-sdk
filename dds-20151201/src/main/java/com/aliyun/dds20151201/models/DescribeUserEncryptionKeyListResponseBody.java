// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeUserEncryptionKeyListResponseBody extends TeaModel {
    @NameInMap("KeyIds")
    public DescribeUserEncryptionKeyListResponseBodyKeyIds keyIds;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserEncryptionKeyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEncryptionKeyListResponseBody self = new DescribeUserEncryptionKeyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserEncryptionKeyListResponseBody setKeyIds(DescribeUserEncryptionKeyListResponseBodyKeyIds keyIds) {
        this.keyIds = keyIds;
        return this;
    }
    public DescribeUserEncryptionKeyListResponseBodyKeyIds getKeyIds() {
        return this.keyIds;
    }

    public DescribeUserEncryptionKeyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserEncryptionKeyListResponseBodyKeyIds extends TeaModel {
        @NameInMap("KeyId")
        public java.util.List<String> keyId;

        public static DescribeUserEncryptionKeyListResponseBodyKeyIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserEncryptionKeyListResponseBodyKeyIds self = new DescribeUserEncryptionKeyListResponseBodyKeyIds();
            return TeaModel.build(map, self);
        }

        public DescribeUserEncryptionKeyListResponseBodyKeyIds setKeyId(java.util.List<String> keyId) {
            this.keyId = keyId;
            return this;
        }
        public java.util.List<String> getKeyId() {
            return this.keyId;
        }

    }

}
