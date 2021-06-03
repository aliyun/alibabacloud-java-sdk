// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAudioProduceJobRequest extends TeaModel {
    @NameInMap("EditingConfig")
    public String editingConfig;

    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("InputConfig")
    public String inputConfig;

    @NameInMap("Title")
    public String title;

    @NameInMap("Description")
    public String description;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Overwrite")
    public Boolean overwrite;

    public static SubmitAudioProduceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioProduceJobRequest self = new SubmitAudioProduceJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAudioProduceJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitAudioProduceJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitAudioProduceJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitAudioProduceJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitAudioProduceJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitAudioProduceJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitAudioProduceJobRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

}
