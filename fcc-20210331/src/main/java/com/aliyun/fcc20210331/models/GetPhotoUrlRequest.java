// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetPhotoUrlRequest extends TeaModel {
    @NameInMap("PhotoUrl")
    public String photoUrl;

    public static GetPhotoUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhotoUrlRequest self = new GetPhotoUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetPhotoUrlRequest setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }
    public String getPhotoUrl() {
        return this.photoUrl;
    }

}
