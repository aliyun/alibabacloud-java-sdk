// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaProducingJobsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    // 查询以下状态的合成任务，支持多值，以英文逗号分隔
    @NameInMap("Status")
    public String status;

    public static ListMediaProducingJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMediaProducingJobsRequest self = new ListMediaProducingJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListMediaProducingJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListMediaProducingJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
