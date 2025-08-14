// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoCognitionJobShrinkRequest extends TeaModel {
    @NameInMap("Input")
    public String inputShrink;

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

    public static SubmitVideoCognitionJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoCognitionJobShrinkRequest self = new SubmitVideoCognitionJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoCognitionJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitVideoCognitionJobShrinkRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitVideoCognitionJobShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitVideoCognitionJobShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitVideoCognitionJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
