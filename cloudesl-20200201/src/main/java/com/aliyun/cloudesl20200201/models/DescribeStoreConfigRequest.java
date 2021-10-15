// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeStoreConfigRequest extends TeaModel {
    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("StoreId")
    public String storeId;

    public static DescribeStoreConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoreConfigRequest self = new DescribeStoreConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStoreConfigRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public DescribeStoreConfigRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
