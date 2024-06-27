// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyMasterSpecRequest extends TeaModel {
    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The specifications of coordinator node resources. Valid values:</p>
     * <ul>
     * <li>2 CU</li>
     * <li>4 CU</li>
     * <li>8 CU</li>
     * <li>16 CU</li>
     * <li>32 CU</li>
     * </ul>
     * <blockquote>
     * <p> You are charged for coordinator node resources of more than 8 compute units (CUs).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8 CU</p>
     */
    @NameInMap("MasterCU")
    public Integer masterCU;

    /**
     * <p>The ID of the resource group to which the instance belongs. For information about how to obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyMasterSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMasterSpecRequest self = new ModifyMasterSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMasterSpecRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public ModifyMasterSpecRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyMasterSpecRequest setMasterCU(Integer masterCU) {
        this.masterCU = masterCU;
        return this;
    }
    public Integer getMasterCU() {
        return this.masterCU;
    }

    public ModifyMasterSpecRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
