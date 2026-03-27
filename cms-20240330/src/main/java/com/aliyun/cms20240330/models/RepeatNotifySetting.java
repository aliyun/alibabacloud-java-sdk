// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class RepeatNotifySetting extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;Resolved&quot;</p>
     */
    @NameInMap("endIncidentState")
    public String endIncidentState;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("repeatInterval")
    public String repeatInterval;

    public static RepeatNotifySetting build(java.util.Map<String, ?> map) throws Exception {
        RepeatNotifySetting self = new RepeatNotifySetting();
        return TeaModel.build(map, self);
    }

    public RepeatNotifySetting setEndIncidentState(String endIncidentState) {
        this.endIncidentState = endIncidentState;
        return this;
    }
    public String getEndIncidentState() {
        return this.endIncidentState;
    }

    public RepeatNotifySetting setRepeatInterval(String repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }
    public String getRepeatInterval() {
        return this.repeatInterval;
    }

}
