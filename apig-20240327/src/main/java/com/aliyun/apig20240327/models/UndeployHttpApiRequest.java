// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UndeployHttpApiRequest extends TeaModel {
    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cqsmtellhtgvo***</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>Route ID. This must be provided when publishing the route of an HTTP API.</p>
     * 
     * <strong>example:</strong>
     * <p>hr-cr82undlhtgrle***</p>
     */
    @NameInMap("routeId")
    public String routeId;

    public static UndeployHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UndeployHttpApiRequest self = new UndeployHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public UndeployHttpApiRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public UndeployHttpApiRequest setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

}
