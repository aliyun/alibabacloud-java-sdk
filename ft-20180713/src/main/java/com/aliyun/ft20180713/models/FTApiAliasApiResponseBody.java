// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FTApiAliasApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Name")
    public String name;

    public static FTApiAliasApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FTApiAliasApiResponseBody self = new FTApiAliasApiResponseBody();
        return TeaModel.build(map, self);
    }

    public FTApiAliasApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FTApiAliasApiResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
