// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryCardHistoryFlowInfoRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static QueryCardHistoryFlowInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCardHistoryFlowInfoRequest self = new QueryCardHistoryFlowInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryCardHistoryFlowInfoRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public QueryCardHistoryFlowInfoRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryCardHistoryFlowInfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
