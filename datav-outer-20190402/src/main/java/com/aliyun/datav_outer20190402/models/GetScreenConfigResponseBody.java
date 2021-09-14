// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetScreenConfigResponseBody extends TeaModel {
    @NameInMap("ShareUrl")
    public String shareUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScreenConfig")
    public String screenConfig;

    public static GetScreenConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScreenConfigResponseBody self = new GetScreenConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScreenConfigResponseBody setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
        return this;
    }
    public String getShareUrl() {
        return this.shareUrl;
    }

    public GetScreenConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScreenConfigResponseBody setScreenConfig(String screenConfig) {
        this.screenConfig = screenConfig;
        return this;
    }
    public String getScreenConfig() {
        return this.screenConfig;
    }

}
