// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ResetUserStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RamIdList")
    public java.util.List<Integer> ramIdList;

    public static ResetUserStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetUserStatusRequest self = new ResetUserStatusRequest();
        return TeaModel.build(map, self);
    }

    public ResetUserStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetUserStatusRequest setRamIdList(java.util.List<Integer> ramIdList) {
        this.ramIdList = ramIdList;
        return this;
    }
    public java.util.List<Integer> getRamIdList() {
        return this.ramIdList;
    }

}
