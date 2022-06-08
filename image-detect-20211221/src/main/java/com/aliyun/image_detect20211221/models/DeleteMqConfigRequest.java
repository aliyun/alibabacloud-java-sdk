// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class DeleteMqConfigRequest extends TeaModel {
    @NameInMap("ConfigName")
    public String configName;

    public static DeleteMqConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqConfigRequest self = new DeleteMqConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMqConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

}
