// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DeleteTrafficControlRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("TrafficControlId")
    public String trafficControlId;

    public static DeleteTrafficControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficControlRequest self = new DeleteTrafficControlRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteTrafficControlRequest setTrafficControlId(String trafficControlId) {
        this.trafficControlId = trafficControlId;
        return this;
    }
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

}
