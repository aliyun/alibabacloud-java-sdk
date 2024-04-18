// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class RevokeRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AclActions")
    public String aclActions;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("TableName")
    public String tableName;

    public static RevokeRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeRequest self = new RevokeRequest();
        return TeaModel.build(map, self);
    }

    public RevokeRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public RevokeRequest setAclActions(String aclActions) {
        this.aclActions = aclActions;
        return this;
    }
    public String getAclActions() {
        return this.aclActions;
    }

    public RevokeRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RevokeRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public RevokeRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
