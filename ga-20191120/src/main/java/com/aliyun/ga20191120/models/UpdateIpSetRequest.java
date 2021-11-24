// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateIpSetRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("IpSetId")
    public String ipSetId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateIpSetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpSetRequest self = new UpdateIpSetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpSetRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public UpdateIpSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpSetRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public UpdateIpSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
