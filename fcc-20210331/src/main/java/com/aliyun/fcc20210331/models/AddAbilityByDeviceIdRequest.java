// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddAbilityByDeviceIdRequest extends TeaModel {
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

    @NameInMap("EdgeId")
    public String edgeId;

    @NameInMap("XScale")
    public Float XScale;

    @NameInMap("YScale")
    public Float YScale;

    public static AddAbilityByDeviceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAbilityByDeviceIdRequest self = new AddAbilityByDeviceIdRequest();
        return TeaModel.build(map, self);
    }

    public AddAbilityByDeviceIdRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddAbilityByDeviceIdRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public AddAbilityByDeviceIdRequest setEventSort(String eventSort) {
        this.eventSort = eventSort;
        return this;
    }
    public String getEventSort() {
        return this.eventSort;
    }

    public AddAbilityByDeviceIdRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public AddAbilityByDeviceIdRequest setEventConfig(String eventConfig) {
        this.eventConfig = eventConfig;
        return this;
    }
    public String getEventConfig() {
        return this.eventConfig;
    }

    public AddAbilityByDeviceIdRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddAbilityByDeviceIdRequest setEdgeId(String edgeId) {
        this.edgeId = edgeId;
        return this;
    }
    public String getEdgeId() {
        return this.edgeId;
    }

    public AddAbilityByDeviceIdRequest setXScale(Float XScale) {
        this.XScale = XScale;
        return this;
    }
    public Float getXScale() {
        return this.XScale;
    }

    public AddAbilityByDeviceIdRequest setYScale(Float YScale) {
        this.YScale = YScale;
        return this;
    }
    public Float getYScale() {
        return this.YScale;
    }

}
