// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdateAutoScaleConfigRequest extends TeaModel {
    @NameInMap("configJson")
    public java.util.Map<String, ?> configJson;

    public static UpdateAutoScaleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoScaleConfigRequest self = new UpdateAutoScaleConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoScaleConfigRequest setConfigJson(java.util.Map<String, ?> configJson) {
        this.configJson = configJson;
        return this;
    }
    public java.util.Map<String, ?> getConfigJson() {
        return this.configJson;
    }

}
