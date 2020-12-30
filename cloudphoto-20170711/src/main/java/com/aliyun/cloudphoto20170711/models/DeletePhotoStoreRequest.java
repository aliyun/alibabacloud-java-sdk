// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class DeletePhotoStoreRequest extends TeaModel {
    @NameInMap("StoreName")
    public String storeName;

    public static DeletePhotoStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePhotoStoreRequest self = new DeletePhotoStoreRequest();
        return TeaModel.build(map, self);
    }

    public DeletePhotoStoreRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

}
