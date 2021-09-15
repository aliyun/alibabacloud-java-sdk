// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HasServiceLinkedRole")
    public String hasServiceLinkedRole;

    @NameInMap("RegionId")
    public String regionId;

    public static CheckServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleResponseBody self = new CheckServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckServiceLinkedRoleResponseBody setHasServiceLinkedRole(String hasServiceLinkedRole) {
        this.hasServiceLinkedRole = hasServiceLinkedRole;
        return this;
    }
    public String getHasServiceLinkedRole() {
        return this.hasServiceLinkedRole;
    }

    public CheckServiceLinkedRoleResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
