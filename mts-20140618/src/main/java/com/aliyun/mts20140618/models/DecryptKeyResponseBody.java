// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DecryptKeyResponseBody extends TeaModel {
    @NameInMap("Plaintext")
    public String plaintext;

    @NameInMap("Rand")
    public String rand;

    @NameInMap("RequestId")
    public String requestId;

    public static DecryptKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DecryptKeyResponseBody self = new DecryptKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DecryptKeyResponseBody setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public DecryptKeyResponseBody setRand(String rand) {
        this.rand = rand;
        return this;
    }
    public String getRand() {
        return this.rand;
    }

    public DecryptKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
