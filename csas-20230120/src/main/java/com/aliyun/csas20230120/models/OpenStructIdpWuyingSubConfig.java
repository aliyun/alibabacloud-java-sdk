// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class OpenStructIdpWuyingSubConfig extends TeaModel {
    @NameInMap("Aliuids")
    public java.util.List<String> aliuids;

    public static OpenStructIdpWuyingSubConfig build(java.util.Map<String, ?> map) throws Exception {
        OpenStructIdpWuyingSubConfig self = new OpenStructIdpWuyingSubConfig();
        return TeaModel.build(map, self);
    }

    public OpenStructIdpWuyingSubConfig setAliuids(java.util.List<String> aliuids) {
        this.aliuids = aliuids;
        return this;
    }
    public java.util.List<String> getAliuids() {
        return this.aliuids;
    }

}
