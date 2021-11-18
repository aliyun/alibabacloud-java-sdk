// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyPrivacyNumberCallDetailRequest extends TeaModel {
    @NameInMap("CallId")
    public String callId;

    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyPrivacyNumberCallDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrivacyNumberCallDetailRequest self = new ModifyPrivacyNumberCallDetailRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrivacyNumberCallDetailRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public ModifyPrivacyNumberCallDetailRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ModifyPrivacyNumberCallDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
