// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoTranslationJobRequest extends TeaModel {
    /**
     * <ul>
     * <li>The client token.</li>
     * </ul>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <ul>
     * <li>The job description.</li>
     * </ul>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <ul>
     * <li>The configuration parameters of the video translation job.</li>
     * <li>The value must be in the JSON format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SourceLanguage&quot;:&quot;zh&quot;,&quot;TargetLanguage&quot;:&quot;en&quot;,&quot;DetextArea&quot;:&quot;Auto&quot;}</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <ul>
     * <li>The input parameters of the video translation job.</li>
     * <li>A video translation job takes a video or subtitle file as the input.</li>
     * <li>The value must be in the JSON format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;:&quot;Video&quot;,&quot;Media&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/xxx.mp4%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/xxx.mp4&quot;}</a></p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <ul>
     * <li>The output parameters of the video translation job.</li>
     * <li>A video translation job can generate a video or subtitle file as the output.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MediaURL&quot;: &quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/your-object.mp4%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/your-object.mp4&quot;}</a></p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <ul>
     * <li>The job title.</li>
     * </ul>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <ul>
     * <li>The user-defined data.</li>
     * <li>The data must be in the JSON format, and can be up to 512 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitVideoTranslationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoTranslationJobRequest self = new SubmitVideoTranslationJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoTranslationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitVideoTranslationJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitVideoTranslationJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitVideoTranslationJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitVideoTranslationJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitVideoTranslationJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitVideoTranslationJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
