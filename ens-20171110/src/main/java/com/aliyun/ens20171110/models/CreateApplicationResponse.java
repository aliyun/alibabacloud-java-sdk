// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateApplicationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static CreateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationResponse self = new CreateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApplicationResponse setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
