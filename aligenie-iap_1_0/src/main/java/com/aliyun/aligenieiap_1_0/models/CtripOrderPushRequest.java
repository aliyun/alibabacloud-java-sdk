// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CtripOrderPushRequest extends TeaModel {
    @NameInMap("JourneyId")
    public String journeyId;

    /**
     * <strong>example:</strong>
     * <p>&quot;scheduleItem&quot;</p>
     */
    @NameInMap("ScheduleItem")
    public String scheduleItem;

    /**
     * <strong>example:</strong>
     * <p>&quot;123456789&quot;</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static CtripOrderPushRequest build(java.util.Map<String, ?> map) throws Exception {
        CtripOrderPushRequest self = new CtripOrderPushRequest();
        return TeaModel.build(map, self);
    }

    public CtripOrderPushRequest setJourneyId(String journeyId) {
        this.journeyId = journeyId;
        return this;
    }
    public String getJourneyId() {
        return this.journeyId;
    }

    public CtripOrderPushRequest setScheduleItem(String scheduleItem) {
        this.scheduleItem = scheduleItem;
        return this;
    }
    public String getScheduleItem() {
        return this.scheduleItem;
    }

    public CtripOrderPushRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
