// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ExecuteTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>APP_PBKT0MFBEBTDO8T7SLVP</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>http://</p>
     */
    @NameInMap("DigitalSignUrl")
    public String digitalSignUrl;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("FormDataJson")
    public String formDataJson;

    /**
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>y</p>
     */
    @NameInMap("NoExecuteExpressions")
    public String noExecuteExpressions;

    /**
     * <strong>example:</strong>
     * <p>AGREE</p>
     */
    @NameInMap("OutResult")
    public String outResult;

    /**
     * <strong>example:</strong>
     * <p>f30233fb-72e1-4af4-8cb8-c7e0ea9ee530</p>
     */
    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>hexxyy</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    /**
     * <strong>example:</strong>
     * <p>12002575L</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ExecuteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTaskRequest self = new ExecuteTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteTaskRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ExecuteTaskRequest setDigitalSignUrl(String digitalSignUrl) {
        this.digitalSignUrl = digitalSignUrl;
        return this;
    }
    public String getDigitalSignUrl() {
        return this.digitalSignUrl;
    }

    public ExecuteTaskRequest setFormDataJson(String formDataJson) {
        this.formDataJson = formDataJson;
        return this;
    }
    public String getFormDataJson() {
        return this.formDataJson;
    }

    public ExecuteTaskRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ExecuteTaskRequest setNoExecuteExpressions(String noExecuteExpressions) {
        this.noExecuteExpressions = noExecuteExpressions;
        return this;
    }
    public String getNoExecuteExpressions() {
        return this.noExecuteExpressions;
    }

    public ExecuteTaskRequest setOutResult(String outResult) {
        this.outResult = outResult;
        return this;
    }
    public String getOutResult() {
        return this.outResult;
    }

    public ExecuteTaskRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public ExecuteTaskRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ExecuteTaskRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public ExecuteTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
