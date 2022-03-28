// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class DeleteOssConfigRequest extends TeaModel {
    @NameInMap("ConfigName")
    public String configName;

    public static DeleteOssConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOssConfigRequest self = new DeleteOssConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOssConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

}
