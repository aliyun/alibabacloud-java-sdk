// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitParentIdsResponseBody extends TeaModel {
    // 父机构ID列表，顺序层级从上到下
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
