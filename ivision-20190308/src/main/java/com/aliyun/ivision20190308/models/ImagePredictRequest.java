// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class ImagePredictRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("DataUrl")
    public String dataUrl;

    public static ImagePredictRequest build(java.util.Map<String, ?> map) throws Exception {
        ImagePredictRequest self = new ImagePredictRequest();
        return TeaModel.build(map, self);
    }

    public ImagePredictRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImagePredictRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public ImagePredictRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public ImagePredictRequest setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
        return this;
    }
    public String getDataUrl() {
        return this.dataUrl;
    }

}
