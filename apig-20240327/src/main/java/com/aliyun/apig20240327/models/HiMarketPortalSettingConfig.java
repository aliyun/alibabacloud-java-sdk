// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketPortalSettingConfig extends TeaModel {
    /**
     * <p>Specifies whether to automatically approve developer registration requests.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoApproveDevelopers")
    public Boolean autoApproveDevelopers;

    /**
     * <p>Specifies whether to automatically approve API subscription requests.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoApproveSubscriptions")
    public Boolean autoApproveSubscriptions;

    /**
     * <p>Specifies whether to enable username-password authentication (built-in authentication).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("builtinAuthEnabled")
    public Boolean builtinAuthEnabled;

    public static HiMarketPortalSettingConfig build(java.util.Map<String, ?> map) throws Exception {
        HiMarketPortalSettingConfig self = new HiMarketPortalSettingConfig();
        return TeaModel.build(map, self);
    }

    public HiMarketPortalSettingConfig setAutoApproveDevelopers(Boolean autoApproveDevelopers) {
        this.autoApproveDevelopers = autoApproveDevelopers;
        return this;
    }
    public Boolean getAutoApproveDevelopers() {
        return this.autoApproveDevelopers;
    }

    public HiMarketPortalSettingConfig setAutoApproveSubscriptions(Boolean autoApproveSubscriptions) {
        this.autoApproveSubscriptions = autoApproveSubscriptions;
        return this;
    }
    public Boolean getAutoApproveSubscriptions() {
        return this.autoApproveSubscriptions;
    }

    public HiMarketPortalSettingConfig setBuiltinAuthEnabled(Boolean builtinAuthEnabled) {
        this.builtinAuthEnabled = builtinAuthEnabled;
        return this;
    }
    public Boolean getBuiltinAuthEnabled() {
        return this.builtinAuthEnabled;
    }

}
