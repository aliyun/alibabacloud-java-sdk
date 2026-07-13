// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddRecursionZoneRequest extends TeaModel {
    /**
     * <p>A client token that ensures the idempotence of the request. You can specify a custom value. Make sure that the value is unique among different requests. The value can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable recursive proxy for subdomains. Valid values:</p>
     * <p>zone: Disables recursive proxy. An NXDOMAIN response is returned for non-existent subdomains. record: Enables recursive proxy. For non-existent subdomains, the system queries the forwarding and recursion modules in sequence and returns the final result.</p>
     * 
     * <strong>example:</strong>
     * <p>record</p>
     */
    @NameInMap("ProxyPattern")
    public String proxyPattern;

    /**
     * <p>The name of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    public static AddRecursionZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRecursionZoneRequest self = new AddRecursionZoneRequest();
        return TeaModel.build(map, self);
    }

    public AddRecursionZoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddRecursionZoneRequest setProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
        return this;
    }
    public String getProxyPattern() {
        return this.proxyPattern;
    }

    public AddRecursionZoneRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
