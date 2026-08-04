// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySaasServiceDeletionProtectionRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable deletion protection.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agdb-xxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    public static ModifySaasServiceDeletionProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySaasServiceDeletionProtectionRequest self = new ModifySaasServiceDeletionProtectionRequest();
        return TeaModel.build(map, self);
    }

    public ModifySaasServiceDeletionProtectionRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public ModifySaasServiceDeletionProtectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySaasServiceDeletionProtectionRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
