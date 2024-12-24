// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GrantPermissionsRequest extends TeaModel {
    /**
     * <p>The list of authorized access items.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Accesses")
    public java.util.List<String> accesses;

    /**
     * <p>The ID of the data directory.</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>The list of authorized access permissions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DelegateAccesses")
    public java.util.List<String> delegateAccesses;

    /**
     * <p>Authorize meta resources.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetaResource")
    public MetaResource metaResource;

    /**
     * <p>Specify the authorized users or roles. The format of the name must meet the following requirements:</p>
     * <ul>
     * <li>RAM user: acs:ram::[accountId]:user/[userName].</li>
     * <li>RAM role: acs:ram::[accountId]:role/[roleName].</li>
     * <li>Data Lake Role: acs:dlf::[accountId]:role/[roleName].</li>
     * </ul>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Principal")
    public Principal principal;

    /**
     * <p>The type of the authorization. Only Hive is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hive</p>
     */
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
