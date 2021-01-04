// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddPersonRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientInfo")
    public String clientInfo;

    public static AddPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPersonRequest self = new AddPersonRequest();
        return TeaModel.build(map, self);
    }

    public AddPersonRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddPersonRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
