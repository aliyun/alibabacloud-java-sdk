// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEpnInstanceRequest extends TeaModel {
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    public static DeleteEpnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEpnInstanceRequest self = new DeleteEpnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEpnInstanceRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

}
