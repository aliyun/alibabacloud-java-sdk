// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteGroupsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientInfo")
    public String clientInfo;

    public static DeleteGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupsRequest self = new DeleteGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteGroupsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
