// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHBaseRegionServerRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RegionServerHost")
    public String regionServerHost;

    public static GetDoctorHBaseRegionServerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHBaseRegionServerRequest self = new GetDoctorHBaseRegionServerRequest();
        return TeaModel.build(map, self);
    }

    public GetDoctorHBaseRegionServerRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetDoctorHBaseRegionServerRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public GetDoctorHBaseRegionServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetDoctorHBaseRegionServerRequest setRegionServerHost(String regionServerHost) {
        this.regionServerHost = regionServerHost;
        return this;
    }
    public String getRegionServerHost() {
        return this.regionServerHost;
    }

}
