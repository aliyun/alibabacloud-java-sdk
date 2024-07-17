// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdatePermissionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Accesses")
    public java.util.List<String> accesses;

    /**
     * <p>CatalogId</p>
     * 
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DelegateAccesses")
    public java.util.List<String> delegateAccesses;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetaResource")
    public MetaResource metaResource;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Principal")
    public Principal principal;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hive</p>
     */
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
