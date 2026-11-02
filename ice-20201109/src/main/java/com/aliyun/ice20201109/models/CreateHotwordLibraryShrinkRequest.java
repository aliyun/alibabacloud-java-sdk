// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateHotwordLibraryShrinkRequest extends TeaModel {
    /**
     * <p>The description of the hotword library. The maximum length is 200 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>A lexicon of celebrity names</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of hotwords. The maximum number of hotwords is 300.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Hotwords")
    public String hotwordsShrink;

    /**
     * <p>The name of the hotword library. The maximum length is 100 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_hotwords</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The scenarios of the hotword library. Valid values:</p>
     * <ul>
     * <li><p>ASR: ASR intelligent text recognition.</p>
     * </li>
     * <li><p>StructuredMediaAssets: structured media assets.</p>
     * </li>
     * <li><p>VideoTranslation: video translation.</p>
     * </li>
     * </ul>
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
