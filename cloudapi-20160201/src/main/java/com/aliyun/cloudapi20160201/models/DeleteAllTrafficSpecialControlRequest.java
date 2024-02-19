// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteAllTrafficSpecialControlRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("TrafficControlId")
    public String trafficControlId;

    public static DeleteAllTrafficSpecialControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllTrafficSpecialControlRequest self = new DeleteAllTrafficSpecialControlRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAllTrafficSpecialControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteAllTrafficSpecialControlRequest setTrafficControlId(String trafficControlId) {
        this.trafficControlId = trafficControlId;
        return this;
    }
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

}
