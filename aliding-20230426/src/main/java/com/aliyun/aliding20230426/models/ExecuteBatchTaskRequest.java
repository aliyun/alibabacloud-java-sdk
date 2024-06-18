// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ExecuteBatchTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APP_PBKTxxx</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disagree</p>
     */
    @NameInMap("OutResult")
    public String outResult;

    /**
     * <strong>example:</strong>
     * <p>remark</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hexxxx</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;taskId&quot;:&quot;2291xxx&quot;,&quot;formInstId&quot;:&quot;d84a79xxx&quot;}, {&quot;taskId&quot;:&quot;2291xxx&quot;,&quot;formInstId&quot;:&quot;f8035e2axxx&quot;}]</p>
     */
    @NameInMap("TaskInformationList")
    public String taskInformationList;

    public static ExecuteBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteBatchTaskRequest self = new ExecuteBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteBatchTaskRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ExecuteBatchTaskRequest setOutResult(String outResult) {
        this.outResult = outResult;
        return this;
    }
    public String getOutResult() {
        return this.outResult;
    }

    public ExecuteBatchTaskRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ExecuteBatchTaskRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public ExecuteBatchTaskRequest setTaskInformationList(String taskInformationList) {
        this.taskInformationList = taskInformationList;
        return this;
    }
    public String getTaskInformationList() {
        return this.taskInformationList;
    }

}
