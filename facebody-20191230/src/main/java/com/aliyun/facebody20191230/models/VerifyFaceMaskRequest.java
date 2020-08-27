// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class VerifyFaceMaskRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("RefUrl")
    @Validation(required = true)
    public String refUrl;

    public static VerifyFaceMaskRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyFaceMaskRequest self = new VerifyFaceMaskRequest();
        return TeaModel.build(map, self);
    }

    public VerifyFaceMaskRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public VerifyFaceMaskRequest setRefUrl(String refUrl) {
        this.refUrl = refUrl;
        return this;
    }
    public String getRefUrl() {
        return this.refUrl;
    }

}
