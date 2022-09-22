// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeLinkedKMSKeysResponseBody extends TeaModel {
    @NameInMap("KMSKeys")
    public KMSKeys KMSKeys;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLinkedKMSKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLinkedKMSKeysResponseBody self = new DescribeLinkedKMSKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLinkedKMSKeysResponseBody setKMSKeys(KMSKeys KMSKeys) {
        this.KMSKeys = KMSKeys;
        return this;
    }
    public KMSKeys getKMSKeys() {
        return this.KMSKeys;
    }

    public DescribeLinkedKMSKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class KMSKey extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        public static KMSKey build(java.util.Map<String, ?> map) throws Exception {
            KMSKey self = new KMSKey();
            return TeaModel.build(map, self);
        }

        public KMSKey setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public KMSKey setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

    }

    public static class KMSKeys extends TeaModel {
        @NameInMap("KMSKey")
        public java.util.List<KMSKey> KMSKey;

        public static KMSKeys build(java.util.Map<String, ?> map) throws Exception {
            KMSKeys self = new KMSKeys();
            return TeaModel.build(map, self);
        }

        public KMSKeys setKMSKey(java.util.List<KMSKey> KMSKey) {
            this.KMSKey = KMSKey;
            return this;
        }
        public java.util.List<KMSKey> getKMSKey() {
            return this.KMSKey;
        }

    }

}
