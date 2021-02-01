// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class EvaluateCertificateQualityRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("Type")
    public String type;

    public static EvaluateCertificateQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateCertificateQualityRequest self = new EvaluateCertificateQualityRequest();
        return TeaModel.build(map, self);
    }

    public EvaluateCertificateQualityRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public EvaluateCertificateQualityRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
