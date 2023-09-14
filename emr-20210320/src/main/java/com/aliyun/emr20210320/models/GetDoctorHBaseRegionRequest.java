// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHBaseRegionRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>Region ID。</p>
     */
    @NameInMap("HbaseRegionId")
    public String hbaseRegionId;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetDoctorHBaseRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHBaseRegionRequest self = new GetDoctorHBaseRegionRequest();
        return TeaModel.build(map, self);
    }

    public GetDoctorHBaseRegionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetDoctorHBaseRegionRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public GetDoctorHBaseRegionRequest setHbaseRegionId(String hbaseRegionId) {
        this.hbaseRegionId = hbaseRegionId;
        return this;
    }
    public String getHbaseRegionId() {
        return this.hbaseRegionId;
    }

    public GetDoctorHBaseRegionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
