// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class TagAssetsByRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TagAssetsByRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagAssetsByRecordsResponseBody self = new TagAssetsByRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public TagAssetsByRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
