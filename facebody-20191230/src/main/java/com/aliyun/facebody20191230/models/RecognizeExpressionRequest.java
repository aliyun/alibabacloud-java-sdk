// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeExpressionRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeExpressionRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExpressionRequest self = new RecognizeExpressionRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeExpressionRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
