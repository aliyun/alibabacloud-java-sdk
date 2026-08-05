// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAudioProduceJobRequest extends TeaModel {
    /**
     * <p>The task description:</p>
     * <ul>
     * <li>Maximum length: 1024 bytes.</li>
     * <li>UTF-8 encoding.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Task description, max 1024 bytes, UTF-8 encoded</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The audio production configuration:</p>
     * <ul>
     * <li>voice: the <a href="https://help.aliyun.com/document_detail/449563.html">voice type</a>.</li>
     * <li>customizedVoice: the VoiceId for voice cloning.</li>
     * <li>format: the output file format. Valid values: PCM, WAV, and MP3.</li>
     * <li>volume: the volume. Valid values: 0 to 100. Default value: 50.</li>
     * <li>speech_rate: the speech rate. Valid values: -500 to 500. Default value: 0.<ul>
     * <li>[-500, 0, 500] corresponds to the speed multiplier range of [0.5, 1.0, 2.0].</li>
     * <li>The calculation method is as follows:<ul>
     * <li>0.8x speed: (1-1/0.8)/0.002 = -125</li>
     * <li>1.2x speed: (1-1/1.2)/0.001 = 166</li>
     * <li>For speeds less than 1x, use the 0.002 coefficient.</li>
     * <li>For speeds greater than 1x, use the 0.001 coefficient.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>pitch_rate: the pitch. Valid values: -500 to 500. Default value: 0.
     * <notice>If both voice and customizedVoice are specified, customizedVoice takes precedence.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;voice&quot;:&quot;Siqi&quot;,&quot;format&quot;:&quot;MP3&quot;,&quot;volume&quot;:50}</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <p>The text content. A maximum of 10,000 Chinese characters is supported. <a href="https://help.aliyun.com/document_detail/2672807.html">SSML markup language</a> is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Audio production task</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>The audio output configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>For example, to store the output audio at <a href="http://my_bucket.oss-cn-shanghai.aliyuncs.com/target_audio.mp3">http://my_bucket.oss-cn-shanghai.aliyuncs.com/target_audio.mp3</a>, configure this parameter as:
     * {
     *       &quot;bucket&quot;: &quot;my_bucket&quot;,
     *       &quot;object&quot;: &quot;target_audio&quot;
     * }</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <p>Specifies whether to overwrite existing OSS files.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <p>The task title. If not provided, a default title is automatically generated based on the date.</p>
     * <ul>
     * <li>Maximum length: 128 bytes.</li>
     * <li>UTF-8 encoding.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>China Regional Daily News</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom settings in JSON format. Maximum length: 512 bytes. <a href="https://help.aliyun.com/document_detail/451631.html">Custom callback URL configuration</a> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;<a href="https://xx.xx.xxx%22%7D">https://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;ice-callback-demo&quot;}</p>
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
