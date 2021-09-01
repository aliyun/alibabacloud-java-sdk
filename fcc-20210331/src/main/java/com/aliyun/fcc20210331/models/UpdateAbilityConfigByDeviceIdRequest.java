// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateAbilityConfigByDeviceIdRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("EventSort")
    public String eventSort;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("EventConfig")
    public String eventConfig;

    @NameInMap("Status")
    public String status;

    @NameInMap("Id")
    public String id;

    @NameInMap("EdgeId")
    public String edgeId;

    @NameInMap("XScale")
    public Float XScale;

    @NameInMap("YScale")
    public Float YScale;

    public static UpdateAbilityConfigByDeviceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAbilityConfigByDeviceIdRequest self = new UpdateAbilityConfigByDeviceIdRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAbilityConfigByDeviceIdRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UpdateAbilityConfigByDeviceIdRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UpdateAbilityConfigByDeviceIdRequest setEventSort(String eventSort) {
        this.eventSort = eventSort;
        return this;
    }
    public String getEventSort() {
        return this.eventSort;
    }

    public UpdateAbilityConfigByDeviceIdRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public UpdateAbilityConfigByDeviceIdRequest setEventConfig(String eventConfig) {
        this.eventConfig = eventConfig;
        return this;
    }
    public String getEventConfig() {
        return this.eventConfig;
    }

    public UpdateAbilityConfigByDeviceIdRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateAbilityConfigByDeviceIdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAbilityConfigByDeviceIdRequest setEdgeId(String edgeId) {
        this.edgeId = edgeId;
        return this;
    }
    public String getEdgeId() {
        return this.edgeId;
    }

    public UpdateAbilityConfigByDeviceIdRequest setXScale(Float XScale) {
        this.XScale = XScale;
        return this;
    }
    public Float getXScale() {
        return this.XScale;
    }

    public UpdateAbilityConfigByDeviceIdRequest setYScale(Float YScale) {
        this.YScale = YScale;
        return this;
    }
    public Float getYScale() {
        return this.YScale;
    }

}
