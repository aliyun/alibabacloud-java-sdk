// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class TagAssetsBySearchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TagAssetsBySearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagAssetsBySearchResponseBody self = new TagAssetsBySearchResponseBody();
        return TeaModel.build(map, self);
    }

    public TagAssetsBySearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
