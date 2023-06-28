// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PublishVersionInput extends TeaModel {
    @NameInMap("description")
    public String description;

    public static PublishVersionInput build(java.util.Map<String, ?> map) throws Exception {
        PublishVersionInput self = new PublishVersionInput();
        return TeaModel.build(map, self);
    }

    public PublishVersionInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
