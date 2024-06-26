// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CancelFavoritePublicMediaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>icepublic-<strong><strong>7213c6050cbc66750b469701</strong></strong>,icepublic-<strong><strong>0b4697017213c6050cbc6675</strong></strong></p>
     */
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
