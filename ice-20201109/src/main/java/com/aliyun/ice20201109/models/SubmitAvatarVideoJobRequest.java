// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAvatarVideoJobRequest extends TeaModel {
    /**
     * <p>The task description. Max length: 128 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The avatar configurations, including the avatar ID, voice, and speech rate.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AvatarId&quot;:&quot;yunqiao&quot;}</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <p>The input configurations of the video rendering task for an avatar. You can specify text, the Object Storage Service (OSS) URL of an audio file, or the ID of a media asset. The audio file must be in the MP3 or WAV format.</p>
     * <blockquote>
     * <p>Notice: The text must be at least five characters in length.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Text&quot;: &quot;To be, or not to be, that is the question.&quot;}</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>The output configurations, including the destination URL for the rendered video.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MediaURL&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/xxx.mp4%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/xxx.mp4&quot;}</a></p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <p>The task name. Max length: 128 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>A user-defined JSON string for passing custom business information, such as environment details or task metadata.</p>
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
