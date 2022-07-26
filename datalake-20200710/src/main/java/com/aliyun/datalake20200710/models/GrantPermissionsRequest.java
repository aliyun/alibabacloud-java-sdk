// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GrantPermissionsRequest extends TeaModel {
    @NameInMap("Accesses")
    public java.util.List<String> accesses;

    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("DelegateAccesses")
    public java.util.List<String> delegateAccesses;

    @NameInMap("MetaResource")
    public MetaResource metaResource;

    @NameInMap("Principal")
    public Principal principal;

    @NameInMap("Type")
    public String type;

    public static GrantPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantPermissionsRequest self = new GrantPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public GrantPermissionsRequest setAccesses(java.util.List<String> accesses) {
        this.accesses = accesses;
        return this;
    }
    public java.util.List<String> getAccesses() {
        return this.accesses;
    }

    public GrantPermissionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public GrantPermissionsRequest setDelegateAccesses(java.util.List<String> delegateAccesses) {
        this.delegateAccesses = delegateAccesses;
        return this;
    }
    public java.util.List<String> getDelegateAccesses() {
        return this.delegateAccesses;
    }

    public GrantPermissionsRequest setMetaResource(MetaResource metaResource) {
        this.metaResource = metaResource;
        return this;
    }
    public MetaResource getMetaResource() {
        return this.metaResource;
    }

    public GrantPermissionsRequest setPrincipal(Principal principal) {
        this.principal = principal;
        return this;
    }
    public Principal getPrincipal() {
        return this.principal;
    }

    public GrantPermissionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
