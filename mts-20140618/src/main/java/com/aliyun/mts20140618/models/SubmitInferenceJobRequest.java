// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitInferenceJobRequest extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    @NameInMap("ServerName")
    public String serverName;

    @NameInMap("ModelType")
    public String modelType;

    @NameInMap("Input")
    public String input;

    public static SubmitInferenceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInferenceJobRequest self = new SubmitInferenceJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInferenceJobRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public SubmitInferenceJobRequest setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

    public SubmitInferenceJobRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public SubmitInferenceJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

}
