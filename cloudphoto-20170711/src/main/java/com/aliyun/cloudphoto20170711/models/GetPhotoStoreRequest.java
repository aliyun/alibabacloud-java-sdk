// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetPhotoStoreRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    public static GetPhotoStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhotoStoreRequest self = new GetPhotoStoreRequest();
        return TeaModel.build(map, self);
    }

    public GetPhotoStoreRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

}
