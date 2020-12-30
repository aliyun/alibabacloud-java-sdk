// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListPhoneNumbersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OutboundOnly")
    public Boolean outboundOnly;

    public static ListPhoneNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneNumbersRequest self = new ListPhoneNumbersRequest();
        return TeaModel.build(map, self);
    }

    public ListPhoneNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListPhoneNumbersRequest setOutboundOnly(Boolean outboundOnly) {
        this.outboundOnly = outboundOnly;
        return this;
    }
    public Boolean getOutboundOnly() {
        return this.outboundOnly;
    }

}
