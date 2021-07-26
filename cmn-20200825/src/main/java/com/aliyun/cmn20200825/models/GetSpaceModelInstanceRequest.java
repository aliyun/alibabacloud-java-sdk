// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetSpaceModelInstanceRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源id
    @NameInMap("SpaceId")
    public String spaceId;

    // 物理空间类型
    @NameInMap("SpaceType")
    public String spaceType;

    // 操作类型
    @NameInMap("OperateType")
    public String operateType;

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

    public GetSpaceModelInstanceRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

}
