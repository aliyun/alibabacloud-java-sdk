// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class HandPostureAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static HandPostureAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        HandPostureAdvanceRequest self = new HandPostureAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public HandPostureAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
