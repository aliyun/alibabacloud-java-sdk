// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstanceIPArrayRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The attribute of the IP whitelist group.</p>
     * 
     * <strong>example:</strong>
     * <p>taffyFish</p>
     */
    @NameInMap("IPArrayAttribute")
    public String IPArrayAttribute;

    /**
     * <p>The name of the IP whitelist group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testarray</p>
     */
    @NameInMap("IPArrayName")
    public String IPArrayName;

    /**
     * <p>The IP addresses in the IP whitelist group. A maximum of 1,000 IP addresses or CIDR blocks are allowed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityIPList")
    public java.util.List<String> securityIPList;

    public static CreateDBInstanceIPArrayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceIPArrayRequest self = new CreateDBInstanceIPArrayRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceIPArrayRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBInstanceIPArrayRequest setIPArrayAttribute(String IPArrayAttribute) {
        this.IPArrayAttribute = IPArrayAttribute;
        return this;
    }
    public String getIPArrayAttribute() {
        return this.IPArrayAttribute;
    }

    public CreateDBInstanceIPArrayRequest setIPArrayName(String IPArrayName) {
        this.IPArrayName = IPArrayName;
        return this;
    }
    public String getIPArrayName() {
        return this.IPArrayName;
    }

    public CreateDBInstanceIPArrayRequest setSecurityIPList(java.util.List<String> securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public java.util.List<String> getSecurityIPList() {
        return this.securityIPList;
    }

}
