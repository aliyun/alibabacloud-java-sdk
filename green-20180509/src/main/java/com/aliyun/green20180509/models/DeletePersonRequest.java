// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeletePersonRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    @NameInMap("RegionId")
    public String regionId;

    public static DeletePersonRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePersonRequest self = new DeletePersonRequest();
        return TeaModel.build(map, self);
    }

    public DeletePersonRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

    public DeletePersonRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
