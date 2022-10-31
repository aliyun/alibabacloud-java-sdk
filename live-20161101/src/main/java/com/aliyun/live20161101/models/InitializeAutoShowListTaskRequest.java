// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class InitializeAutoShowListTaskRequest extends TeaModel {
    @NameInMap("CallBackUrl")
    public String callBackUrl;

    @NameInMap("CasterConfig")
    public String casterConfig;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceIds")
    public String resourceIds;

    @NameInMap("StartTime")
    public Long startTime;

    public static InitializeAutoShowListTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeAutoShowListTaskRequest self = new InitializeAutoShowListTaskRequest();
        return TeaModel.build(map, self);
    }

    public InitializeAutoShowListTaskRequest setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
        return this;
    }
    public String getCallBackUrl() {
        return this.callBackUrl;
    }

    public InitializeAutoShowListTaskRequest setCasterConfig(String casterConfig) {
        this.casterConfig = casterConfig;
        return this;
    }
    public String getCasterConfig() {
        return this.casterConfig;
    }

    public InitializeAutoShowListTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public InitializeAutoShowListTaskRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public InitializeAutoShowListTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public InitializeAutoShowListTaskRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public InitializeAutoShowListTaskRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
