// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningScopeResponseBody extends TeaModel {
    @NameInMap("groupIds")
    public java.util.List<String> groupIds;

    /**
     * <p>The IDs of organizational units.</p>
     * 
     * <strong>example:</strong>
     * <p>[ou_xxx001]</p>
     */
    @NameInMap("organizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    public static GetApplicationProvisioningScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisioningScopeResponseBody self = new GetApplicationProvisioningScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisioningScopeResponseBody setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public GetApplicationProvisioningScopeResponseBody setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

}
