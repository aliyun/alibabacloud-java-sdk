// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartEpnInstanceRequest extends TeaModel {
    @NameInMap("EPNInstanceId")
    @Validation(required = true)
    public String EPNInstanceId;

    public static StartEpnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartEpnInstanceRequest self = new StartEpnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartEpnInstanceRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

}
