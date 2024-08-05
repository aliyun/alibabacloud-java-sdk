// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteAllTrafficSpecialControlRequest extends TeaModel {
    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     * 
     * <strong>example:</strong>
     * <p>fa876ffb-caab-4f0a-93b3-3409f2fa5199</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the throttling policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tf123456</p>
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
