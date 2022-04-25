// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGrantPermissionsRequest extends TeaModel {
    // catalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // 待授权列表
    @NameInMap("GrantRevokeEntries")
    public java.util.List<GrantRevokeEntry> grantRevokeEntries;

    // 授权的类型，目前仅支持hive
    @NameInMap("Type")
    public String type;

    public static BatchGrantPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGrantPermissionsRequest self = new BatchGrantPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public BatchGrantPermissionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public BatchGrantPermissionsRequest setGrantRevokeEntries(java.util.List<GrantRevokeEntry> grantRevokeEntries) {
        this.grantRevokeEntries = grantRevokeEntries;
        return this;
    }
    public java.util.List<GrantRevokeEntry> getGrantRevokeEntries() {
        return this.grantRevokeEntries;
    }

    public BatchGrantPermissionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
