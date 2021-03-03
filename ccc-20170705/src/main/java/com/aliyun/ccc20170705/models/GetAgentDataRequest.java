// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetAgentDataRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartDay")
    public String startDay;

    @NameInMap("EndDay")
    public String endDay;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetAgentDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDataRequest self = new GetAgentDataRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAgentDataRequest setStartDay(String startDay) {
        this.startDay = startDay;
        return this;
    }
    public String getStartDay() {
        return this.startDay;
    }

    public GetAgentDataRequest setEndDay(String endDay) {
        this.endDay = endDay;
        return this;
    }
    public String getEndDay() {
        return this.endDay;
    }

    public GetAgentDataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetAgentDataRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetAgentDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
