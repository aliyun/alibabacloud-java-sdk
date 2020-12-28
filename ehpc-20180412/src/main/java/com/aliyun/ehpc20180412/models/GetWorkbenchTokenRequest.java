// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetWorkbenchTokenRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserPassword")
    public String userPassword;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("AccountSessionTicket")
    public String accountSessionTicket;

    @NameInMap("AccountUid")
    public String accountUid;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetWorkbenchTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkbenchTokenRequest self = new GetWorkbenchTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkbenchTokenRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetWorkbenchTokenRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public GetWorkbenchTokenRequest setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }
    public String getUserPassword() {
        return this.userPassword;
    }

    public GetWorkbenchTokenRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public GetWorkbenchTokenRequest setAccountSessionTicket(String accountSessionTicket) {
        this.accountSessionTicket = accountSessionTicket;
        return this;
    }
    public String getAccountSessionTicket() {
        return this.accountSessionTicket;
    }

    public GetWorkbenchTokenRequest setAccountUid(String accountUid) {
        this.accountUid = accountUid;
        return this;
    }
    public String getAccountUid() {
        return this.accountUid;
    }

    public GetWorkbenchTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
