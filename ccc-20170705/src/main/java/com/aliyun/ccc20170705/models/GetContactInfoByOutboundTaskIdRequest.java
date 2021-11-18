// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetContactInfoByOutboundTaskIdRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OutboundTaskId")
    public String outboundTaskId;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static GetContactInfoByOutboundTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContactInfoByOutboundTaskIdRequest self = new GetContactInfoByOutboundTaskIdRequest();
        return TeaModel.build(map, self);
    }

    public GetContactInfoByOutboundTaskIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetContactInfoByOutboundTaskIdRequest setOutboundTaskId(String outboundTaskId) {
        this.outboundTaskId = outboundTaskId;
        return this;
    }
    public String getOutboundTaskId() {
        return this.outboundTaskId;
    }

    public GetContactInfoByOutboundTaskIdRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
