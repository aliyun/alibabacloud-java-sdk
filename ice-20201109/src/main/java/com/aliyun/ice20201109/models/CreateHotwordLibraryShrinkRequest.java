// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateHotwordLibraryShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>存放名人的词库</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Hotwords")
    public String hotwordsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_hotwords</p>
     */
    @NameInMap("Name")
    public String name;

    /**
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
