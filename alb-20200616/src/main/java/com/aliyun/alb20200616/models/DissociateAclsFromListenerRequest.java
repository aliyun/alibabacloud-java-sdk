// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DissociateAclsFromListenerRequest extends TeaModel {
    @NameInMap("AclIds")
    public java.util.List<String> aclIds;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ListenerId")
    public String listenerId;

    public static DissociateAclsFromListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateAclsFromListenerRequest self = new DissociateAclsFromListenerRequest();
        return TeaModel.build(map, self);
    }

    public DissociateAclsFromListenerRequest setAclIds(java.util.List<String> aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public java.util.List<String> getAclIds() {
        return this.aclIds;
    }

    public DissociateAclsFromListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DissociateAclsFromListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DissociateAclsFromListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

}
