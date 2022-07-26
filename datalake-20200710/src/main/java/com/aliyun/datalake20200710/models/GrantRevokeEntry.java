// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GrantRevokeEntry extends TeaModel {
    @NameInMap("Accesses")
    public java.util.List<String> accesses;

    @NameInMap("DelegateAccesses")
    public java.util.List<String> delegateAccesses;

    @NameInMap("Id")
    public String id;

    @NameInMap("MetaResource")
    public MetaResource metaResource;

    @NameInMap("Principal")
    public Principal principal;

    public static GrantRevokeEntry build(java.util.Map<String, ?> map) throws Exception {
        GrantRevokeEntry self = new GrantRevokeEntry();
        return TeaModel.build(map, self);
    }

    public GrantRevokeEntry setAccesses(java.util.List<String> accesses) {
        this.accesses = accesses;
        return this;
    }
    public java.util.List<String> getAccesses() {
        return this.accesses;
    }

    public GrantRevokeEntry setDelegateAccesses(java.util.List<String> delegateAccesses) {
        this.delegateAccesses = delegateAccesses;
        return this;
    }
    public java.util.List<String> getDelegateAccesses() {
        return this.delegateAccesses;
    }

    public GrantRevokeEntry setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GrantRevokeEntry setMetaResource(MetaResource metaResource) {
        this.metaResource = metaResource;
        return this;
    }
    public MetaResource getMetaResource() {
        return this.metaResource;
    }

    public GrantRevokeEntry setPrincipal(Principal principal) {
        this.principal = principal;
        return this;
    }
    public Principal getPrincipal() {
        return this.principal;
    }

}
