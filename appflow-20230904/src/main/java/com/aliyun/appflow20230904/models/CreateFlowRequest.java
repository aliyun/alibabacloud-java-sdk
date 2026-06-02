// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class CreateFlowRequest extends TeaModel {
    @NameInMap("FlowDesc")
    public String flowDesc;

    /**
     * <strong>example:</strong>
     * <p>flow-647da8e366a74d1cab6e</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("FlowTemplate")
    public String flowTemplate;

    @NameInMap("LaunchStatus")
    public Boolean launchStatus;

    @NameInMap("Parameters")
    public java.util.List<CreateFlowRequestParameters> parameters;

    @NameInMap("Tag")
    public java.util.List<CreateFlowRequestTag> tag;

    /**
     * <strong>example:</strong>
     * <p>tl-715d93e708b546b7b464</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRequest self = new CreateFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowRequest setFlowDesc(String flowDesc) {
        this.flowDesc = flowDesc;
        return this;
    }
    public String getFlowDesc() {
        return this.flowDesc;
    }

    public CreateFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateFlowRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateFlowRequest setFlowTemplate(String flowTemplate) {
        this.flowTemplate = flowTemplate;
        return this;
    }
    public String getFlowTemplate() {
        return this.flowTemplate;
    }

    public CreateFlowRequest setLaunchStatus(Boolean launchStatus) {
        this.launchStatus = launchStatus;
        return this;
    }
    public Boolean getLaunchStatus() {
        return this.launchStatus;
    }

    public CreateFlowRequest setParameters(java.util.List<CreateFlowRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateFlowRequestParameters> getParameters() {
        return this.parameters;
    }

    public CreateFlowRequest setTag(java.util.List<CreateFlowRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateFlowRequestTag> getTag() {
        return this.tag;
    }

    public CreateFlowRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public static class CreateFlowRequestParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dingdingAuthId</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <strong>example:</strong>
         * <p>uac-cdd8e1cfde534b4db482</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateFlowRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowRequestParameters self = new CreateFlowRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateFlowRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public CreateFlowRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateFlowRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateFlowRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowRequestTag self = new CreateFlowRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateFlowRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateFlowRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
