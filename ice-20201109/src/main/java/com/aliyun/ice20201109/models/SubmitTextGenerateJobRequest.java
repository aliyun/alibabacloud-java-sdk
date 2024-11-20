// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTextGenerateJobRequest extends TeaModel {
    /**
     * <p>The job description, which can be up to 1,024 bytes in length and must be encoded in UTF-8.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The text generation configurations, including keywords and the requirements for the word count and number of output copies.</p>
     */
    @NameInMap("GenerateConfig")
    public String generateConfig;

    /**
     * <p>The job title.</p>
     * <p>The job title can be up to 128 bytes in length.</p>
     * <p>The value must be encoded in UTF-8.</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The job type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>MarketingCopy: the marketing copy.</li>
     * <li>Title: the short video title.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MarketingCopy</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The user-defined data in the JSON format, which can be up to 512 bytes in length. You can specify a custom callback URL. For more information, see <a href="https://help.aliyun.com/document_detail/451631.html">Configure a callback upon editing completion</a>.</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitTextGenerateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextGenerateJobRequest self = new SubmitTextGenerateJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTextGenerateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitTextGenerateJobRequest setGenerateConfig(String generateConfig) {
        this.generateConfig = generateConfig;
        return this;
    }
    public String getGenerateConfig() {
        return this.generateConfig;
    }

    public SubmitTextGenerateJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitTextGenerateJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SubmitTextGenerateJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
