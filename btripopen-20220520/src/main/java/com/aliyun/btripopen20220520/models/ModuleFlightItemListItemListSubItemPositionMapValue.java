// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleFlightItemListItemListSubItemPositionMapValue extends TeaModel {
    @NameInMap("journey_index")
    public Integer journeyIndex;

    @NameInMap("segment_index")
    public Integer segmentIndex;

    public static ModuleFlightItemListItemListSubItemPositionMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleFlightItemListItemListSubItemPositionMapValue self = new ModuleFlightItemListItemListSubItemPositionMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleFlightItemListItemListSubItemPositionMapValue setJourneyIndex(Integer journeyIndex) {
        this.journeyIndex = journeyIndex;
        return this;
    }
    public Integer getJourneyIndex() {
        return this.journeyIndex;
    }

    public ModuleFlightItemListItemListSubItemPositionMapValue setSegmentIndex(Integer segmentIndex) {
        this.segmentIndex = segmentIndex;
        return this;
    }
    public Integer getSegmentIndex() {
        return this.segmentIndex;
    }

}
