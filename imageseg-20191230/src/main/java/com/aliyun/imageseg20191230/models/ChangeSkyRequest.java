// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ChangeSkyRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("ReplaceImageURL")
    @Validation(required = true)
    public String replaceImageURL;

    public static ChangeSkyRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeSkyRequest self = new ChangeSkyRequest();
        return TeaModel.build(map, self);
    }

    public ChangeSkyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public ChangeSkyRequest setReplaceImageURL(String replaceImageURL) {
        this.replaceImageURL = replaceImageURL;
        return this;
    }
    public String getReplaceImageURL() {
        return this.replaceImageURL;
    }

}
