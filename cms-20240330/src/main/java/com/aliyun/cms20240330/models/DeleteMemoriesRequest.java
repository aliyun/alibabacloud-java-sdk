// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteMemoriesRequest extends TeaModel {
    /**
     * <p>The agent ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>952730733889060865</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98ea19fe-128b-4841-b318-0359bec3c65d</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <p>The run ID.</p>
     * 
     * <strong>example:</strong>
     * <p>jr-dd7c645fd6fe50d4</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test_user_001</p>
     */
    @NameInMap("userId")
    public String userId;

    public static DeleteMemoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemoriesRequest self = new DeleteMemoriesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMemoriesRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DeleteMemoriesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMemoriesRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public DeleteMemoriesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
