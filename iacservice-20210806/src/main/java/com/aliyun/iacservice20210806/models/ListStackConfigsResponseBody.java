// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListStackConfigsResponseBody extends TeaModel {
    @NameInMap("configs")
    public java.util.List<ListStackConfigsResponseBodyConfigs> configs;

    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jIFUaFVhy2VD6whh5GaY854dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>9BEDBCF8-03BE-5A59-AC93-9263942B37E8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListStackConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackConfigsResponseBody self = new ListStackConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackConfigsResponseBody setConfigs(java.util.List<ListStackConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListStackConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListStackConfigsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListStackConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListStackConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListStackConfigsResponseBodyConfigsComponentConfigComponent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>log</p>
         */
        @NameInMap("name")
        public String name;

        public static ListStackConfigsResponseBodyConfigsComponentConfigComponent build(java.util.Map<String, ?> map) throws Exception {
            ListStackConfigsResponseBodyConfigsComponentConfigComponent self = new ListStackConfigsResponseBodyConfigsComponentConfigComponent();
            return TeaModel.build(map, self);
        }

        public ListStackConfigsResponseBodyConfigsComponentConfigComponent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListStackConfigsResponseBodyConfigsComponentConfigOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>the name of sls project</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>project_name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>log-test</p>
         */
        @NameInMap("value")
        public String value;

        public static ListStackConfigsResponseBodyConfigsComponentConfigOutput build(java.util.Map<String, ?> map) throws Exception {
            ListStackConfigsResponseBodyConfigsComponentConfigOutput self = new ListStackConfigsResponseBodyConfigsComponentConfigOutput();
            return TeaModel.build(map, self);
        }

        public ListStackConfigsResponseBodyConfigsComponentConfigOutput setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStackConfigsResponseBodyConfigsComponentConfigOutput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListStackConfigsResponseBodyConfigsComponentConfigOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListStackConfigsResponseBodyConfigsComponentConfigOutput setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListStackConfigsResponseBodyConfigsComponentConfigVariable extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ap-southeast-3</p>
         */
        @NameInMap("default")
        public String _default;

        /**
         * <strong>example:</strong>
         * <p>region of sls project</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>region</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        public static ListStackConfigsResponseBodyConfigsComponentConfigVariable build(java.util.Map<String, ?> map) throws Exception {
            ListStackConfigsResponseBodyConfigsComponentConfigVariable self = new ListStackConfigsResponseBodyConfigsComponentConfigVariable();
            return TeaModel.build(map, self);
        }

        public ListStackConfigsResponseBodyConfigsComponentConfigVariable set_default(String _default) {
            this._default = _default;
            return this;
        }
        public String get_default() {
            return this._default;
        }

        public ListStackConfigsResponseBodyConfigsComponentConfigVariable setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStackConfigsResponseBodyConfigsComponentConfigVariable setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListStackConfigsResponseBodyConfigsComponentConfigVariable setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListStackConfigsResponseBodyConfigsComponentConfig extends TeaModel {
        @NameInMap("component")
        public java.util.List<ListStackConfigsResponseBodyConfigsComponentConfigComponent> component;

        @NameInMap("output")
        public java.util.List<ListStackConfigsResponseBodyConfigsComponentConfigOutput> output;

        @NameInMap("variable")
        public java.util.List<ListStackConfigsResponseBodyConfigsComponentConfigVariable> variable;

        public static ListStackConfigsResponseBodyConfigsComponentConfig build(java.util.Map<String, ?> map) throws Exception {
            ListStackConfigsResponseBodyConfigsComponentConfig self = new ListStackConfigsResponseBodyConfigsComponentConfig();
            return TeaModel.build(map, self);
        }

        public ListStackConfigsResponseBodyConfigsComponentConfig setComponent(java.util.List<ListStackConfigsResponseBodyConfigsComponentConfigComponent> component) {
            this.component = component;
            return this;
        }
        public java.util.List<ListStackConfigsResponseBodyConfigsComponentConfigComponent> getComponent() {
            return this.component;
        }

        public ListStackConfigsResponseBodyConfigsComponentConfig setOutput(java.util.List<ListStackConfigsResponseBodyConfigsComponentConfigOutput> output) {
            this.output = output;
            return this;
        }
        public java.util.List<ListStackConfigsResponseBodyConfigsComponentConfigOutput> getOutput() {
            return this.output;
        }

        public ListStackConfigsResponseBodyConfigsComponentConfig setVariable(java.util.List<ListStackConfigsResponseBodyConfigsComponentConfigVariable> variable) {
            this.variable = variable;
            return this;
        }
        public java.util.List<ListStackConfigsResponseBodyConfigsComponentConfigVariable> getVariable() {
            return this.variable;
        }

    }

    public static class ListStackConfigsResponseBodyConfigsDeploymentConfigDeployment extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>production</p>
         */
        @NameInMap("name")
        public String name;

        public static ListStackConfigsResponseBodyConfigsDeploymentConfigDeployment build(java.util.Map<String, ?> map) throws Exception {
            ListStackConfigsResponseBodyConfigsDeploymentConfigDeployment self = new ListStackConfigsResponseBodyConfigsDeploymentConfigDeployment();
            return TeaModel.build(map, self);
        }

        public ListStackConfigsResponseBodyConfigsDeploymentConfigDeployment setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListStackConfigsResponseBodyConfigsDeploymentConfigPublishOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>the name of sls project</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>project_name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>log-test</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>deployment.production.project_name</p>
         */
        @NameInMap("value")
        public String value;

        public static ListStackConfigsResponseBodyConfigsDeploymentConfigPublishOutput build(java.util.Map<String, ?> map) throws Exception {
            ListStackConfigsResponseBodyConfigsDeploymentConfigPublishOutput self = new ListStackConfigsResponseBodyConfigsDeploymentConfigPublishOutput();
            return TeaModel.build(map, self);
        }

        public ListStackConfigsResponseBodyConfigsDeploymentConfigPublishOutput setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStackConfigsResponseBodyConfigsDeploymentConfigPublishOutput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListStackConfigsResponseBodyConfigsDeploymentConfigPublishOutput setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListStackConfigsResponseBodyConfigsDeploymentConfigPublishOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListStackConfigsResponseBodyConfigsDeploymentConfigPublishOutput setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListStackConfigsResponseBodyConfigsDeploymentConfigUpstreamInput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>network</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>IacEndpoint/156718871222312/stack_network</p>
         */
        @NameInMap("source")
        public String source;

        public static ListStackConfigsResponseBodyConfigsDeploymentConfigUpstreamInput build(java.util.Map<String, ?> map) throws Exception {
            ListStackConfigsResponseBodyConfigsDeploymentConfigUpstreamInput self = new ListStackConfigsResponseBodyConfigsDeploymentConfigUpstreamInput();
            return TeaModel.build(map, self);
        }

        public ListStackConfigsResponseBodyConfigsDeploymentConfigUpstreamInput setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListStackConfigsResponseBodyConfigsDeploymentConfigUpstreamInput setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class ListStackConfigsResponseBodyConfigsDeploymentConfig extends TeaModel {
        @NameInMap("deployment")
        public java.util.List<ListStackConfigsResponseBodyConfigsDeploymentConfigDeployment> deployment;

        @NameInMap("publishOutput")
        public java.util.List<ListStackConfigsResponseBodyConfigsDeploymentConfigPublishOutput> publishOutput;

        @NameInMap("upstreamInput")
        public java.util.List<ListStackConfigsResponseBodyConfigsDeploymentConfigUpstreamInput> upstreamInput;

        public static ListStackConfigsResponseBodyConfigsDeploymentConfig build(java.util.Map<String, ?> map) throws Exception {
            ListStackConfigsResponseBodyConfigsDeploymentConfig self = new ListStackConfigsResponseBodyConfigsDeploymentConfig();
            return TeaModel.build(map, self);
        }

        public ListStackConfigsResponseBodyConfigsDeploymentConfig setDeployment(java.util.List<ListStackConfigsResponseBodyConfigsDeploymentConfigDeployment> deployment) {
            this.deployment = deployment;
            return this;
        }
        public java.util.List<ListStackConfigsResponseBodyConfigsDeploymentConfigDeployment> getDeployment() {
            return this.deployment;
        }

        public ListStackConfigsResponseBodyConfigsDeploymentConfig setPublishOutput(java.util.List<ListStackConfigsResponseBodyConfigsDeploymentConfigPublishOutput> publishOutput) {
            this.publishOutput = publishOutput;
            return this;
        }
        public java.util.List<ListStackConfigsResponseBodyConfigsDeploymentConfigPublishOutput> getPublishOutput() {
            return this.publishOutput;
        }

        public ListStackConfigsResponseBodyConfigsDeploymentConfig setUpstreamInput(java.util.List<ListStackConfigsResponseBodyConfigsDeploymentConfigUpstreamInput> upstreamInput) {
            this.upstreamInput = upstreamInput;
            return this;
        }
        public java.util.List<ListStackConfigsResponseBodyConfigsDeploymentConfigUpstreamInput> getUpstreamInput() {
            return this.upstreamInput;
        }

    }

    public static class ListStackConfigsResponseBodyConfigs extends TeaModel {
        @NameInMap("componentConfig")
        public ListStackConfigsResponseBodyConfigsComponentConfig componentConfig;

        /**
         * <strong>example:</strong>
         * <p>format_version: IaCService/2021-08-06\ndescription: create ALB \nvariable:\n  - name: region\n    type: string\n ...</p>
         */
        @NameInMap("componentContent")
        public String componentContent;

        /**
         * <strong>example:</strong>
         * <p>2025-08-15T16:14:06Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("deploymentConfig")
        public ListStackConfigsResponseBodyConfigsDeploymentConfig deploymentConfig;

        /**
         * <strong>example:</strong>
         * <p>format_version: IaCService/2021-08-06\ndescription: create ALB\nupstream_input:\n  - name: stack_network\n ...</p>
         */
        @NameInMap("deploymentContent")
        public String deploymentContent;

        @NameInMap("failedReason")
        public String failedReason;

        /**
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        public static ListStackConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListStackConfigsResponseBodyConfigs self = new ListStackConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListStackConfigsResponseBodyConfigs setComponentConfig(ListStackConfigsResponseBodyConfigsComponentConfig componentConfig) {
            this.componentConfig = componentConfig;
            return this;
        }
        public ListStackConfigsResponseBodyConfigsComponentConfig getComponentConfig() {
            return this.componentConfig;
        }

        public ListStackConfigsResponseBodyConfigs setComponentContent(String componentContent) {
            this.componentContent = componentContent;
            return this;
        }
        public String getComponentContent() {
            return this.componentContent;
        }

        public ListStackConfigsResponseBodyConfigs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStackConfigsResponseBodyConfigs setDeploymentConfig(ListStackConfigsResponseBodyConfigsDeploymentConfig deploymentConfig) {
            this.deploymentConfig = deploymentConfig;
            return this;
        }
        public ListStackConfigsResponseBodyConfigsDeploymentConfig getDeploymentConfig() {
            return this.deploymentConfig;
        }

        public ListStackConfigsResponseBodyConfigs setDeploymentContent(String deploymentContent) {
            this.deploymentContent = deploymentContent;
            return this;
        }
        public String getDeploymentContent() {
            return this.deploymentContent;
        }

        public ListStackConfigsResponseBodyConfigs setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public ListStackConfigsResponseBodyConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackConfigsResponseBodyConfigs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
