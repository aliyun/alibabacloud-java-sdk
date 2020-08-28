// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureLifeCycleRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    public static QueryDevicePictureLifeCycleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureLifeCycleRequest self = new QueryDevicePictureLifeCycleRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureLifeCycleRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

}
