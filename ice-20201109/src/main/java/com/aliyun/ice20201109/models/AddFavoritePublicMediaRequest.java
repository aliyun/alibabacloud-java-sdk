// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddFavoritePublicMediaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>icepublic-<strong><strong>7213c6050cbc66750b469701</strong></strong>,icepublic-<strong><strong>0b4697017213c6050cbc6675</strong></strong></p>
     */
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
