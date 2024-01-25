// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateScriptRequest extends TeaModel {
    @NameInMap("HandleSuggestDesc")
    public String handleSuggestDesc;

    @NameInMap("Id")
    public Integer id;

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

    @NameInMap("ScriptLanguage")
    public String scriptLanguage;

    @NameInMap("ScriptName")
    public String scriptName;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Type")
    public Integer type;

    public static UpdateScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScriptRequest self = new UpdateScriptRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScriptRequest setHandleSuggestDesc(String handleSuggestDesc) {
        this.handleSuggestDesc = handleSuggestDesc;
        return this;
    }
    public String getHandleSuggestDesc() {
        return this.handleSuggestDesc;
    }

    public UpdateScriptRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public UpdateScriptRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public UpdateScriptRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public UpdateScriptRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public UpdateScriptRequest setRootCauseDesc(String rootCauseDesc) {
        this.rootCauseDesc = rootCauseDesc;
        return this;
    }
    public String getRootCauseDesc() {
        return this.rootCauseDesc;
    }

    public UpdateScriptRequest setRootCausesLog(String rootCausesLog) {
        this.rootCausesLog = rootCausesLog;
        return this;
    }
    public String getRootCausesLog() {
        return this.rootCausesLog;
    }

    public UpdateScriptRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public UpdateScriptRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public UpdateScriptRequest setScriptLanguage(String scriptLanguage) {
        this.scriptLanguage = scriptLanguage;
        return this;
    }
    public String getScriptLanguage() {
        return this.scriptLanguage;
    }

    public UpdateScriptRequest setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public UpdateScriptRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public UpdateScriptRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
