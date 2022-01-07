// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProxyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("Password")
    public String password;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("Username")
    public String username;

    public static CreateProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProxyRequest self = new CreateProxyRequest();
        return TeaModel.build(map, self);
    }

    public CreateProxyRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public CreateProxyRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateProxyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public CreateProxyRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
