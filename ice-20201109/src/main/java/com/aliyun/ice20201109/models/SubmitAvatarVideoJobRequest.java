// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAvatarVideoJobRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EditingConfig")
    public String editingConfig;

    @NameInMap("InputConfig")
    public String inputConfig;

    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserData")
    public String userData;

    public static SubmitAvatarVideoJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAvatarVideoJobRequest self = new SubmitAvatarVideoJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAvatarVideoJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitAvatarVideoJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitAvatarVideoJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitAvatarVideoJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitAvatarVideoJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitAvatarVideoJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
