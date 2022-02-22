// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class AccessRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("Principal")
    public Principal principal;

    @NameInMap("PrivilegeResources")
    public java.util.List<PrivilegeResource> privilegeResources;

    public static AccessRequest build(java.util.Map<String, ?> map) throws Exception {
        AccessRequest self = new AccessRequest();
        return TeaModel.build(map, self);
    }

    public AccessRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public AccessRequest setPrincipal(Principal principal) {
        this.principal = principal;
        return this;
    }
    public Principal getPrincipal() {
        return this.principal;
    }

    public AccessRequest setPrivilegeResources(java.util.List<PrivilegeResource> privilegeResources) {
        this.privilegeResources = privilegeResources;
        return this;
    }
    public java.util.List<PrivilegeResource> getPrivilegeResources() {
        return this.privilegeResources;
    }

}
