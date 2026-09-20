// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class RevokeRequest extends TeaModel {
    /**
     * <p>The database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The list of permissions. Separate multiple permissions with commas (,). Valid values:</p>
     * <ul>
     * <li>READ: read permission.</li>
     * <li>WRITE: write permission.</li>
     * <li>ADMIN: administrative permission.</li>
     * <li>TRASH: purge permission.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>READ,WRITE</p>
     */
    @NameInMap("AclActions")
    public String aclActions;

    /**
     * <p>The target instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp150tns0sjxs****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The namespace. An asterisk (*) indicates global, which means all namespaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The table name. An asterisk (*) indicates global, which means all tables.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table</p>
     */
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
