// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyAiServiceProtectionRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable manual shutdown protection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    public static ModifyAiServiceProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAiServiceProtectionRequest self = new ModifyAiServiceProtectionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAiServiceProtectionRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public ModifyAiServiceProtectionRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
