// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyVectorConfigurationRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](~~86911~~) operation to query the IDs of all AnalyticDB for PostgreSQL instances in a region.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable vector engine optimization. Valid values:</p>
     * <br>
     * <p>*   **enabled**</p>
     * <p>*   **disabled**</p>
     * <br>
     * <p>> *   We recommend that you **do not enable** vector engine optimization in mainstream analysis and real-time data warehousing scenarios.</p>
     * <p>> *   We recommend that you **enable** vector engine optimization in AI Generated Content (AIGC) and vector retrieval scenarios that require the vector analysis engine.</p>
     */
    @NameInMap("VectorConfigurationStatus")
    public String vectorConfigurationStatus;

    public static ModifyVectorConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVectorConfigurationRequest self = new ModifyVectorConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVectorConfigurationRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyVectorConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVectorConfigurationRequest setVectorConfigurationStatus(String vectorConfigurationStatus) {
        this.vectorConfigurationStatus = vectorConfigurationStatus;
        return this;
    }
    public String getVectorConfigurationStatus() {
        return this.vectorConfigurationStatus;
    }

}
