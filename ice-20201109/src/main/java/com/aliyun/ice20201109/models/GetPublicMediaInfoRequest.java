// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPublicMediaInfoRequest extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    public static GetPublicMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublicMediaInfoRequest self = new GetPublicMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetPublicMediaInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
