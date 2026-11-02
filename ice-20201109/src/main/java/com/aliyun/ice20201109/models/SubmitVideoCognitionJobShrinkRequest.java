// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoCognitionJobShrinkRequest extends TeaModel {
    /**
     * <p>The input media structure.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

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

    public SubmitVideoCognitionJobShrinkRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
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
