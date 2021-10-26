// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetAccountSettingsResponseBody extends TeaModel {
    // 可用区列表
    @NameInMap("availableAZs")
    public java.util.List<String> availableAZs;

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

}
