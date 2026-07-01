// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class BatchGetMediaInfosRequest extends TeaModel {
    /**
     * <p>The types of additional media asset information to return. If this parameter is not specified, only basic information is returned. Valid values are:</p>
     * <p>-FileInfo</p>
     * <p>-DynamicMetaData</p>
     * 
     * <strong>example:</strong>
     * <p>FileInfo,DynamicMetaData</p>
     */
    @NameInMap("AdditionType")
    public String additionType;

    /**
     * <p>The authentication timeout, in seconds.</p>
     * <ul>
     * <li><p>Minimum value: <strong>1</strong>.</p>
     * </li>
     * <li><p>Maximum value: 86400.</p>
     * </li>
     * <li><p>Default value: 3600.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>A comma-separated list of media asset IDs to query.</p>
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
