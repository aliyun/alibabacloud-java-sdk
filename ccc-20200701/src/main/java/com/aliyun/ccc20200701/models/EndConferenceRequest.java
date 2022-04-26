// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class EndConferenceRequest extends TeaModel {
    @NameInMap("BearerTokenClientId")
    public String bearerTokenClientId;

    @NameInMap("BearerTokenScope")
    public String bearerTokenScope;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("UserId")
    public String userId;

    public static EndConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        EndConferenceRequest self = new EndConferenceRequest();
        return TeaModel.build(map, self);
    }

    public EndConferenceRequest setBearerTokenClientId(String bearerTokenClientId) {
        this.bearerTokenClientId = bearerTokenClientId;
        return this;
    }
    public String getBearerTokenClientId() {
        return this.bearerTokenClientId;
    }

    public EndConferenceRequest setBearerTokenScope(String bearerTokenScope) {
        this.bearerTokenScope = bearerTokenScope;
        return this;
    }
    public String getBearerTokenScope() {
        return this.bearerTokenScope;
    }

    public EndConferenceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EndConferenceRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public EndConferenceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
