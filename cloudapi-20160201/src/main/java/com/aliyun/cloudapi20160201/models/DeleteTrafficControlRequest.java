// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteTrafficControlRequest extends TeaModel {
    @NameInMap("TrafficControlId")
    public String trafficControlId;

    public static DeleteTrafficControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficControlRequest self = new DeleteTrafficControlRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficControlRequest setTrafficControlId(String trafficControlId) {
        this.trafficControlId = trafficControlId;
        return this;
    }
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

}
