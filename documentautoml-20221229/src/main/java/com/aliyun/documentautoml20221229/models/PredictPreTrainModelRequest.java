// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class PredictPreTrainModelRequest extends TeaModel {
    @NameInMap("BinaryToText")
    public Boolean binaryToText;

    @NameInMap("Body")
    public String body;

    @NameInMap("Content")
    public String content;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static PredictPreTrainModelRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictPreTrainModelRequest self = new PredictPreTrainModelRequest();
        return TeaModel.build(map, self);
    }

    public PredictPreTrainModelRequest setBinaryToText(Boolean binaryToText) {
        this.binaryToText = binaryToText;
        return this;
    }
    public Boolean getBinaryToText() {
        return this.binaryToText;
    }

    public PredictPreTrainModelRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PredictPreTrainModelRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PredictPreTrainModelRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public PredictPreTrainModelRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
