// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CallOnlinePrivacyNumberRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TelA")
    public String telA;

    @NameInMap("TelB")
    public String telB;

    public static CallOnlinePrivacyNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        CallOnlinePrivacyNumberRequest self = new CallOnlinePrivacyNumberRequest();
        return TeaModel.build(map, self);
    }

    public CallOnlinePrivacyNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CallOnlinePrivacyNumberRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public CallOnlinePrivacyNumberRequest setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

}
