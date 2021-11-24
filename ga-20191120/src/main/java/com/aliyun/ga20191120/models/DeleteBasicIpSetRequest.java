// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicIpSetRequest extends TeaModel {
    // 客户端Token
    @NameInMap("ClientToken")
    public String clientToken;

    // 加速接入点Id
    @NameInMap("IpSetId")
    public String ipSetId;

    // RegionId
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteBasicIpSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicIpSetRequest self = new DeleteBasicIpSetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBasicIpSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteBasicIpSetRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public DeleteBasicIpSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
