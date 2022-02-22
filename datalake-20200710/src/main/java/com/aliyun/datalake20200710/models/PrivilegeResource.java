// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class PrivilegeResource extends TeaModel {
    // Access type
    @NameInMap("Access")
    public String access;

    // resource
    @NameInMap("MetaResource")
    public MetaResource metaResource;

    public static PrivilegeResource build(java.util.Map<String, ?> map) throws Exception {
        PrivilegeResource self = new PrivilegeResource();
        return TeaModel.build(map, self);
    }

    public PrivilegeResource setAccess(String access) {
        this.access = access;
        return this;
    }
    public String getAccess() {
        return this.access;
    }

    public PrivilegeResource setMetaResource(MetaResource metaResource) {
        this.metaResource = metaResource;
        return this;
    }
    public MetaResource getMetaResource() {
        return this.metaResource;
    }

}
