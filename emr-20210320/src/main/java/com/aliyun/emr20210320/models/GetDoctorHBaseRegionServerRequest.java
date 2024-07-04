// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHBaseRegionServerRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The host of the region server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>emr-worker-4.cluster-20****</p>
     */
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
