// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DeleteStoreRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StoreId")
    public String storeId;

    public static DeleteStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStoreRequest self = new DeleteStoreRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStoreRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
