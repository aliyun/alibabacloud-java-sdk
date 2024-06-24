// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleGroupItemSubItemPositionMapValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("journey_index")
    public Integer journeyIndex;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("segment_index")
    public Integer segmentIndex;

    public static ModuleGroupItemSubItemPositionMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleGroupItemSubItemPositionMapValue self = new ModuleGroupItemSubItemPositionMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleGroupItemSubItemPositionMapValue setJourneyIndex(Integer journeyIndex) {
        this.journeyIndex = journeyIndex;
        return this;
    }
    public Integer getJourneyIndex() {
        return this.journeyIndex;
    }

    public ModuleGroupItemSubItemPositionMapValue setSegmentIndex(Integer segmentIndex) {
        this.segmentIndex = segmentIndex;
        return this;
    }
    public Integer getSegmentIndex() {
        return this.segmentIndex;
    }

}
