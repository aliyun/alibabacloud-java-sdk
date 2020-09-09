// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ParseFaceRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static ParseFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ParseFaceRequest self = new ParseFaceRequest();
        return TeaModel.build(map, self);
    }

    public ParseFaceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
