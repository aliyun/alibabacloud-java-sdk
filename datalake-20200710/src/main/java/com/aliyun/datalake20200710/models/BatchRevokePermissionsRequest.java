// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchRevokePermissionsRequest extends TeaModel {
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("GrantRevokeEntries")
    public java.util.List<GrantRevokeEntry> grantRevokeEntries;

    @NameInMap("Type")
    public String type;

    public static BatchRevokePermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRevokePermissionsRequest self = new BatchRevokePermissionsRequest();
        return TeaModel.build(map, self);
    }

    public BatchRevokePermissionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public BatchRevokePermissionsRequest setGrantRevokeEntries(java.util.List<GrantRevokeEntry> grantRevokeEntries) {
        this.grantRevokeEntries = grantRevokeEntries;
        return this;
    }
    public java.util.List<GrantRevokeEntry> getGrantRevokeEntries() {
        return this.grantRevokeEntries;
    }

    public BatchRevokePermissionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
