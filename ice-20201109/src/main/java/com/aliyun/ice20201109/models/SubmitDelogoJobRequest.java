// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDelogoJobRequest extends TeaModel {
    // 输入文件
    @NameInMap("InputFile")
    public String inputFile;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("Title")
    public String title;

    @NameInMap("Description")
    public String description;

    // 输出bucket
    @NameInMap("OutputConfig")
    public String outputConfig;

    // 输入文件类型
    @NameInMap("InputType")
    public String inputType;

    // 是否强制覆盖现有OSS文件
    @NameInMap("Overwrite")
    public Boolean overwrite;

    // 输出类型
    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

    public static SubmitDelogoJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDelogoJobRequest self = new SubmitDelogoJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDelogoJobRequest setInputFile(String inputFile) {
        this.inputFile = inputFile;
        return this;
    }
    public String getInputFile() {
        return this.inputFile;
    }

    public SubmitDelogoJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitDelogoJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitDelogoJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitDelogoJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitDelogoJobRequest setInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }
    public String getInputType() {
        return this.inputType;
    }

    public SubmitDelogoJobRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public SubmitDelogoJobRequest setOutputMediaTarget(String outputMediaTarget) {
        this.outputMediaTarget = outputMediaTarget;
        return this;
    }
    public String getOutputMediaTarget() {
        return this.outputMediaTarget;
    }

}
