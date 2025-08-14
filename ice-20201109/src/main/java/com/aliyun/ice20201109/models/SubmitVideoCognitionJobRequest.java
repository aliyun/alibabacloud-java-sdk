// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoCognitionJobRequest extends TeaModel {
    @NameInMap("Input")
    public SubmitVideoCognitionJobRequestInput input;

    /**
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
     * <strong>example:</strong>
     * <p>39f8e0bc00***************</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>example-title-****</p>
     */
    @NameInMap("Title")
    public String title;

    /**
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
         * <strong>example:</strong>
         * <p>c5c62d8f03613************c6d</p>
         */
        @NameInMap("Media")
        public String media;

        /**
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
