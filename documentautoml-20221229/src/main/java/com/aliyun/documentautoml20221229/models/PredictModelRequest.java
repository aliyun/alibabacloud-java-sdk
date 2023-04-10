// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class PredictModelRequest extends TeaModel {
    @NameInMap("BinaryToText")
    public Boolean binaryToText;

    @NameInMap("Body")
    public String body;

    @NameInMap("Content")
    public String content;

    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("ModelVersion")
    public String modelVersion;

    public static PredictModelRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictModelRequest self = new PredictModelRequest();
        return TeaModel.build(map, self);
    }

    public PredictModelRequest setBinaryToText(Boolean binaryToText) {
        this.binaryToText = binaryToText;
        return this;
    }
    public Boolean getBinaryToText() {
        return this.binaryToText;
    }

    public PredictModelRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PredictModelRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PredictModelRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public PredictModelRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

}
