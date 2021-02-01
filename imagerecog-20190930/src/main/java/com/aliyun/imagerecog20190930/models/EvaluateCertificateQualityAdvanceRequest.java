// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class EvaluateCertificateQualityAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("Type")
    public String type;

    public static EvaluateCertificateQualityAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateCertificateQualityAdvanceRequest self = new EvaluateCertificateQualityAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EvaluateCertificateQualityAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public EvaluateCertificateQualityAdvanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
