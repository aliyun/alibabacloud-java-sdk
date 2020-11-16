// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetConnectionTicketRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientId")
    @Validation(required = true)
    public String clientId;

    @NameInMap("LoginToken")
    @Validation(required = true)
    public String loginToken;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("DesktopId")
    public String desktopId;

    public static GetConnectionTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionTicketRequest self = new GetConnectionTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetConnectionTicketRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetConnectionTicketRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GetConnectionTicketRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public GetConnectionTicketRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetConnectionTicketRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

}
