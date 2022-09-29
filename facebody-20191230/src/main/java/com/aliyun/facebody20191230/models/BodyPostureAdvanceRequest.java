// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BodyPostureAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static BodyPostureAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BodyPostureAdvanceRequest self = new BodyPostureAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public BodyPostureAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
