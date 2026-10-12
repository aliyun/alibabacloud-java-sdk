// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayErrorAccessLogsRequest extends TeaModel {
    /**
     * <p>The domain name filter. This parameter performs an exact match against the authority field in Simple Log Service (SLS).</p>
     * 
     * <strong>example:</strong>
     * <p>api.example.com</p>
     */
    @NameInMap("authority")
    public String authority;

    /**
     * <p>The end of the query window, in UNIX seconds. The value cannot be later than the current time, and the time span cannot exceed 24 hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1756348800</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The gateway request ID (x-acs-request-id) for exact match filtering.</p>
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
     * <p>The HTTP error code. Only three-digit numbers in the 400–599 range are accepted. This parameter is required. If you do not specify this parameter, the API returns InvalidParameter.WithDetail (400).</p>
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
     * <p>The start of the query window, in UNIX seconds. The value must be no earlier than 24 hours before the current time.</p>
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
