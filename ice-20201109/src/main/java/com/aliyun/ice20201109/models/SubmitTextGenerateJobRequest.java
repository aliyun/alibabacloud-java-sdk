// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTextGenerateJobRequest extends TeaModel {
    /**
     * <p>The job description, with a maximum length of 1,024 bytes (UTF-8 encoded).</p>
     * 
     * <strong>example:</strong>
     * <p>Test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The generation configuration, in JSON format.</p>
     * <p>If <code>Type</code> is set to <code>Title</code> or <code>MarketingCopy</code>, specify the following fields:</p>
     * <ul>
     * <li><p><code>keywords</code>: The keywords used to generate the title or marketing copy. This parameter is required.</p>
     * </li>
     * <li><p><code>textLength</code>: The target length of the generated text, in characters. Valid values: 5 to 1,000. The actual length of the output is less than or equal to this value. This parameter is required.</p>
     * </li>
     * <li><p><code>targetCount</code>: The number of copy variations to generate. Valid values: 1 to 1,000. This parameter is required.</p>
     * </li>
     * </ul>
     * <p>If <code>Type</code> is set to <code>StoryboardScript</code>, specify the following field:</p>
     * <ul>
     * <li><code>originText</code>: The original text used to generate the storyboard script. This parameter is required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;keywords&quot;:&quot;New cake shop, animal cream&quot;,&quot;textLength&quot;:100,&quot;targetCount&quot;:3}
     * or
     * {&quot;originText&quot;: &quot;A new cake shop just opened on the street, selling cream cakes, fruit cakes, bread, muffins, etc. A coffee shop opened across from the cake shop, with a steady stream of customers.&quot;}</p>
     */
    @NameInMap("GenerateConfig")
    public String generateConfig;

    /**
     * <p>The job title.</p>
     * <p>\- The maximum length is 128 bytes.</p>
     * <p>\- UTF-8 encoding is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The job type.</p>
     * <p><strong>Valid values:</strong></p>
     * <ul>
     * <li><p><code>MarketingCopy</code>: Generates marketing copy.</p>
     * </li>
     * <li><p><code>Title</code>: Generates a short video title.</p>
     * </li>
     * <li><p><code>StoryboardScript</code>: Generates a storyboard script from text.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MarketingCopy</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The custom settings in JSON format. The maximum length is 512 bytes. You can use this parameter to specify a <a href="https://help.aliyun.com/document_detail/451631.html">custom callback address</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;<a href="https://xx.xx.xxx%22%7D">https://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;ice-callback-demo&quot;}</p>
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
