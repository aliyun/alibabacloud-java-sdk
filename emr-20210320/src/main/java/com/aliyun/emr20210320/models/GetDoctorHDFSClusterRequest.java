// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHDFSClusterRequest extends TeaModel {
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

    public static GetDoctorHDFSClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHDFSClusterRequest self = new GetDoctorHDFSClusterRequest();
        return TeaModel.build(map, self);
    }

    public GetDoctorHDFSClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetDoctorHDFSClusterRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public GetDoctorHDFSClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
