// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupPersonSchedulingRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("userId")
    public Long userId;

    public static GetServiceGroupPersonSchedulingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupPersonSchedulingRequest self = new GetServiceGroupPersonSchedulingRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupPersonSchedulingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetServiceGroupPersonSchedulingRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetServiceGroupPersonSchedulingRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public GetServiceGroupPersonSchedulingRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetServiceGroupPersonSchedulingRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
