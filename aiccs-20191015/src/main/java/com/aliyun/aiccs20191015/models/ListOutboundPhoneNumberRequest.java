// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListOutboundPhoneNumberRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ListOutboundPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundPhoneNumberRequest self = new ListOutboundPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public ListOutboundPhoneNumberRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ListOutboundPhoneNumberRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListOutboundPhoneNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
