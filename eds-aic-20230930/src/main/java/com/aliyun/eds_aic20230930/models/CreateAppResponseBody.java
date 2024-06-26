// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("AppId")
    public Integer appId;

    /**
     * <strong>example:</strong>
     * <p>E5138F7E-46B5-526A-8C99-82DEAE6B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponseBody self = new CreateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppResponseBody setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public CreateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
