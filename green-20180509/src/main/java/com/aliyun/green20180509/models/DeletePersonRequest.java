// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeletePersonRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientInfo")
    public String clientInfo;

    public static DeletePersonRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePersonRequest self = new DeletePersonRequest();
        return TeaModel.build(map, self);
    }

    public DeletePersonRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeletePersonRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
