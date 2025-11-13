// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionZoneRemarkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>173671468000011</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateRecursionZoneRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionZoneRemarkRequest self = new UpdateRecursionZoneRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionZoneRemarkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRecursionZoneRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateRecursionZoneRemarkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
