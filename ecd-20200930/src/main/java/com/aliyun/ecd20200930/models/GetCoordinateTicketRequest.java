// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetCoordinateTicketRequest extends TeaModel {
    @NameInMap("CoId")
    public String coId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("UserType")
    public String userType;

    public static GetCoordinateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCoordinateTicketRequest self = new GetCoordinateTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetCoordinateTicketRequest setCoId(String coId) {
        this.coId = coId;
        return this;
    }
    public String getCoId() {
        return this.coId;
    }

    public GetCoordinateTicketRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GetCoordinateTicketRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetCoordinateTicketRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetCoordinateTicketRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
