// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceConfigResponseBody extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConfigResponseBody self = new GetInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
