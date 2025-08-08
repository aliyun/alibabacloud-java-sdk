// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelSetModelProfile extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>通义千问系列速度最快、成本很低的模型，适合简单任务。本模型是动态更新版本，模型更新不会提前通知，模型中英文综合能力显著提升，模型人类偏好显著提升，模型推理能力和复杂指令理解能力显著增强，困难任务上的表现更优，数学、代码能力显著提升。</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>通义千问-Turbo-Latest</p>
     */
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-turbo-latest</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("props")
    public ModelSetModelProfileProps props;

    /**
     * <strong>example:</strong>
     * <p>predefined</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    public static ModelSetModelProfile build(java.util.Map<String, ?> map) throws Exception {
        ModelSetModelProfile self = new ModelSetModelProfile();
        return TeaModel.build(map, self);
    }

    public ModelSetModelProfile setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModelSetModelProfile setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ModelSetModelProfile setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ModelSetModelProfile setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelSetModelProfile setProps(ModelSetModelProfileProps props) {
        this.props = props;
        return this;
    }
    public ModelSetModelProfileProps getProps() {
        return this.props;
    }

    public ModelSetModelProfile setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class ModelSetModelProfileProps extends TeaModel {
        @NameInMap("contextSize")
        public Long contextSize;

        @NameInMap("llmMode")
        public String llmMode;

        public static ModelSetModelProfileProps build(java.util.Map<String, ?> map) throws Exception {
            ModelSetModelProfileProps self = new ModelSetModelProfileProps();
            return TeaModel.build(map, self);
        }

        public ModelSetModelProfileProps setContextSize(Long contextSize) {
            this.contextSize = contextSize;
            return this;
        }
        public Long getContextSize() {
            return this.contextSize;
        }

        public ModelSetModelProfileProps setLlmMode(String llmMode) {
            this.llmMode = llmMode;
            return this;
        }
        public String getLlmMode() {
            return this.llmMode;
        }

    }

}
