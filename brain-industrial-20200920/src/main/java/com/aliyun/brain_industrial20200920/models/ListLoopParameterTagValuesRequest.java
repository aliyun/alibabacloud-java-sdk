// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListLoopParameterTagValuesRequest extends TeaModel {
    @NameInMap("PidLoopParameterId")
    @Validation(required = true)
    public String pidLoopParameterId;

    @NameInMap("DataStartTime")
    public String dataStartTime;

    @NameInMap("DataEndTime")
    public String dataEndTime;

    @NameInMap("PidLoopId")
    @Validation(required = true)
    public String pidLoopId;

    public static ListLoopParameterTagValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLoopParameterTagValuesRequest self = new ListLoopParameterTagValuesRequest();
        return TeaModel.build(map, self);
    }

    public ListLoopParameterTagValuesRequest setPidLoopParameterId(String pidLoopParameterId) {
        this.pidLoopParameterId = pidLoopParameterId;
        return this;
    }
    public String getPidLoopParameterId() {
        return this.pidLoopParameterId;
    }

    public ListLoopParameterTagValuesRequest setDataStartTime(String dataStartTime) {
        this.dataStartTime = dataStartTime;
        return this;
    }
    public String getDataStartTime() {
        return this.dataStartTime;
    }

    public ListLoopParameterTagValuesRequest setDataEndTime(String dataEndTime) {
        this.dataEndTime = dataEndTime;
        return this;
    }
    public String getDataEndTime() {
        return this.dataEndTime;
    }

    public ListLoopParameterTagValuesRequest setPidLoopId(String pidLoopId) {
        this.pidLoopId = pidLoopId;
        return this;
    }
    public String getPidLoopId() {
        return this.pidLoopId;
    }

}
