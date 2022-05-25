// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningScopeResponseBody extends TeaModel {
    // 机构ID列表
    @NameInMap("organizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    public static GetApplicationProvisioningScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisioningScopeResponseBody self = new GetApplicationProvisioningScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisioningScopeResponseBody setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

}
