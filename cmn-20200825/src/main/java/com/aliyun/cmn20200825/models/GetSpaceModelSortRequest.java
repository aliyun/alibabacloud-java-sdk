// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetSpaceModelSortRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("SpaceType")
    public String spaceType;

    public static GetSpaceModelSortRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceModelSortRequest self = new GetSpaceModelSortRequest();
        return TeaModel.build(map, self);
    }

    public GetSpaceModelSortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSpaceModelSortRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public GetSpaceModelSortRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

}
