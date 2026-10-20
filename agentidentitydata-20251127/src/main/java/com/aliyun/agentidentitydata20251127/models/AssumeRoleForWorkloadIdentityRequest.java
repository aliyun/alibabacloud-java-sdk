// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class AssumeRoleForWorkloadIdentityRequest extends TeaModel {
    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("RoleSessionName")
    public String roleSessionName;

    @NameInMap("WorkloadAccessToken")
    public String workloadAccessToken;

    public static AssumeRoleForWorkloadIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleForWorkloadIdentityRequest self = new AssumeRoleForWorkloadIdentityRequest();
        return TeaModel.build(map, self);
    }

    public AssumeRoleForWorkloadIdentityRequest setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public AssumeRoleForWorkloadIdentityRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AssumeRoleForWorkloadIdentityRequest setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
        return this;
    }
    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    public AssumeRoleForWorkloadIdentityRequest setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

}
