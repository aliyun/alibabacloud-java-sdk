// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSubtitleProduceJobRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EditingConfig")
    public String editingConfig;

    @NameInMap("InputConfig")
    public String inputConfig;

    @NameInMap("IsAsync")
    public Long isAsync;

    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("Title")
    public String title;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserData")
    public String userData;

    public static SubmitSubtitleProduceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSubtitleProduceJobRequest self = new SubmitSubtitleProduceJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSubtitleProduceJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitSubtitleProduceJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitSubtitleProduceJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitSubtitleProduceJobRequest setIsAsync(Long isAsync) {
        this.isAsync = isAsync;
        return this;
    }
    public Long getIsAsync() {
        return this.isAsync;
    }

    public SubmitSubtitleProduceJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitSubtitleProduceJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitSubtitleProduceJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SubmitSubtitleProduceJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
