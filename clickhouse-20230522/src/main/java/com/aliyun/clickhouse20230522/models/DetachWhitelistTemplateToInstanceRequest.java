// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DetachWhitelistTemplateToInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-nkhdbf1d,cc-nkhdbf1s</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>98a6d3db05984dca</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DetachWhitelistTemplateToInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachWhitelistTemplateToInstanceRequest self = new DetachWhitelistTemplateToInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DetachWhitelistTemplateToInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DetachWhitelistTemplateToInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachWhitelistTemplateToInstanceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
