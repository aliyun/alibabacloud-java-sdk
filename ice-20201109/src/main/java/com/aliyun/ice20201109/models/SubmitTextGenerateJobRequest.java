// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTextGenerateJobRequest extends TeaModel {
    /**
     * <p>The description of the task. The description can be up to 1,024 bytes in length and must be encoded in UTF-8.</p>
     * 
     * <strong>example:</strong>
     * <p>Test Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The generation configuration. When Type is set to Title or MarketingCopy, you must specify the following fields:</p>
     * <ul>
     * <li>keywords: the keywords used to generate the title or marketing copy. Required.</li>
     * <li>textLength: the word count of the generated copy. Valid values: 5 to 1000. The actual word count of the generated copy may be slightly less than or equal to this value, but will not exceed it. Required.</li>
     * <li>targetCount: the number of copies to generate. Valid values: 1 to 1000. Required.</li>
     * </ul>
     * <p>When Type is set to StoryboardScript, you must specify the following field:</p>
     * <ul>
     * <li>originText: the original copy used to generate the storyboard script. Required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;keywords&quot;:&quot;New store cake,Animal cream&quot;,&quot;textLength&quot;:100,&quot;targetCount&quot;:3} or {&quot;originText&quot;: &quot;A new cake shop has opened on the street,Selling cream cakes,Fruit cake,Bread,Muffins, etc..A coffee shop has opened across from the cake shop,An endless stream of customers.&quot;}</p>
     */
    @NameInMap("GenerateConfig")
    public String generateConfig;

    /**
     * <p>The title of the task.</p>
     * <ul>
     * <li><p>The length cannot exceed 128 bytes.</p>
     * </li>
     * <li><p>The title must be encoded in UTF-8.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Test Title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li>MarketingCopy: marketing copy</li>
     * <li>Title: short video title</li>
     * <li>StoryboardScript: storyboard script generated from copy</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MarketingCopy</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The custom settings in JSON format. The length cannot exceed 512 bytes. <a href="https://help.aliyun.com/document_detail/451631.html">Custom callback URL configuration</a> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
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
