// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class BatchGetMediaInfosRequest extends TeaModel {
    /**
     * <p>The additional information about the media asset to return in the batch query. By default, only BasicInfo is returned. The additional information includes:</p>
     * <p>\-FileInfo</p>
     * <p>\-DynamicMetaData</p>
     * 
     * <strong>example:</strong>
     * <p>FileInfo,DynamicMetaData</p>
     */
    @NameInMap("AdditionType")
    public String additionType;

    /**
     * <p>The authentication expiration time. Unit: seconds.</p>
     * <ul>
     * <li>Minimum value: <strong>1</strong>.</li>
     * <li>Maximum value: 86400.</li>
     * <li>Default value: 3600.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The IDs of the media assets to query, separated by commas.</p>
     * 
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

    public BatchGetMediaInfosRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public BatchGetMediaInfosRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

}
