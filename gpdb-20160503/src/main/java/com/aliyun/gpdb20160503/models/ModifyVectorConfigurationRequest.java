// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyVectorConfigurationRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable vector engine optimization. Valid values:</p>
     * <ul>
     * <li><strong>enabled</strong></li>
     * <li><strong>disabled</strong></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>We recommend that you <strong>do not enable</strong> vector engine optimization in mainstream analysis and real-time data warehousing scenarios.</li>
     * <li>We recommend that you <strong>enable</strong> vector engine optimization in AI Generated Content (AIGC) and vector retrieval scenarios that require the vector analysis engine.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
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
