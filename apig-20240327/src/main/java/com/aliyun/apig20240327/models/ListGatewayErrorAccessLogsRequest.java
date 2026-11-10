// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayErrorAccessLogsRequest extends TeaModel {
    /**
     * <p>The domain name filter. This parameter performs an exact match on the authority field in Simple Log Service (SLS).</p>
     * 
     * <strong>example:</strong>
     * <p>api.example.com</p>
     */
    @NameInMap("authority")
    public String authority;

    /**
     * <p>The end time of the query window, in UNIX seconds. The value cannot be later than the current time, and the time span must be less than or equal to 24 hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1756348800</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The exact filter for the gateway request ID (x-acs-request-id).</p>
     * 
     * <strong>example:</strong>
     * <p>E5D4xxxx</p>
     */
    @NameInMap("gatewayRequestId")
    public String gatewayRequestId;

    /**
     * <p>The request path filter.</p>
     * 
     * <strong>example:</strong>
     * <p>/api/v1/pets</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The specific HTTP error code. Only three-digit numbers in the range of 400 to 599 are accepted. This parameter is required. If it is not provided, the API returns the InvalidParameter.WithDetail(400) error.</p>
     * 
     * <strong>example:</strong>
     * <p>502</p>
     */
    @NameInMap("responseCode")
    public String responseCode;

    /**
     * <p>The route name filter.</p>
     * 
     * <strong>example:</strong>
     * <p>my-route</p>
     */
    @NameInMap("routeName")
    public String routeName;

    /**
     * <p>The start time of the query window, in UNIX seconds. The value must be greater than or equal to the current time minus 24 hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1756262400</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static ListGatewayErrorAccessLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayErrorAccessLogsRequest self = new ListGatewayErrorAccessLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayErrorAccessLogsRequest setAuthority(String authority) {
        this.authority = authority;
        return this;
    }
    public String getAuthority() {
        return this.authority;
    }

    public ListGatewayErrorAccessLogsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListGatewayErrorAccessLogsRequest setGatewayRequestId(String gatewayRequestId) {
        this.gatewayRequestId = gatewayRequestId;
        return this;
    }
    public String getGatewayRequestId() {
        return this.gatewayRequestId;
    }

    public ListGatewayErrorAccessLogsRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListGatewayErrorAccessLogsRequest setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public ListGatewayErrorAccessLogsRequest setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }
    public String getRouteName() {
        return this.routeName;
    }

    public ListGatewayErrorAccessLogsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
