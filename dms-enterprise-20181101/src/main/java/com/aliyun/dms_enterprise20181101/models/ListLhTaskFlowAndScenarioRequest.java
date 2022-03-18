// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLhTaskFlowAndScenarioRequest extends TeaModel {
    @NameInMap("SpaceId")
    public Long spaceId;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("UserId")
    public Long userId;

    public static ListLhTaskFlowAndScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLhTaskFlowAndScenarioRequest self = new ListLhTaskFlowAndScenarioRequest();
        return TeaModel.build(map, self);
    }

    public ListLhTaskFlowAndScenarioRequest setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public Long getSpaceId() {
        return this.spaceId;
    }

    public ListLhTaskFlowAndScenarioRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListLhTaskFlowAndScenarioRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
