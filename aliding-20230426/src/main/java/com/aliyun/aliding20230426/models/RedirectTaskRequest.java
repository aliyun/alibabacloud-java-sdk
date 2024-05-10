// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RedirectTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppType")
    public String appType;

    @NameInMap("ByManager")
    public String byManager;

    @NameInMap("Language")
    public String language;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NowActionExecutorId")
    public String nowActionExecutorId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    @NameInMap("Remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static RedirectTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RedirectTaskRequest self = new RedirectTaskRequest();
        return TeaModel.build(map, self);
    }

    public RedirectTaskRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public RedirectTaskRequest setByManager(String byManager) {
        this.byManager = byManager;
        return this;
    }
    public String getByManager() {
        return this.byManager;
    }

    public RedirectTaskRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public RedirectTaskRequest setNowActionExecutorId(String nowActionExecutorId) {
        this.nowActionExecutorId = nowActionExecutorId;
        return this;
    }
    public String getNowActionExecutorId() {
        return this.nowActionExecutorId;
    }

    public RedirectTaskRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public RedirectTaskRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public RedirectTaskRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public RedirectTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
