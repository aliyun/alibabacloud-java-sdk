// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDescriptionRequest extends TeaModel {
    /**
     * <p>The description of the instance.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. It cannot start with http:// or https://.</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](~~86911~~) operation to query the instance IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is no longer used.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyDBInstanceDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDescriptionRequest self = new ModifyDBInstanceDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDescriptionRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public ModifyDBInstanceDescriptionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceDescriptionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
