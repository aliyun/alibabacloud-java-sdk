// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateOrganizationalUnitParentIdRequest extends TeaModel {
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

    /**
     * <p>父组织ID。</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    public static UpdateOrganizationalUnitParentIdRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationalUnitParentIdRequest self = new UpdateOrganizationalUnitParentIdRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationalUnitParentIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateOrganizationalUnitParentIdRequest setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    public UpdateOrganizationalUnitParentIdRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

}
