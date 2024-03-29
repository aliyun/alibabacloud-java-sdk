// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetSpaceModelInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("SpaceType")
    public String spaceType;

    public static GetSpaceModelInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceModelInstanceRequest self = new GetSpaceModelInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetSpaceModelInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSpaceModelInstanceRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public GetSpaceModelInstanceRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public GetSpaceModelInstanceRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

}
