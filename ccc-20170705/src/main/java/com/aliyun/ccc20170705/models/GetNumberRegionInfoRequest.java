// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetNumberRegionInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Number")
    public String number;

    public static GetNumberRegionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNumberRegionInfoRequest self = new GetNumberRegionInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetNumberRegionInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetNumberRegionInfoRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
