// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHBaseRegionRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>Region ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>67f6808f60a8c357103a3a95fe00610e</p>
     */
    @NameInMap("HbaseRegionId")
    public String hbaseRegionId;

    /**
     * <p>区域ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
