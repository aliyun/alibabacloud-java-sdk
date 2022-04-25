// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RevokePermissionsRequest extends TeaModel {
    // 取消授权的accesses列表
    @NameInMap("Accesses")
    public java.util.List<String> accesses;

    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // 取消授权的grantable accesses列表
    @NameInMap("DelegateAccesses")
    public java.util.List<String> delegateAccesses;

    // 取消授权meta资源
    @NameInMap("MetaResource")
    public MetaResource metaResource;

    // 取消授权的用户/角色principal
    @NameInMap("Principal")
    public Principal principal;

    // 取消授权的类型，目前仅支持hive
    @NameInMap("Type")
    public String type;

    public static RevokePermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokePermissionsRequest self = new RevokePermissionsRequest();
        return TeaModel.build(map, self);
    }

    public RevokePermissionsRequest setAccesses(java.util.List<String> accesses) {
        this.accesses = accesses;
        return this;
    }
    public java.util.List<String> getAccesses() {
        return this.accesses;
    }

    public RevokePermissionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public RevokePermissionsRequest setDelegateAccesses(java.util.List<String> delegateAccesses) {
        this.delegateAccesses = delegateAccesses;
        return this;
    }
    public java.util.List<String> getDelegateAccesses() {
        return this.delegateAccesses;
    }

    public RevokePermissionsRequest setMetaResource(MetaResource metaResource) {
        this.metaResource = metaResource;
        return this;
    }
    public MetaResource getMetaResource() {
        return this.metaResource;
    }

    public RevokePermissionsRequest setPrincipal(Principal principal) {
        this.principal = principal;
        return this;
    }
    public Principal getPrincipal() {
        return this.principal;
    }

    public RevokePermissionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
