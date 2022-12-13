// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RemoveProblemServiceGroupRequest extends TeaModel {
    @NameInMap("problemId")
    public Long problemId;

    @NameInMap("serviceGroupIds")
    public java.util.List<Long> serviceGroupIds;

    public static RemoveProblemServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveProblemServiceGroupRequest self = new RemoveProblemServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveProblemServiceGroupRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public RemoveProblemServiceGroupRequest setServiceGroupIds(java.util.List<Long> serviceGroupIds) {
        this.serviceGroupIds = serviceGroupIds;
        return this;
    }
    public java.util.List<Long> getServiceGroupIds() {
        return this.serviceGroupIds;
    }

}
