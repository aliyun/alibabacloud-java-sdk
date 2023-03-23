// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class PublishRasterResponseBody extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("RequestId")
    public String requestId;

    public static PublishRasterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishRasterResponseBody self = new PublishRasterResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishRasterResponseBody setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public PublishRasterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
