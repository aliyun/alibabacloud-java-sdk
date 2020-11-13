// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CountCrowdAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("IsShow")
    public Boolean isShow;

    public static CountCrowdAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CountCrowdAdvanceRequest self = new CountCrowdAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CountCrowdAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public CountCrowdAdvanceRequest setIsShow(Boolean isShow) {
        this.isShow = isShow;
        return this;
    }
    public Boolean getIsShow() {
        return this.isShow;
    }

}
