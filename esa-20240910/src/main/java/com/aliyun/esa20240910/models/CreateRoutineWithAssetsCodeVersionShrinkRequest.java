// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineWithAssetsCodeVersionShrinkRequest extends TeaModel {
    @NameInMap("BuildId")
    public Long buildId;

    @NameInMap("CodeDescription")
    public String codeDescription;

    @NameInMap("ConfOptions")
    public String confOptionsShrink;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateRoutineWithAssetsCodeVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineWithAssetsCodeVersionShrinkRequest self = new CreateRoutineWithAssetsCodeVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoutineWithAssetsCodeVersionShrinkRequest setBuildId(Long buildId) {
        this.buildId = buildId;
        return this;
    }
    public Long getBuildId() {
        return this.buildId;
    }

    public CreateRoutineWithAssetsCodeVersionShrinkRequest setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
        return this;
    }
    public String getCodeDescription() {
        return this.codeDescription;
    }

    public CreateRoutineWithAssetsCodeVersionShrinkRequest setConfOptionsShrink(String confOptionsShrink) {
        this.confOptionsShrink = confOptionsShrink;
        return this;
    }
    public String getConfOptionsShrink() {
        return this.confOptionsShrink;
    }

    public CreateRoutineWithAssetsCodeVersionShrinkRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateRoutineWithAssetsCodeVersionShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
