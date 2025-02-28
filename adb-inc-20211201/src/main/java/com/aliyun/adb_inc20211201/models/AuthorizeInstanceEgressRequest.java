// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class AuthorizeInstanceEgressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InsType")
    public String insType;

    public static AuthorizeInstanceEgressRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeInstanceEgressRequest self = new AuthorizeInstanceEgressRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeInstanceEgressRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AuthorizeInstanceEgressRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public AuthorizeInstanceEgressRequest setInsType(String insType) {
        this.insType = insType;
        return this;
    }
    public String getInsType() {
        return this.insType;
    }

}
