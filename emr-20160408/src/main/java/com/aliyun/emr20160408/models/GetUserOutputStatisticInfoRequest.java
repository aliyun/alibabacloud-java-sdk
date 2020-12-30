// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetUserOutputStatisticInfoRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("FromDatetime")
    public String fromDatetime;

    @NameInMap("ToDatetime")
    public String toDatetime;

    public static GetUserOutputStatisticInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserOutputStatisticInfoRequest self = new GetUserOutputStatisticInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUserOutputStatisticInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetUserOutputStatisticInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetUserOutputStatisticInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetUserOutputStatisticInfoRequest setFromDatetime(String fromDatetime) {
        this.fromDatetime = fromDatetime;
        return this;
    }
    public String getFromDatetime() {
        return this.fromDatetime;
    }

    public GetUserOutputStatisticInfoRequest setToDatetime(String toDatetime) {
        this.toDatetime = toDatetime;
        return this;
    }
    public String getToDatetime() {
        return this.toDatetime;
    }

}
