// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoCognitionJobRequest extends TeaModel {
    /**
     * <p>The media input object.</p>
     */
    @NameInMap("Input")
    public SubmitVideoCognitionJobRequestInput input;

    /**
     * <p>Additional request parameters, provided as a JSON string. This is used to pass specific settings for various AI analysis modules, such as Natural Language Processing (NLP), shot segmentation, tagging, and action recognition.</p>
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
     * <p>The ID of the template that specifies the analysis algorithms to be used. For details, see <a href="https://help.aliyun.com/zh/ims/developer-reference/api-ice-2020-11-09-createcustomtemplate?spm=a2c4g.11186623.help-menu-193643.d_5_0_3_3_0_0.17b66afamjKySv">CreateCustomTemplate</a> and <a href="https://help.aliyun.com/zh/ims/user-guide/smart-tagging-template?spm=a2c4g.11186623.0.i15">smart tagging template</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc00***************</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The video title. It supports letters, digits, and hyphens (-), and cannot start with a special character. Max length: 256 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>example-title-****</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user-defined data that is passed through and returned as-is in the response. Max length: 1,024 bytes.</p>
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
         * <p>If Type is set to OSS, specify an OSS path. Example: OSS://test-bucket/video/202208/test.mp4.</p>
         * <p>If Type is set to Media, specify a media asset ID. Example: c5c62d8f0361337cab312dce8e77dc6d.</p>
         * <p>If Type is set to URL, specify an HTTP URL. Example: <a href="https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4">https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>c5c62d8f03613************c6d</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of media input. Valid values:</p>
         * <ul>
         * <li>OSS</li>
         * <li>Media</li>
         * <li>URL</li>
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
