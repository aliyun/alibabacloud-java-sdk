// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PluginClassInfo extends TeaModel {
    @NameInMap("alias")
    public String alias;

    @NameInMap("configExample")
    public String configExample;

    @NameInMap("description")
    public String description;

    @NameInMap("executePriority")
    public Integer executePriority;

    @NameInMap("executeStage")
    public String executeStage;

    @NameInMap("imageName")
    public String imageName;

    @NameInMap("innerPlugin")
    public Boolean innerPlugin;

    @NameInMap("mode")
    public String mode;

    @NameInMap("name")
    public String name;

    @NameInMap("pluginClassId")
    public String pluginClassId;

    @NameInMap("source")
    public String source;

    @NameInMap("supportedMinGatewayVersion")
    public String supportedMinGatewayVersion;

    @NameInMap("type")
    public String type;

    @NameInMap("version")
    public String version;

    @NameInMap("versionDescription")
    public String versionDescription;

    @NameInMap("wasmLanguage")
    public String wasmLanguage;

    @NameInMap("wasmUrl")
    public String wasmUrl;

    public static PluginClassInfo build(java.util.Map<String, ?> map) throws Exception {
        PluginClassInfo self = new PluginClassInfo();
        return TeaModel.build(map, self);
    }

    public PluginClassInfo setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PluginClassInfo setConfigExample(String configExample) {
        this.configExample = configExample;
        return this;
    }
    public String getConfigExample() {
        return this.configExample;
    }

    public PluginClassInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PluginClassInfo setExecutePriority(Integer executePriority) {
        this.executePriority = executePriority;
        return this;
    }
    public Integer getExecutePriority() {
        return this.executePriority;
    }

    public PluginClassInfo setExecuteStage(String executeStage) {
        this.executeStage = executeStage;
        return this;
    }
    public String getExecuteStage() {
        return this.executeStage;
    }

    public PluginClassInfo setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public PluginClassInfo setInnerPlugin(Boolean innerPlugin) {
        this.innerPlugin = innerPlugin;
        return this;
    }
    public Boolean getInnerPlugin() {
        return this.innerPlugin;
    }

    public PluginClassInfo setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public PluginClassInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PluginClassInfo setPluginClassId(String pluginClassId) {
        this.pluginClassId = pluginClassId;
        return this;
    }
    public String getPluginClassId() {
        return this.pluginClassId;
    }

    public PluginClassInfo setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public PluginClassInfo setSupportedMinGatewayVersion(String supportedMinGatewayVersion) {
        this.supportedMinGatewayVersion = supportedMinGatewayVersion;
        return this;
    }
    public String getSupportedMinGatewayVersion() {
        return this.supportedMinGatewayVersion;
    }

    public PluginClassInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PluginClassInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public PluginClassInfo setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public PluginClassInfo setWasmLanguage(String wasmLanguage) {
        this.wasmLanguage = wasmLanguage;
        return this;
    }
    public String getWasmLanguage() {
        return this.wasmLanguage;
    }

    public PluginClassInfo setWasmUrl(String wasmUrl) {
        this.wasmUrl = wasmUrl;
        return this;
    }
    public String getWasmUrl() {
        return this.wasmUrl;
    }

}
