// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CancelFavoritePublicMediaRequest extends TeaModel {
    @NameInMap("MediaIds")
    public String mediaIds;

    public static CancelFavoritePublicMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelFavoritePublicMediaRequest self = new CancelFavoritePublicMediaRequest();
        return TeaModel.build(map, self);
    }

    public CancelFavoritePublicMediaRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

}
