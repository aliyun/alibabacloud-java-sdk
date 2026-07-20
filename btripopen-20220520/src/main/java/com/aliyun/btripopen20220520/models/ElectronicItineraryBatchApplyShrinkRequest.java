// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ElectronicItineraryBatchApplyShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apply_itinerary_list")
    public String applyItineraryListShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("can_reprint")
    public Boolean canReprint;

    public static ElectronicItineraryBatchApplyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ElectronicItineraryBatchApplyShrinkRequest self = new ElectronicItineraryBatchApplyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ElectronicItineraryBatchApplyShrinkRequest setApplyItineraryListShrink(String applyItineraryListShrink) {
        this.applyItineraryListShrink = applyItineraryListShrink;
        return this;
    }
    public String getApplyItineraryListShrink() {
        return this.applyItineraryListShrink;
    }

    public ElectronicItineraryBatchApplyShrinkRequest setCanReprint(Boolean canReprint) {
        this.canReprint = canReprint;
        return this;
    }
    public Boolean getCanReprint() {
        return this.canReprint;
    }

}
