// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoCognitionJobRequest extends TeaModel {
    /**
     * <p>The input media structure.</p>
     */
    @NameInMap("Input")
    public SubmitVideoCognitionJobRequestInput input;

    /**
     * <p>The additional request parameters, represented as a JSON string. This parameter supports additional parameters for operators such as natural language processing, shot detection, custom tagging, and action recognition.</p>
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

    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The template ID used to specify the analysis algorithm. For template-related operations, refer to <a href="https://www.alibabacloud.com/help/en/ims/developer-reference/api-ice-2020-11-09-createcustomtemplate">Create a custom template</a> and <a href="https://www.alibabacloud.com/help/en/ims/user-guide/smart-tagging-template">Smart tagging template</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc00***************</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The video title. The title supports Chinese characters, English letters, digits, and hyphens (-). It cannot start with a special character and cannot exceed 256 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>example-title-****</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user-defined data. The data is returned as-is when the result is retrieved. The length cannot exceed 1,024 bytes.</p>
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
         * <p>If the Type parameter is set to OSS, specify the OSS address, such as OSS://test-bucket/video/202208/test.mp4.</p>
         * <p>If the Type parameter is set to Media, specify the mediaId, such as c5c62d8f0361337cab312dce8e77dc6d.</p>
         * <p>If the Type parameter is set to URL, specify the HTTP URL, such as <a href="https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4">https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>c5c62d8f03613************c6d</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media type. Valid values:</p>
         * <ul>
         * <li><p>OSS</p>
         * </li>
         * <li><p>Media</p>
         * </li>
         * <li><p>URL</p>
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
