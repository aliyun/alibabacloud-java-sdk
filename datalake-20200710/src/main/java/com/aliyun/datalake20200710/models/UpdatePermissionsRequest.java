// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdatePermissionsRequest extends TeaModel {
    // 授权的accesses列表
    @NameInMap("Accesses")
    public java.util.List<String> accesses;

    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // 授权的grantable accesses列表
    @NameInMap("DelegateAccesses")
    public java.util.List<String> delegateAccesses;

    // 授权meta资源
    @NameInMap("MetaResource")
    public MetaResource metaResource;

    // 授权的用户/角色principal
    @NameInMap("Principal")
    public Principal principal;

    // 授权的类型，目前仅支持hive
    @NameInMap("Type")
    public String type;

    public static UpdatePermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePermissionsRequest self = new UpdatePermissionsRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePermissionsRequest setAccesses(java.util.List<String> accesses) {
        this.accesses = accesses;
        return this;
    }
    public java.util.List<String> getAccesses() {
        return this.accesses;
    }

    public UpdatePermissionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public UpdatePermissionsRequest setDelegateAccesses(java.util.List<String> delegateAccesses) {
        this.delegateAccesses = delegateAccesses;
        return this;
    }
    public java.util.List<String> getDelegateAccesses() {
        return this.delegateAccesses;
    }

    public UpdatePermissionsRequest setMetaResource(MetaResource metaResource) {
        this.metaResource = metaResource;
        return this;
    }
    public MetaResource getMetaResource() {
        return this.metaResource;
    }

    public UpdatePermissionsRequest setPrincipal(Principal principal) {
        this.principal = principal;
        return this;
    }
    public Principal getPrincipal() {
        return this.principal;
    }

    public UpdatePermissionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
