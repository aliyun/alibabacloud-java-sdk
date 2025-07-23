// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigAuditLogRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the audit log feature. Valid values:</p>
     * <ul>
     * <li>enable</li>
     * <li>disable</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("AuditAction")
    public String auditAction;

    /**
     * <p>The bucket to which audit logs are delivered.</p>
     * 
     * <strong>example:</strong>
     * <p>hsm-log</p>
     */
    @NameInMap("AuditOssBucket")
    public String auditOssBucket;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ConfigAuditLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigAuditLogRequest self = new ConfigAuditLogRequest();
        return TeaModel.build(map, self);
    }

    public ConfigAuditLogRequest setAuditAction(String auditAction) {
        this.auditAction = auditAction;
        return this;
    }
    public String getAuditAction() {
        return this.auditAction;
    }

    public ConfigAuditLogRequest setAuditOssBucket(String auditOssBucket) {
        this.auditOssBucket = auditOssBucket;
        return this;
    }
    public String getAuditOssBucket() {
        return this.auditOssBucket;
    }

    public ConfigAuditLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
