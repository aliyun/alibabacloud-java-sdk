// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SetAuthConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Key1")
    public String key1;

    @NameInMap("Key2")
    public String key2;

    public static SetAuthConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAuthConfigResponseBody self = new SetAuthConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAuthConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetAuthConfigResponseBody setKey1(String key1) {
        this.key1 = key1;
        return this;
    }
    public String getKey1() {
        return this.key1;
    }

    public SetAuthConfigResponseBody setKey2(String key2) {
        this.key2 = key2;
        return this;
    }
    public String getKey2() {
        return this.key2;
    }

}
