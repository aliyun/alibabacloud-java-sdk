// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteAllTrafficSpecialControlRequest extends TeaModel {
    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the throttling policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
