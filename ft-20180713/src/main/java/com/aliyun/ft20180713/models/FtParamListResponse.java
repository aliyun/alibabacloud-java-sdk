// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtParamListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static FtParamListResponse build(java.util.Map<String, ?> map) throws Exception {
        FtParamListResponse self = new FtParamListResponse();
        return TeaModel.build(map, self);
    }

    public FtParamListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FtParamListResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
