// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DeleteStoreRequest extends TeaModel {
    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("StoreId")
    public String storeId;

    public static DeleteStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStoreRequest self = new DeleteStoreRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStoreRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public DeleteStoreRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
