// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static GetMessageAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessageAppRequest self = new GetMessageAppRequest();
        return TeaModel.build(map, self);
    }

    public GetMessageAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
