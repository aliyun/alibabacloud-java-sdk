// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectChefCapAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static DetectChefCapAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectChefCapAdvanceRequest self = new DetectChefCapAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectChefCapAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
