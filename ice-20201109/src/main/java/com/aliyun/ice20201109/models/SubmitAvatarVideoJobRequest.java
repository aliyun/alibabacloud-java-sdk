// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAvatarVideoJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>测试描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>{&quot;AvatarId&quot;:&quot;yunqiao&quot;}</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <strong>example:</strong>
     * <p>{&quot;MediaURL&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/xxx.mp4%22,%22Width%22:1920,%22Height%22:1080%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/xxx.mp4&quot;,&quot;Width&quot;:1920,&quot;Height&quot;:1080}</a></p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <strong>example:</strong>
     * <p>测试标题</p>
     */
    @NameInMap("Title")
    public String title;

    /**
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
