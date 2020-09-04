// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceDataRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static GetPipelineInstanceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceDataRequest self = new GetPipelineInstanceDataRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceDataRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public GetPipelineInstanceDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetPipelineInstanceDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
