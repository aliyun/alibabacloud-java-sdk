// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitParentIdsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the parent organizational units. The IDs of the organizational unit are ordered based on their levels from high to low. Only the IDs of the organizational units within the authorization scope are displayed.</p>
     * 
     * <strong>example:</strong>
     * <p>[ou_xxx001]</p>
     */
    @NameInMap("parentIds")
    public java.util.List<String> parentIds;

    public static ListOrganizationalUnitParentIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitParentIdsResponseBody self = new ListOrganizationalUnitParentIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitParentIdsResponseBody setParentIds(java.util.List<String> parentIds) {
        this.parentIds = parentIds;
        return this;
    }
    public java.util.List<String> getParentIds() {
        return this.parentIds;
    }

}
