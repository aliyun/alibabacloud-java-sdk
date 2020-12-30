// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class GetConnectTicketRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("Password")
    public String password;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("AsyncMode")
    public Boolean asyncMode;

    public static GetConnectTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConnectTicketRequest self = new GetConnectTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetConnectTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetConnectTicketRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetConnectTicketRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public GetConnectTicketRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public GetConnectTicketRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetConnectTicketRequest setAsyncMode(Boolean asyncMode) {
        this.asyncMode = asyncMode;
        return this;
    }
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

}
