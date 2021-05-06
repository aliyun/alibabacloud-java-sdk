// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyPriorityRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("AclUuid")
    public String aclUuid;

    @NameInMap("Order")
    public String order;

    public static ModifyControlPolicyPriorityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlPolicyPriorityRequest self = new ModifyControlPolicyPriorityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyControlPolicyPriorityRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyControlPolicyPriorityRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyControlPolicyPriorityRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public ModifyControlPolicyPriorityRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

}
