// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateHotwordLibraryRequest extends TeaModel {
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
    public java.util.List<Hotword> hotwords;

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

    public static CreateHotwordLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHotwordLibraryRequest self = new CreateHotwordLibraryRequest();
        return TeaModel.build(map, self);
    }

    public CreateHotwordLibraryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateHotwordLibraryRequest setHotwords(java.util.List<Hotword> hotwords) {
        this.hotwords = hotwords;
        return this;
    }
    public java.util.List<Hotword> getHotwords() {
        return this.hotwords;
    }

    public CreateHotwordLibraryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateHotwordLibraryRequest setUsageScenario(String usageScenario) {
        this.usageScenario = usageScenario;
        return this;
    }
    public String getUsageScenario() {
        return this.usageScenario;
    }

}
