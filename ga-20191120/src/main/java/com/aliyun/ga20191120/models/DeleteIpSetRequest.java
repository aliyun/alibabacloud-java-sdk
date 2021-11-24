// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteIpSetRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("IpSetId")
    public String ipSetId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteIpSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpSetRequest self = new DeleteIpSetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpSetRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DeleteIpSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteIpSetRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public DeleteIpSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
