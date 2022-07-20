// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MediaId")
    public String mediaId;

    public static GetMediaAuditResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultRequest self = new GetMediaAuditResultRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMediaAuditResultRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
