// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetMediaUploadUrlShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static GetMediaUploadUrlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaUploadUrlShrinkRequest self = new GetMediaUploadUrlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaUploadUrlShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMediaUploadUrlShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
