// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetHdfsCapacityStatisticInfoRequest extends TeaModel {
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

    public static GetHdfsCapacityStatisticInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHdfsCapacityStatisticInfoRequest self = new GetHdfsCapacityStatisticInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetHdfsCapacityStatisticInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetHdfsCapacityStatisticInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetHdfsCapacityStatisticInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetHdfsCapacityStatisticInfoRequest setFromDatetime(String fromDatetime) {
        this.fromDatetime = fromDatetime;
        return this;
    }
    public String getFromDatetime() {
        return this.fromDatetime;
    }

    public GetHdfsCapacityStatisticInfoRequest setToDatetime(String toDatetime) {
        this.toDatetime = toDatetime;
        return this;
    }
    public String getToDatetime() {
        return this.toDatetime;
    }

}
