// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class StartOnlineWorkRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("StationType")
    public String stationType;

    @NameInMap("WorkType")
    public Integer workType;

    @NameInMap("UserAgent")
    public String userAgent;

    public static StartOnlineWorkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartOnlineWorkRequest self = new StartOnlineWorkRequest();
        return TeaModel.build(map, self);
    }

    public StartOnlineWorkRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public StartOnlineWorkRequest setStationType(String stationType) {
        this.stationType = stationType;
        return this;
    }
    public String getStationType() {
        return this.stationType;
    }

    public StartOnlineWorkRequest setWorkType(Integer workType) {
        this.workType = workType;
        return this;
    }
    public Integer getWorkType() {
        return this.workType;
    }

    public StartOnlineWorkRequest setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }
    public String getUserAgent() {
        return this.userAgent;
    }

}
