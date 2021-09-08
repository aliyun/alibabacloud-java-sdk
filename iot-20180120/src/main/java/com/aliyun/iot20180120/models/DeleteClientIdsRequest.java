// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteClientIdsRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static DeleteClientIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientIdsRequest self = new DeleteClientIdsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientIdsRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public DeleteClientIdsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
