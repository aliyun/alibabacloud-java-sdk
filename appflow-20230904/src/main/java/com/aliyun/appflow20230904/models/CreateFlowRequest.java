// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class CreateFlowRequest extends TeaModel {
    /**
     * <p>The description of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>在钉钉中使用OpenClaw(MoltBot、MoltBot)</p>
     */
    @NameInMap("FlowDesc")
    public String flowDesc;

    /**
     * <p>The ID of the flow. This parameter is required when you update a flow or create a new flow version.</p>
     * 
     * <strong>example:</strong>
     * <p>flow-647da8e366a74d1cab6e</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>The name of the flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>企业微信自建应用大模型自动回复</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The content of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;FormatVersion&quot;: &quot;appflow-2025-07-01&quot;,
     *   &quot;Nodes&quot;: [</p>
     * <pre><code> ]
     * </code></pre>
     * <p>}</p>
     */
    @NameInMap("FlowTemplate")
    public String flowTemplate;

    /**
     * <p>The publication status of the flow: True for published, False for unpublished.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LaunchStatus")
    public Boolean launchStatus;

    /**
     * <p>The parameters for the template.</p>
     * <p>You can specify up to 200 parameters.</p>
     * <blockquote>
     * <p>This parameter is optional. If you use this parameter, you must specify both ParameterKey and ParameterValue for each entry.</p>
     * </blockquote>
     */
    @NameInMap("Parameters")
    public java.util.List<CreateFlowRequestParameters> parameters;

    /**
     * <p>The object tags to which the rule applies. You can specify multiple tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateFlowRequestTag> tag;

    /**
     * <p>The ID of the template. Specify this parameter when you create a flow from a template in the Template Center.</p>
     * 
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
         * <p>The name of a parameter defined in the template. If no parameter name or value is specified, ROS uses the default value defined in the template.</p>
         * <p>The maximum value of N is 200.<br>
         * The name must be 1 to 128 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <blockquote>
         * <p>Parameters is optional. If you specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dingdingAuthId</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value for the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>uac-xxxxxxx</p>
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
        /**
         * <p>The tag key. You can filter the cluster list by tag. You can specify up to 20 tag pairs. The number N in each tag pair must be unique and a consecutive integer starting from 1. The value corresponding to <code>Tag.N.Key</code> is <code>Tag.N.Value</code>.</p>
         * <blockquote>
         * <p>The tag key can be up to 64 characters long and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CreateBy</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The authentication content.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
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
