// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetRecordDataRequest extends TeaModel {
    @NameInMap("Acid")
    public String acid;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRecordDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecordDataRequest self = new GetRecordDataRequest();
        return TeaModel.build(map, self);
    }

    public GetRecordDataRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public GetRecordDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
