// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultDetailRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MediaId")
    public String mediaId;

    public static GetMediaAuditResultDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultDetailRequest self = new GetMediaAuditResultDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMediaAuditResultDetailRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
