// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class AddProblemServiceGroupRequest extends TeaModel {
    // 故障ID
    @NameInMap("problemId")
    public Long problemId;

    // 应急协同组
    @NameInMap("serviceGroupIds")
    public java.util.List<Long> serviceGroupIds;

    public static AddProblemServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProblemServiceGroupRequest self = new AddProblemServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddProblemServiceGroupRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public AddProblemServiceGroupRequest setServiceGroupIds(java.util.List<Long> serviceGroupIds) {
        this.serviceGroupIds = serviceGroupIds;
        return this;
    }
    public java.util.List<Long> getServiceGroupIds() {
        return this.serviceGroupIds;
    }

}
