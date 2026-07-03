// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePluginClassRequest extends TeaModel {
    @NameInMap("alias")
    public String alias;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("executePriority")
    public Integer executePriority;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("executeStage")
    public String executeStage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("supportedMinGatewayVersion")
    public String supportedMinGatewayVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("versionDescription")
    public String versionDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("wasmLanguage")
    public String wasmLanguage;

    /**
     * <p>This parameter is required.</p>
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
