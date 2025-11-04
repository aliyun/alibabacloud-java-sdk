// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateHotwordLibraryShrinkRequest extends TeaModel {
    /**
     * <p>The description of the hotword library. It can be up to 200 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>存放名人的词库</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The hotword list. You can add up to 300 hotword entries to a single library.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Hotwords")
    public String hotwordsShrink;

    /**
     * <p>The name of the hotword library. It can be up to 100 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_hotwords</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The usage scenario of the hotword library. Valid values:</p>
     * <p>· ASR: Automatic Speech Recognition</p>
     * <p>· StructuredMediaAssets: structured media analysis</p>
     * <p>· VideoTranslation: Video translation.</p>
     * <p>This field cannot be modified after the hotword library is created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ASR</p>
     */
    @NameInMap("UsageScenario")
    public String usageScenario;

    public static CreateHotwordLibraryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHotwordLibraryShrinkRequest self = new CreateHotwordLibraryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateHotwordLibraryShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateHotwordLibraryShrinkRequest setHotwordsShrink(String hotwordsShrink) {
        this.hotwordsShrink = hotwordsShrink;
        return this;
    }
    public String getHotwordsShrink() {
        return this.hotwordsShrink;
    }

    public CreateHotwordLibraryShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateHotwordLibraryShrinkRequest setUsageScenario(String usageScenario) {
        this.usageScenario = usageScenario;
        return this;
    }
    public String getUsageScenario() {
        return this.usageScenario;
    }

}
