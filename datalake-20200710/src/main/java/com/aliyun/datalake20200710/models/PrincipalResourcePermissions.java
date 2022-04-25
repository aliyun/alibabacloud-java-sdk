// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class PrincipalResourcePermissions extends TeaModel {
    // 权限
    @NameInMap("Accesses")
    public java.util.List<String> accesses;

    // grantable权限
    @NameInMap("DelegateAccesses")
    public java.util.List<String> delegateAccesses;

    // 权限信息所属的Hive元数据资源
    @NameInMap("MetaResource")
    public MetaResource metaResource;

    // 权限信息所属的Principal
    @NameInMap("Principal")
    public Principal principal;

    public static PrincipalResourcePermissions build(java.util.Map<String, ?> map) throws Exception {
        PrincipalResourcePermissions self = new PrincipalResourcePermissions();
        return TeaModel.build(map, self);
    }

    public PrincipalResourcePermissions setAccesses(java.util.List<String> accesses) {
        this.accesses = accesses;
        return this;
    }
    public java.util.List<String> getAccesses() {
        return this.accesses;
    }

    public PrincipalResourcePermissions setDelegateAccesses(java.util.List<String> delegateAccesses) {
        this.delegateAccesses = delegateAccesses;
        return this;
    }
    public java.util.List<String> getDelegateAccesses() {
        return this.delegateAccesses;
    }

    public PrincipalResourcePermissions setMetaResource(MetaResource metaResource) {
        this.metaResource = metaResource;
        return this;
    }
    public MetaResource getMetaResource() {
        return this.metaResource;
    }

    public PrincipalResourcePermissions setPrincipal(Principal principal) {
        this.principal = principal;
        return this;
    }
    public Principal getPrincipal() {
        return this.principal;
    }

}
