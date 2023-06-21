// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitParentsRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>组织ID。</p>
     */
    @NameInMap("OrganizationalUnitId")
    public String organizationalUnitId;

    public static ListOrganizationalUnitParentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitParentsRequest self = new ListOrganizationalUnitParentsRequest();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitParentsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOrganizationalUnitParentsRequest setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

}
