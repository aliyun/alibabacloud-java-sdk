// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListFCTriggerRequest extends TeaModel {
    /**
     * <p>The name of the event. You can specify only one name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventMetaName")
    public String eventMetaName;

    /**
     * <p>The version number of the event. You can specify only one version number.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventMetaVersion")
    public String eventMetaVersion;

    public static ListFCTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFCTriggerRequest self = new ListFCTriggerRequest();
        return TeaModel.build(map, self);
    }

    public ListFCTriggerRequest setEventMetaName(String eventMetaName) {
        this.eventMetaName = eventMetaName;
        return this;
    }
    public String getEventMetaName() {
        return this.eventMetaName;
    }

    public ListFCTriggerRequest setEventMetaVersion(String eventMetaVersion) {
        this.eventMetaVersion = eventMetaVersion;
        return this;
    }
    public String getEventMetaVersion() {
        return this.eventMetaVersion;
    }

}
