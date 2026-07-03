// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PluginClassInfo extends TeaModel {
    /**
     * <p>The plugin class alias.</p>
     * 
     * <strong>example:</strong>
     * <p>AI安全护栏</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <p>The configuration example (JSON string).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;checkRequest&quot;:true}</p>
     */
    @NameInMap("configExample")
    public String configExample;

    /**
     * <p>The plugin class description.</p>
     * 
     * <strong>example:</strong>
     * <p>AI请求内容安全检测插件</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The execution priority.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("executePriority")
    public Integer executePriority;

    /**
     * <p>The execution stage.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTHN</p>
     */
    @NameInMap("executeStage")
    public String executeStage;

    /**
     * <p>The Wasm image name.</p>
     * 
     * <strong>example:</strong>
     * <p>higress-registry.tencentcloudcr.com/ai-security-guard</p>
     */
    @NameInMap("imageName")
    public String imageName;

    /**
     * <p>Indicates whether the plugin is a built-in plugin.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("innerPlugin")
    public Boolean innerPlugin;

    /**
     * <p>The plugin running mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Wasm</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The plugin class name.</p>
     * 
     * <strong>example:</strong>
     * <p>ai-security-guard</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The plugin class ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cls-xxx</p>
     */
    @NameInMap("pluginClassId")
    public String pluginClassId;

    /**
     * <p>The plugin source.</p>
     * 
     * <strong>example:</strong>
     * <p>HigressOfficial</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The minimum supported gateway DPI engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.1.11</p>
     */
    @NameInMap("supportedMinGatewayVersion")
    public String supportedMinGatewayVersion;

    /**
     * <p>The plugin type category.</p>
     * 
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The plugin version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The version description.</p>
     * 
     * <strong>example:</strong>
     * <p>初始版本</p>
     */
    @NameInMap("versionDescription")
    public String versionDescription;

    /**
     * <p>The Wasm programming language.</p>
     * 
     * <strong>example:</strong>
     * <p>Rust</p>
     */
    @NameInMap("wasmLanguage")
    public String wasmLanguage;

    /**
     * <p>The Wasm file download URL.</p>
     * 
     * <strong>example:</strong>
     * <p>https://...</p>
     */
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
