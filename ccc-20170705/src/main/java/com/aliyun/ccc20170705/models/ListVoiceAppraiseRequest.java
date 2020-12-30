// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListVoiceAppraiseRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListVoiceAppraiseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceAppraiseRequest self = new ListVoiceAppraiseRequest();
        return TeaModel.build(map, self);
    }

    public ListVoiceAppraiseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
