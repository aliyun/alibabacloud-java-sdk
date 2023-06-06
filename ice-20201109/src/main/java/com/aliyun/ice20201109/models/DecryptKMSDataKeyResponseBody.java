// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DecryptKMSDataKeyResponseBody extends TeaModel {
    @NameInMap("DataKey")
    public DecryptKMSDataKeyResponseBodyDataKey dataKey;

    @NameInMap("RequestId")
    public String requestId;

    public static DecryptKMSDataKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DecryptKMSDataKeyResponseBody self = new DecryptKMSDataKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DecryptKMSDataKeyResponseBody setDataKey(DecryptKMSDataKeyResponseBodyDataKey dataKey) {
        this.dataKey = dataKey;
        return this;
    }
    public DecryptKMSDataKeyResponseBodyDataKey getDataKey() {
        return this.dataKey;
    }

    public DecryptKMSDataKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DecryptKMSDataKeyResponseBodyDataKey extends TeaModel {
        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("Plaintext")
        public String plaintext;

        public static DecryptKMSDataKeyResponseBodyDataKey build(java.util.Map<String, ?> map) throws Exception {
            DecryptKMSDataKeyResponseBodyDataKey self = new DecryptKMSDataKeyResponseBodyDataKey();
            return TeaModel.build(map, self);
        }

        public DecryptKMSDataKeyResponseBodyDataKey setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public DecryptKMSDataKeyResponseBodyDataKey setPlaintext(String plaintext) {
            this.plaintext = plaintext;
            return this;
        }
        public String getPlaintext() {
            return this.plaintext;
        }

    }

}
