// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineWithAssetsCodeVersionRequest extends TeaModel {
    @NameInMap("BuildId")
    public Long buildId;

    @NameInMap("CodeDescription")
    public String codeDescription;

    @NameInMap("ConfOptions")
    public CreateRoutineWithAssetsCodeVersionRequestConfOptions confOptions;

    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateRoutineWithAssetsCodeVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineWithAssetsCodeVersionRequest self = new CreateRoutineWithAssetsCodeVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoutineWithAssetsCodeVersionRequest setBuildId(Long buildId) {
        this.buildId = buildId;
        return this;
    }
    public Long getBuildId() {
        return this.buildId;
    }

    public CreateRoutineWithAssetsCodeVersionRequest setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
        return this;
    }
    public String getCodeDescription() {
        return this.codeDescription;
    }

    public CreateRoutineWithAssetsCodeVersionRequest setConfOptions(CreateRoutineWithAssetsCodeVersionRequestConfOptions confOptions) {
        this.confOptions = confOptions;
        return this;
    }
    public CreateRoutineWithAssetsCodeVersionRequestConfOptions getConfOptions() {
        return this.confOptions;
    }

    public CreateRoutineWithAssetsCodeVersionRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateRoutineWithAssetsCodeVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class CreateRoutineWithAssetsCodeVersionRequestConfOptions extends TeaModel {
        @NameInMap("NotFoundStrategy")
        public String notFoundStrategy;

        public static CreateRoutineWithAssetsCodeVersionRequestConfOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateRoutineWithAssetsCodeVersionRequestConfOptions self = new CreateRoutineWithAssetsCodeVersionRequestConfOptions();
            return TeaModel.build(map, self);
        }

        public CreateRoutineWithAssetsCodeVersionRequestConfOptions setNotFoundStrategy(String notFoundStrategy) {
            this.notFoundStrategy = notFoundStrategy;
            return this;
        }
        public String getNotFoundStrategy() {
            return this.notFoundStrategy;
        }

    }

}
