// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketPortalSettingConfig extends TeaModel {
    @NameInMap("autoApproveDevelopers")
    public Boolean autoApproveDevelopers;

    @NameInMap("autoApproveSubscriptions")
    public Boolean autoApproveSubscriptions;

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
