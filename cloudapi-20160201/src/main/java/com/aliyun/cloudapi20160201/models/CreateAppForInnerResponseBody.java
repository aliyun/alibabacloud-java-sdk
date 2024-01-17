// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateAppForInnerResponseBody extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppForInnerResponseBody self = new CreateAppForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppForInnerResponseBody setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateAppForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
