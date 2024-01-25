// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddScriptRequest extends TeaModel {
    @NameInMap("HandleSuggestDesc")
    public String handleSuggestDesc;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RootCauseDesc")
    public String rootCauseDesc;

    @NameInMap("RootCausesLog")
    public String rootCausesLog;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("Script")
    public String script;

    @NameInMap("ScriptDesc")
    public String scriptDesc;

    @NameInMap("ScriptLanguage")
    public String scriptLanguage;

    @NameInMap("ScriptName")
    public String scriptName;

    @NameInMap("ScriptVersion")
    public String scriptVersion;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Type")
    public Integer type;

    public static AddScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        AddScriptRequest self = new AddScriptRequest();
        return TeaModel.build(map, self);
    }

    public AddScriptRequest setHandleSuggestDesc(String handleSuggestDesc) {
        this.handleSuggestDesc = handleSuggestDesc;
        return this;
    }
    public String getHandleSuggestDesc() {
        return this.handleSuggestDesc;
    }

    public AddScriptRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public AddScriptRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public AddScriptRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AddScriptRequest setRootCauseDesc(String rootCauseDesc) {
        this.rootCauseDesc = rootCauseDesc;
        return this;
    }
    public String getRootCauseDesc() {
        return this.rootCauseDesc;
    }

    public AddScriptRequest setRootCausesLog(String rootCausesLog) {
        this.rootCausesLog = rootCausesLog;
        return this;
    }
    public String getRootCausesLog() {
        return this.rootCausesLog;
    }

    public AddScriptRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public AddScriptRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public AddScriptRequest setScriptDesc(String scriptDesc) {
        this.scriptDesc = scriptDesc;
        return this;
    }
    public String getScriptDesc() {
        return this.scriptDesc;
    }

    public AddScriptRequest setScriptLanguage(String scriptLanguage) {
        this.scriptLanguage = scriptLanguage;
        return this;
    }
    public String getScriptLanguage() {
        return this.scriptLanguage;
    }

    public AddScriptRequest setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public AddScriptRequest setScriptVersion(String scriptVersion) {
        this.scriptVersion = scriptVersion;
        return this;
    }
    public String getScriptVersion() {
        return this.scriptVersion;
    }

    public AddScriptRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public AddScriptRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
