// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePluginClassRequest extends TeaModel {
    /**
     * <p>The alias of the plugin.</p>
     * 
     * <strong>example:</strong>
     * <p>My Wasm Plugin</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <p>The description of the plugin.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom authentication plugin for validating tokens in request headers</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The execution priority of the plugin.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("executePriority")
    public Integer executePriority;

    /**
     * <p>The execution stage of the plugin.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTHN</p>
     */
    @NameInMap("executeStage")
    public String executeStage;

    /**
     * <p>The name of the plugin class.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-wasm-plugin</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The minimum gateway version that the plugin is compatible with.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("supportedMinGatewayVersion")
    public String supportedMinGatewayVersion;

    /**
     * <p>The version number of the plugin.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The description of the current version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Initial version with basic token validation</p>
     */
    @NameInMap("versionDescription")
    public String versionDescription;

    /**
     * <p>The programming language used to develop the WASM plugin.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Rust</p>
     */
    @NameInMap("wasmLanguage")
    public String wasmLanguage;

    /**
     * <p>The download URL of the WASM plugin binary file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/plugins/my-plugin.wasm">https://example.com/plugins/my-plugin.wasm</a></p>
     */
    @NameInMap("wasmUrl")
    public String wasmUrl;

    public static CreatePluginClassRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginClassRequest self = new CreatePluginClassRequest();
        return TeaModel.build(map, self);
    }

    public CreatePluginClassRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CreatePluginClassRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePluginClassRequest setExecutePriority(Integer executePriority) {
        this.executePriority = executePriority;
        return this;
    }
    public Integer getExecutePriority() {
        return this.executePriority;
    }

    public CreatePluginClassRequest setExecuteStage(String executeStage) {
        this.executeStage = executeStage;
        return this;
    }
    public String getExecuteStage() {
        return this.executeStage;
    }

    public CreatePluginClassRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePluginClassRequest setSupportedMinGatewayVersion(String supportedMinGatewayVersion) {
        this.supportedMinGatewayVersion = supportedMinGatewayVersion;
        return this;
    }
    public String getSupportedMinGatewayVersion() {
        return this.supportedMinGatewayVersion;
    }

    public CreatePluginClassRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreatePluginClassRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public CreatePluginClassRequest setWasmLanguage(String wasmLanguage) {
        this.wasmLanguage = wasmLanguage;
        return this;
    }
    public String getWasmLanguage() {
        return this.wasmLanguage;
    }

    public CreatePluginClassRequest setWasmUrl(String wasmUrl) {
        this.wasmUrl = wasmUrl;
        return this;
    }
    public String getWasmUrl() {
        return this.wasmUrl;
    }

}
