// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PickGlobalOutboundNumbersRequest extends TeaModel {
    @NameInMap("CalleeNumber")
    public String calleeNumber;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsVirtual")
    public Boolean isVirtual;

    @NameInMap("SkillGroupId")
    public java.util.List<String> skillGroupId;

    public static PickGlobalOutboundNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        PickGlobalOutboundNumbersRequest self = new PickGlobalOutboundNumbersRequest();
        return TeaModel.build(map, self);
    }

    public PickGlobalOutboundNumbersRequest setCalleeNumber(String calleeNumber) {
        this.calleeNumber = calleeNumber;
        return this;
    }
    public String getCalleeNumber() {
        return this.calleeNumber;
    }

    public PickGlobalOutboundNumbersRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public PickGlobalOutboundNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PickGlobalOutboundNumbersRequest setIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
        return this;
    }
    public Boolean getIsVirtual() {
        return this.isVirtual;
    }

    public PickGlobalOutboundNumbersRequest setSkillGroupId(java.util.List<String> skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public java.util.List<String> getSkillGroupId() {
        return this.skillGroupId;
    }

}
