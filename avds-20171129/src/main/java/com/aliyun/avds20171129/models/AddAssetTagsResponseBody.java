// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddAssetTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddAssetTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAssetTagsResponseBody self = new AddAssetTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAssetTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
