// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAudioProduceJobRequest extends TeaModel {
    /**
     * <p>The description of the job.</p>
     * <ul>
     * <li><p>Cannot exceed 1,024 bytes.</p>
     * </li>
     * <li><p>Must be UTF-8 encoded.</p>
     * </li>
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
     * <li><p><code>voice</code>: The <a href="https://help.aliyun.com/document_detail/449563.html">voice type</a>.</p>
     * </li>
     * <li><p><code>customizedVoice</code>: The ID of the custom voice for voice cloning.</p>
     * </li>
     * <li><p><code>format</code>: The output file format. Supported formats: <code>PCM</code>, <code>WAV</code>, and <code>MP3</code>.</p>
     * </li>
     * <li><p><code>volume</code>: The volume. The value ranges from 0 to 100. Default: 50.</p>
     * </li>
     * <li><p><code>speech_rate</code>: The speech rate. The value ranges from -500 to 500. Default: 0.</p>
     * <ul>
     * <li><p>Values of -500, 0, and 500 correspond to 0.5x, 1.0x, and 2.0x speed, respectively.</p>
     * </li>
     * <li><p>Calculation method:</p>
     * <ul>
     * <li><p>For a 0.8x speed multiplier: (1 - 1/0.8) / 0.002 = -125.</p>
     * </li>
     * <li><p>For a 1.2x speed multiplier: (1 - 1/1.2) / 0.001 = 166.</p>
     * </li>
     * <li><p>For speed multipliers less than 1, use a factor of 0.002.</p>
     * </li>
     * <li><p>For speed multipliers greater than 1, use a factor of 0.001.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p><code>pitch_rate</code>: The pitch rate. The value ranges from -500 to 500. Default: 0.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>If you provide both <code>voice</code> and <code>customizedVoice</code>, <code>customizedVoice</code> takes precedence.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;voice&quot;:&quot;Siqi&quot;,&quot;format&quot;:&quot;MP3&quot;,&quot;volume&quot;:50}</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <p>The text to synthesize. The maximum length is 10,000 characters. Supports <a href="https://help.aliyun.com/document_detail/2672807.html">SSML</a>.</p>
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
     * <p>Specifies whether to overwrite an existing OSS file.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <p>The title of the job. If you do not provide a title, the system automatically generates one based on the current date.</p>
     * <ul>
     * <li><p>Cannot exceed 128 bytes.</p>
     * </li>
     * <li><p>Must be UTF-8 encoded.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>China Regional Daily News</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>Custom settings in JSON format. The maximum length is 512 bytes. This parameter supports <a href="https://help.aliyun.com/document_detail/451631.html">custom callback address configuration</a>.</p>
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
