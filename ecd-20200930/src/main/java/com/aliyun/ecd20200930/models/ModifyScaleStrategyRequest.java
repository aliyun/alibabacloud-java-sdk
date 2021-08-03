// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyScaleStrategyRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScaleStrategyId")
    public String scaleStrategyId;

    @NameInMap("ScaleStrategyName")
    public String scaleStrategyName;

    @NameInMap("ScaleStrategyType")
    public String scaleStrategyType;

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

    public static ModifyScaleStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScaleStrategyRequest self = new ModifyScaleStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScaleStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyScaleStrategyRequest setScaleStrategyId(String scaleStrategyId) {
        this.scaleStrategyId = scaleStrategyId;
        return this;
    }
    public String getScaleStrategyId() {
        return this.scaleStrategyId;
    }

    public ModifyScaleStrategyRequest setScaleStrategyName(String scaleStrategyName) {
        this.scaleStrategyName = scaleStrategyName;
        return this;
    }
    public String getScaleStrategyName() {
        return this.scaleStrategyName;
    }

    public ModifyScaleStrategyRequest setScaleStrategyType(String scaleStrategyType) {
        this.scaleStrategyType = scaleStrategyType;
        return this;
    }
    public String getScaleStrategyType() {
        return this.scaleStrategyType;
    }

    public ModifyScaleStrategyRequest setMinDesktopsCount(Integer minDesktopsCount) {
        this.minDesktopsCount = minDesktopsCount;
        return this;
    }
    public Integer getMinDesktopsCount() {
        return this.minDesktopsCount;
    }

    public ModifyScaleStrategyRequest setMaxDesktopsCount(Integer maxDesktopsCount) {
        this.maxDesktopsCount = maxDesktopsCount;
        return this;
    }
    public Integer getMaxDesktopsCount() {
        return this.maxDesktopsCount;
    }

    public ModifyScaleStrategyRequest setMinAvailableDesktopsCount(Integer minAvailableDesktopsCount) {
        this.minAvailableDesktopsCount = minAvailableDesktopsCount;
        return this;
    }
    public Integer getMinAvailableDesktopsCount() {
        return this.minAvailableDesktopsCount;
    }

    public ModifyScaleStrategyRequest setMaxAvailableDesktopsCount(Integer maxAvailableDesktopsCount) {
        this.maxAvailableDesktopsCount = maxAvailableDesktopsCount;
        return this;
    }
    public Integer getMaxAvailableDesktopsCount() {
        return this.maxAvailableDesktopsCount;
    }

    public ModifyScaleStrategyRequest setScaleStep(Integer scaleStep) {
        this.scaleStep = scaleStep;
        return this;
    }
    public Integer getScaleStep() {
        return this.scaleStep;
    }

}
