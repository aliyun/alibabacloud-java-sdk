// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionRecordWeightEnableStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("RequestSource")
    public String requestSource;

    /**
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>176432424234</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateRecursionRecordWeightEnableStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionRecordWeightEnableStatusRequest self = new UpdateRecursionRecordWeightEnableStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionRecordWeightEnableStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRecursionRecordWeightEnableStatusRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public UpdateRecursionRecordWeightEnableStatusRequest setRequestSource(String requestSource) {
        this.requestSource = requestSource;
        return this;
    }
    public String getRequestSource() {
        return this.requestSource;
    }

    public UpdateRecursionRecordWeightEnableStatusRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public UpdateRecursionRecordWeightEnableStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateRecursionRecordWeightEnableStatusRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
