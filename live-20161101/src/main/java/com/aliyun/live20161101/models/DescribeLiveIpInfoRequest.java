// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveIpInfoRequest extends TeaModel {
    /**
     * <p>The IP address that you want to check. You can specify only one IP address in each call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("IP")
    public String IP;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeLiveIpInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveIpInfoRequest self = new DescribeLiveIpInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveIpInfoRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public DescribeLiveIpInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveIpInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
