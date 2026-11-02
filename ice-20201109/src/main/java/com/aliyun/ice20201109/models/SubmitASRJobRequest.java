// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitASRJobRequest extends TeaModel {
    /**
     * <p>The job description. The maximum length is 128 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>Test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The duration.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00:10</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The audio speech-to-text configuration:</p>
     * <ul>
     * <li>HotwordLibraryIdList: the list of hotword library IDs. Currently, only one hotword library ID can be passed. Support for multiple hotword library IDs is planned for the future.</li>
     * <li>SentenceMaxLength: the maximum length of each sentence in the output result. Type: int.</li>
     * <li>EnableSemanticSentenceDetection: specifies whether to segment sentences in the output result based on semantics. Type: bool. Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;HotwordLibraryIdList&quot;: &quot;<strong><strong><strong>2609a14f54a0636b7e16</strong></strong></strong>&quot;
     * }</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <p>The input configuration. OSS URLs and content library material IDs are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
     */
    @NameInMap("InputFile")
    public String inputFile;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The job title. The maximum length is 128 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>Test title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom settings. You can pass in customer business information, such as the business environment and job information, in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;user&quot;: &quot;data&quot;,
     *       &quot;env&quot;: &quot;prod&quot;
     * }</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitASRJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitASRJobRequest self = new SubmitASRJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitASRJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitASRJobRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public SubmitASRJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitASRJobRequest setInputFile(String inputFile) {
        this.inputFile = inputFile;
        return this;
    }
    public String getInputFile() {
        return this.inputFile;
    }

    public SubmitASRJobRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SubmitASRJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitASRJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
