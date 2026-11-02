// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAvatarVideoJobRequest extends TeaModel {
    /**
     * <p>The description of the task. The description can be up to 128 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Test Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configuration information for the digital human task. You can configure information such as the digital human ID, voice, and speech rate.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AvatarId&quot;:&quot;yunqiao&quot;}</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <p>The input parameters for the digital human task. Text, audio files stored in OSS, and media assets are supported as input. Audio files support only the MP3 or WAV format.</p>
     * <blockquote>
     * <p>Notice: The length of the input text cannot be less than 5 characters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Text&quot;: &quot;Do you not see the Yellow River\&quot;s waters descending from heaven, rushing to the sea never to return.Do you not see in the bright mirror of the high hall, the sad sight of white hair,Hair turns from black to white in the course of a day.&quot;}</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>The output information of the task. You can configure the output address.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MediaURL&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/xxx.mp4%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/xxx.mp4&quot;}</a></p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <p>The title of the task. The title can be up to 128 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Test Title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom settings of the user. You can pass in customer business information, such as the business environment and task information, in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;user&quot;:&quot;data&quot;,&quot;env&quot;:&quot;prod&quot;}</p>
     */
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
