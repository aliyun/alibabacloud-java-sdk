// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAudioProduceJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>任务描述  长度不超过1024字节  UTF8编码</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;voice&quot;:&quot;Siqi&quot;,&quot;format&quot;:&quot;MP3&quot;,&quot;volume&quot;:50}</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试文本</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;bucket&quot;:&quot;bucket&quot;,&quot;object&quot;:&quot;objeck&quot;}</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <strong>example:</strong>
     * <p>任务标题。若不提供，根据日期自动生成默认title  长度不超过128字节  UTF8编码</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>{&quot;user&quot;:&quot;data&quot;}</p>
     */
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
