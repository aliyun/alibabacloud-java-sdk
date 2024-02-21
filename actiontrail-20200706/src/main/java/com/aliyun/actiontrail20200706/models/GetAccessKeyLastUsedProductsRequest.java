// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedProductsRequest extends TeaModel {
    /**
     * <p>The AccessKey ID.</p>
     */
    @NameInMap("AccessKey")
    public String accessKey;

    public static GetAccessKeyLastUsedProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedProductsRequest self = new GetAccessKeyLastUsedProductsRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedProductsRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

}
