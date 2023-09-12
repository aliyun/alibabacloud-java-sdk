// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetAppRequest extends TeaModel {
    @NameInMap("detailed")
    public Boolean detailed;

    public static GetAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppRequest self = new GetAppRequest();
        return TeaModel.build(map, self);
    }

    public GetAppRequest setDetailed(Boolean detailed) {
        this.detailed = detailed;
        return this;
    }
    public Boolean getDetailed() {
        return this.detailed;
    }

}
