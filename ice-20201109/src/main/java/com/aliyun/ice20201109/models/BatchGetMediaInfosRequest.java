// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class BatchGetMediaInfosRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FileInfo,DynamicMetaData</p>
     */
    @NameInMap("AdditionType")
    public String additionType;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>b48fb04483915d4f2cd8</strong></strong></strong>,<strong><strong><strong>c48fb37407365d4f2cd8</strong></strong></strong></p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    public static BatchGetMediaInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetMediaInfosRequest self = new BatchGetMediaInfosRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetMediaInfosRequest setAdditionType(String additionType) {
        this.additionType = additionType;
        return this;
    }
    public String getAdditionType() {
        return this.additionType;
    }

    public BatchGetMediaInfosRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

}
