// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoCognitionJobRequest extends TeaModel {
    /**
     * <p>The input media object.</p>
     */
    @NameInMap("Input")
    public SubmitVideoCognitionJobRequestInput input;

    /**
     * <p>A JSON string containing additional parameters for operators such as natural language processing, shot detection, custom tagging, and action recognition.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;nlpParams&quot;: {
     *         &quot;sourceLanguage&quot;: &quot;cn&quot;,
     *         &quot;diarizationEnabled&quot;: true,
     *         &quot;speakerCount&quot;: 2,
     *         &quot;summarizationEnabled&quot;: true,
     *         &quot;summarizationTypes&quot;: &quot;Paragraph,Conversational,QuestionsAnswering,MindMap&quot;,
     *         &quot;translationEnabled&quot;: true,
     *         &quot;targetLanguages&quot;: &quot;en&quot;,
     *         &quot;autoChaptersEnabled&quot;: true,
     *         &quot;meetingAssistanceEnabled&quot;: true
     *     }
     * }</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The template configuration.</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The ID of the template that specifies the analysis algorithms to use. For more information about managing templates, see <a href="https://help.aliyun.com/zh/ims/developer-reference/api-ice-2020-11-09-createcustomtemplate?spm=a2c4g.11186623.help-menu-193643.d_5_0_3_3_0_0.17b66afamjKySv">Create Custom Template</a> and <a href="https://help.aliyun.com/zh/ims/user-guide/smart-tagging-template?spm=a2c4g.11186623.0.i15">AI-powered tagging template</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc00***************</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The title of the video. The title can contain Chinese characters, English letters, digits, and hyphens (-). The title cannot start with a special character and must not exceed 256 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>example-title-****</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user-defined data. The service returns this data unmodified in the callback notification. This parameter cannot exceed 1,024 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:1}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitVideoCognitionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoCognitionJobRequest self = new SubmitVideoCognitionJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoCognitionJobRequest setInput(SubmitVideoCognitionJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitVideoCognitionJobRequestInput getInput() {
        return this.input;
    }

    public SubmitVideoCognitionJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitVideoCognitionJobRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public SubmitVideoCognitionJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitVideoCognitionJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitVideoCognitionJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitVideoCognitionJobRequestInput extends TeaModel {
        /**
         * <p>If <code>Type</code> is <code>OSS</code>, specify the Object Storage Service (OSS) URL of the media file. Example: <code>OSS://test-bucket/video/202208/test.mp4</code></p>
         * <p>If <code>Type</code> is <code>Media</code>, specify the media ID. Example: <code>c5c62d8f0361337cab312dce8e77dc6d</code></p>
         * <p>If <code>Type</code> is <code>URL</code>, specify the HTTP URL of the media file. Example: <code>https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4</code></p>
         * 
         * <strong>example:</strong>
         * <p>c5c62d8f03613************c6d</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input media. Valid values:</p>
         * <ul>
         * <li><p><code>OSS</code></p>
         * </li>
         * <li><p><code>Media</code></p>
         * </li>
         * <li><p><code>URL</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Media</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitVideoCognitionJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoCognitionJobRequestInput self = new SubmitVideoCognitionJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitVideoCognitionJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitVideoCognitionJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
