// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitBatchMediaProducingJobRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EditingConfig")
    public String editingConfig;

    @NameInMap("InputConfig")
    public String inputConfig;

    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("UserData")
    public String userData;

    public static SubmitBatchMediaProducingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchMediaProducingJobRequest self = new SubmitBatchMediaProducingJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBatchMediaProducingJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitBatchMediaProducingJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitBatchMediaProducingJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitBatchMediaProducingJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitBatchMediaProducingJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
