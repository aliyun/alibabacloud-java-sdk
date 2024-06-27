// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsRequest extends TeaModel {
    /**
     * <p>The attribute of the IP address whitelist. By default, this parameter is empty. A whitelist with the <code>hidden</code> attribute does not appear in the console.</p>
     * 
     * <strong>example:</strong>
     * <p>hidden</p>
     */
    @NameInMap("DBInstanceIPArrayAttribute")
    public String DBInstanceIPArrayAttribute;

    /**
     * <p>The name of the whitelist. If you do not enter a name, IP addresses are added to the default whitelist.</p>
     * <blockquote>
     * <p> You can create up to 50 whitelists for an instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DBInstanceIPArrayName")
    public String DBInstanceIPArrayName;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the instance IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The method of modification. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong>: overwrites the whitelist.</li>
     * <li><strong>Append</strong>: appends data to the whitelist.</li>
     * <li><strong>Delete</strong>: deletes the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    /**
     * <p>The ID of the resource group to which the instance belongs. For more information about how to obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IP addresses listed in the whitelist. You can add up to 1,000 IP addresses to the whitelist. Separate multiple IP addresses with commas (,). The IP addresses must use one of the following formats:</p>
     * <ul>
     * <li>0.0.0.0/0</li>
     * <li>10.23.12.24. This is a standard IP address.</li>
     * <li>10.23.12.24/24. This is a CIDR block. The value <code>/24</code> indicates that the prefix of the CIDR block is 24-bit long. You can replace 24 with a value in the range of <code>1 to 32</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.**.**</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    public static ModifySecurityIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIpsRequest self = new ModifySecurityIpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIpsRequest setDBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
        this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
        return this;
    }
    public String getDBInstanceIPArrayAttribute() {
        return this.DBInstanceIPArrayAttribute;
    }

    public ModifySecurityIpsRequest setDBInstanceIPArrayName(String DBInstanceIPArrayName) {
        this.DBInstanceIPArrayName = DBInstanceIPArrayName;
        return this;
    }
    public String getDBInstanceIPArrayName() {
        return this.DBInstanceIPArrayName;
    }

    public ModifySecurityIpsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifySecurityIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifySecurityIpsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifySecurityIpsRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

}
