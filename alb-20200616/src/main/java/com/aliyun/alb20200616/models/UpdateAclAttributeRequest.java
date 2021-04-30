// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateAclAttributeRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // AclId
    @NameInMap("AclId")
    public String aclId;

    // 访问控制策略名称
    @NameInMap("AclName")
    public String aclName;

    // 是否预校验请求
    @NameInMap("DryRun")
    public Boolean dryRun;

    public static UpdateAclAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAclAttributeRequest self = new UpdateAclAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAclAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAclAttributeRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public UpdateAclAttributeRequest setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public UpdateAclAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
