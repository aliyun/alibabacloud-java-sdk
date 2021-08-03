// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateScaleStrategyRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScaleStrategyName")
    public String scaleStrategyName;

    @NameInMap("ScaleStrategyType")
    public String scaleStrategyType;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("MinDesktopsCount")
    public Integer minDesktopsCount;

    @NameInMap("MaxDesktopsCount")
    public Integer maxDesktopsCount;

    @NameInMap("MinAvailableDesktopsCount")
    public Integer minAvailableDesktopsCount;

    @NameInMap("MaxAvailableDesktopsCount")
    public Integer maxAvailableDesktopsCount;

    @NameInMap("ScaleStep")
    public Integer scaleStep;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateScaleStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScaleStrategyRequest self = new CreateScaleStrategyRequest();
        return TeaModel.build(map, self);
    }

    public CreateScaleStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateScaleStrategyRequest setScaleStrategyName(String scaleStrategyName) {
        this.scaleStrategyName = scaleStrategyName;
        return this;
    }
    public String getScaleStrategyName() {
        return this.scaleStrategyName;
    }

    public CreateScaleStrategyRequest setScaleStrategyType(String scaleStrategyType) {
        this.scaleStrategyType = scaleStrategyType;
        return this;
    }
    public String getScaleStrategyType() {
        return this.scaleStrategyType;
    }

    public CreateScaleStrategyRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateScaleStrategyRequest setMinDesktopsCount(Integer minDesktopsCount) {
        this.minDesktopsCount = minDesktopsCount;
        return this;
    }
    public Integer getMinDesktopsCount() {
        return this.minDesktopsCount;
    }

    public CreateScaleStrategyRequest setMaxDesktopsCount(Integer maxDesktopsCount) {
        this.maxDesktopsCount = maxDesktopsCount;
        return this;
    }
    public Integer getMaxDesktopsCount() {
        return this.maxDesktopsCount;
    }

    public CreateScaleStrategyRequest setMinAvailableDesktopsCount(Integer minAvailableDesktopsCount) {
        this.minAvailableDesktopsCount = minAvailableDesktopsCount;
        return this;
    }
    public Integer getMinAvailableDesktopsCount() {
        return this.minAvailableDesktopsCount;
    }

    public CreateScaleStrategyRequest setMaxAvailableDesktopsCount(Integer maxAvailableDesktopsCount) {
        this.maxAvailableDesktopsCount = maxAvailableDesktopsCount;
        return this;
    }
    public Integer getMaxAvailableDesktopsCount() {
        return this.maxAvailableDesktopsCount;
    }

    public CreateScaleStrategyRequest setScaleStep(Integer scaleStep) {
        this.scaleStep = scaleStep;
        return this;
    }
    public Integer getScaleStep() {
        return this.scaleStep;
    }

    public CreateScaleStrategyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
