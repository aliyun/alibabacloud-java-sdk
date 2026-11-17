// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class FinishValidateRequest extends TeaModel {
    /**
     * <p>The application ID for exact match queries. If this parameter is omitted, the results are not filtered by application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>app-0aae4rxw7ql*****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application version ID. <strong>Required</strong>. It must match the application version corresponding to the AdaptorId. This parameter is not the image version ID.</p>
     * 
     * <strong>example:</strong>
     * <p>apv-bp1example****</p>
     */
    @NameInMap("AppVersionId")
    public String appVersionId;

    /**
     * <p>The verification result.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tid-bp1example****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static FinishValidateRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishValidateRequest self = new FinishValidateRequest();
        return TeaModel.build(map, self);
    }

    public FinishValidateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public FinishValidateRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public FinishValidateRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public FinishValidateRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
