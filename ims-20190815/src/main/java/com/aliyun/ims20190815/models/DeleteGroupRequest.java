// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteGroupRequest extends TeaModel {
    @NameInMap("GroupPrincipalName")
    public String groupPrincipalName;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    @NameInMap("GroupName")
    public String groupName;

    public static DeleteGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupRequest self = new DeleteGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGroupRequest setGroupPrincipalName(String groupPrincipalName) {
        this.groupPrincipalName = groupPrincipalName;
        return this;
    }
    public String getGroupPrincipalName() {
        return this.groupPrincipalName;
    }

    public DeleteGroupRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

    public DeleteGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
