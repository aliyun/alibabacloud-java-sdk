// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetAccountSettingsResponseBody extends TeaModel {
    /**
     * <p>Liuxia</p>
     */
    @NameInMap("availableAZs")
    public java.util.List<String> availableAZs;

    @NameInMap("defaultRole")
    public String defaultRole;

    public static GetAccountSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSettingsResponseBody self = new GetAccountSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountSettingsResponseBody setAvailableAZs(java.util.List<String> availableAZs) {
        this.availableAZs = availableAZs;
        return this;
    }
    public java.util.List<String> getAvailableAZs() {
        return this.availableAZs;
    }

    public GetAccountSettingsResponseBody setDefaultRole(String defaultRole) {
        this.defaultRole = defaultRole;
        return this;
    }
    public String getDefaultRole() {
        return this.defaultRole;
    }

}
