// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteLangfuseInstanceRequest extends TeaModel {
    /**
     * <p>The confirmation flag for deleting the AiGateway instance associated with the Langfuse instance.</p>
     */
    @NameInMap("ConfirmDeleteAiGateway")
    public Boolean confirmDeleteAiGateway;

    /**
     * <p>The Langfuse instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lfs-****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteLangfuseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLangfuseInstanceRequest self = new DeleteLangfuseInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLangfuseInstanceRequest setConfirmDeleteAiGateway(Boolean confirmDeleteAiGateway) {
        this.confirmDeleteAiGateway = confirmDeleteAiGateway;
        return this;
    }
    public Boolean getConfirmDeleteAiGateway() {
        return this.confirmDeleteAiGateway;
    }

    public DeleteLangfuseInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteLangfuseInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
