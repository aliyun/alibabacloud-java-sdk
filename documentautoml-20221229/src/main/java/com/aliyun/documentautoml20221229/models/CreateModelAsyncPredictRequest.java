// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class CreateModelAsyncPredictRequest extends TeaModel {
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

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static CreateModelAsyncPredictRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelAsyncPredictRequest self = new CreateModelAsyncPredictRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelAsyncPredictRequest setBinaryToText(Boolean binaryToText) {
        this.binaryToText = binaryToText;
        return this;
    }
    public Boolean getBinaryToText() {
        return this.binaryToText;
    }

    public CreateModelAsyncPredictRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateModelAsyncPredictRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateModelAsyncPredictRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public CreateModelAsyncPredictRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public CreateModelAsyncPredictRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateModelAsyncPredictRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
