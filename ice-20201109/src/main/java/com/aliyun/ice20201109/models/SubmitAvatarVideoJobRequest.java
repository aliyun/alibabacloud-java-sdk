// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAvatarVideoJobRequest extends TeaModel {
    /**
     * <p>The description of the job. The description can be up to 128 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configurations for the avatar job, such as the avatar ID, voice, and speech rate.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AvatarId&quot;:&quot;yunqiao&quot;}</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <p>Input can be text, an audio file from Object Storage Service (OSS), or a <a href="">media asset</a>. Only MP3 and WAV audio formats are supported.&gt;Notice:  The value of the <code>Text</code> parameter must contain at least five characters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Text&quot;: &quot;To be or not to be, that is the question.&quot;}</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>Specifies the output configuration, including the destination URL for the rendered video.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MediaURL&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/xxx.mp4%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/xxx.mp4&quot;}</a></p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <p>The title of the job. The title can be up to 128 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Test title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>A user-defined JSON string for passing custom business information, such as environment details or job metadata.</p>
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
