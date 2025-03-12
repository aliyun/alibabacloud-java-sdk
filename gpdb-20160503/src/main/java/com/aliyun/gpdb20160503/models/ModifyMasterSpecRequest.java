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
     * <p>This parameter must be specified if you want to change coordinator nodes to AI coordinator nodes.</p>
     * <blockquote>
     * <ul>
     * <li>You cannot specify the MasterAISpec and MasterCU parameters at the same time.</li>
     * <li>You can change coordinator nodes to AI coordinator nodes only in specific regions and zones.</li>
     * <li>Only AnalyticDB for PostgreSQL V7.0 instances of Basic Edition support AI coordinator nodes.</li>
     * <li>You can view the valid values of this parameter on the configuration change page of coordinator nodes.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ADB.AIMedium.2</p>
     */
    @NameInMap("MasterAISpec")
    public String masterAISpec;

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

    public ModifyMasterSpecRequest setMasterAISpec(String masterAISpec) {
        this.masterAISpec = masterAISpec;
        return this;
    }
    public String getMasterAISpec() {
        return this.masterAISpec;
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
