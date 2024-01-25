// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeEventTopologyRequest extends TeaModel {
    @NameInMap("EventId")
    public String eventId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeEventTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventTopologyRequest self = new DescribeEventTopologyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventTopologyRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeEventTopologyRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
