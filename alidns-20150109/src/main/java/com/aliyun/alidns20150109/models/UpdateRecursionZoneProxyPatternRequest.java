// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionZoneProxyPatternRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>record</p>
     */
    @NameInMap("ProxyPattern")
    public String proxyPattern;

    /**
     * <strong>example:</strong>
     * <p>173671468000011</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateRecursionZoneProxyPatternRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionZoneProxyPatternRequest self = new UpdateRecursionZoneProxyPatternRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionZoneProxyPatternRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRecursionZoneProxyPatternRequest setProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
        return this;
    }
    public String getProxyPattern() {
        return this.proxyPattern;
    }

    public UpdateRecursionZoneProxyPatternRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
