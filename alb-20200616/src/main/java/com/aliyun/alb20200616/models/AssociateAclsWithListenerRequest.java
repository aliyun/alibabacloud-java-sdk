// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AssociateAclsWithListenerRequest extends TeaModel {
    // 访问控制策略Id
    @NameInMap("AclIds")
    public java.util.List<String> aclIds;

    // 绑定类型
    @NameInMap("AclType")
    public String aclType;

    // 幂等标识
    @NameInMap("ClientToken")
    public String clientToken;

    // 预检此次请求
    @NameInMap("DryRun")
    public Boolean dryRun;

    // 监听Id
    @NameInMap("ListenerId")
    public String listenerId;

    public static AssociateAclsWithListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateAclsWithListenerRequest self = new AssociateAclsWithListenerRequest();
        return TeaModel.build(map, self);
    }

    public AssociateAclsWithListenerRequest setAclIds(java.util.List<String> aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public java.util.List<String> getAclIds() {
        return this.aclIds;
    }

    public AssociateAclsWithListenerRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public AssociateAclsWithListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateAclsWithListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateAclsWithListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

}
