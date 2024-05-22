// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAudioProduceJobRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("Overwrite")
    public Boolean overwrite;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserData")
    public String userData;

    public static SubmitAudioProduceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioProduceJobRequest self = new SubmitAudioProduceJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAudioProduceJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitAudioProduceJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitAudioProduceJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitAudioProduceJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitAudioProduceJobRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public SubmitAudioProduceJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitAudioProduceJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
