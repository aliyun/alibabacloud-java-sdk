// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DataResultsValue extends TeaModel {
    /**
     * <p>The route ID corresponding to the result, which is the same as the key in results.</p>
     * 
     * <strong>example:</strong>
     * <p>hr-example001</p>
     */
    @NameInMap("routeId")
    public String routeId;

    /**
     * <p>For asynchronous publishing, Pending indicates that the request is accepted, and Rejected indicates that the request is rejected before submission. For synchronous publishing, Succeeded indicates that the route is successfully published, and Failed indicates that the publishing failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The cause of the route being rejected or failing to be published. This parameter is returned when the status is Rejected or Failed.</p>
     * 
     * <strong>example:</strong>
     * <p>ErrorType: Conflict, ErrorCode: DeployRouteForbidden, Message: the route  example-route is not allowed to deploy when it\&quot;s status is Deploying., Params: [example-route Deploying]</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    public static DataResultsValue build(java.util.Map<String, ?> map) throws Exception {
        DataResultsValue self = new DataResultsValue();
        return TeaModel.build(map, self);
    }

    public DataResultsValue setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

    public DataResultsValue setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DataResultsValue setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
