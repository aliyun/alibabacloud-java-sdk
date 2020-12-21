// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetImageNameRequest extends TeaModel {
    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static SetImageNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SetImageNameRequest self = new SetImageNameRequest();
        return TeaModel.build(map, self);
    }

    public SetImageNameRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public SetImageNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
