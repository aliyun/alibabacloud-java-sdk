// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class BatchGetYikeAssetMediaInfosRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>b48fb04483915d4f2cd8</strong></strong></strong>,<strong><strong><strong>c48fb37407365d4f2cd8</strong></strong></strong></p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    public static BatchGetYikeAssetMediaInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetYikeAssetMediaInfosRequest self = new BatchGetYikeAssetMediaInfosRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetYikeAssetMediaInfosRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

}
