// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeVehicleTypeRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeVehicleTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleTypeRequest self = new RecognizeVehicleTypeRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleTypeRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
