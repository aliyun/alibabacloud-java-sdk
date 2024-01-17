// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateAppForBackendResponseBody extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppForBackendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppForBackendResponseBody self = new CreateAppForBackendResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppForBackendResponseBody setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateAppForBackendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
