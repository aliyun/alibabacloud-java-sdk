// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class PedestrianDetectAttributeRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static PedestrianDetectAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        PedestrianDetectAttributeRequest self = new PedestrianDetectAttributeRequest();
        return TeaModel.build(map, self);
    }

    public PedestrianDetectAttributeRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
