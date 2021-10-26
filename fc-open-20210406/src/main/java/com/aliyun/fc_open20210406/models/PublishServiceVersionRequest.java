// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PublishServiceVersionRequest extends TeaModel {
    // 版本描述
    @NameInMap("description")
    public String description;

    public static PublishServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishServiceVersionRequest self = new PublishServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishServiceVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
