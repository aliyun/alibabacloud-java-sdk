// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAudioProduceJobRequest extends TeaModel {
    /**
     * <p>The job description.</p>
     * <ul>
     * <li>The job description can be up to 1,024 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>任务描述  长度不超过1024字节  UTF8编码</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The audio editing configurations.</p>
     * <ul>
     * <li>voice: the <a href="https://help.aliyun.com/document_detail/402424.html">voice type</a>.</li>
     * <li>customizedVoice: the ID of the personalized human voice.</li>
     * <li>format: the format of the output file. Valid values: PCM, WAV, and MP3.</li>
     * <li>volume: the volume. Default value: 50. Valid values: 0 to 100.</li>
     * <li>speech_rate: the speech tempo. Default value: 0. Value range: -500 to 500.</li>
     * <li>pitch_rate: the intonation. Default value: 0. Value range: -500 to 500.</li>
     * </ul>
     * <blockquote>
     * <p> If you specify both voice and customizedVoice, customizedVoice takes precedence over voice.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;voice&quot;:&quot;Siqi&quot;,&quot;format&quot;:&quot;MP3&quot;,&quot;volume&quot;:50}</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <p>The text content. A maximum of 2,000 characters are supported. The <a href="https://help.aliyun.com/document_detail/2672807.html">Speech Synthesis Markup Language (SSML)</a> is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试文本</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>The output audio configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;bucket&quot;:&quot;bucket&quot;,&quot;object&quot;:&quot;objeck&quot;}</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <p>Specifies whether to overwrite the existing Object Storage Service (OSS) object.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <p>The job title. If you do not specify this parameter, the system generates a title based on the current date.</p>
     * <ul>
     * <li>The job title can be up to 128 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>任务标题。若不提供，根据日期自动生成默认title  长度不超过128字节  UTF8编码</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user-defined data in the JSON format, which can be up to 512 bytes in length. You can specify a custom callback URL. For more information, see <a href="https://help.aliyun.com/document_detail/451631.html">Configure a callback upon editing completion</a>.</p>
     * 
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
