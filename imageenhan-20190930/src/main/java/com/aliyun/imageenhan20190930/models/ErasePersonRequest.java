// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ErasePersonRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("UserMask")
    @Validation(required = true)
    public String userMask;

    public static ErasePersonRequest build(java.util.Map<String, ?> map) throws Exception {
        ErasePersonRequest self = new ErasePersonRequest();
        return TeaModel.build(map, self);
    }

    public ErasePersonRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public ErasePersonRequest setUserMask(String userMask) {
        this.userMask = userMask;
        return this;
    }
    public String getUserMask() {
        return this.userMask;
    }

}
