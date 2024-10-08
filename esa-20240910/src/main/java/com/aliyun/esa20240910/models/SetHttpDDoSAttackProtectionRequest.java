// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackProtectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("GlobalMode")
    public String globalMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static SetHttpDDoSAttackProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackProtectionRequest self = new SetHttpDDoSAttackProtectionRequest();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackProtectionRequest setGlobalMode(String globalMode) {
        this.globalMode = globalMode;
        return this;
    }
    public String getGlobalMode() {
        return this.globalMode;
    }

    public SetHttpDDoSAttackProtectionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
