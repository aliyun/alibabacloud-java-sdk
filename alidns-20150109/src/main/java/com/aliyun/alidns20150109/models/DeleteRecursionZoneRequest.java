// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteRecursionZoneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>169783221000012</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DeleteRecursionZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecursionZoneRequest self = new DeleteRecursionZoneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRecursionZoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteRecursionZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
