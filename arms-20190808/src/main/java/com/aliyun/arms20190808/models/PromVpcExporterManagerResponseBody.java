// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class PromVpcExporterManagerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Token")
    public String token;

    public static PromVpcExporterManagerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PromVpcExporterManagerResponseBody self = new PromVpcExporterManagerResponseBody();
        return TeaModel.build(map, self);
    }

    public PromVpcExporterManagerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PromVpcExporterManagerResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
