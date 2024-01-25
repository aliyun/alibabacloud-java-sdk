// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskEventTopologyRequest extends TeaModel {
    @NameInMap("EventId")
    public Long eventId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeRiskEventTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventTopologyRequest self = new DescribeRiskEventTopologyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventTopologyRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public DescribeRiskEventTopologyRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
