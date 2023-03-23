// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class PublishMapserviceResponseBody extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("RequestId")
    public String requestId;

    public static PublishMapserviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishMapserviceResponseBody self = new PublishMapserviceResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishMapserviceResponseBody setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public PublishMapserviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
