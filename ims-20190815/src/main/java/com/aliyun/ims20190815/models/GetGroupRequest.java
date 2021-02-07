// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetGroupRequest extends TeaModel {
    @NameInMap("GroupPrincipalName")
    public String groupPrincipalName;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    @NameInMap("GroupName")
    public String groupName;

    public static GetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupRequest self = new GetGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupRequest setGroupPrincipalName(String groupPrincipalName) {
        this.groupPrincipalName = groupPrincipalName;
        return this;
    }
    public String getGroupPrincipalName() {
        return this.groupPrincipalName;
    }

    public GetGroupRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

    public GetGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
