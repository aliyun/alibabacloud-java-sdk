// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ExecutePlatformTaskRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("FormDataJson")
    public String formDataJson;

    @NameInMap("Language")
    public String language;

    @NameInMap("NoExecuteExpressions")
    public String noExecuteExpressions;

    @NameInMap("OutResult")
    public String outResult;

    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SystemToken")
    public String systemToken;

    public static ExecutePlatformTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecutePlatformTaskRequest self = new ExecutePlatformTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecutePlatformTaskRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ExecutePlatformTaskRequest setFormDataJson(String formDataJson) {
        this.formDataJson = formDataJson;
        return this;
    }
    public String getFormDataJson() {
        return this.formDataJson;
    }

    public ExecutePlatformTaskRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ExecutePlatformTaskRequest setNoExecuteExpressions(String noExecuteExpressions) {
        this.noExecuteExpressions = noExecuteExpressions;
        return this;
    }
    public String getNoExecuteExpressions() {
        return this.noExecuteExpressions;
    }

    public ExecutePlatformTaskRequest setOutResult(String outResult) {
        this.outResult = outResult;
        return this;
    }
    public String getOutResult() {
        return this.outResult;
    }

    public ExecutePlatformTaskRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public ExecutePlatformTaskRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ExecutePlatformTaskRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
