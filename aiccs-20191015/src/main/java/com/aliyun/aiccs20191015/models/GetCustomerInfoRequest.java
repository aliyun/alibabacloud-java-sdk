// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetCustomerInfoRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 会员ID
    @NameInMap("MemberId")
    public Long memberId;

    public static GetCustomerInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerInfoRequest self = new GetCustomerInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomerInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetCustomerInfoRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

}
