// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAuthConfigResponseBody extends TeaModel {
    @NameInMap("Key2")
    public String key2;

    @NameInMap("Key1")
    public String key1;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAuthConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthConfigResponseBody self = new QueryAuthConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuthConfigResponseBody setKey2(String key2) {
        this.key2 = key2;
        return this;
    }
    public String getKey2() {
        return this.key2;
    }

    public QueryAuthConfigResponseBody setKey1(String key1) {
        this.key1 = key1;
        return this;
    }
    public String getKey1() {
        return this.key1;
    }

    public QueryAuthConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
