// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddFavoritePublicMediaRequest extends TeaModel {
    @NameInMap("MediaIds")
    public String mediaIds;

    public static AddFavoritePublicMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFavoritePublicMediaRequest self = new AddFavoritePublicMediaRequest();
        return TeaModel.build(map, self);
    }

    public AddFavoritePublicMediaRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

}
