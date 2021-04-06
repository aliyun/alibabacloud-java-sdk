// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MonitorExaminationAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    // A short description of struct
    @NameInMap("Type")
    public Long type;

    public static MonitorExaminationAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MonitorExaminationAdvanceRequest self = new MonitorExaminationAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public MonitorExaminationAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public MonitorExaminationAdvanceRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
