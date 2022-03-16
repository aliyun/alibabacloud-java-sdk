// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class RemoveEntriesFromAclRequest extends TeaModel {
    // 访问控制策略Id
    @NameInMap("AclId")
    public String aclId;

    // 幂等标识
    @NameInMap("ClientToken")
    public String clientToken;

    // 是否只预检此次请求
    @NameInMap("DryRun")
    public Boolean dryRun;

    // 条目列表
    @NameInMap("Entries")
    public java.util.List<String> entries;

    public static RemoveEntriesFromAclRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntriesFromAclRequest self = new RemoveEntriesFromAclRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEntriesFromAclRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public RemoveEntriesFromAclRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveEntriesFromAclRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RemoveEntriesFromAclRequest setEntries(java.util.List<String> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<String> getEntries() {
        return this.entries;
    }

}
