// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class GrantRequest extends TeaModel {
    /**
     * <p>The name of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The permission list. Separate multiple permissions with commas (,). Valid values:</p>
     * <ul>
     * <li>READ: read permission.</li>
     * <li>WRITE: write permission.</li>
     * <li>ADMIN: admin permission.</li>
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
     * <p>The ID of target instance. You can call the DescribeInstances operation to obtain target instance ID.</p>
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

    public static GrantRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantRequest self = new GrantRequest();
        return TeaModel.build(map, self);
    }

    public GrantRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GrantRequest setAclActions(String aclActions) {
        this.aclActions = aclActions;
        return this;
    }
    public String getAclActions() {
        return this.aclActions;
    }

    public GrantRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GrantRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GrantRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
