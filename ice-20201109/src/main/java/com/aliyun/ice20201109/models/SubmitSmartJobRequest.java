// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSmartJobRequest extends TeaModel {
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

    @NameInMap("JobType")
    public String jobType;

    public static SubmitSmartJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmartJobRequest self = new SubmitSmartJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmartJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitSmartJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitSmartJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitSmartJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitSmartJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitSmartJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitSmartJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

}
