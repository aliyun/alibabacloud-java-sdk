// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAudioProduceJobRequest extends TeaModel {
    // 任务描述
    @NameInMap("Description")
    public String description;

    // 音频生产配置
    @NameInMap("EditingConfig")
    public String editingConfig;

    // 文本内容。  最大支持300个汉字
    @NameInMap("InputConfig")
    public String inputConfig;

    // 音频输出配置
    @NameInMap("OutputConfig")
    public String outputConfig;

    // 是否覆盖现有OSS文件
    @NameInMap("Overwrite")
    public Boolean overwrite;

    // 任务标题
    @NameInMap("Title")
    public String title;

    // 自定义数据
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
