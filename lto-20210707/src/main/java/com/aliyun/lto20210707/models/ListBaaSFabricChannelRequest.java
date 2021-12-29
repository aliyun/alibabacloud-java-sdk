// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSFabricChannelRequest extends TeaModel {
    @NameInMap("BaaSFabricConsortiumId")
    public String baaSFabricConsortiumId;

    public static ListBaaSFabricChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSFabricChannelRequest self = new ListBaaSFabricChannelRequest();
        return TeaModel.build(map, self);
    }

    public ListBaaSFabricChannelRequest setBaaSFabricConsortiumId(String baaSFabricConsortiumId) {
        this.baaSFabricConsortiumId = baaSFabricConsortiumId;
        return this;
    }
    public String getBaaSFabricConsortiumId() {
        return this.baaSFabricConsortiumId;
    }

}
